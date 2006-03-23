package one2one;

import java.io.PrintStream;

import ucm.map.AndJoin;
import ucm.map.NodeConnection;
import ucm.map.PathNode;
/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Join) of the AndJoin object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class AndJoinConverter implements AbstractConverter {
    private AndJoin aj;
    
    // constructors
    public AndJoinConverter(AndJoin aj){
       this.aj = aj;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
       
       // object attributes 
        String object_attributes = "<Join id=\"" + "h" + aj.getId() + "\" "; //+ " " +
                                   
        ps.print("			" + object_attributes);
        String closing_attribute = "/>";
      //optional attributes
       OptionalAssociations.printDescription(ps, aj);
       OptionalAssociations.printTarget(ps, aj);
       OptionalAssociations.printSource(ps, aj);
       
       ps.println(closing_attribute);
       ps.flush();                    
                        
    }
}
