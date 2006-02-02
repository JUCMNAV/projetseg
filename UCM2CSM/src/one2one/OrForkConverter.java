package one2one;
import java.io.PrintStream;

import ucm.map.OrFork;
import ucm.map.impl.OrForkImpl;


/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Branch) of the OrFork object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class OrForkConverter implements AbstractConverter{
    private OrFork of;
	// constructors
    public OrForkConverter(OrFork of){
       this.of=of;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
        
        // object attributes
        String object_attributes = "<Branch id=\"" + "h" + of.getId() + "\"" + " " +
                                    "description=\"" + of.getDescription() +"\"/>";
        
        // output to file
        ps.println("            " + object_attributes);
        ps.flush();                    
    }
}