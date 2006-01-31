package one2one;

import java.io.PrintStream;

import ucm.map.PathNode;
import ucm.map.impl.AndJoinImpl;
/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Join) of the AndJoin object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class AndJoinConverter extends AndJoinImpl implements AbstractConverter {
    // constructors
    public AndJoinConverter(PathNode pn){
       this.description = pn.getDescription();
       this.id = pn.getId();
       this.name = pn.getName();
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
       
       // object attributes 
        String Object_attributes = "<Join id=\"" + "h" + getId() + "\"" + " " +
                                   "description=\"" + getDescription() +"\"/>";
       
       // output to file
       ps.println("            " + Object_attributes);
       ps.flush();                    
                        
    }
}
