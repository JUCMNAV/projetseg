package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.EndPoint;

/**
 * Creates the CSM representation(End) of the End-Point object.
 * 
 * @see seg.ucm2csm.one2one
 */
public class EndPointConverter implements AbstractConverter {
    private EndPoint endPointNode;

    // private PathNode source;
    PathConnAttributes pathConnAttribs = new PathConnAttributes();

    // constructors
    public EndPointConverter(EndPoint ep) {
        this.endPointNode = ep;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        String mandatory_attribute = "<End id=\"" + "h" + this.endPointNode.getId() + "\" "; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        String traceabilityLink = "traceabilityLink=\"" + this.endPointNode.getId() + "\" "; //$NON-NLS-1$ //$NON-NLS-2$
        ps.print("            " + mandatory_attribute + traceabilityLink); //$NON-NLS-1$
        String closing_attribute = "/> <!-- EndPoint " + this.endPointNode.getName() + " -->"; //$NON-NLS-1$ //$NON-NLS-2$

        // optional attributes
        this.pathConnAttribs.OptionalAttributes(this.endPointNode, ps, source, target);

        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }

}
