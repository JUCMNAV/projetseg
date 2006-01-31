package one2one;
import java.io.PrintStream;

import ucm.map.PathNode;
import ucm.map.impl.OrForkImpl;


/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Branch) of the OrFork object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class OrForkConverter extends OrForkImpl implements AbstractConverter{
	// constructors
    public OrForkConverter(PathNode pn){
       this.description = pn.getDescription();
       this.id = pn.getId();
       this.name = pn.getName();
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
        
        // object attributes
        String Object_attributes = "<Branch id=\"" + "h" + getId() + "\"" + " " +
                                    "description=\"" + getDescription() +"\"/>";
        
        // output to file
        ps.println("            " + Object_attributes);
        ps.flush();                    
    }
}
