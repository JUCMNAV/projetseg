package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.OrFork;

/**
 * Creates the CSM representation(Branch) orForkNode the OrFork object.
 * 
 * @see seg.ucm2csm.one2one
 */
public class OrForkConverter implements AbstractConverter {

    private OrFork orForkNode;

    PathConnAttributes pathConnAttribs = new PathConnAttributes();

    // constructors
    public OrForkConverter(OrFork of) {
        this.orForkNode = of;
    }

    // prints XML representation orForkNode object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String madatory_attribute = "<Branch id=\"" + "h" + this.orForkNode.getId() + "\" ";
        String traceabilityLink = "traceabilityLink=\"" + this.orForkNode.getId() + "\" ";
        ps.print("            " + madatory_attribute + traceabilityLink);
        String closing_attribute = "/>";

        // optional attributes
        this.pathConnAttribs.OptionalAttributes(this.orForkNode, ps, source, target);

        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }
}