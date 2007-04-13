package one2one;

import implicit.CSMDupConnection;
import implicit.CSMDupConnectionList;
import implicit.CSMDupNode;
import implicit.CSMDupNodeList;
import implicit.ResourceAcquisition;
import implicit.ResourceAttribs;
import implicit.ResourceRelease;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import seg.jUCMNav.extensionpoints.IURNExport;
import ucm.map.ComponentRef;
import ucm.map.EmptyPoint;
import ucm.map.EndPoint;
import ucm.map.PathNode;
import ucm.map.PluginBinding;
import ucm.map.StartPoint;
import ucm.map.Stub;
import ucm.map.UCMmap;
import ucm.map.impl.MapFactoryImpl;
import ucm.performance.ExternalOperation;
import ucm.performance.GeneralResource;
import ucm.performance.PassiveResource;
import ucm.performance.ProcessingResource;
import urn.URNspec;
import urncore.Component;
import urncore.IURNDiagram;

/**
 * <!-- begin-user-doc --> Performs implicit and explicit conversions on UCM components <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */

public class Convert implements IURNExport {

    private List processedComponents = new ArrayList();
    private List processedResources = new ArrayList();
    private int dummy_id = 5000; // limitation.  js
    private int emptyPoint_id = 9000; //js
    
    // Converts object through polymorphism (dynamic binding)
    public void doComponentRefConvert(ComponentRefConverter obj, PrintStream ps) {
        obj.Convert(ps);
    }

    public void export(URNspec urn, HashMap mapDiagrams, FileOutputStream fos) throws InvocationTargetException {
    	
        PrintStream ps = new PrintStream(fos);

        // CSM header and footer
        String XML_header = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
        String CSM_header = "<CSM:CSMType xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                            "xmlns:CSM=\"platform:/resource/edu.carleton.sce.puma/CSM.xsd\" " + 
                            "name=\"" + urn.getName() + "\" description=\"" + urn.getDescription() + 
                            "\" author=\"" + urn.getAuthor() + "\" version=\"" + urn.getSpecVersion() + "\">";
                            // Note: "created" not handled yet because of missing Date to xsd:dateTime conversion
        String CSM_footer = "</CSM:CSMType>";

        // output to file
        ps.println(XML_header);
        ps.println(CSM_header);

        // Produce SpecDiagrams (scenarios)
        for (Iterator iter = urn.getUrndef().getSpecDiagrams().iterator(); iter.hasNext();) {
            IURNDiagram diag = (IURNDiagram) iter.next();
            if (diag instanceof UCMmap) {
                UCMmap map = (UCMmap) diag;
                exportMap(map, ps, null);    
            }
        }
        ps.println(CSM_footer);
        ps.flush();
    }

    // prints scenario CSM element
    public void csmScenario(UCMmap map, PrintStream ps) {
        // map header and footer

    }

