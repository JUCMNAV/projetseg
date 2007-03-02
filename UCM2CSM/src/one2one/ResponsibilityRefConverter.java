package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.RespRef;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(Step) of the Responsibility object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */
public class ResponsibilityRefConverter implements AbstractConverter {
    private RespRef resp;
    StepAttributes sa = new StepAttributes();

    // constructors
    public ResponsibilityRefConverter(RespRef resp) {
        this.resp = resp;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {

        // object attributes
        String mandatory_attribute = "<Step id=\"h" + resp.getId() + "\"" + " " + "name =\"" + resp.getRespDef().getName() + "\"" + " " + "predecessor =\""
                + source.toString().subSequence(1, (source.toString().length() - 1)) + "\"" + " " + "successor= \""
                + target.toString().subSequence(1, (target.toString().length() - 1)) + "\"";

        ps.print("            " + mandatory_attribute);
        String closing_attribute = "/>";

        // optional attributes
        sa.OptionalAttributes(resp, ps);

        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }
}
