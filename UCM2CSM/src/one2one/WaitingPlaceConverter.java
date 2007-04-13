package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.WaitingPlace;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(And-Fork) of the WaitingPlace object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */

public class WaitingPlaceConverter implements AbstractConverter {

    private WaitingPlace af;
    PathConnAttributes oa = new PathConnAttributes();

    // constructors
    public WaitingPlaceConverter(WaitingPlace af) {
        this.af = af;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {

        // object attributes
        String id_attribute = "<Join id=\"" + "h" + af.getId() + "\" ";
        String traceabilityLink = "traceabilityLink=\"" + af.getId() + "\" ";
        ps.print("            " + id_attribute + traceabilityLink);

        String closing_attribute = "/> <!-- Waiting Place -->";

        // optional attributes
        oa.OptionalAttributes(af, ps, source, target);

        ps.println(closing_attribute);
        ps.flush();
    }

}
