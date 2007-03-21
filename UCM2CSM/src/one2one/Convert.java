package one2one;

import implicit.CSMDupConnection;
import implicit.CSMDupConnectionList;
import implicit.CSMDupNode;
import implicit.CSMDupNodeList;
import implicit.ResourceAcquisition;
import implicit.ResourceRelease;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import seg.jUCMNav.extensionpoints.IURNExport;
import ucm.map.ComponentRef;
import ucm.map.EmptyPoint;
import ucm.map.PathNode;
import ucm.map.UCMmap;
import ucm.map.impl.MapFactoryImpl;
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
                            "name=\"" + urn.getName() + "\" description= \"" + urn.getDescription() + 
                            "\" author=\"" + urn.getAuthor() + "\" version=\"" + urn.getSpecVersion() + "\">";
                            // Note: "created" not handled yet because of missing Date to xsd:dateTime conversion
        String CSM_footer = "</CSM:CSMType>";

        // output to file
        ps.println(XML_header);
        ps.println(CSM_header);

        // parsing SpecDiagram
        for (Iterator iter = urn.getUrndef().getSpecDiagrams().iterator(); iter.hasNext();) {
            IURNDiagram diag = (IURNDiagram) iter.next();
            if (diag instanceof UCMmap) {
                UCMmap map = (UCMmap) diag;
                exportMap(map, ps);
            }
        }
        ps.println(CSM_footer);
        ps.flush();
    }

    // prints scenario CSM element
    public void csmScenario(UCMmap map, PrintStream ps) {
        // map header and footer

    }

    private void exportMap(UCMmap map, PrintStream ps) {

        String open_scenario_tag = "<Scenario id=\"m" + map.getId() + 
                                   "\" name=\"" + map.getName() + 
                                   "\" traceabilityLink=\"" + map.getId() +
                                   "\" ";
        String close_attributes = ">";
        // optional attributes

        String close_scenario_tag = "</Scenario>";

        // output to file
        ps.print("\n        " + open_scenario_tag);

        if (map.getDescription() != null) {
            String descr_attribute = "description=\"" + map.getDescription() + "\"";
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

        // Generate XML tags
        saveXML(ps, dupMaplist, dupMapConnList);

        // close scenario THEN print components. JS
        ps.println("        " + close_scenario_tag);

        // parsing the map for components
        for (Iterator iter3 = map.getContRefs().iterator(); iter3.hasNext();) {
            ComponentRef compRef = (ComponentRef) iter3.next();
            // if UCM object is found, generate CSM representation
            if (compRef instanceof ComponentRef) {
                ComponentRefConverter obj = new ComponentRefConverter(compRef);
                doComponentRefConvert(obj, ps);
            } else {
                System.out.println("Component not implemented.");
            }

        }
        ps.flush();

    }

    // adds RA/RR/Seq nodes where necessary in the duplicate map
    public void transform(CSMDupNodeList list, CSMDupConnectionList conn_list, PrintStream ps) {
        ResourceAcquisition ra = new ResourceAcquisition(ps);
        ResourceRelease rr = new ResourceRelease(ps);
        int i = 0;
        int list_size = list.size();
        while (i < list_size) {
            CSMDupNode node = (CSMDupNode) list.get(i); // current edge
            if (true)
            		/*js
             		(node.getType() == CSMDupNode.START || node.getType() == CSMDupNode.END || node.getType() == CSMDupNode.STUB
                    || node.getType() == CSMDupNode.RESPREF)
                    */ {

                // keep track of all nodes inserted prior to current edge
                PathNode curr_node = node.getNode();
                ra.acquireResource(curr_node, list, conn_list);
                rr.releaseResource(curr_node, list, conn_list);
            } else {
                System.out.println("Unhandled type = " + node.getType());
            }
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

        // object attributes
        if (predecessor.startsWith("G") && successor.startsWith("G")) {
            dummy_attributes = "<Step id=\"" + id + "\"" + " " + "name= \"" + name + "\"" + " " + "predecessor= \"" + predecessor + "\"" + " "
            + "successor= \"" + successor + "\"" + "/>";        
        } else if (predecessor.startsWith("G") && !successor.startsWith("!G")) {
            dummy_attributes = "<Step id=\"" + id + "\"" + " " + "name= \"" + name + "\"" + " " + "predecessor= \"" + predecessor + "\"" + " "
            + "successor= \"h" + successor + "\"" + "/>";
        } else if (!predecessor.startsWith("!G") && successor.startsWith("G")) {
            dummy_attributes = "<Step id=\"" + id + "\"" + " " + "name= \"" + name + "\"" + " " + "predecessor= \"h" + predecessor + "\"" + " "
            + "successor= \"" + successor + "\"" + "/>";
        } else {        	
            dummy_attributes = "<Step id=\"" + id + "\"" + " " + "name= \"" + name + "\"" + " " + "predecessor= \"h" + predecessor + "\"" + " "
            + "successor= \"h" + successor + "\"" + "/>";
        }

        // output to file
        ps.println("            " + dummy_attributes);
        ps.flush();
    }
    
    // print CSM output for RA and Sequence
    public void saveXML(PrintStream ps, CSMDupNodeList dupMaplist, CSMDupConnectionList dupMapConnlist) {

        for (int b = 0; b < dupMaplist.size(); b++) {
            CSMDupNode curr_node = (CSMDupNode) dupMaplist.get(b);
            // printing RA
            if (curr_node.getId().startsWith("G1")) {
        	Component comp = curr_node.getCompToAcquire();
                ResourceAcquisition ra = new ResourceAcquisition(ps);
                if (comp != null) {
                    ra.acquireComp(comp, curr_node, dupMapConnlist);    
                } else {
                    String res = curr_node.getResToAcquire();
                    ra.acquireComp(res, curr_node, dupMapConnlist);
                }
                
            }
            // printing RR
            else if (curr_node.getId().startsWith("G3")) {
                Component comp = curr_node.getCompToRelease();
                ResourceRelease rr = new ResourceRelease(ps);
                if (comp != null) {
                    rr.releaseComp(comp, curr_node, dupMapConnlist);    
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
            } else { // print other objects
                // initializing attributes
                String curr_node_id = ((PathNode) ((CSMDupNode) dupMaplist.get(b)).getNode()).getId();
                // determine new source and target of all PathConnection types
                ArrayList source = new ArrayList();
                ArrayList target = new ArrayList();
                // retrieve list of target/source nodes
                source = getSources(dupMapConnlist, curr_node_id);
                target = getTargets(dupMapConnlist, curr_node_id);
                curr_node.printPathNode(ps, source, target);
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
        if (!sources.isEmpty()) {
            return sources;
        } else
            return null;
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
        if (!targets.isEmpty()) {
            return targets;
        } else
            return null;
    } // method

    // Eliminate adjacent emptyPoints
    public void eliminateAdjacentEmptyPoints(CSMDupNodeList node_list, CSMDupConnectionList conn_list) {
        boolean adj_ep_found = true;
        while (adj_ep_found) {
            adj_ep_found = false; // reset loop condition
            // Scan the list of connections for a connection that has EmptyPoints as both source and target
            int conn_list_size = conn_list.size();
            for (int i = 0; i < conn_list_size; i++) {
                CSMDupConnection curr_conn = (CSMDupConnection) conn_list.get(i);
                CSMDupNode source = (CSMDupNode) curr_conn.getCSMSource();
                CSMDupNode target = (CSMDupNode) curr_conn.getCSMTarget();

                if (source.isPathNode() && (source.getNode() instanceof EmptyPoint) && target.isPathNode() && (target.getNode() instanceof EmptyPoint)) {
                    // find next connection, that has source = 'target'
                    if (conn_list.existsConnectionForSource(target)) {
                        CSMDupConnection next_conn = (CSMDupConnection) conn_list.getConnectionForSource(target);
                        CSMDupNode next_target = (CSMDupNode) next_conn.getCSMTarget();

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
        int dummy_id = 5000; // limitation.  js
        int emptyPoint_id = 9000; //js

        while (work_to_do) {
            work_to_do = false; // reset loop condition
            // Scan the list of connections for a connection that has Steps as both source and target
            int conn_list_size = conn_list.size();
            for (int i = 0; i < conn_list_size; i++) {
                CSMDupConnection curr_conn = (CSMDupConnection) conn_list.get(i);
                CSMDupNode source = (CSMDupNode) curr_conn.getCSMSource();
                CSMDupNode target = (CSMDupNode) curr_conn.getCSMTarget();

                // Empty point is in between two steps
                if (target.isPathNode() && (target.getNode() instanceof EmptyPoint)) {
                    if (conn_list.existsConnectionForSource(target)) {
                        CSMDupConnection next_conn = (CSMDupConnection) conn_list.getConnectionForSource(target);
                        CSMDupNode next_target = (CSMDupNode) next_conn.getCSMTarget();
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
                        	if ( (next_target.getType() == CSMDupNode.RESPREF) || (next_target.getType() == CSMDupNode.STUB)
                        		||
                            		 (next_target.getType() == CSMDupNode.RR)  || (next_target.getType() == CSMDupNode.RA)  ) {
                                // delete empty point
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
                            } else { // replace empty point with dummy
                                // delete empty point
                                // remove 'target' node
                                node_list.remove(target);

                                // create dummy node
                                CSMDupNode dummy_node = new CSMDupNode(dummy_id);
                		dummy_node.setResourcesDownstream(source.getResourcesDownstream());
                		dummy_node.setResourcesUpstream(target.getResourcesUpstream());
                                dummy_id++;
                                node_list.add(dummy_node);

                               // remove curr_conn connection
                                conn_list.remove(curr_conn);
                                conn_list_size--;

                                // remove next_conn connection
                                conn_list.remove(next_conn);
                                conn_list_size--;

                                // add new connection
                                conn_list.add(new CSMDupConnection(source, dummy_node));
                                conn_list_size++;
                                conn_list.add(new CSMDupConnection(dummy_node, next_target));
                                conn_list_size++;
                                work_to_do = true; // js:  we need to start over when adding connections
                            } // else
                        } // else
                    } // if
                } // if 
                //  Throw in an empty point in between to adjacent ResponsibilityRef. NEEDS MAJOR CHECKUP. JS 
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
                	CSMDupNode ep_node = new CSMDupNode((PathNode)ep);
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
                	|| (source.getType() == CSMDupNode.CSMEMPTY)
                	)&&(
                	   (target.getType() == CSMDupNode.ARROW)
                        || (target.getType() == CSMDupNode.END)
                        || (target.getType() == CSMDupNode.ANDFORK)
                        || (target.getType() == CSMDupNode.ANDJOIN)
                        || (target.getType() == CSMDupNode.ORFORK)
                        || (target.getType() == CSMDupNode.ORJOIN)
                        || (target.getType() == CSMDupNode.CSMEMPTY)                        		
                	)) {	// create dummy node
                	dummy_id = insertDummyStep(dummy_id, node_list, conn_list, curr_conn, source, target);
                	conn_list_size++;
            		work_to_do = true; // js:  we need to start over when adding connections
                } // else
                // STEP-STEP needs a DUMMY SEQUENCE. JS
                else if ((source.getType() == CSMDupNode.CSMDUMMY) && (target.getType() == CSMDupNode.CSMDUMMY)) {
                	dummy_id = insertDummyStep(dummy_id, node_list, conn_list, curr_conn, source, target);
                	conn_list_size++;
            		work_to_do = true; // js:  we need to start over when adding connections
                } // else  STEP-STEP case //js
            } // for
        } // while
    } // method

    // js
    public int insertDummyStep(int dummy_id, CSMDupNodeList node_list, CSMDupConnectionList conn_list, CSMDupConnection curr_conn, CSMDupNode source, CSMDupNode target) {
//    	create dummy node
		CSMDupNode dummy_node = new CSMDupNode(dummy_id);
		dummy_node.setResourcesDownstream(source.getResourcesDownstream());
		dummy_node.setResourcesUpstream(target.getResourcesUpstream());
		dummy_id++;
		node_list.add(dummy_node);
		// remove curr_conn connection
		conn_list.remove(curr_conn);
		// add the new connections
		conn_list.add(new CSMDupConnection(source, dummy_node));
		conn_list.add(new CSMDupConnection(dummy_node, target));
		return dummy_id;
    }
        
    public void export(URNspec urn,  HashMap mapDiagrams, String filename) throws InvocationTargetException {
        // TODO Auto-generated method stub
    }
}
