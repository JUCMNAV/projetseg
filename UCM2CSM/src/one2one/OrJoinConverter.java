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
        String Object_header = "<CSM name=\"merge\" description=\"\">";      
        String Object_attributes = "<merge id=\"" + getId() + "\"/>";
        String Open_scenario_tag = "<Scenario id=\"" + getId() + "\"" + " name=\""+ getName()+"\"description= \"" + getDescription()+ "/>";
        String Close_scenario_tag = "</Scenario>";
        // output to file
        ps.println("    " + Object_header);
        ps.println("        " + Open_scenario_tag);
        ps.println("        " + Object_attributes);
        ps.println("        " + Close_scenario_tag);
        ps.flush();                    
    }
}
