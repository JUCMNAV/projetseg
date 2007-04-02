package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.AndJoin;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(Join) of the AndJoin object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */
public class AndJoinConverter implements AbstractConverter {

    private AndJoin aj;
    PathConnAttributes so = new PathConnAttributes();

    // constructors
    public AndJoinConverter(AndJoin aj) {
        this.aj = aj;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {

        // object attributes
        String object_attributes = "<Join id=\"" + "h" + aj.getId() + "\" ";

        // output to file
        ps.print("			" + object_attributes);
        String closing_attribute = "/>";

        // optional attributes
        so.OptionalAttributes(aj, ps, source, target);

        ps.println(closing_attribute);
        ps.flush();

    }
}
