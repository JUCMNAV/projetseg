package one2one;

import java.io.PrintStream;

import ucm.map.EndPoint;
import ucm.map.NodeConnection;
import ucm.map.PathNode;

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
                                   String source,
                                   String target){

		
		printDescription(ps, af);
		printSource(ps, af, source);
		printTarget(ps, af, target);
		
   /*     if ((NodeConnection)af.getogetO){
            // NodeConnection bind = (NodeConnection) ep.getOutBindings();
       	   String outbind = "";
       	   for (int i=0;i<ep.getOutBindings().size(); i++){
       		   outbind += " so" + ep.getOutBindings().get(i);    		
       	   }
       	   OutBinding
           String source_attribute = "Outbinding= \"" + outbind +"\"";
           System.out.println("CSM Rep " + source_attribute);
           System.out.println("OutBindings list: " + ep.getOutBindings());
           ps.print(" " + source_attribute);
          }*/
	}
    
	// prints the source attribute
	public static void printSource(PrintStream ps, PathNode pathnode, String source) {        
        if (source != null){            
            String source_attribute = "source= \"h" + source +"\"";
            ps.print(" " + source_attribute);
        }
	}
    // prints the target attribute
	public static void printTarget(PrintStream ps, PathNode pathnode, String target) {        
        if (target != null){            
            // special case for StartPoint
            if (pathnode.getName().compareTo("StartPoint") == 0){
                String target_attribute = "target= \"h" + target + "\"" + ">";
                ps.print(" " + target_attribute);
            }
            else {
                String target_attribute = "target= \"h" + target +"\"";
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
    
	// prints inbinding attribute
    public static void inbinding(PrintStream ps, PathNode pathnode) {
        /*
        if (!sp.getInBindings().isEmpty()){
           String outbind = "";
           for (int i=0;i<sp.getInBindings().size(); i++){
               outbind += " so" + sp.getInBindings().get(i);            
           }
         String source_attribute = "Inbinding= \"" + outbind +"\"";
         System.out.println("CSM Rep " + source_attribute);
         System.out.println("InBindings list: " + sp.getInBindings());
         ps.print(" " + source_attribute);
        }
        */                
    }
    // prints outbinding attribute
    public static void outbinding(PrintStream ps, PathNode pathnode) {        
        /*
         * if (!ep.getOutBindings().isEmpty()){
           String outbind = "";
           for (int i=0;i<ep.getOutBindings().size(); i++){
               outbind += " so" + ep.getOutBindings().get(i);           
           }
        */   
        /*   
        String source_attribute = "Outbinding= \"" + outbind +"\"";
        System.out.println("CSM Rep " + source_attribute);
        System.out.println("OutBindings list: " + ep.getOutBindings());
         * 
         */        
    }
}
