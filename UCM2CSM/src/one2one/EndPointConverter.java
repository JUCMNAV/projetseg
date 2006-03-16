package one2one;

import java.io.PrintStream;

import ucm.map.EndPoint;
import ucm.map.NodeConnection;
import ucm.map.OutBinding;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(End) of the End-Point object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class EndPointConverter implements AbstractConverter {
    private EndPoint ep; 
    private PathNode source;
    OptionalAssociations oa = new OptionalAssociations();
    // constructors
    public EndPointConverter(EndPoint ep){
       this.ep = ep;       
    }
    
    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
       
       //retrieve target/source        
      // source = (PathNode) ((NodeConnection)ep.getPred().get(0)).getSource();
      
       // object attributes 
    //   String object_attributes = "<End id=\"h" + ep.getId() + "\"" + " " +                              
      //                             "source= \"h" + source.getId() +"\"/>";
       String id_attribute = "<End id=\"" + "h" + ep.getId() + "\" ";
       ps.print("			" + id_attribute);
       String closing_attribute = "/>";
       
       // optional attributes
     /*  if (ep.getDescription() != null){
       	String description_attribute = "description=\"" + ep.getDescription() +"\"";
       	ps.print(description_attribute);
       }
       if ((NodeConnection)ep.getPred().get(0) != null && (PathNode) ((NodeConnection)ep.getPred().get(0)).getSource() != null){
       	PathNode source = (PathNode) ((NodeConnection)ep.getPred().get(0)).getSource();
       	String source_attribute = "source= \"h" + source.getId() +"\"";
       	ps.print(" " + source_attribute);
       } */
       oa.OptionalAttributes((PathNode) ep,  ps);
       if (!ep.getOutBindings().isEmpty()){
         // NodeConnection bind = (NodeConnection) ep.getOutBindings();
    	   String outbind = "";
    	   for (int i=0;i<ep.getOutBindings().size(); i++){
    		   outbind += " so" + ep.getOutBindings().get(i);    		
    	   }
        String source_attribute = "Outbinding= \"" + outbind +"\"";
        System.out.println("CSM Rep " + source_attribute);
        System.out.println("OutBindings list: " + ep.getOutBindings());
        ps.print(" " + source_attribute);
       }
      
       // output to file             
       ps.println(closing_attribute);                        
       ps.flush();                    
                        
    }
}

