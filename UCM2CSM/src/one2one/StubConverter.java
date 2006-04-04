package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.PluginBinding;
import ucm.map.Stub;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Step) of the Stub object
 * Component-Ref object
 *  <!-- end-user-doc -->
 * @see one2one
 * @generated
 */
public class StubConverter implements AbstractConverter {
    private Stub stub;
    StepAttributes sa = new StepAttributes();
    private PluginBinding ao;
    // constructors
    public StubConverter(Stub stub){
       this.stub = stub;
    }
  
    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target){
     
       // object attributes         
       String mandatory_attribute = "<Step id=\"" + "h" + stub.getId() + "\"" + " " +
                                    "name=\"" + stub.getName() + "\"" + " " +
                                    // "hostDemand=\"" + "1" + "\"" + " " +                             
                                    "predecessor=\"" + "h" + source + "\"" + " " +
                                    "successor=\"" + "h" + target +"\"";
       
       ps.print("           " + mandatory_attribute);
       String closing_attribute = "/>";
       
       // optional attributes
       //PathConnAttributes.printDescription(ps, stub);
       sa.OptionalAttributes(stub, ps);
       
       // output to file
       ps.println(closing_attribute);
       ps.flush();                    
                    
    }
}