    private void exportMap(UCMmap map, PrintStream ps, PluginBinding pb) {
        String probability;
        String transaction;
        String name_extension;

	// map name will also be plugin binding specific (if given)
	// and contain probability and transaction
        if (pb != null) {
            name_extension = "_h" + pb.getStub().getId();
            probability = "probability=\"" + pb.getProbability() + "\" ";
            transaction = "transaction=\"" + pb.isTransaction() + "\" ";
        } else {
            name_extension = "";
            probability = "";
            transaction = "";
        }

        String open_scenario_tag = "<Scenario "
            	+ "id=\"m" + map.getId() + name_extension + "\" "
        	+ "name=\"" + map.getName() + "\" "
        	+ "traceabilityLink=\"" + map.getId() + "\" ";
        String close_attributes = ">";
        // optional attributes

        String close_scenario_tag = "</Scenario>";

        // output to file
        ps.print("\n        " + open_scenario_tag + probability + transaction);

        if (map.getDescription() != null) {
            String descr_attribute = "description=\"" + map.getDescription() + "\" ";
            ps.print(descr_attribute);
        }
        ps.println(close_attributes);
        /*
         * Create an intermediate map based on original one This map contains references to all PathNodes in the original map as well as references to all the
         * original connections in the map This intermediate map is implemented as two list; - a node list - a connections list
         */
        CSMDupNodeList dupMaplist = new CSMDupNodeList();
        dupMaplist.DuplicateHyperEdges(map);
        CSMDupConnectionList dupMapConnList = new CSMDupConnectionList();
        dupMapConnList.DuplicateConnection(map);

        // Complete Resource Requests
        dupMaplist.computeNodesResources(dupMapConnList);
        
        // Insert RA/RR/Seq nodes in above list
        transform(dupMaplist, dupMapConnList, ps);

        // Imperfect and optional sorting:  eases XML human parsing.
        // If in doubt, remove altogether.  JS
        sortConnectionList(dupMapConnList);
        CSMDupNodeList dupMaplistSorted = new CSMDupNodeList();
        sortNodeList(dupMapConnList,dupMaplist, dupMaplistSorted);

        // Generate XML tags
        saveXML(ps, dupMaplistSorted, dupMapConnList);

        // Close scenario
        ps.println("        " + close_scenario_tag);

        // Generate sub-maps for probabilistic binding of dynamic stubs
        outputDynamicStubSubMaps(dupMaplistSorted, map, ps);
        
        // Generate components
        for (Iterator iter3 = map.getContRefs().iterator(); iter3.hasNext();) {
            ComponentRef compRef = (ComponentRef) iter3.next();
            // produce components only once (to avoid CSM2LQN to crash)
            if (!processedComponents.contains(((Component) compRef.getContDef()).getId())) {
		processedComponents.add(((Component) compRef.getContDef()).getId());
		// generate CSM representation
		ComponentRefConverter obj = new ComponentRefConverter(compRef);
		doComponentRefConvert(obj, ps);
	    }
        }
        
        // Generate resources
        for (Iterator res = map.getUrndefinition().getUrnspec().getUcmspec().getResources().iterator(); res.hasNext();) {
	    GeneralResource genRes = (GeneralResource) res.next();
	    // but ouput each resource only once
	    if (!processedResources.contains(genRes.getId())) {
		processedResources.add(genRes.getId());
		if (genRes instanceof ExternalOperation) {
		    ExternalOperationConverter externalOpnCvtr = new ExternalOperationConverter((ExternalOperation) genRes);
		    externalOpnCvtr.Convert(ps, /* source */null, /* target */null);
		} else if (genRes instanceof ProcessingResource) {
		    ProcessingResourceConverter processingResCvtr = new ProcessingResourceConverter((ProcessingResource) genRes);
		    processingResCvtr.Convert(ps, /* source */null, /* target */null);
		} else if (genRes instanceof PassiveResource) {
		    PassiveResourceConverter passiveResCvtr = new PassiveResourceConverter((PassiveResource) genRes);
		    passiveResCvtr.Convert(ps, /* source */null, /* target */null);
		}
	    }
	}
        
	ps.flush();
    }

