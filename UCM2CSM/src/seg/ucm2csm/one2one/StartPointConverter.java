package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.StartPoint;

/**
 * Creates the CSM representation(Start) of the Start object.
 * 
 * @see seg.ucm2csm.one2one
 */

public class StartPointConverter implements AbstractConverter {
    private StartPoint startPointNode;

    private PathConnAttributes pathConnAttribs = new PathConnAttributes();

    private WorkLoadAttributes workLoadAttribs = new WorkLoadAttributes();

    // constructors
    public StartPointConverter(StartPoint sp) {
        this.startPointNode = sp;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String mandatory_attributes = "<Start id=\"h" + this.startPointNode.getId() + "\" " + "traceabilityLink=\"" + this.startPointNode.getId() + "\" ";
        String closing_attribute = "</Start>";

        // common attributes
        ps.print("            " + mandatory_attributes);

        // optional attributes
        this.pathConnAttribs.OptionalAttributes(this.startPointNode, ps, source, target);

        // processing workload
        if (this.startPointNode.getWorkload() != null) {

            // decide if workload is open or closed
            if (this.startPointNode.getWorkload().isClosed()) {
                String close_wload_attributes = "<ClosedWorkload id=\"w" + this.startPointNode.getWorkload().getId() + "\" " + "population=\""
                        + this.startPointNode.getWorkload().getPopulation() + "\" " + " ";
                ps.print("                " + close_wload_attributes);
            } else {
                String open_wload_attributes = "<OpenWorkload id=\"w" + this.startPointNode.getWorkload().getId() + "\" ";
                ps.print("                " + open_wload_attributes);
            }
            // optional workload attributes
            this.workLoadAttribs.workAttributes(this.startPointNode.getWorkload(), ps);
            String print_attribute = "/>";
            ps.println(print_attribute);
        }

        // output to file
        ps.println("            " + closing_attribute);
        ps.flush();
    }
}
