package one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

/**
 * <!-- begin-user-doc --> It provides a convert method for all UCM to CSM Explicit Mappings. <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */
public interface AbstractConverter {
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings);
}