    public void outputDynamicStubSubMaps(CSMDupNodeList dupMaplist, UCMmap map, PrintStream ps) {
        for (int i = 0; i < dupMaplist.size(); i++) {
	    CSMDupNode	node = dupMaplist.get(i);
	    if ((node.getNode() != null) && (node.getNode() instanceof Stub) && ( ((Stub)node.getNode()).isDynamic())) {
		Stub stub = (Stub) node.getNode();
		
		String stubId = stub.getId();
	        String fake_stubId = "fs_" + stubId;
		String steps = "";
		for (int j = 0; j < stub.getBindings().size(); j++) {
		    steps = steps + fake_stubId + "_step_" + j + " "; 
		}
		steps = steps.trim();

		String scenario_head = "<Scenario id=\"" + fake_stubId + "\" name=\"" + map.getName() + "_" + stub.getName() + "\" >";
		String start = "<Start id=\"" + fake_stubId + "_start\" target=\"" + fake_stubId + "_ds1\" />";
		String ds1 = "<Step id=\"" + fake_stubId + "_ds1\" "
			+ "name=\"dummy1\" "
			+ "predecessor=\"" + fake_stubId + "_start\" " 
			+ "successor=\"" + fake_stubId + "_branch\" />";
		String branch = "<Branch id=\"" + fake_stubId + "_branch\" source=\"" + fake_stubId + "_ds1\" target=\"" + steps + "\" />";

		String oneTab = "        ";
	        String twoTab = "            ";
//	        String threeTab = "                ";
//	        String fourTab = "                    ";

		ps.println(oneTab + scenario_head);
		ps.println(twoTab + start);
		ps.println(twoTab + ds1);
		ps.println(twoTab + branch);
		
		int j = 0;
		for (Iterator iter = stub.getBindings().iterator(); iter.hasNext();) {
		    PluginBinding binding = (PluginBinding) iter.next();
		    PluginBindingConverter bind_obj = new PluginBindingConverter(binding);
		    String step = "<Step id=\"" + fake_stubId + "_step_" + j + "\" " 
		    	+ "name=\"Stub\" "
		    	+ "predecessor=\"" + fake_stubId + "_branch\" "
		    	+ "successor=\"" + fake_stubId + "_merge\" "
		    	+ "probability=\"" + binding.getProbability() + "\" "
		    	+ ">";
		    ps.println(twoTab + step);

		    // produce Bindings relative to sub-map
		    ArrayList src = new ArrayList();
		    ArrayList tgt = new ArrayList();
		    src.add(fake_stubId + "_start");
		    tgt.add(fake_stubId + "_end");
		    bind_obj.Convert(ps, src /*source*/, tgt /*target*/);
		    ps.println(twoTab + "</Step>");
		    j++;
		}
		String merge = "<Merge id=\"" + fake_stubId + "_merge\" "
			+ "source=\"" + steps + "\" "
			+ "target=\"" + fake_stubId + "_ds2\" />";
		String ds2 = "<Step id=\"" + fake_stubId + "_ds2\" "
			+ "name=\"dummy2\" "
			+ "predecessor=\"" + fake_stubId + "_merge\" " 
			+ "successor=\"" + fake_stubId + "_end\" />";
		String end = "<End id=\"" + fake_stubId + "_end\" "
			+ "source=\"" + fake_stubId + "_ds2\" />";
		String scenario_tail = "</Scenario>";
		
		ps.println(twoTab + merge);
		ps.println(twoTab + ds2);
		ps.println(twoTab + end);
		ps.println(oneTab + scenario_tail);
	    }
	}
	
    }
    
    	/**
    	 * Sorting of CSMDupNodeList
    	 * 
    	 * @param connList
    	 * 	used to visit the nodes
    	 * @param nodeList
    	 * 	list of nodes to sort
    	 * @param nodeListSorted
    	 * 	sorted node list
    	 */
	public void sortNodeList(CSMDupConnectionList connList, CSMDupNodeList nodeList, CSMDupNodeList nodeListSorted) {
		int indexInNewList;
		int indexInOldList;
		for (int i = 0; i < connList.size(); i++) {
		    if (connList.get(i).getCSMSource() != null) {
			indexInNewList = findNodeInList(nodeListSorted, connList.get(i).getCSMSource().getId());
			if (indexInNewList == -1) {
				indexInOldList = findNodeInList(nodeList, connList.get(i).getCSMSource().getId());
				if (indexInOldList != -1) {
				    nodeListSorted.add(nodeList.get(indexInOldList));    
				}
			}
		    }
		    if (connList.get(i).getCSMTarget() != null) {
			indexInNewList = findNodeInList(nodeListSorted, connList.get(i).getCSMTarget().getId());
			if (indexInNewList == -1) {
				indexInOldList = findNodeInList(nodeList, connList.get(i).getCSMTarget().getId());
				if (indexInOldList != -1) {
				    nodeListSorted.add(nodeList.get(indexInOldList));
				}
			}
		    }
		}
	}

	/**
	 * Utility to search for nodes in nodelist
	 * 
	 * @param nodeList
	 * 	list of nodes to search
	 * @param id
	 * 	id of the node sought
	 * @return
	 * 	index of the node in the list
	 */
	public int findNodeInList(CSMDupNodeList nodeList, String id) {
		boolean found = false;
		int pos = -1;
		for (int i = 0; (i < nodeList.size()) && (!found); i++) {
			CSMDupNode n = nodeList.get(i);
			if (n.getId() == id) {
				found = true;
				pos = i;
			}
		}
		return pos;
	}

