package one2one;

import java.io.PrintStream;

import ucm.map.NodeConnection;
import ucm.map.StartPoint;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Start) of the Start object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
// public class StartPointConverter extends StartPointImpl implements AbstractConverter {
public class StartPointConverter implements AbstractConverter { 
    private StartPoint sp;
    // constructors
    public StartPointConverter(StartPoint sp){
        this.sp = sp;
    }
    
    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
        
       // object attributes 
       String object_attributes = "<Start id=\"h" + sp.getId() + "\"" + " " +
                                   "name =\"" + sp.getName() +"\"" + " " + 
                                   //"target=\"h" + sp.getSucc().get(0).getClass() +
                                   //"target=\"h" + this.getPrecondition().getNodeConnection().getSource().toString() +
                                   "\"/>";
//* ************ There is a problem with obtaining the workload attribute **************************
     
       String open_wload_attributes = "<OpenWorkload id=\"w" + sp.getWorkload().getId() + "\"/>";
       String close_wload_attributes = "<CloseWorkload id=\"w" + sp.getWorkload().getId() + "\"/>";
       String object_attributes_close = "</Start>";
                  
       // output to file
       
       // common attributes
       ps.println("         " + object_attributes);
                       
       
       // decide if workload is open or closed   
       if (sp.getWorkload().isClosed()){
           ps.println("             " + close_wload_attributes);
       }
       else{
           ps.println("             " + open_wload_attributes);
       }       
       
       // arrival parameters       
       // ps.println("         " + object_attributes_close);
       ps.flush();                    
                        
    }
}

