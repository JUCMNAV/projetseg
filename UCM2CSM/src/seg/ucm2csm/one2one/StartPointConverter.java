package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.StartPoint;

/**
 * Creates the CSM representation(Start) of the Start object.
 * 
 * @see one2one
 */

public class StartPointConverter implements AbstractConverter {
    private StartPoint sp;

    PathConnAttributes oa = new PathConnAttributes();

    WorkLoadAttributes wa = new WorkLoadAttributes();

    // constructors
    public StartPointConverter(StartPoint sp) {
        this.sp = sp;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String mandatory_attributes = "<Start id=\"h" + sp.getId() + "\" " + "traceabilityLink=\"" + sp.getId() + "\" ";
        String closing_attribute = "</Start>";

        // common attributes
        ps.print("            " + mandatory_attributes);

        // optional attributes
        oa.OptionalAttributes(sp, ps, source, target);

        // processing workload
        if (sp.getWorkload() != null) {

            // decide if workload is open or closed
            if (sp.getWorkload().isClosed()) {
                String close_wload_attributes = "<ClosedWorkload id=\"w" + sp.getWorkload().getId() + "\" " + "population=\""
                        + sp.getWorkload().getPopulation() + "\" " + " ";
                ps.print("                " + close_wload_attributes);
            } else {
                String open_wload_attributes = "<OpenWorkload id=\"w" + sp.getWorkload().getId() + "\" ";
                ps.print("                " + open_wload_attributes);
            }
            // optional workload attributes
            wa.workAttributes(sp.getWorkload(), ps);
            String print_attribute = "/>";
            ps.println(print_attribute);
        }

        // output to file
        ps.println("            " + closing_attribute);
        ps.flush();
    }
}
