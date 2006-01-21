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

    public OrJoinConverter(PathNode pn){
       this.description = pn.getDescription();
       this.id = pn.getId();
       this.name = pn.getName();
    }

    public void Convert(PrintStream ps){
        String Object_header = "<CSM name=\"merge\" description=\"\" >";      
        String Object_attributes = "<merge id=\"" + getId() + "\"" + " name=\""+ getClass().getName()+"\" />";        
        // output to file
        ps.println("    " + Object_header);
        ps.println("        " + Object_attributes);
        ps.flush();                    
    }
}
