package one2one;

import java.io.PrintStream;
import java.util.Iterator;

import ucm.map.ComponentRef;
import ucm.performance.PassiveResource;
import ucm.performance.ProcessingResource;
import urncore.Component;
import urncore.ComponentElement;
import urncore.ComponentRegular;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(Component) of the Component-Ref object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */
public class ComponentRefConverter {

    // component references
    public ComponentRef compRef;
    private ComponentRef parentCompRef;
    private ComponentRef childrenCompRef;

    // component definitions
    private ComponentRegular compDef;
    private ComponentRegular parentCompDef;
    private ComponentRegular childrenCompDef;

    // other variables
    private String children = new String();
    private String parent = new String();

    private boolean activeP;
    public String type = new String();

    public String host = new String();

    // constructors
    public ComponentRefConverter(ComponentRef compRef) {
        this.compRef = compRef;
        this.compDef = (ComponentRegular) compRef.getContDef();

        // processing active_process
        this.activeP = false;

        // set up the boolean value is_active_process to true if component is Process, Team or Agent
        type = compDef.getKind().toString();
        if (type.compareTo("Process") == 0 || type.compareTo("Team") == 0 || type.compareTo("Agent") == 0) {
            this.activeP = true;
        }

        // initialize parent only if a reference to the parent component exists
        if (((ComponentRef) compRef.getParent()) != null) {
            this.parentCompRef = (ComponentRef) compRef.getParent();
            this.parentCompDef = (ComponentRegular) this.parentCompRef.getContDef();
            parent += "c" + this.parentCompRef.getId();
        } else {
            parent += " ";
        }

        // retrieve children
        for (Iterator iter = compRef.getChildren().listIterator(); iter.hasNext();) {
            this.childrenCompRef = (ComponentRef) iter.next();
            this.childrenCompDef = (ComponentRegular) this.childrenCompRef.getContDef();
            children += "c" + this.childrenCompRef.getId() + " ";
        }

    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps) {

        // object attributes --- host attribute to be implemanteds
	String id = ((Component)compRef.getContDef()).getId();
	String name = ((Component)compRef.getContDef()).getName();
        String comp_attributes = "<Component id=\"" + "c" + id + "\"" + " " + "name=\"" + name + "\"" + " " + "host=\"" + " " + "\""
                + " ";
        String close = "/>";

        String comp_attributes_sub = "sub=\"" + children + "\"" + " ";
        String comp_attributes_parent = "parent=\"" + parent + "\"" + " ";
        String comp_attributes_active_process = "isActiveProcess =\"" + activeP + "\"" + " ";

        ps.print("        " + comp_attributes);
        ps.print(" " + comp_attributes_active_process);

        if (parent.compareTo(" ") != 0) {
            ps.print(comp_attributes_parent);
        }
        if (children.compareTo("") != 0) {
            ps.print(comp_attributes_sub);
        }
        ps.println(" " + close);
        ps.flush();
        
        // resources do not exist yet. js
        Component comp = (Component)compRef.getContDef();
        if (comp != null) {
            if (comp instanceof ComponentRegular) {
        	if (comp.getHost() != null) {
        	    ProcessingResource procRes = (ProcessingResource) comp.getHost();
        	    String resStr = "<Component id=\"" + "r" + procRes.getId() + "\" name=\"" + procRes.getName() + "\" />";
        	    ps.println("        " + resStr);
        	    ps.flush();
        	}
            }
            if (comp instanceof ComponentElement) {
        	if (comp.getResource() != null) {
        	    PassiveResource passRes = (PassiveResource) comp.getResource(); 
        	    String resStr = "<Component id=\"" + "r" + passRes.getId() + "\" name=\"" + passRes.getName() + "\" />";
        	    ps.println("        " + resStr);
        	    ps.flush();
        	}
            }
        }
    }
}
