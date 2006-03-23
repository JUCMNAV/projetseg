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
       String object_attributes = "<Start id=\"h" + sp.getId() + "\" ";
                                  //"target=\"h" + target.getId() + "\" >";
       String closing_StartAtt = "/>";
       // common attributes
       ps.print("            " + object_attributes);     
       OptionalAssociations.printDescription(ps, sp);
       OptionalAssociations.printTarget(ps, sp);
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
       ps.println(closing_StartAtt);
       // processing workload
       WorkLoadOptionalAttributes.workLoadAttributes(ps, sp);    
      
       String object_attributes_close = "</Start>";
       
       // arrival parameters
       
       ps.println("             " + object_attributes_close);
       ps.flush();                    
                     
    }
}

