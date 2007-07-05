package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

/**
 * It provides a convert method for all UCM to CSM Explicit Mappings.
 * 
 * @see seg.ucm2csm.one2one
 */
public interface AbstractConverter {
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings);
}
