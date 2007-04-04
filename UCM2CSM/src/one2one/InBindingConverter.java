package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.InBinding;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(inbinding) of the In-Connection object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */
public class InBindingConverter implements AbstractConverter {

    private InBinding in_bind;

    // constructors
    public InBindingConverter(InBinding in_bind) {
        this.in_bind = in_bind;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {

        String predecessor = (String) source.toString().subSequence(1, (source.toString().length() - 1));

        // object attributes
        String Object_attributes = "<InBinding start=\"" + "h" + in_bind.getStartPoint().getId() + "\" " + "in=\"" + predecessor + "\"/>";

        // output to file
        ps.println("                     " + Object_attributes);
        ps.flush();
    }
}
