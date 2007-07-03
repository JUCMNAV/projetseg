package one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.OrJoin;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(Merge) of the OrJoin object <!-- end-user-doc -->
 * 
 * @see one2one
 */
public class OrJoinConverter implements AbstractConverter {

    private OrJoin oj;

    PathConnAttributes so = new PathConnAttributes();

    // constructors
    public OrJoinConverter(OrJoin oj) {
        this.oj = oj;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String madatory_attribute = "<Merge id=\"" + "h" + oj.getId() + "\" ";
        String traceabilityLink = "traceabilityLink=\"" + oj.getId() + "\" ";
        ps.print("            " + madatory_attribute + traceabilityLink);
        String closing_attribute = "/>";

        // optional attributes
        so.OptionalAttributes(oj, ps, source, target);

        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }
}
