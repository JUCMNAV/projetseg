package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.OrJoin;

/**
 * Creates the CSM representation(Merge) of the OrJoin object.
 * 
 * @see seg.ucm2csm.one2one
 */
public class OrJoinConverter implements AbstractConverter {

    private OrJoin orJoinNode;

    PathConnAttributes pathConnAttribs = new PathConnAttributes();

    // constructors
    public OrJoinConverter(OrJoin oj) {
        this.orJoinNode = oj;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String madatory_attribute = "<Merge id=\"" + "h" + this.orJoinNode.getId() + "\" ";
        String traceabilityLink = "traceabilityLink=\"" + this.orJoinNode.getId() + "\" ";
        ps.print("            " + madatory_attribute + traceabilityLink);
        String closing_attribute = "/>";

        // optional attributes
        this.pathConnAttribs.OptionalAttributes(this.orJoinNode, ps, source, target);

        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }
}
