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
    PathNode target;
    
    // constructors
    public StartPointConverter(StartPoint sp){
        this.sp = sp;
    }
    
    // prints XML representation of object to output file
    public void Convert(PrintStream ps){        
       // retrieve target/source        
       target = (PathNode) ((NodeConnection)sp.getSucc().get(0)).getTarget();              
         //  sp.getWorkload().g
       // object attributes 
       String object_attributes = "<Start id=\"h" + sp.getId() + "\"" + " " +
                                  "target=\"h" + target.getId() + "\" >";
       // common attributes
       ps.println("            " + object_attributes);     
       
       // processing workload
       if (sp.getWorkload() != null){           
           String open_wload_attributes = "<OpenWorkload id=\"w" + sp.getWorkload().getId() + "\" ";
           String close_wload_attributes = "<CloseWorkload id=\"w" + sp.getWorkload().getId() + "\" " +
           									"puplation = \"" + sp.getWorkload().getPopulation() + "\" ";
         
	       
           // decide if workload is open or closed
           if (sp.getWorkload().isClosed()){
               ps.print("                " + close_wload_attributes);
           }
           else{
               ps.print("                " + open_wload_attributes);
           } 
           if (sp.getWorkload().getArrivalPattern() != null)
           {String print_aPattren = "arrivalPattern=\"" + sp.getWorkload().getArrivalPattern() + "\"" + " " ;
            ps.print(print_aPattren);
           }
           if (sp.getWorkload().getArrivalParam1() != 0.0)
           {String print_aParam1 = "arrivalParam1=\"" + sp.getWorkload().getArrivalParam1() + "\"" + " " ;
            ps.print(print_aParam1);
           }
           if (sp.getWorkload().getArrivalParam2() != 0.0)
           {String print_aParam2 = "arrivalParam2=\"" + sp.getWorkload().getArrivalParam2() + "\"" + " " ;
            ps.print(print_aParam2);
           }
           if (sp.getWorkload().getCoeffVarSeq() != 0.0)
           {String print_coeffVar = "coeffVarSq=\"" + sp.getWorkload().getCoeffVarSeq() + "\"" + " " ;
            ps.print(print_coeffVar);
           }
           if (sp.getWorkload().getExternalDelay() != 0.0)
           {String print_delay = "externalDelay=\"" + sp.getWorkload().getExternalDelay() + "\"" + " " ;
            ps.print(print_delay);
           }
           if (sp.getWorkload().getValue() != 0.0)
           {String print_value = "Value=\"" + sp.getWorkload().getValue() + "\"" + " " ;
            ps.print(print_value);
           }
           if (sp.getWorkload().getDescription() != null)
           {String print_description = "Description=\"" + sp.getWorkload().getDescription() + "\"" + " " ;
            ps.print(print_description);
           }
           if (sp.getWorkload().getRespTime() != null)
           {String print_respTime = "ResponesTime=\"" + sp.getWorkload().getRespTime() + "\"" + " " ;
            ps.print(print_respTime);
           }
          /* String Print_optional = "arrivalParam1 =\"" + sp.getWorkload().getArrivalParam1() + "\"" + " " +
           						  "arrivalParam2 =\"" + sp.getWorkload().getArrivalParam2() + "\"" + " " +
           						  "externalDelay =\"" + sp.getWorkload().getExternalDelay() + "\"" + " " +
           						  "value =\"" + sp.getWorkload().getValue() + "\"" + " " +
           						  "coeffVarSq = \"" + sp.getWorkload().getCoeffVarSeq() + "\"" + " " +
           						  "description =\"" +sp.getWorkload().getDescription() + "\"/>";
           ps.println(Print_optional);*/
           		//"traceabilityLink responseTime"
       }    
       String object_attributes_close = "</Start>";
       String closing_attribute = "/>";
       // arrival parameters
       ps.println(closing_attribute);
       ps.println("             " + object_attributes_close);
       ps.flush();                    
                     
    }
}

