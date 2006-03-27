package one2one;

import java.io.FileOutputStream;
import java.io.PrintStream;

import ucm.map.UCMmap;
/**
 * <!-- begin-user-doc -->
 * It provides a convert method for all UCM to CSM Explicit Mappings.
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public interface AbstractConverter {    
    public void Convert(PrintStream ps, String source, String target);
}
