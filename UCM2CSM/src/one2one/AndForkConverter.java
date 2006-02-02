package one2one;

import java.io.PrintStream;

import ucm.map.AndFork;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(And-Fork) of the AndFork object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */

public class AndForkConverter implements AbstractConverter{
	    private AndFork af;
		// constructors
	    public AndForkConverter(AndFork af){
	       this.af = af;
	    }

	    // prints XML representation of object to output file
	    public void Convert(PrintStream ps){
	        
	        // object attributes
	        String object_attributes = "<Fork id=\"" + "h" + af.getId() + "\"" + " " +
	                                    "description=\"" + af.getDescription() +"\"/>";	        
	        // output to file
	        ps.println("            " + object_attributes);
	        ps.flush();                    
	    }
	
}