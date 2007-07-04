package one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.performance.ProcessingResource;

/**
 * Class currently NOT IMPLEMENTED!
 * 
 * @see one2one
 */

public class ProcessingResourceConverter implements AbstractConverter {
    ProcessingResource processingRes;

    // constructors
    public ProcessingResourceConverter(ProcessingResource pr) {
        this.processingRes = pr;
    }

    // prints XML representation of object to output file -- implement this!!
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {
        String id = "id=\"" + "r" + processingRes.getId() + "\" ";
        String name = "name=\"" + processingRes.getName() + "\" ";
        String description;
        String opTime = "opTime=\"" + processingRes.getOpTime() + "\" ";
        String multiplicity;
        String schedPolicy;
        if (processingRes.getDescription() != null) {
            description = "description=\"" + processingRes.getDescription() + "\" ";
        } else
            description = "";
        if (processingRes.getMultiplicity() != null) {
            multiplicity = "multiplicity=\"" + processingRes.getMultiplicity() + "\" ";
        } else {
            multiplicity = "";
        }
        if (processingRes.getSchedPolicy() != null) {
            schedPolicy = "schedPolicy=\"" + processingRes.getSchedPolicy() + "\" ";
        } else {
            schedPolicy = "";
        }
        String traceabilityLink = "traceabilityLink=\"" + processingRes.getId() + "\" ";
        String resStr = "<ProcessingResource " + id + name + opTime + description + multiplicity + schedPolicy + traceabilityLink + "/>";
        ps.println("        " + resStr);

        ps.flush();
    }
}