	/**
	 * Sorting of CSMDupConnectionList
	 * 
	 * @param connList
	 */
	public void sortConnectionList(CSMDupConnectionList connList) {
		int startSortingAt = 0;
		int lastSorted = 0;
		int startSortingFrom = startSortingAt;
		while (startSortingAt < connList.size()) {
			// find a better starting place if it exists
			boolean foundConnWithStartSource = false;
			for (int i3 = startSortingAt; !foundConnWithStartSource && i3 < connList.size(); i3++) {
				if (connList.get(i3).getCSMSource().getType() == CSMDupNode.START) {
					startSortingFrom = i3;
					foundConnWithStartSource = true;
				}
			}
			if (startSortingAt != startSortingFrom) {
				connList.swap(startSortingAt, startSortingFrom);
			}
			lastSorted = startSortingAt;
			startSortingAt++;
			startSortingFrom = startSortingAt;

			// sort until end node or end of list
			boolean foundEnd = false;
			while ((startSortingAt < connList.size()) && !foundEnd) {
				boolean foundFollowing = false;

				foundEnd = connList.get(lastSorted).getCSMTarget().getType() == CSMDupNode.END;
				for (int i4 = startSortingAt; !foundFollowing && i4 < connList.size(); i4++) {
					if (connList.get(i4).getCSMSource().getId() == connList.get(lastSorted).getCSMTarget().getId()) {
						startSortingFrom = i4;
						foundFollowing = true;
					}
				}
				if (startSortingAt != startSortingFrom) {
					connList.swap(startSortingAt, startSortingFrom);
				}
				lastSorted = startSortingAt;
				startSortingAt++;
				startSortingFrom = startSortingAt;
			}

			// the end

		}
	}
    
    // adds RA/RR/Seq nodes where necessary in the duplicate map
    public void transform(CSMDupNodeList list, CSMDupConnectionList conn_list, PrintStream ps) {
        ResourceAcquisition ra = new ResourceAcquisition(ps);
        ResourceRelease rr = new ResourceRelease(ps);
        int i = 0;
        int list_size = list.size();
        while (i < list_size) {
            CSMDupNode node = list.get(i); // current edge
            PathNode curr_node = node.getNode(); // current node
            ra.acquireResource(curr_node, list, conn_list);
            rr.releaseResource(curr_node, list, conn_list);
            i++;
        }
        // eliminate duplicate empty points and add dummy Steps
        eliminateAdjacentEmptyPoints(list, conn_list);
        addDummy(list, conn_list);
    }

    // prints dummy step
    public void printDummyStep(CSMDupNode node, String id, PrintStream ps, CSMDupConnectionList list) {

        // initializing attributes
        String name = "Dummy";
        String successor = list.getTargetForSource(node.getId());
        String predecessor = list.getSourceForTarget(node.getId());
        String dummy_attributes;
        String hostDemand = "hostDemand=\"0\" ";
        // object attributes
        if (predecessor.startsWith("G") && successor.startsWith("G")) {
            dummy_attributes = "<Step id=\"" + id + "\" " + "name=\"" + name + "\" " 
            + "predecessor=\"" + predecessor + "\" "
            + "successor=\"" + successor + "\" " + hostDemand + "/>";        
        } else if (predecessor.startsWith("G") && !successor.startsWith("!G")) {
            dummy_attributes = "<Step id=\"" + id + "\" " + "name=\"" + name + "\" "
            + "predecessor=\"" + predecessor + "\" "
            + "successor=\"h" + successor + "\" " + hostDemand + "/>";
        } else if (!predecessor.startsWith("!G") && successor.startsWith("G")) {
            dummy_attributes = "<Step id=\"" + id + "\" " + "name=\"" + name + "\" "
            + "predecessor=\"h" + predecessor + "\" "
            + "successor=\"" + successor + "\" " + hostDemand + "/>";
        } else {        	
            dummy_attributes = "<Step id=\"" + id + "\" " + "name=\"" + name + "\" "
            + "predecessor=\"h" + predecessor + "\" "
            + "successor=\"h" + successor + "\" " + hostDemand + "/>";
        }

        // output to file
        ps.println("            " + dummy_attributes);
        ps.flush();
    }
    
