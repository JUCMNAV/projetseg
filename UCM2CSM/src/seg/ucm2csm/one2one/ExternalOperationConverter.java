package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.performance.ExternalOperation;

/**
 * Producing ExternalOperation declarations.
 * 
 * @see seg.ucm2csm.one2one
 */

public class ExternalOperationConverter implements AbstractConverter {
    ExternalOperation externalOpn;

    // constructors
    public ExternalOperationConverter(ExternalOperation pr) {
        this.externalOpn = pr;
    }

    // prints XML representation of object to output file -- implement this!!
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {
        String id = "id=\"" + "e" + this.externalOpn.getId() + "\" ";
        String name = "name=\"" + this.externalOpn.getName() + "\" ";
        String description;
        String opTime = "opTime=\"" + this.externalOpn.getOpTime() + "\" ";
        String multiplicity;
        String schedPolicy;
        if (this.externalOpn.getDescription() != null) {
            description = "description=\"" + this.externalOpn.getDescription() + "\" ";
        } else
            description = "";
        if (this.externalOpn.getMultiplicity() != null) {
            multiplicity = "multiplicity=\"" + this.externalOpn.getMultiplicity() + "\" ";
        } else {
            multiplicity = "";
        }
        if (this.externalOpn.getSchedPolicy() != null) {
            schedPolicy = "schedPolicy=\"" + this.externalOpn.getSchedPolicy() + "\" ";
        } else {
            schedPolicy = "";
        }
        String traceabilityLink = "traceabilityLink=\"" + this.externalOpn.getId() + "\" ";
        String resStr = "<ExternalOperation " + id + name + opTime + description + multiplicity + schedPolicy + traceabilityLink + "/>";
        ps.println("        " + resStr);
        ps.flush();

    }
}
