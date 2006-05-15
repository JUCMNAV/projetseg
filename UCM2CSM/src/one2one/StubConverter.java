package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.PluginBinding;
import ucm.map.Stub;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(Step) of the Stub object Component-Ref object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */
public class StubConverter implements AbstractConverter {

    private Stub stub;
    StepAttributes sa = new StepAttributes();
    private PluginBinding ao;

    // constructors
    public StubConverter(Stub stub) {
        this.stub = stub;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {
        ((PluginBinding) stub.getBindings().get(0)).getProbability();

        // object attributes
        String mandatory_attribute = "<Step id=\"" + "h" + stub.getId() + "\"" + " " + "name=\"" + stub.getName() + "\"" + " " + "predecessor=\"" + ""
                + source.toString().subSequence(1, (source.toString().length() - 1)) + "\"" + " " + "successor=\"" + ""
                + target.toString().subSequence(1, (target.toString().length() - 1)) + "\"";

        ps.print("           " + mandatory_attribute);
        String closing_attribute = "/>";

        // optional attributes
        sa.OptionalAttributes(stub, ps);
        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }
}
