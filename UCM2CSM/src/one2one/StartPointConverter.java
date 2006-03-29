package one2one;

import java.io.PrintStream;

import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.StartPoint;
//import ucm.performance.Workload;
/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Start) of the Start object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */

public class StartPointConverter implements AbstractConverter { 
    private StartPoint sp;
    PathConnAttributes oa = new PathConnAttributes();
    WorkLoadAttributes wa = new WorkLoadAttributes();
    
    // constructors
    public StartPointConverter(StartPoint sp){
        this.sp = sp;
    }
    
    // prints XML representation of object to output file
    public void Convert(PrintStream ps, String source, String target){        
              
       // object attributes 
       String mandatory_attributes = "<Start id=\"h" + sp.getId() + "\"";                                      
       String closing_attribute = "</Start>";

       // common attributes
       ps.print("            " + mandatory_attributes);
      /* if (!sp.getInBindings().isEmpty()){
           String inbind = "";
           for (int i=0;i<sp.getInBindings().size(); i++){
        	   String in_bind_str = sp.getInBindings().get(i).toString();
         	   String in_bind_id = in_bind_str.substring(28,(in_bind_str.length()-1));
               inbind += in_bind_id;            
           }
         String source_attribute = "Inbinding= \"" +inbind +"\"";
         System.out.println("CSM Rep " + source_attribute);
         System.out.println("InBindings list: " + sp.getInBindings());
         ps.print(" " + source_attribute);
        }*/
       oa.inbinding(ps, sp);
       // optional attributes
       oa.OptionalAttributes((PathNode) sp,  ps, source, target);
       
       // processing workload
       if (sp.getWorkload() != null){           
           String open_wload_attributes = "<OpenWorkload id=\"w" + sp.getWorkload().getId() + "\" ";
           String close_wload_attributes = "<CloseWorkload id=\"w" + sp.getWorkload().getId() + "\" ";
           
           // decide if workload is open or closed
           if (sp.getWorkload().isClosed()){
               ps.print("");
               ps.print("                " + close_wload_attributes);
           }
           else{
               ps.print("");
               ps.print("                " + open_wload_attributes);
           }
           // optional workload attributes
           wa.workAttributes(sp.getWorkload(), ps);
           String print_attribute = "/>";
	       ps.println(print_attribute);
       }    
       
       // output to file
       ps.println("             " + closing_attribute);
       ps.flush();                        
    }
}

