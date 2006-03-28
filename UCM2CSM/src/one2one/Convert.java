package one2one;

import implicit.CSMDupNode;
import implicit.CSMDupNodeList;
import implicit.ResourceAcquisition;
import implicit.ResourceRelease;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.Iterator;

import seg.jUCMNav.extensionpoints.IURNExport;
import ucm.map.AndFork;
import ucm.map.AndJoin;
import ucm.map.ComponentRef;
import ucm.map.EmptyPoint;
import ucm.map.EndPoint;
import ucm.map.OrFork;
import ucm.map.OrJoin;
import ucm.map.PluginBinding;
import ucm.map.RespRef;
import ucm.map.StartPoint;
import ucm.map.Stub;
import ucm.map.UCMmap;
import ucm.map.impl.PathNodeImpl;
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
         * This map contains references to all PathNodes in the original map
         * This intermediate map is implemented as a list 
         */ 
        CSMDupNodeList dupMaplist = new CSMDupNodeList();
        dupMaplist.DuplicateHyperEdges(map);
        Hashtable comp_map = new Hashtable(); // stores the acquire/release components associated with every RA/RR 
        
        // Insert RA/RR/Seq nodes in above list 
        transform(dupMaplist, comp_map, ps);
        
        // Generate XML tags
        saveXML(ps, dupMaplist, comp_map);
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
                          Hashtable comp_map,                          
                          PrintStream ps){         
        ResourceAcquisition ra = new ResourceAcquisition(ps);
        ResourceRelease rr = new ResourceRelease(ps);
        int i = 0;
        while (i < list.size() - 1){    
            CSMDupNode node = (CSMDupNode) list.get(i); // current edge
            // System.out.println("Read Node " + i + ": " + node.toString()); 
            if(node.getType() == CSMDupNode.START ||
               node.getType() == CSMDupNode.END   ||
               node.getType() == CSMDupNode.STUB  ||
               node.getType() == CSMDupNode.RESPREF){
               // keep track of all nodes inserted prior to current edge 
               int ra_node_insert = ra.acquireResource(node.getNode(), list, comp_map);
               int rr_node_insert = rr.releaseResource(node.getNode(), list, comp_map);       
               i = i + ra_node_insert;
               i = i + rr_node_insert;               
            }           
            i++;
        }
        //  normalize duplicate map
        // normalize(list);
    }
    // normalize algorithm -- insert empty points in between steps and pathconnections
    public void normalize(CSMDupNodeList list){
        //  sequence ids for dummy empty points
        int seq_id = 500;
        String prev_edge_type_str = "";
        String curr_edge_type_str = "";
        for (int i=1; i < list.size(); i++){            
            // previous edge node type
            int prev_edge_type = ((CSMDupNode)(list.get(i-1))).getType();            
            // current edge node type
            int curr_edge_type = ((CSMDupNode)(list.get(i))).getType();
            // convert type from int to string, so we have only 2 kinds of elements to deal with            
            if (prev_edge_type == CSMDupNode.STUB ||
                prev_edge_type == CSMDupNode.RESPREF ||
                prev_edge_type == CSMDupNode.RA ||
                prev_edge_type == CSMDupNode.RR ){
                prev_edge_type_str = "Step";
            }
            else
                prev_edge_type_str = "PathConnection";
            if (curr_edge_type == CSMDupNode.STUB ||
                curr_edge_type == CSMDupNode.RESPREF ||
                curr_edge_type == CSMDupNode.RA ||
                curr_edge_type == CSMDupNode.RR ){
                curr_edge_type_str = "Step";
            }
            else
                curr_edge_type_str = "PathConnection";
            System.out.println("Prev edge type:" + prev_edge_type_str);
            System.out.println("Curr edge type:" + curr_edge_type_str);
            
            if (curr_edge_type != CSMDupNode.END){
                // if previous edge is a step and current edge are of the same type, insert Empty Point
                if (prev_edge_type_str.compareTo(curr_edge_type_str) == 0){
                    // create empty point and insert it in duplicate map                
                    CSMDupNode e_node = new CSMDupNode(seq_id);
                    list.add(i,e_node);
                    seq_id++;
                    System.out.println("Inserted E-POint" + seq_id);
                }
            }
            // end-point 
            else {
                // if previous edge is a step and current edge are of the same type, insert Empty Point
                if (prev_edge_type_str.compareTo(curr_edge_type_str) == 0){
                    // create empty point and insert it in duplicate map and exit loop                
                    CSMDupNode e_node = new CSMDupNode(seq_id);
                    list.add(i,e_node);
                    seq_id++; 
                    System.out.println("Inserted E-POint" + seq_id);
                    return;
                }
            } // if                        
        }// for
    }
    
    // print CSM output for RA and Sequence
    public void saveXML(PrintStream ps, CSMDupNodeList dupMaplist, Hashtable comp_map){
        ResourceAcquisition ra = new ResourceAcquisition(ps);
        ResourceRelease rr = new ResourceRelease(ps);
        dupMaplist.printDupList(); // debug
      
        for (int b = 0; b < dupMaplist.size(); b ++){              
             CSMDupNode curr_node = (CSMDupNode)dupMaplist.get(b);
             
             // printing RA
             if (curr_node.getId().startsWith("G1")){
             // if (curr_node.getType() == CSMDupNode.RA){                 
                 ComponentRef comp = (ComponentRef) comp_map.get(curr_node.getId());                 
                 ra.acquireComp(comp,curr_node,dupMaplist,b);
             }
             // printing RR
             else if (curr_node.getId().startsWith("G3")){
             // if (curr_node.getType() == CSMDupNode.RR){                 
                 ComponentRef comp = (ComponentRef) comp_map.get(curr_node.getId());                 
                 rr.releaseComp(comp,curr_node,dupMaplist,b);
             }
             // printing RA_Sequence
             else if (curr_node.getId().startsWith("G2")){
             // if (curr_node.getType() == CSMDupNode.EMPTY){
                 ra.acquireEmptyPoint(curr_node, dupMaplist, b);
             }
             // printing RR_Sequence
             else if (curr_node.getId().startsWith("G4")){
             // if (curr_node.getType() == CSMDupNode.EMPTY){
                 ra.acquireEmptyPoint(curr_node,dupMaplist, b);
             }
             // printing dummy Sequence
             else if (curr_node.getId().startsWith("G5")){
             // if (curr_node.getType() == CSMDupNode.EMPTY){
                 ra.acquireEmptyPoint(curr_node,dupMaplist, b);
             }
             else{ // print other objects
                 // determine new source and target of all PathConnection types
                 String source = null;
                 String target = null;
                 if (b == 0) // start point
                     target = dupMaplist.getSuccessor(b);
                 else if (b == dupMaplist.size() - 1) // end point
                     source = dupMaplist.getPredecessor(b);
                 else{
                     target = dupMaplist.getSuccessor(b);
                     source = dupMaplist.getPredecessor(b);
                 }
                 curr_node.printPathNode(ps, source, target);
             }
        } // for
    }
	
	public void export(URNspec urn, String filename) throws InvocationTargetException {
		// TODO Auto-generated method stub		
	}
}
