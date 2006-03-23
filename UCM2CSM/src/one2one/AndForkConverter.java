package one2one;

import java.io.PrintStream;

import ucm.map.AndFork;
import ucm.map.NodeConnection;
import ucm.map.PathNode;

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
	    // ()	;
	        // object attributes
            
	        String id_attribute = "<Fork id=\"" + "h" + af.getId() + "\" ";
	        ps.print("			" + id_attribute);
	        String closing_attribute = "/>";
	        
	        // optional attributes
	        OptionalAssociations.printDescription(ps, af);
	        OptionalAssociations.printTarget(ps, af);
	        OptionalAssociations.printSource(ps, af);
	       
	        
	        ps.println(closing_attribute);
	        ps.flush();                    
	    }
	
}