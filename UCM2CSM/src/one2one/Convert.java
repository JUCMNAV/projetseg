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
import java.util.Hashtable;
import java.util.Iterator;

import seg.jUCMNav.extensionpoints.IURNExport;
import ucm.map.ComponentRef;
import ucm.map.EmptyPoint;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.map.Stub;
import ucm.map.UCMmap;
import urn.URNspec;
import urncore.IURNDiagram;
/**
 * <!-- begin-user-doc -->
 * Performs implicit and explicit conversions on UCM components 
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */

public class Convert implements IURNExport {
	
    //  Converts object through polymorphism (dynamic binding)
    public void doComponentConvert(ComponentConverter obj, PrintStream ps){
        obj.Convert(ps);
    }

	public void export(URNspec urn, FileOutputStream fos) throws InvocationTargetException {
        
        PrintStream ps = new PrintStream(fos);
        
        // CSM header and footer 
        String XML_header = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";    
        String CSM_header = "<CSM name=\"root\" " +
                            "description= \"" + urn.getDescription() + "\">";
        String CSM_footer = "</CSM>";         
        
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
	
	private void exportMap(UCMmap map, PrintStream ps) {
        
        // map header and footer
        String open_scenario_tag = "<Scenario id=\"" + "m" + map.getId() + "\"" +
                                    " " + "name=\"" + map.getName()+ "\"" +
                                    " " + "description=\"" + map.getDescription()+ "\"" + " " + ">";
        String close_scenario_tag = "</Scenario>";
        
        // output to file
        ps.println("        " + open_scenario_tag);
       
        /* Create an intermediate map based on original one
         * This map contains references to all PathNodes in the original map as well
         * as references to all the original connections in the map
         * This intermediate map is implemented as two list;
         *                  - a node list
         *                  - a connections list 
         */ 
        CSMDupNodeList dupMaplist = new CSMDupNodeList();
        dupMaplist.DuplicateHyperEdges(map);
        CSMDupConnectionList dupMapConnList = new CSMDupConnectionList();
        dupMapConnList.DuplicateConnection(map);
        Hashtable comp_map = new Hashtable(); // stores the acquire/release components associated with every RA/RR 
        
        // Insert RA/RR/Seq nodes in above list 
        transform(dupMaplist,dupMapConnList, comp_map, ps);
        
        // Generate XML tags
        saveXML(ps, dupMaplist, dupMapConnList, comp_map);
        /*
        // code for explicit transformation (remains to be integrated with implicit
        int i=0;
		for (Iterator iter2 = map.getNodes().iterator(); iter2.hasNext();) {
            i++;
		    PathNodeImpl node = (PathNodeImpl) iter2.next();
            // System.out.println("Read Node " + i + ": " + node.toString());            
            
		    // if UCM object is found, generate CSM representation
		    if(node instanceof OrJoin){
		       OrJoinConverter obj = new OrJoinConverter((OrJoin)node); 
		       doConvert(obj,ps);               
		    }		    
            else if(node instanceof AndJoin){
		        AndJoinConverter obj = new AndJoinConverter((AndJoin)node); 
		        doConvert(obj,ps);
		    }
            else if(node instanceof OrFork){
			    OrForkConverter obj = new OrForkConverter((OrFork)node); 
			    doConvert(obj,ps);
            }
            else if(node instanceof AndFork){
			    AndForkConverter obj = new AndForkConverter((AndFork)node); 
			    doConvert(obj,ps);
			}            
            else if(node instanceof StartPoint){
                StartPointConverter obj = new StartPointConverter((StartPoint)node); 
                doConvert(obj,ps);
            }
            else if(node instanceof EndPoint){
                EndPointConverter obj = new EndPointConverter((EndPoint)node); 
                doConvert(obj,ps);
            } 
            else if(node instanceof EmptyPoint){
		 	    EmptyPointConverter obj = new EmptyPointConverter((EmptyPoint)node);
		 	    doConvert(obj,ps);
		 	}
            else if(node instanceof Stub){
                StubConverter obj = new StubConverter((Stub)node);
                doConvert(obj,ps);                
            }
            else if(node instanceof RespRef){
                ResponsibilityRefConverter obj = new ResponsibilityRefConverter((RespRef)node);
                doConvert(obj,ps);
            }
            
            else if(node instanceof ProcessingResource){ 
            	ProcessingResourceConverter obj = new ProcessingResourceConverter((ProcessingResource)node);
            }
            
            else{
                System.out.println("Node not implemented.");
            }                     
		} // for
            */
        /*
		// looking at stub for inbindings and outbindings
        for (Iterator iter4 = map.getParentStub().iterator(); iter4.hasNext();) {        	
        	PluginBinding binding = (PluginBinding) iter4.next();        	        	
        	if(binding instanceof PluginBinding){
                PluginBindingConverter obj = new PluginBindingConverter(binding);
                doConvert(obj,ps);
            }
        }
		*/
		// parsing the map for components      
        for (Iterator iter3 = map.getContRefs().iterator(); iter3.hasNext();) {
            ComponentRef cref = (ComponentRef) iter3.next();              
            //  if UCM object is found, generate CSM representation
            if(cref instanceof ComponentRef){                
                ComponentConverter obj = new ComponentConverter(cref);
                doComponentConvert(obj,ps);
            }            
            else{
                System.out.println("Component not implemented.");
            }

        }
        ps.println("        " + close_scenario_tag);
        ps.flush();
        
	}
    
    // adds RA/RR/Seq nodes where necessary in the duplicate map
    public void transform(CSMDupNodeList list,
                          CSMDupConnectionList conn_list,  
                          Hashtable comp_map,                          
                          PrintStream ps){         
        ResourceAcquisition ra = new ResourceAcquisition(ps);
        ResourceRelease rr = new ResourceRelease(ps);
        System.out.println("*********In Transform*************");
        list.printDupList(); // debug
        conn_list.printDupList(); // debug
        int i = 0;
        int list_size = list.size();
        // System.out.println("List size: " + list.size());
        while (i < list_size){    
            CSMDupNode node = (CSMDupNode) list.get(i); // current edge
            // System.out.println("Read Node " + i + ": " + node.toString());
            // System.out.println("Reading type: " + node.getType());
            if(node.getType() == CSMDupNode.START ||
               node.getType() == CSMDupNode.END   ||
               node.getType() == CSMDupNode.STUB  ||
               node.getType() == CSMDupNode.RESPREF){
               // keep track of all nodes inserted prior to current edge
               PathNode curr_node = node.getNode(); 
               // ResourceAcquisition ra = new ResourceAcquisition(ps);
               ra.acquireResource(curr_node, list, conn_list, comp_map);
               //ResourceRelease rr = new ResourceRelease(ps);
               list.printDupList(); // debug
               conn_list.printDupList(); // debug
               rr.releaseResource(curr_node, list, conn_list, comp_map);
               /*
               i = i + ra_node_insert;
               list_size+=ra_node_insert;
               i = i + rr_node_insert;
               list_size+=rr_node_insert;
               */
            }
            else {
                System.out.println("Unhandled type = " + node.getType());
            }
            i++;
        }

        //  normalize duplicate map -- does not work yet!
        // normalize(list, conn_list);
    }
    
    /* normalize algorithm -- insert dummy resp refs in between steps and pathconnections
     *                        and delete redundant empty points 
     */
    /*
    public void normalize(CSMDupNodeList list, CSMDupConnectionList conn_list){                
        //  sequence ids for dummy empty points
        int dummy_id = 500;
        int list_size = list.size();
        for (int i=0; i < list_size; i++){
            CSMDupNode curr_edge = (CSMDupNode) list.get(i); // current edge
            // removing all additional NODE empty points (not created by RA/RR algorithms)
            if (curr_edge.getType() == CSMDupNode.EMPTY){
                // build a list of all previous and all subsequent edges
                String curr_edge_id = curr_edge.getId();
                ArrayList prev_edge_list = new ArrayList(1000);                
                ArrayList next_edge_list = new ArrayList(1000);
                conn_list.getPrevEdgeList(curr_edge_id, prev_edge_list);
                // for debug -- Printing prev_edge_list
                System.out.println("--------Printing prev_edge_list----------");
                for (int a=0;a<prev_edge_list.size(); a++){
                    System.out.println("Index " + a + " Contents: " + prev_edge_list.get(a));
                }
                System.out.println("-----------------------------------------");
                conn_list.getNextEdgeList(curr_edge_id, next_edge_list);
                next_edge_list = conn_list.reverseList(next_edge_list);
                
                //  for debug -- Printing next_edge_list
                System.out.println("--------Printing next_edge_list----------");
                for (int b=0;b<next_edge_list.size(); b++){
                    System.out.println("Index " + b + " Contents: " + next_edge_list.get(b));
                }
                System.out.println("-----------------------------------------");
                 
                // scan previous edge list looking for adjacent empty points
                if (prev_edge_list.size() > 1){
                    for (int j = 0; j < prev_edge_list.size() - 1; j++){
                        PathNode prev_edge = (PathNode)prev_edge_list.get(j);
                        PathNode prev_prev_edge = (PathNode)prev_edge_list.get(j+1);
                        if (prev_edge instanceof EmptyPoint){
                            // remove redundant node and adjust links
                            list.remove(prev_edge);
                            // CSMDupNode source = conn_list.getSourceForTarget(curr_edge.getNode());
                            conn_list.remove(curr_edge, prev_edge);
                            conn_list.remove(prev_edge, curr_edge);
                            conn_list.remove(prev_edge, prev_prev_edge);
                            conn_list.remove(prev_prev_edge, prev_edge);
                            conn_list.add(new CSMDupConnection(curr_edge, prev_prev_edge));
                            list.printDupList(); // debug
                            conn_list.printDupList(); // debug
                        }// if
                    } //for
                } // if     
                // scan next edge list looking for adjacent empty points
                if (next_edge_list.size() > 1){
                    for (int j = 0; j < next_edge_list.size() - 1; j++){
                        PathNode next_edge = (PathNode) next_edge_list.get(j);
                        PathNode next_next_edge = (PathNode) next_edge_list.get(j+1);
                        if (next_edge instanceof EmptyPoint){
                            // remove redundant node and adjust links
                            list.remove(next_edge);
                            // CSMDupNode target = conn_list.getTargetForSource(next_edge);
                            conn_list.remove(curr_edge, next_edge);
                            conn_list.remove(next_edge, curr_edge);
                            conn_list.remove(next_edge, next_next_edge);
                            conn_list.remove(next_next_edge, next_edge);
                            conn_list.add(new CSMDupConnection(curr_edge, next_next_edge));
                            list.printDupList(); // debug
                            conn_list.printDupList(); // debug
                        } // if
                     } // for
                } //  if
                
                PathNode prev_edge = (PathNode) prev_edge_list.get(0);
                PathNode next_edge = (PathNode) next_edge_list.get(0);
                if (prev_edge instanceof RespRef || prev_edge instanceof Stub){
                    if (next_edge instanceof RespRef || next_edge instanceof Stub){
                        ; // keep node
                    }
                    else{
                        // remove redundant node and adjust links
                        list.remove(curr_edge);                        
                        conn_list.remove(prev_edge, curr_edge);
                        conn_list.remove(curr_edge, next_edge);
                        conn_list.add(new CSMDupConnection(prev_edge, next_edge));
                    }                        
                }
                else{
                    if (next_edge instanceof RespRef || next_edge instanceof Stub){
                        // remove redundant node and adjust links
                        list.remove(curr_edge);                        
                        conn_list.remove(prev_edge, curr_edge);
                        conn_list.remove(curr_edge, next_edge);
                        conn_list.add(new CSMDupConnection(prev_edge, next_edge));
                    }
                    else{
                        // create dummy responsibility
                        dummy_id = substituteWithDummy(curr_edge, conn_list, list, prev_edge, next_edge, curr_edge, dummy_id);
                    }                       
                }
                
            }
        }                
    }
    
    */
    /*
    // substitutes empty point with a dummy responsibility
    public int substituteWithDummy(PathNode epoint,
                                   CSMDupConnectionList conn_list,
                                   CSMDupNodeList list,
                                   PathNode prev_edge,
                                   PathNode next_edge,
                                   CSMDupNode curr_edge,
                                   int id){
        //  remove redundant node and adjust links        
        list.remove(epoint);
        conn_list.remove(prev_edge, curr_edge);
        conn_list.remove(curr_edge, next_edge);
        conn_list.add(new CSMDupConnection(prev_edge, next_edge));
        // add new node and adjust links
        CSMDupNode dummy_step = new CSMDupNode(id);
        list.add(dummy_step);
        conn_list.remove(prev_edge, next_edge);
        conn_list.add(new CSMDupConnection(prev_edge, dummy_step));
        conn_list.add(new CSMDupConnection(dummy_step, next_edge));
        id++;
        return id;
    }
    // prints dummy step
    public void printDummyStep(CSMDupNode node,
                               String id,
                               PrintStream ps,
                               CSMDupConnectionList list){
        // initializing attributes
        String name = "Dummy";
        String successor = list.getTargetForSource (node.getId());
        String predecessor = list.getSourceForTarget(node.getId());
        
        // object attributes              
        String dummy_attributes = "<Step id=\"" + id + "\"" + " " +
                                    "name= \"h" + name + "\"" + " " +
                                    "predecessor= \"h" + predecessor + "\"" + 
                                    "successor= \"h" + successor + "\"" + "/>";        
        // output to file
        ps.println("            " + dummy_attributes);
        ps.flush();     
    }
    */
    // print CSM output for RA and Sequence
    public void saveXML(PrintStream ps,
                        CSMDupNodeList dupMaplist,
                        CSMDupConnectionList dupMapConnlist,
                        Hashtable comp_map){
        // ResourceAcquisition ra = new ResourceAcquisition(ps);
        // ResourceRelease rr = new ResourceRelease(ps);
        dupMaplist.printDupList(); // debug
        dupMapConnlist.printDupList(); // debug
      
        for (int b = 0; b < dupMaplist.size(); b ++){              
             CSMDupNode curr_node = (CSMDupNode)dupMaplist.get(b);
             
             // printing RA
             if (curr_node.getId().startsWith("G1")){
             // if (curr_node.getType() == CSMDupNode.RA){                 
                 ComponentRef comp = (ComponentRef) comp_map.get(curr_node.getId());
                 ResourceAcquisition ra = new ResourceAcquisition(ps);                 
                 ra.acquireComp(comp,curr_node, dupMapConnlist);
             }
             // printing RR
             else if (curr_node.getId().startsWith("G3")){
             // if (curr_node.getType() == CSMDupNode.RR){                 
                 ComponentRef comp = (ComponentRef) comp_map.get(curr_node.getId());
                 ResourceRelease rr = new ResourceRelease(ps);
                 rr.releaseComp(comp,curr_node, dupMapConnlist);
             }
             // printing RA_Sequence
             else if (curr_node.getId().startsWith("G2")){
             // if (curr_node.getType() == CSMDupNode.EMPTY){
                 ResourceAcquisition ra = new ResourceAcquisition(ps);
                 ra.acquireEmptyPoint(curr_node, dupMapConnlist);
             }
             // printing RR_Sequence
             else if (curr_node.getId().startsWith("G4")){
             // if (curr_node.getType() == CSMDupNode.EMPTY){
                 ResourceRelease rr = new ResourceRelease(ps);
                 rr.acquireEmptyPoint(curr_node,dupMapConnlist);
             }
             // printing dummy Sequence
             else if (curr_node.getId().startsWith("G5")){
             // if (curr_node.getType() == CSMDupNode.EMPTY){
                // ResourceAcquisition ra = new ResourceAcquisition(ps);
                //  ra.acquireEmptyPoint(curr_node,dupMapConnlist);
                //printDummyStep(curr_node, curr_node.getId(), ps, dupMapConnlist);                 
             }
             else{ // print other objects
                 // initializing attributes
                 String curr_node_id = ((PathNode)((CSMDupNode)dupMaplist.get(b)).getNode()).getId();
                 // String successor = dupMapConnlist.getSourceForTarget(curr_node.getId());
                 // String predecessor = dupMapConnlist.getTargetForSource(curr_node.getId());        
                 
                 // determine new source and target of all PathConnection types
                 // String source = null;
                 // String target = null;
                 // determine new source and target of all PathConnection types
                 ArrayList source = new ArrayList();
                 ArrayList target = new ArrayList();
                 // retrieve list of target/source nodes
                 source = getSources(dupMapConnlist, curr_node_id);
                 target = getTargets(dupMapConnlist, curr_node_id);
                 /*
                 if (b == 0) // start point
                     target = dupMapConnlist.getSourceForTarget(curr_node.getId());
                 else if (b == dupMaplist.size() - 1) // end point
                     source = dupMapConnlist.getTargetForSource(curr_node.getId());        
                 else{
                     target = dupMapConnlist.getSourceForTarget(curr_node.getId());
                     source = dupMapConnlist.getTargetForSource(curr_node.getId());        
                 }
                 */
                 curr_node.printPathNode(ps, source, target);
             }
        } // for
    }
	
    // retrieve list of source nodes
    public ArrayList getSources(CSMDupConnectionList dupMapConnlist, String edge_id){
        ArrayList sources = new ArrayList();        
        for (int i=0; i < dupMapConnlist.size();i++){               
            // if more than one target node is repeated, create a list of sources for each instance of that target
            String source_id = dupMapConnlist.get(i).getSourceStr();
            String target_id = dupMapConnlist.get(i).getTargetStr();                     
            if (target_id.compareTo(edge_id) == 0){                     
                sources.add(source_id);                     
            } // if              
        } // for
        if (!sources.isEmpty()){
            return sources;
        }
        else
            return null;
    } // method
    
    //  retrieve list of target nodes
    public ArrayList getTargets(CSMDupConnectionList dupMapConnlist, String edge_id){
        ArrayList targets = new ArrayList();        
        for (int i=0; i < dupMapConnlist.size();i++){               
            // if more than one target node is repeated, create a list of sources for each instance of that target
            String source_id = dupMapConnlist.get(i).getSourceStr();
            String target_id = dupMapConnlist.get(i).getTargetStr();                     
            if (source_id.compareTo(edge_id) == 0){                     
                targets.add(target_id);                     
            } // if              
        } // for
        if (!targets.isEmpty()){
            return targets;
        }
        else
            return null;
    } // method
    
    
	public void export(URNspec urn, String filename) throws InvocationTargetException {
		// TODO Auto-generated method stub		
	}
}
