package one2one;

import java.io.PrintStream;

import ucm.map.OrJoin;
/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Merge) of the OrJoin object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class OrJoinConverter implements AbstractConverter {
	private OrJoin oj;
	// constructors
    public OrJoinConverter(OrJoin oj){
      this.oj = oj;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
        
        // object attributes
        String object_attributes = "<Merge id=\"" + "h" + oj.getId() + "\"" + " " +
                                    "description=\"" + oj.getDescription() +"\"/>";
        
        // output to file
        ps.println("            " + object_attributes);
        ps.flush();                    
    }
}
