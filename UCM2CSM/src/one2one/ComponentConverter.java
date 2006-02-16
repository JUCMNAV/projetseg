package one2one;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.*;

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
    
    // component definitions
	private ComponentElement compDef;
	private ComponentElement parentCompDef;
    private ComponentElement childrenCompDef;
    
    // other variables    
    private String children = new String();
    private String parent = new String();
    
	// constructors
	public ComponentConverter(ComponentRef compRef) {
		this.compRef = compRef;
		this.compDef = (ComponentElement) compRef.getContDef();
        
		// initialize parent only if a reference to the parent component exists
		if (((ComponentRef) compRef.getParent()) != null){
			this.parentCompRef = (ComponentRef) compRef.getParent();			 
			// if (this.parentCompRef != null)
			this.parentCompDef = (ComponentElement) this.parentCompRef.getContDef();
            parent += "c" + this.parentCompDef.getId();
		}
		else{
            parent += " ";
            System.out.println("Parent String: " + children);			
		}
        
		// retrieve children
        int j = 0;   
       
        for (Iterator iter = compRef.getChildren().listIterator(); iter.hasNext();) {               
            this.childrenCompRef = (ComponentRef) iter.next(); 
            this.childrenCompDef = (ComponentElement) this.childrenCompRef.getContDef();                 
            j++;
            System.out.println("Child #" + j + ": " + this.childrenCompDef.getId());
            children += "c" + this.childrenCompDef.getId() + " ";
            System.out.println("Children String: " + children);
            //hasChildren = true;              
       }
      												
	}

	// prints XML representation of object to output file
	public void Convert(PrintStream ps) {

		// object attributes
			
		 String comp_attributes = "<Component id=\"" + "c" + compDef.getId() + "\"" + " " +
		 						  "name=\"" + compDef.getName() + "\"" + " " +
		 						  "host=\"" + " " + "\"" + " " + "\" />";
		  
		 String comp_attributes_sub = "<Component id=\"" + "c" + compDef.getId() + "\"" + " " +
		 							  "name=\"" + compDef.getName()+ "\"" + " " +
		 							  "host=\"" + " " + "\"" + " " + "sub=\"" + children + "\"/>";
       
         String comp_attributes_parent = "<Component id=\"" + "c" + compDef.getId() + "\"" + " " +
                                         "name=\"" + compDef.getName() + "\"" + " " +
                                         "host=\"" + " " + "\"" + " " +
                                         "parent=\"" + parent + "\" />";
  		  
		 String comp_attributes_sub_parent = "<Component id=\"" + "c" + compDef.getId() + "\"" + " " +
		 									 "name=\"" + compDef.getName() + "\"" + " " +
		 									 "host=\"" + " " + "\"" + " " +
		 									 "sub=\"" + children + "\"" + " " +
		 									 "parent=\"" + parent + "\" />";		
	 
		// determine if component has parents or children or both and output to file
 
		 if(parent != " "){
			 if(children != " "){
				 ps.println("            " + comp_attributes_sub_parent);
			 }
			 else{
				 ps.println("            " + comp_attributes_parent);
			 }
		 }
		 else {
             if(children != " "){
				 ps.println("            " + comp_attributes_sub);
			 }
			 else{
				 ps.println("            " + comp_attributes);
			 }
		 }	
		ps.flush();

	}
		
}