    // print CSM output for RA and Sequence
    public void saveXML(PrintStream ps, CSMDupNodeList dupMaplist, CSMDupConnectionList dupMapConnlist) {

        for (int b = 0; b < dupMaplist.size(); b++) {
            CSMDupNode curr_node = dupMaplist.get(b);
            // printing RA
            if (curr_node.getId().startsWith("G1")) {
        	ResourceAttribs resAttribs = curr_node.getResourceToAcquire();
                ResourceAcquisition ra = new ResourceAcquisition(ps);
                if (resAttribs != null) {
                    ra.acquireRes(resAttribs, curr_node, dupMapConnlist);    
                } else {
                    String res = curr_node.getResToAcquire();
                    ra.acquireComp(res, curr_node, dupMapConnlist);
                }
                
            }
            // printing RR
            else if (curr_node.getId().startsWith("G3")) {
        	ResourceAttribs resAttribs = curr_node.getResourceToRelease();
                ResourceRelease rr = new ResourceRelease(ps);
                if (resAttribs != null) {
                    rr.releaseRes(resAttribs, curr_node, dupMapConnlist);    
                } else {
                    String res = curr_node.getResToRelease();
                    rr.releaseComp(res, curr_node, dupMapConnlist);
                }
                
            }
            // printing RA_Sequence
            else if (curr_node.getId().startsWith("G2")) {
                ResourceAcquisition ra = new ResourceAcquisition(ps);
                ra.acquireEmptyPoint(curr_node, dupMapConnlist);
            }
            // printing RR_Sequence
            else if (curr_node.getId().startsWith("G4")) {
                ResourceRelease rr = new ResourceRelease(ps);
                rr.acquireEmptyPoint(curr_node, dupMapConnlist);
            }
            // printing dummy Step
            else if (curr_node.getId().startsWith("G5")) {
                printDummyStep(curr_node, curr_node.getId(), ps, dupMapConnlist);
            }
            // print other objects
            else {
                // initializing attributes
                String curr_node_id = dupMaplist.get(b).getNode().getId();
                // determine new source and target of all PathConnection types
                ArrayList source = new ArrayList();
                ArrayList target = new ArrayList();
                // retrieve list of target/source nodes
                source = getSources(dupMapConnlist, curr_node_id);
                target = getTargets(dupMapConnlist, curr_node_id);
                PathNode pathnode = curr_node.getNode();
                /**
                 * EmptyPoint of a WaitingPlace
                 */
		if (curr_node.isPathNode() && (pathnode instanceof EmptyPoint)
                	&& (pathnode.getSucc().size() > 1) ) {
	            String target_noBracket = target.toString().substring(1, (target.toString().length() - 1));
	            String target_noComma = StringUtil.trimString(',', target_noBracket); // eliminate ','

                    String epoint_attributes = "            <Fork id=\"h" + curr_node.getId() + "\" ";
                    String epoint_source = "source=\"" + source.get(0) + "\" ";
                    String epoint_target = "target=\"" + target_noComma + "\" ";
                    String epoint_end = "/> <!-- EmptyPoint -->";
                    ps.println(epoint_attributes + epoint_source + epoint_target + epoint_end);
                /**
                 * EndPoint of a Connect
                 */
                } else if (curr_node.isPathNode() && (pathnode instanceof EndPoint)
                        && ((EndPoint)pathnode).getSucc().size() > 0 ) {
                    String epoint_attributes = "            <Sequence id=\"h" + curr_node.getId() + "\" ";
                    String epoint_source = "source=\"" + source.get(0) + "\" ";
                    String epoint_target = "target=\"" + target.get(0) + "\" ";
                    String epoint_end = "/> <!-- EndPoint -->";
                    ps.println(epoint_attributes + epoint_source + epoint_target + epoint_end);
                /**
                 * StartPoint of a Connect
                 */
                } else if (curr_node.isPathNode() && (pathnode instanceof StartPoint)
                        && ((StartPoint)pathnode).getPred().size() > 0 ) {
                    String epoint_attributes = "            <Sequence id=\"h" + curr_node.getId() + "\" ";
                    String epoint_source = "source=\"" + source.get(0) + "\" ";
                    String epoint_target = "target=\"" + target.get(0) + "\" ";
                    String epoint_end = "/> <!-- StartPoint -->";
                    ps.println(epoint_attributes + epoint_source + epoint_target + epoint_end);
                } else {
                    curr_node.printPathNode(ps, source, target);
                }
            }
        } // for
    }

