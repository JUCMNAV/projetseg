package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.OutBinding;

/**
 * Creates the CSM representation(outbinding) of the Out-Connection object
 * 
 * @see one2one
 */
public class OutBindingConverter implements AbstractConverter {

    private OutBinding out_bind;

    // constructors
    public OutBindingConverter(OutBinding out_bind) {
        this.out_bind = out_bind;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // a DummySequence may now exist between stub and next node suche that
        // stubEntry.target no longer holds.
        // new "next" nodes (CSMDupNode) are passed as array.
        String nextNode = (String) target.get(0);

        // object attributes
        String Object_attributes = "<OutBinding end=\"" + "h" + out_bind.getEndPoint().getId() + "\" " + "out=\"" + nextNode + "\"/>";

        // output to file
        ps.println("                     " + Object_attributes);
        ps.flush();
    }
}
