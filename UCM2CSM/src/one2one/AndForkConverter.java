package one2one;

import java.io.PrintStream;

import ucm.map.AndFork;
import ucm.map.NodeConnection;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(And-Fork) of the AndFork object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */

public class AndForkConverter implements AbstractConverter{
	    private AndFork af;
	   // OptionalAssociations oa = new OptionalAssociations();
		// constructors
	    public AndForkConverter(AndFork af){
	       this.af = af;
	    }

	    // prints XML representation of object to output file
	    public void Convert(PrintStream ps){
	    // ()	;
	        // object attributes
            
	        String id_attribute = "<Fork id=\"" + "h" + af.getId() + "\" ";
	        ps.print("			" + id_attribute);
	        String closing_attribute = "/>";
	        
	        // optional attributes
	     /*   if (af.getDescription() != null){
	        	String description_attribute = "description=\"" + af.getDescription() +"\"";
	        	ps.print(description_attribute);
	        }
	       if ((NodeConnection)af.getSucc().get(0)!= null && (PathNode) ((NodeConnection)af.getSucc().get(0)).getTarget()!= null  ){
	        	PathNode target = (PathNode) ((NodeConnection)af.getSucc().get(0)).getTarget(); 
	        	String target_attribute = "target= \"h" +target.getId() +"\"";
	        	ps.print(" " + target_attribute);
	        }
	        if ((NodeConnection)af.getPred().get(0) != null && (PathNode) ((NodeConnection)af.getPred().get(0)).getSource() != null){
	        	PathNode source = (PathNode) ((NodeConnection)af.getPred().get(0)).getSource();
	        	String source_attribute = "source= \"h" + source.getId() +"\"";
	        	ps.print(" " + source_attribute);
	        }*/
	        OptionalAssociations.printDescription(ps, af);
	        OptionalAssociations.printTarget(ps, af);
	        OptionalAssociations.printSource(ps, af);
	       // oa.OptionalAttributes((PathNode) af,  ps);
	        
	        ps.println(closing_attribute);
	        ps.flush();                    
	    }
	
}