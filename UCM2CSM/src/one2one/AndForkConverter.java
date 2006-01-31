package one2one;

import java.io.PrintStream;

import ucm.map.PathNode;
import ucm.map.impl.AndForkImpl;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Join) of the AndFork object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */

public class AndForkConverter extends AndForkImpl implements AbstractConverter{
	
		// constructors
	    public AndForkConverter(PathNode pn){
	       this.description = pn.getDescription();
	       this.id = pn.getId();
	       this.name = pn.getName();
	    }

	    // prints XML representation of object to output file
	    public void Convert(PrintStream ps){
	        
	        // object attributes
	        String Object_attributes = "<Fork id=\"" + "h" + getId() + "\"" + " " +
	                                    "description=\"" + getDescription() +"\"/>";
	        
	        // output to file
	        ps.println("            " + Object_attributes);
	        ps.flush();                    
	    }
	
}