    // retrieve list of source nodes
    public ArrayList getSources(CSMDupConnectionList dupMapConnlist, String edge_id) {
        ArrayList sources = new ArrayList();
        for (int i = 0; i < dupMapConnlist.size(); i++) {
            String add_h = "h";
            String source_id = dupMapConnlist.get(i).getSourceStr();
            String target_id = add_h.concat(dupMapConnlist.get(i).getTargetStr());
            if (target_id.compareTo(add_h.concat(edge_id)) == 0) {
                if (source_id.startsWith("G"))
                    sources.add(source_id);
                else
                    sources.add(add_h.concat(source_id));

            } // if
        } // for
        if (sources.isEmpty()) {
            sources = null;
        }
        return sources;
    } // method

    // retrieve list of target nodes
    public ArrayList getTargets(CSMDupConnectionList dupMapConnlist, String edge_id) {
        ArrayList targets = new ArrayList();
        for (int i = 0; i < dupMapConnlist.size(); i++) {
            String add_h = "h";
            String source_id = add_h.concat(dupMapConnlist.get(i).getSourceStr());
            String target_id = dupMapConnlist.get(i).getTargetStr();
            if (source_id.compareTo(add_h.concat(edge_id)) == 0) {
                if (target_id.startsWith("G"))
                    targets.add(target_id);
                else
                    targets.add(add_h.concat(target_id));
            } // if
        } // for
        if (targets.isEmpty()) {
            targets = null;
        }
        return targets;
    } // method

    // Eliminate adjacent emptyPoints
    public void eliminateAdjacentEmptyPoints(CSMDupNodeList node_list, CSMDupConnectionList conn_list) {
        boolean adj_ep_found = true;
        while (adj_ep_found) {
            adj_ep_found = false; // reset loop condition
            // Scan the list of connections for a connection that has EmptyPoints as both source and target
            int conn_list_size = conn_list.size();
            for (int i = 0; i < conn_list_size; i++) {
                CSMDupConnection curr_conn = conn_list.get(i);
                CSMDupNode source = curr_conn.getCSMSource();
                CSMDupNode target = curr_conn.getCSMTarget();

                if (source.isPathNode() && (source.getNode() instanceof EmptyPoint) && target.isPathNode() && (target.getNode() instanceof EmptyPoint)) {
                    // find next connection, that has source = 'target'
                    if (conn_list.existsConnectionForSource(target)) {
                        CSMDupConnection next_conn = conn_list.getConnectionForSource(target);
                        CSMDupNode next_target = next_conn.getCSMTarget();

                        // remove 'target' node
                        node_list.remove(target);

                        // remove curr_conn connection
                        conn_list.remove(curr_conn);
                        conn_list_size--;

                        // remove next_conn connection
                        conn_list.remove(next_conn);
                        conn_list_size--;

                        // add new connection
                        conn_list.add(new CSMDupConnection(source, next_target));
                        conn_list_size++;

                        adj_ep_found = true; // set loop condition
                    } else {
                        System.out.println("LOGICAL ERROR:  'last' connection has Empty Point target: " + target);
                    }
                } // if
            } // for
        } // while
    } // method

