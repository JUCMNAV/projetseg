package one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import ucm.map.RespRef;
import ucm.performance.Demand;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(Step) of the Responsibility object <!-- end-user-doc -->
 * 
 * @see one2one
 */
public class ResponsibilityRefConverter implements AbstractConverter {
    private RespRef resp;

    StepAttributes sa = new StepAttributes();

    // constructors
    public ResponsibilityRefConverter(RespRef resp) {
        this.resp = resp;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String mandatory_attribute = "<Step id=\"h" + resp.getId() + "\" " + "name=\"" + resp.getRespDef().getName() + "\" " + "predecessor=\""
                + source.toString().subSequence(1, (source.toString().length() - 1)) + "\" " + "successor=\""
                + target.toString().subSequence(1, (target.toString().length() - 1)) + "\" ";
        ps.print("            " + mandatory_attribute);

        // optional attributes
        sa.OptionalAttributes(resp, ps);

        if (resp.getRespDef().getDemands().size() == 0) {
            String closing_attribute = "/>";
            // output to file
            ps.println(closing_attribute);
        } else {
            String closing_attribute1 = ">";
            // output to file
            ps.println(closing_attribute1);
            for (Iterator demands = resp.getRespDef().getDemands().iterator(); demands.hasNext();) {
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
