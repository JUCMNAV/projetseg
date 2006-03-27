package one2one;

import java.io.PrintStream;

import ucm.map.NodeConnection;
import ucm.map.OrJoin;
import ucm.map.PathNode;
/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Merge) of the OrJoin object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class OrJoinConverter implements AbstractConverter {
	private OrJoin oj;
    OptionalAssociations so = new OptionalAssociations();
	// constructors
    public OrJoinConverter(OrJoin oj){
      this.oj = oj;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, String source, String target){
        
        // object attributes
        String madatory_attribute = "<Merge id=\"" + "h" + oj.getId() + "\"";
        ps.print("			" + madatory_attribute);
        String closing_attribute = "/>";
        
        // optional attributes
        so.OptionalAttributes((PathNode) oj,  ps, source, target);
        
        // output to file
        ps.println(closing_attribute);
        ps.flush();                    
    }
}
