package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.DirectionArrow;

/**
 * Creates the CSM representation(Sequence) of the DirectionArrow object.
 * 
 * Direction Arrows are replaced by a CSM Dummy Sequence
 * 
 * @author jack
 * @see seg.ucm2csm.one2one
 */

public class DirectionArrowConverter implements AbstractConverter {

    private DirectionArrow directionArrowNode;

    private PathConnAttributes pathConnAttribs = new PathConnAttributes();

    // constructors
    public DirectionArrowConverter(DirectionArrow ep) {
        this.directionArrowNode = ep;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String Object_attributes = "<Sequence id=\"" + "h" + this.directionArrowNode.getId() + "\" ";
        String traceabilityLink = "traceabilityLink=\"" + this.directionArrowNode.getId() + "\" ";
        ps.print("            " + Object_attributes + traceabilityLink);
        String closing_attribute = "/> <!-- DirectionArrow -->";

        this.pathConnAttribs.OptionalAttributes(this.directionArrowNode, ps, source, target);

        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }
}
