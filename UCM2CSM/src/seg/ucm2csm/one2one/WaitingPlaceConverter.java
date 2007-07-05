package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.WaitingPlace;

/**
 * Creates the CSM representation(And-Fork) of the WaitingPlace object.
 * 
 * @see seg.ucm2csm.one2one
 */

public class WaitingPlaceConverter implements AbstractConverter {

    private WaitingPlace waitingPlaceNode;

    PathConnAttributes pathConnAttribs = new PathConnAttributes();

    // constructors
    public WaitingPlaceConverter(WaitingPlace af) {
        this.waitingPlaceNode = af;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String id_attribute = "<Join id=\"" + "h" + this.waitingPlaceNode.getId() + "\" ";
        String traceabilityLink = "traceabilityLink=\"" + this.waitingPlaceNode.getId() + "\" ";
        ps.print("            " + id_attribute + traceabilityLink);

        String closing_attribute = "/> <!-- Waiting Place -->";

        // optional attributes
        this.pathConnAttribs.OptionalAttributes(this.waitingPlaceNode, ps, source, target);

        ps.println(closing_attribute);
        ps.flush();
    }

}
