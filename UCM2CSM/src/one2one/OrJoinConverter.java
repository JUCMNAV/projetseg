package one2one;

import java.io.PrintStream;

import ucm.map.PathNode;
import ucm.map.impl.OrJoinImpl;
/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Merge) of the OrJoin object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class OrJoinConverter extends OrJoinImpl implements AbstractConverter {
	
	// constructors
    public OrJoinConverter(PathNode pn){
       this.description = pn.getDescription();
       this.id = pn.getId();
       this.name = pn.getName();
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
        
        // object attributes
        String Object_attributes = "<Merge id=\"" + "h" + getId() + "\"" + " " +
                                    "description=\"" + getDescription() +"\"/>";
        
        // output to file
        ps.println("            " + Object_attributes);
        ps.flush();                    
    }
}
