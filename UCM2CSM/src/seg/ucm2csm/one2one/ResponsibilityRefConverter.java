package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import ucm.map.RespRef;
import ucm.performance.Demand;

/**
 * Creates the CSM representation(Step) of the Responsibility object.
 * 
 * @see seg.ucm2csm.one2one
 */
public class ResponsibilityRefConverter implements AbstractConverter {
    private RespRef respRef;

    StepAttributes stepAttribs = new StepAttributes();

    // constructors
    public ResponsibilityRefConverter(RespRef resp) {
        this.respRef = resp;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String mandatory_attribute = "<Step id=\"h" + this.respRef.getId() + "\" " + "name=\"" + this.respRef.getRespDef().getName() + "\" " + "predecessor=\""
                + source.toString().subSequence(1, (source.toString().length() - 1)) + "\" " + "successor=\""
                + target.toString().subSequence(1, (target.toString().length() - 1)) + "\" ";
        ps.print("            " + mandatory_attribute);

        // optional attributes
        this.stepAttribs.OptionalAttributes(this.respRef, ps);

        if (this.respRef.getRespDef().getDemands().size() == 0) {
            String closing_attribute = "/>";
            // output to file
            ps.println(closing_attribute);
        } else {
            String closing_attribute1 = ">";
            // output to file
            ps.println(closing_attribute1);
            for (Iterator demands = this.respRef.getRespDef().getDemands().iterator(); demands.hasNext();) {
                Demand demand = (Demand) demands.next();
                String currentDemandQty = demand.getQuantity();
                if (currentDemandQty == null)
                    currentDemandQty = "1";
                String demand_line = "                  <ExternalDemand demand=\"" + currentDemandQty + "\" extOp=\"e" + demand.getResource().getId() + "\"/>";
                ps.println(demand_line);
            }
            String closing_attribute2 = "            </Step>";
            // output to file
            ps.println(closing_attribute2);
        }

        ps.flush();
    }
}
