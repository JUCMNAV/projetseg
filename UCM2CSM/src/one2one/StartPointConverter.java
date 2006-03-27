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
    OptionalAssociations oa = new OptionalAssociations();
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
       
       // optional attributes
       oa.OptionalAttributes((PathNode) sp,  ps, source, target);
       
       // processing workload
       if (sp.getWorkload() != null){           
           String open_wload_attributes = "<OpenWorkload id=\"w" + sp.getWorkload().getId() + "\" />";
           String close_wload_attributes = "<CloseWorkload id=\"w" + sp.getWorkload().getId() + "\"/>";
           
           // decide if workload is open or closed
           if (sp.getWorkload().isClosed()){
               ps.println("");
               ps.println("                " + close_wload_attributes);
           }
           else{
               ps.println("");
               ps.println("                " + open_wload_attributes);
           }
           // optional workload attributes
           wa.workAttributes(sp, ps);
       }    
       
       // output to file
       ps.println("             " + closing_attribute);
       ps.flush();                        
    }
}

