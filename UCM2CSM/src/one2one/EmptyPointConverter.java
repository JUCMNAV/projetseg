package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.EmptyPoint;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(Sequence) of the EmptyPoint object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */

public class EmptyPointConverter implements AbstractConverter {

    private EmptyPoint ep;
    PathConnAttributes oa = new PathConnAttributes();

    // constructors
    public EmptyPointConverter(EmptyPoint ep) {
        this.ep = ep;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {

        // object attributes
        String Object_attributes = "<Sequence id=\"" + "h" + ep.getId() + "\"";

        ps.print("            " + Object_attributes);
        String closing_attribute = "/>";

        oa.OptionalAttributes(ep, ps, source, target);

        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }
}
