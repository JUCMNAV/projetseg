package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.performance.ProcessingResource;

/**
 * <!-- begin-user-doc --> Class currently NOT IMPLEMENTED! <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */

public class ProcessingResourceConverter implements AbstractConverter {
    ProcessingResource processingRes;
    // constructors
    public ProcessingResourceConverter(ProcessingResource pr) {
	this.processingRes = pr;
    }

    // prints XML representation of object to output file -- implement this!!
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {
	String id = "id=\"" + "r" + processingRes.getId() + "\" ";
	String name = "name=\"" + processingRes.getName() + "\" ";
	String description;
	String opTime = "opTime=\"" + processingRes.getOpTime()+ "\" "; 
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

	String resStr = "<ProcessingResource "
	    + id + name + opTime + description + multiplicity + schedPolicy
            +  "/>";
        ps.println("        " + resStr);

        ps.flush();
    }
}
