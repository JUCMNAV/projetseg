package one2one;
import java.io.PrintStream;
import java.util.Iterator;

import ucm.map.ComponentRef;
//import urncore.ComponentElement;
import urncore.ComponentRegular;
//import urncore.ComponentKind;

/**
* <!-- begin-user-doc --> Creates the CSM representation(Component) of the
* Component-Ref object <!-- end-user-doc -->
*
* @see one2one
* @generated
*/
public class ComponentConverter {//implements AbstractConverter {

    // component references
	public ComponentRef compRef;
    private ComponentRef parentCompRef;
    private ComponentRef childrenCompRef;

    // component definitions
	private ComponentRegular compDef;
	// private ComponentElement compDef;
	private ComponentRegular parentCompDef;
    private ComponentRegular childrenCompDef;

    // other variables
    private String children = new String();
    private String parent = new String();

    private boolean activeP;
    public String type = new String();
    
    
	// constructors
	public ComponentConverter(ComponentRef compRef) {
		this.compRef = compRef;
		this.compDef = (ComponentRegular) compRef.getContDef();

		this.activeP = false;
		

		//check the type of the component; if the type is process, agent or team set activeP to true

		//set up the boolean value is_active_process to true if component is Process, Team or Agent
		String type = new String();
		type = compDef.getKind().toString();
		if (type.compareTo("Process")== 0 || type.compareTo("Team") == 0 ||
					type.compareTo("Agent") == 0)
		{
			this.activeP = true;
		}


		// initialize parent only if a reference to the parent component exists
		if (((ComponentRef) compRef.getParent()) != null){
			this.parentCompRef = (ComponentRef) compRef.getParent();
			this.parentCompDef = (ComponentRegular) this.parentCompRef.getContDef();
            parent += "c" + this.parentCompDef.getId();
		}
		else{
            parent += " ";
		}

		// retrieve children
		
		

        for (Iterator iter = compRef.getChildren().listIterator(); iter.hasNext();) {
            this.childrenCompRef = (ComponentRef) iter.next();
            this.childrenCompDef = (ComponentRegular) this.childrenCompRef.getContDef();
            children += "c" + this.childrenCompDef.getId() + " ";
       }

	}

	// prints XML representation of object to output file
	public void Convert(PrintStream ps) {

		// object attributes

		 String comp_attributes = "<Component id=\"" + "c" + compDef.getId() + "\"" + " " + 
		 						  "name=\"" + compDef.getName() + "\"" + " " +
		 						  "host=\"" + "h1000" + "\"" + " ";

		 String close = "/>";


		 String comp_attributes_sub = "sub=\"" + children + "\"";

		 System.out.println("Children: " +comp_attributes_sub);

		 String comp_attributes_parent = "parent=\"" + parent + "\"";

		 System.out.println("parent: " + comp_attributes_parent);

		 String comp_attributes_active_process = "is_active_process =\"" + activeP + "\"";

		 System.out.println("Active? " + comp_attributes_active_process);



	
		 
		 ps.print("            " + comp_attributes);



		 if(activeP != false)
		 {
			 ps.print(comp_attributes_active_process);

		 }

		 if(parent.compareTo(" ") != 0)
		 {
			 ps.print(comp_attributes_parent);
		 }
		 if(children.compareTo("") != 0)
		 {
			 ps.print(comp_attributes_sub);
		 }
		
		 ps.println(" " + close);
		ps.flush();

		

	}
}


