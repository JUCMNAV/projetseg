package one2one;
import java.io.PrintStream;

import ucm.map.OrFork;
import ucm.map.PathNode;
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
    OptionalAssociations so = new OptionalAssociations();
	// constructors
    public OrForkConverter(OrFork of){
       this.of=of;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, String source, String target){
        
        // object attributes
        String madatory_attribute = "<Branch id=\"" + "h" + of.getId() + "\"";
        ps.print("			" + madatory_attribute);
        String closing_attribute = "/>";
       
        // optional attributes
        so.OptionalAttributes((PathNode) of,  ps, source, target);
        
        // output to file
        ps.println(closing_attribute);
        ps.flush();                    
    }
}