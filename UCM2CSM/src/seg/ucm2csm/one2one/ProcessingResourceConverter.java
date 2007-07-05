package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.performance.ProcessingResource;

/**
 * Class currently NOT IMPLEMENTED!
 * 
 * @see seg.ucm2csm.one2one
 */

public class ProcessingResourceConverter implements AbstractConverter {
    ProcessingResource processingRes;

    // constructors
    public ProcessingResourceConverter(ProcessingResource pr) {
        this.processingRes = pr;
    }

    // prints XML representation of object to output file -- implement this!!
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {
        String id = "id=\"" + "r" + this.processingRes.getId() + "\" ";
        String name = "name=\"" + this.processingRes.getName() + "\" ";
        String description;
        String opTime = "opTime=\"" + this.processingRes.getOpTime() + "\" ";
        String multiplicity;
        String schedPolicy;
        if (this.processingRes.getDescription() != null) {
            description = "description=\"" + this.processingRes.getDescription() + "\" ";
        } else
            description = "";
        if (this.processingRes.getMultiplicity() != null) {
            multiplicity = "multiplicity=\"" + this.processingRes.getMultiplicity() + "\" ";
        } else {
            multiplicity = "";
        }
        if (this.processingRes.getSchedPolicy() != null) {
            schedPolicy = "schedPolicy=\"" + this.processingRes.getSchedPolicy() + "\" ";
        } else {
            schedPolicy = "";
        }
        String traceabilityLink = "traceabilityLink=\"" + this.processingRes.getId() + "\" ";
        String resStr = "<ProcessingResource " + id + name + opTime + description + multiplicity + schedPolicy + traceabilityLink + "/>";
        ps.println("        " + resStr);

        ps.flush();
    }
}