    // Adds a Dummy responsability in between 2 steps
    public void addDummy(CSMDupNodeList node_list, CSMDupConnectionList conn_list) {
        boolean work_to_do = true;

        while (work_to_do) {
            work_to_do = false; // reset loop condition
            // Scan the list of connections for a connection that has Steps as both source and target
            int conn_list_size = conn_list.size();
            for (int i = 0; i < conn_list_size; i++) {
                CSMDupConnection curr_conn = conn_list.get(i);
                CSMDupNode source = curr_conn.getCSMSource();
                CSMDupNode target = curr_conn.getCSMTarget();

                // Empty point is in between two steps
                if (target.isPathNode() && (target.getNode() instanceof EmptyPoint)) {
                    if (conn_list.existsConnectionForSource(target)) {
                        CSMDupConnection next_conn = conn_list.getConnectionForSource(target);
                        CSMDupNode next_target = next_conn.getCSMTarget();
                        if (	(source.isPathNode() && ((source.getType() == CSMDupNode.RESPREF) || (source.getType() == CSMDupNode.STUB)))
                        		||
                        		( (source.getType() == CSMDupNode.RR)  || (source.getType() == CSMDupNode.RA)  )
                        	) {
                            if (	(next_target.isPathNode() && ((next_target.getType() == CSMDupNode.RESPREF) || (next_target.getType() == CSMDupNode.STUB)))
                            		||
                            		( (next_target.getType() == CSMDupNode.RR)  || (next_target.getType() == CSMDupNode.RA) )
                            	)	{
                                ; // keep empty point
                            } else { // delete empty point
                                // remove 'target' node
                                node_list.remove(target);

                                // remove curr_conn connection
                                conn_list.remove(curr_conn);
                                conn_list_size--;

                                // remove next_conn connection
                                conn_list.remove(next_conn);
                                conn_list_size--;

                                // add new connection
                                conn_list.add(new CSMDupConnection(source, next_target));
                                conn_list_size++;
                                work_to_do = true; // js:  we need to start over when adding connections
                            }
                        } // if
                        else {                        	
                        	/**
                        	 * an EmptyPoint is preceded by a connection node:
                        	 * convert the EmptyPoint to a DummySequence and insert DummyStep before  
                        	 */
                        	if ((source.getType() == CSMDupNode.START) || (source.getType() == CSMDupNode.ARROW)
					|| (source.getType() == CSMDupNode.ANDFORK) || (source.getType() == CSMDupNode.ANDJOIN)
					|| (source.getType() == CSMDupNode.ORFORK) || (source.getType() == CSMDupNode.ORJOIN)
					|| (source.getType() == CSMDupNode.WAIT) || (source.getType() == CSMDupNode.CSMEMPTY)
					|| (source.getType() == CSMDupNode.END) || (source.getType() == CSMDupNode.EMPTY)) {
				    insertDummyStep(node_list, conn_list, curr_conn, source, target);
				    conn_list_size++;
				    node_list.retype(target, CSMDupNode.CSMDUMMY);
	                            work_to_do = true; // js:  we need to start over when adding connections
				/**
				 * an EmptyPoint is followed by a connection node:
				 * convert EmptyPoint to a DummySequence and insert a DummyStep after
				 */
                        	} else if ((next_target.getType() == CSMDupNode.START) || (next_target.getType() == CSMDupNode.ARROW)
					|| (next_target.getType() == CSMDupNode.ANDFORK) || (next_target.getType() == CSMDupNode.ANDJOIN)
					|| (next_target.getType() == CSMDupNode.ORFORK) || (next_target.getType() == CSMDupNode.ORJOIN)
					|| (next_target.getType() == CSMDupNode.WAIT) || (next_target.getType() == CSMDupNode.CSMEMPTY)
					|| (next_target.getType() == CSMDupNode.END) || (next_target.getType() == CSMDupNode.EMPTY)) {
				    insertDummyStep(node_list, conn_list, next_conn, target, next_target);
				    conn_list_size++;
				    node_list.retype(target, CSMDupNode.CSMDUMMY);
				    work_to_do = true; // js:  we need to start over when adding connections
                        	}
                        } // else
                    } // if
                } // if
                // Throw in an empty point in between to adjacent ResponsibilityRef. NEEDS MAJOR CHECKUP. JS
                else if (
                	((source.getType() == CSMDupNode.RESPREF) || (source.getType() == CSMDupNode.STUB))
                	&& 
                	( (target.getType() == CSMDupNode.RESPREF) || (target.getType() == CSMDupNode.STUB))
                	) {

                	// create dummy node
                	MapFactoryImpl mfi = new MapFactoryImpl();
                	EmptyPoint ep = mfi.createEmptyPoint();
                	ep.setName("" + emptyPoint_id);
                	ep.setDescription("" + emptyPoint_id);
                	ep.setId("" + emptyPoint_id);
                	CSMDupNode ep_node = new CSMDupNode(ep);
                	ep_node.setType(CSMDupNode.EMPTY);
                	ep_node.setID("" + emptyPoint_id);
        		ep_node.setResourcesDownstream(source.getResourcesDownstream());
        		ep_node.setResourcesUpstream(target.getResourcesUpstream());
        		emptyPoint_id++;
                	node_list.add(ep_node);

                	// remove curr_conn connection
                    conn_list.remove(curr_conn);
                    conn_list_size--;

                    // add new connection
                    conn_list.add(new CSMDupConnection(source, ep_node));
                    conn_list_size++;
                    conn_list.add(new CSMDupConnection(ep_node, target));
                    conn_list_size++;
               		work_to_do = true; // js:  we need to start over when adding connections
                } // else
                // complex cases //js
                else if ((
                	   (source.getType() == CSMDupNode.START)
                	|| (source.getType() == CSMDupNode.ARROW)
                	|| (source.getType() == CSMDupNode.ANDFORK)
                	|| (source.getType() == CSMDupNode.ANDJOIN)
                	|| (source.getType() == CSMDupNode.ORFORK)
                	|| (source.getType() == CSMDupNode.ORJOIN)
                	|| (source.getType() == CSMDupNode.WAIT)
                	|| (source.getType() == CSMDupNode.END)
                	)&&(
                           (target.getType() == CSMDupNode.START)
                	|| (target.getType() == CSMDupNode.ARROW)
                        || (target.getType() == CSMDupNode.ANDFORK)
                        || (target.getType() == CSMDupNode.ANDJOIN)
                        || (target.getType() == CSMDupNode.ORFORK)
                        || (target.getType() == CSMDupNode.ORJOIN)
                        || (target.getType() == CSMDupNode.WAIT)
                        || (target.getType() == CSMDupNode.END)
                	)) {	// create dummy node
                	insertDummyStep(node_list, conn_list, curr_conn, source, target);
                	conn_list_size++;
            		work_to_do = true; // js:  we need to start over when adding connections
                } // else
                // STEP-STEP needs a DUMMY SEQUENCE. JS
                else if ((source.getType() == CSMDupNode.CSMDUMMY) && (target.getType() == CSMDupNode.CSMDUMMY)) {
                	insertDummyStep(node_list, conn_list, curr_conn, source, target);
                	conn_list_size++;
            		work_to_do = true; // js:  we need to start over when adding connections
                } // else  STEP-STEP case //js
            } // for
        } // while
    } // method

