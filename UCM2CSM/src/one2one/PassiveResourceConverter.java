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

        // object attributes
        String Object_attributes = "<PassiveResource "
            + "id=\"" + "r" + passiveRes.getId() + "\" "
            + "name=\"" + passiveRes.getName() + "\"/>";

        // output to file
        ps.println("        " + Object_attributes);
        ps.flush();
    }
}
