package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.performance.PassiveResource;

/**
 * Produces CSM of PassiveResources.
 * 
 * @see seg.ucm2csm.one2one
 */

public class PassiveResourceConverter implements AbstractConverter {

    private PassiveResource passiveRes;

    // constructors
    public PassiveResourceConverter(PassiveResource genRes) {
        this.passiveRes = genRes;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {
        String id = "id=\"" + "p" + passiveRes.getId() + "\" ";
        String name = "name=\"" + passiveRes.getName() + "\" ";
        String description;
        String multiplicity;
        String schedPolicy;
        if (passiveRes.getDescription() != null) {
            description = "description=\"" + passiveRes.getDescription() + "\" ";
        } else
            description = "";
        if (passiveRes.getMultiplicity() != null) {
            multiplicity = "multiplicity=\"" + passiveRes.getMultiplicity() + "\" ";
        } else {
            multiplicity = "";
        }
        if (passiveRes.getSchedPolicy() != null) {
            schedPolicy = "schedPolicy=\"" + passiveRes.getSchedPolicy() + "\" ";
        } else {
            schedPolicy = "";
        }
        String traceabilityLink = "traceabilityLink=\"" + passiveRes.getId() + "\" ";
        String resStr = "<PassiveResource " + id + name + description + multiplicity + schedPolicy + traceabilityLink + "/>";

        // output to file
        ps.println("        " + resStr);
        ps.flush();
    }
}
