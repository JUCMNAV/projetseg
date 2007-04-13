package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.OutBinding;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(outbinding) of the Out-Connection object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */

public class OutBindingConverter implements AbstractConverter {

    private OutBinding out_bind;

    // constructors
    public OutBindingConverter(OutBinding out_bind) {
        this.out_bind = out_bind;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {

        String successor0 = (String) target.toString().subSequence(1, (target.toString().length() - 1));
        String successor = StringUtil.trimString(',', successor0); // eliminate ','
        if (target.size() > 1) {
            System.err.println("WARNING:  OutBinding " + out_bind.getEndPoint().getId() + " has more than one predecessor.");
        }
 
        // object attributes
        String Object_attributes = "<OutBinding end=\"" + "h" + out_bind.getEndPoint().getId() + "\" " + "out=\"" + successor + "\"/>";

        // output to file
        ps.println("                     " + Object_attributes);
        ps.flush();
    }
}
