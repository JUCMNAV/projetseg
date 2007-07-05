package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.AndJoin;

/**
 * Creates the CSM representation(Join) of the AndJoin object.
 * 
 * @see seg.ucm2csm.one2one
 */
public class AndJoinConverter implements AbstractConverter {

    private AndJoin andJoinNode;

    private PathConnAttributes pathConnAttribs = new PathConnAttributes();

    // constructors
    public AndJoinConverter(AndJoin aj) {
        this.andJoinNode = aj;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String object_attributes = "<Join id=\"" + "h" + this.andJoinNode.getId() + "\" ";
        String traceabilityLink = "traceabilityLink=\"" + this.andJoinNode.getId() + "\" ";
        // output to file
        ps.print("			" + object_attributes + traceabilityLink);
        String closing_attribute = "/>";

        // optional attributes
        this.pathConnAttribs.OptionalAttributes(this.andJoinNode, ps, source, target);

        ps.println(closing_attribute);
        ps.flush();

    }
}
