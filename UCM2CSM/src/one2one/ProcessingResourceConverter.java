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
        String resStr = "<ProcessingResource "
            + "id=\"" + "r" + processingRes.getId() + "\" "
            + "name=\"" + processingRes.getName() + "\" "
            + "opTime=\"" + processingRes.getOpTime()+ "\" />";
        ps.println("        " + resStr);
        ps.flush();
    }
}
