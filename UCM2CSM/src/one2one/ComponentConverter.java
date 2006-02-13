package one2one;

import java.awt.List;
import java.io.PrintStream;

import ucm.map.ComponentRef;
import urncore.ComponentElement;

/**
 * <!-- begin-user-doc --> Creates the CSM representation(Component) of the
 * Component-Ref object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */
public class ComponentConverter implements AbstractConverter {
    
    // component references
	private ComponentRef compRef;
    private ComponentRef parentCompRef;
    private ComponentRef childrenCompRef;
    private List childrenList = new List();    
    
    // component definitions
	private ComponentElement compDef;
	private ComponentElement parentCompDef;
    private ComponentElement childrenCompDef;
    
    // other variables
    private boolean hasParent; 	
	private boolean hasChildren;
	
	// constructors
	public ComponentConverter(ComponentRef compRef) {
		hasParent = true;
		hasChildren = true;
		this.compRef = compRef;
		this.compDef = (ComponentElement) compRef.getContDef();
		// initialize parent only if a reference to the parent component exists
		if (((ComponentRef) compRef.getParent()) != null){
			this.parentCompRef = (ComponentRef) compRef.getParent();			 
			// if (this.parentCompRef != null)
			this.parentCompDef = (ComponentElement) this.parentCompRef.getContDef();
		}
		else{
			hasParent = false;
		}							
		// initialize children only if a reference to the child component exists
        //this.childrenCompRef = (ComponentRef) compRef.getChildren();
        // implement a LIST ??
   /*     this.childrenList = (List) compRef.getChildren();      
        System.out.println("In ComponentConverter about to retreive data ");
	    // if (((ComponentRef) compRef.getChildren()!= null)){
        if (!childrenCompRef.getChildren().isEmpty()){
			// if (this.childrenCompRef != null)
			this.childrenCompDef = (ComponentElement) this.childrenCompRef.getContDef();
		}
		else {
			hasChildren = false;
		}
     */ 												
	}

	// prints XML representation of object to output file
	public void Convert(PrintStream ps) {
		// for debug
		System.out.println("In ComponentConverter about to retreive data ");
		System.out.println("Get id = " + compDef.getId());
		System.out.println("Get name = " + compDef.getName());
		if (hasParent)
			System.out.println("Get parent = " + parentCompDef.getId());
//		if (hasChildren)
//			System.out.println("Get children = " + childrenCompDef.getId());
      

		// object attributes
/*			
		 String comp_attributes = "<Component id=\"" + "c" + compDef.getId() + "\"" + " " +
		 						  "name=\"" + compDef.getName() + "\"" + " " +
		 						  "host=\"" + " " + "\"" + " " + "\" />";
		  
		 String comp_attributes_sub = "<Component id=\"" + "c" + compDef.getId() + "\"" + " " +
		 							  "name=\"" + compDef.getName()+ "\"" + " " +
		 							  "host=\"" + " " + "\"" + " " + "sub=\"" + childrenCompDef.getId() + "\"/>";
		 
		 String comp_attributes_parent = "<Component id=\"" + "c" + compDef.getId() + "\"" + " " +
		 								 "name=\"" + compDef.getName() + "\"" + " " +
		 								 "host=\"" + " " + "\"" + " " +
		 								 "parent=\"" + parentCompDef.getId() + "\" />";
		  
		 String comp_attributes_sub_parent = "<Component id=\"" + "c" + compDef.getId() + "\"" + " " +
		 									 "name=\"" + compDef.getName() + "\"" + " " +
		 									 "host=\"" + " " + "\"" + " " +
		 									 "sub=\"" + childrenCompDef.getId() + "\"" + " " +
		 									 "parent=\"" + parentCompDef.getId() + "\" />";		
*/		 
		// determine if component has parents or children or both and output to file
/*		 
		 if(parentCompDef.getId() != null){
			 if(childrenCompDef.getId() != null){
				 ps.println(" " + comp_attributes_sub_parent);
			 }
			 else{
				 ps.println(" " + comp_attributes_parent);
			 }
		 }
		 else {
			 if(childrenCompDef.getId() != null){
				 ps.println(" " + comp_attributes_sub);
			 }
			 else{
				 ps.println(" " + comp_attributes);
			 }
		 }
*/		
		ps.flush();

	}
		
}
