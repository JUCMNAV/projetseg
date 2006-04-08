package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.EndPoint;
import ucm.map.PathNode;
import ucm.map.StartPoint;

/**
 * <!-- begin-user-doc -->
 * Prints PathConnection optional attributes to CSM file 
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */

public class PathConnAttributes {


	public void OptionalAttributes(PathNode af,
                                   PrintStream ps,
                                   ArrayList source,
                                   ArrayList target){

		printDescription(ps, af);
		// printTracebilityLink(ps, af);
		printSource(ps, af, source);
		printTarget(ps, af, target);
	}
    
	// prints the source attribute
	public static void printSource(PrintStream ps, PathNode pathnode, ArrayList source) {        
        if (source != null){            
            String source_attribute = "source= \"h" + source.toString().subSequence(1,(source.toString().length()-1)) +"\"";
            ps.print(" " + source_attribute);
        }
	}
    // prints the target attribute
	public static void printTarget(PrintStream ps, PathNode pathnode, ArrayList target) {        
        if (target != null){            
            // special case for StartPoint   
            if (pathnode.getName().compareTo("StartPoint")== 0){
                String target_attribute = "target= \"h" + target.toString().subSequence(1,(target.toString().length()-1)) + "\"" + ">";
                ps.println(" " + target_attribute);
            }
            else {
                String target_attribute = "target= \"h" + target.toString().subSequence(1,(target.toString().length()-1)) +"\"";
                ps.print(" " + target_attribute);
           }
        }
	}
    
    // prints description attribute
	public static void printDescription(PrintStream ps, PathNode pathnode) {
	    if (pathnode.getDescription() != null){
	        String description_attribute = " description=\"" + pathnode.getDescription() +"\"";
	        ps.print(description_attribute);
	    }
	}
	
	public static void printTracebilityLink (PrintStream ps, PathNode pathnode) {
	    if (pathnode.getId() != null){
	        String tracebility_attribute = " Tracebilitylink=\"h" + pathnode.getId() +"\"";
	        ps.print(tracebility_attribute);
	    }
	}
    
	// prints inbinding attribute
    public void inbinding(PrintStream ps, StartPoint sp) {
    	if (!sp.getInBindings().isEmpty()){
            String inbind = "";
            for (int i=0;i<sp.getInBindings().size(); i++){
         	   String in_bind_str = sp.getInBindings().get(i).toString();
          	   String in_bind_id = in_bind_str.substring(28,(in_bind_str.length()-1));
                inbind += in_bind_id;            
            }
          String source_attribute = "Inbinding= \"" +inbind +"\"";
         // System.out.println("CSM Rep " + source_attribute);
          //System.out.println("InBindings list: " + sp.getInBindings());
          ps.print(" " + source_attribute);
         }                 
    }
    // prints outbinding attribute
    public void outbinding(PrintStream ps, EndPoint ep) {        
    	if (!ep.getOutBindings().isEmpty()){
            String outbind = "";
            for (int i=0;i<ep.getOutBindings().size(); i++){
         	   String out_bind_str = ep.getOutBindings().get(i).toString();
         	   String out_bind_id = out_bind_str.substring(28,(out_bind_str.length()-1));
                outbind += out_bind_id;
            }
            
         String source_attribute = "Outbinding= \"" + outbind +"\"";
         //System.out.println("CSM Rep " + source_attribute);
         //System.out.println("OutBindings list: " + ep.getOutBindings());
         ps.print(" " + source_attribute);
        }       
    }
}
