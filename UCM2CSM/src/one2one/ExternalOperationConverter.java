package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.performance.ExternalOperation;

/**
 * <!-- begin-user-doc --> Producing ExternalOperation declarations <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */

public class ExternalOperationConverter implements AbstractConverter {
    ExternalOperation externalOpn;
    // constructors
    public ExternalOperationConverter(ExternalOperation pr) {
	this.externalOpn = pr;
    }

    // prints XML representation of object to output file -- implement this!!
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {
        String resStr = "<ExternalOperation "
            + "id=\"" + "e" + externalOpn.getId() + "\" "
            + "name=\"" + externalOpn.getName() + "\" "
            + "opTime=\"" + externalOpn.getOpTime()+ "\" />";
        ps.println("        " + resStr);
        ps.flush();
    }
}
