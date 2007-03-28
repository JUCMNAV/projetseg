package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.performance.PassiveResource;

/**
 * <!-- begin-user-doc --> Produces CSM of PassiveResources <!-- end-user-doc -->
 * 
 * @see one2one
 */

public class PassiveResourceConverter implements AbstractConverter {

    private PassiveResource passiveRes;

    // constructors
    public PassiveResourceConverter(PassiveResource genRes) {
        this.passiveRes = genRes;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {
	String id = "id=\"" + "r" + passiveRes.getId() + "\" ";
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

	String resStr = "<PassiveResource "
	    + id + name + description + multiplicity + schedPolicy
            + "/>";

        // output to file
        ps.println("        " + resStr);
        ps.flush();
    }
}
