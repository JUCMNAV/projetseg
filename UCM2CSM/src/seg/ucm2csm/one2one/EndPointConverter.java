package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.EndPoint;

/**
 * Creates the CSM representation(End) of the End-Point object.
 * 
 * @see one2one
 */
public class EndPointConverter implements AbstractConverter {
    private EndPoint ep;

    // private PathNode source;
    PathConnAttributes oa = new PathConnAttributes();

    // constructors
    public EndPointConverter(EndPoint ep) {
        this.ep = ep;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        String mandatory_attribute = "<End id=\"" + "h" + ep.getId() + "\" ";
        String traceabilityLink = "traceabilityLink=\"" + ep.getId() + "\" ";
        ps.print("            " + mandatory_attribute + traceabilityLink);
        String closing_attribute = "/> <!-- EndPoint " + ep.getName() + " -->";

        // optional attributes
        oa.OptionalAttributes(ep, ps, source, target);

        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }

}
