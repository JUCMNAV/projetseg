package one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.OrFork;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(Branch) of the OrFork object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */
public class OrForkConverter implements AbstractConverter {

    private OrFork of;

    PathConnAttributes so = new PathConnAttributes();

    // constructors
    public OrForkConverter(OrFork of) {
        this.of = of;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String madatory_attribute = "<Branch id=\"" + "h" + of.getId() + "\" ";
        String traceabilityLink = "traceabilityLink=\"" + of.getId() + "\" ";
        ps.print("            " + madatory_attribute + traceabilityLink);
        String closing_attribute = "/>";

        // optional attributes
        so.OptionalAttributes(of, ps, source, target);

        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }
}