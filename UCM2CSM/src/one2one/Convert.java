package one2one;

import implicit.CSMDupNode;
import implicit.CSMDupNodeList;
import implicit.ResourceAcquisition;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import seg.jUCMNav.extensionpoints.IURNExport;
import ucm.map.AndFork;
import ucm.map.AndJoin;
import ucm.map.ComponentRef;
import ucm.map.EmptyPoint;
import ucm.map.EndPoint;
import ucm.map.OrFork;
import ucm.map.OrJoin;
import ucm.map.PathNode;
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
	
	// Converts object through polymorphism (dynamic binding)
    public void doConvert(AbstractConverter pn, PrintStream ps){
        pn.Convert(ps);
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
	    //resource acquisition 
        // ResourceAcquisition ra = new ResourceAcquisition();        
        
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
        
        // Insert RA/RR/Seq nodes in above list 
        transform(dupMaplist, ps);
        
        // Generate XML tags for all elements in above list
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
            /*
            else if(node instanceof ProcessingResource){ 
            	ProcessingResourceConverter obj = new ProcessingResourceConverter((ProcessingResource)node);
            }
            */
            else{
                System.out.println("Node not implemented.");
            }
                      
		}
    
		// looking at stub for inbindings and outbindings
        for (Iterator iter4 = map.getParentStub().iterator(); iter4.hasNext();) {        	
        	PluginBinding binding = (PluginBinding) iter4.next();        	        	
        	if(binding instanceof PluginBinding){
                PluginBindingConverter obj = new PluginBindingConverter(binding);
                doConvert(obj,ps);
            }
        }
		
		// parsing the map for components      
        for (Iterator iter3 = map.getContRefs().iterator(); iter3.hasNext();) {
            ComponentRef cref = (ComponentRef) iter3.next();              
            //  if UCM object is found, generate CSM representation
            if(cref instanceof ComponentRef){                
                ComponentConverter obj = new ComponentConverter(cref);
                doConvert(obj,ps);
            }            
            else{
                System.out.println("Component not implemented.");
            }

        }
        ps.println("        " + close_scenario_tag);
        ps.flush();
        
	}
    
    // adds RA/RR/Seq nodes where necessary
    public void transform(CSMDupNodeList list, PrintStream ps){
        // resource acquisition 
        ResourceAcquisition ra = new ResourceAcquisition();    
        int i = 0;
        while (i < list.size()){    
            CSMDupNode node = (CSMDupNode) list.get(i);
            System.out.println("Read Node " + i + ": " + node.toString()); 
            if(node.getType() == CSMDupNode.START ||
               node.getType() == CSMDupNode.END   ||
               node.getType() == CSMDupNode.STUB  ||
               node.getType() == CSMDupNode.RESPREF){
                int ni = ra.acquireResource(node.getNode(), list, ps);
                i = i + ni;
            }            
            i++;
        }        
    }
	
	public void export(URNspec urn, String filename) throws InvocationTargetException {
		// TODO Auto-generated method stub		
	}
}
