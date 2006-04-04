package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.RespRef;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Step) of the Responsibility object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class ResponsibilityRefConverter implements AbstractConverter {
    private RespRef resp;
    StepAttributes sa = new StepAttributes();
    // PathNode successor;
    // PathNode predecessor;    
    
    // constructors
    public ResponsibilityRefConverter(RespRef resp){
      this.resp = resp;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target){
        
        // retrieve target/source        
        // successor = (PathNode) ((NodeConnection)resp.getSucc().get(0)).getTarget();
        // predecessor = (PathNode) ((NodeConnection)resp.getPred().get(0)).getSource();         
        
        // object attributes
        String mandatory_attribute = "<Step id=\"h" + resp.getId() + "\"" + " " +
                                     "name =\"" + resp.getName() +"\"" + " " +                                                                      
                                     "predecessor =\"h" + source +"\"" + " " +                                        
                                     "successor= \"h" + target + "\"";
        ps.print("           " + mandatory_attribute);
        String closing_attribute = "/>";
        
        // optional attributes
        //PathConnAttributes.printDescription(ps, resp);
        sa.OptionalAttributes(resp, ps);
        
        // output to file
        ps.println(closing_attribute);
        ps.flush();                                   
    }
}