    /**
     * Create a Dummy Step (likely just to comply with CSM syntax)
     * 
     * @param node_list
     * 	where to store generated Step
     * @param conn_list
     *  to connected CSM Dup nodes
     * @param curr_conn
     *  the Dummy Step will be inserted in place of this connection
     * @param source
     *  node preceeding the Dummy Step
     * @param target
     *  node following the Dummy Step
     */
    public void insertDummyStep(CSMDupNodeList node_list, CSMDupConnectionList conn_list, CSMDupConnection curr_conn, CSMDupNode source, CSMDupNode target) {
	// create the new node
	CSMDupNode dummy_node = new CSMDupNode(dummy_id);
	dummy_node.setResourcesDownstream(source.getResourcesDownstream());
	dummy_node.setResourcesUpstream(target.getResourcesUpstream());
	dummy_id++;
	node_list.add(dummy_node);
	// remove curr_conn connection
	conn_list.remove(curr_conn);
	// add new connections to the DummyStep node 
	conn_list.add(new CSMDupConnection(source, dummy_node));
	conn_list.add(new CSMDupConnection(dummy_node, target));
    }
        
    public void export(URNspec urn,  HashMap mapDiagrams, String filename) throws InvocationTargetException {
        // TODO Auto-generated method stub
    }
}
