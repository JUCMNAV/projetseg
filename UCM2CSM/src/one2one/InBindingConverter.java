package one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.InBinding;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(inbinding) of the In-Connection object <!-- end-user-doc -->
 * 
 * @see one2one
 */
public class InBindingConverter implements AbstractConverter {

    private InBinding in_bind;

    // constructors
    public InBindingConverter(InBinding in_bind) {
        this.in_bind = in_bind;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // a DummySequence may exist between stub and previous node such that
        // stubEntry.source no longer holds.
        // new "source" nodes (CSMDupNode) are passed as array.
        String previousNode = (String) source.get(0);

        // object attributes
        String Object_attributes = "<InBinding start=\"" + "h" + in_bind.getStartPoint().getId() + "\" " + "in=\"" + previousNode + "\"/>";

        // output to file
        ps.println("                     " + Object_attributes);
        ps.flush();
    }
}
