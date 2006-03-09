package one2one;
import java.io.PrintStream;

import ucm.map.NodeConnection;
import ucm.map.OrFork;
import ucm.map.PathNode;
import ucm.map.impl.OrForkImpl;


/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Branch) of the OrFork object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class OrForkConverter implements AbstractConverter{
    private OrFork of;
	// constructors
    public OrForkConverter(OrFork of){
       this.of=of;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
        
        // object attributes
        //String object_attributes = "<Branch id=\"" + "h" + of.getId() + "\"" + " " +
          //                          "description=\"" + of.getDescription() +"\"/>";
        
        
        String id_attribute = "<Branch id=\"" + "h" + of.getId() + "\"";
        ps.print("			" + id_attribute);
        String closing_attribute = "/>";
        
        // optional attributes
        if (of.getDescription() != null){
        	String description_attribute = "description=\"" + of.getDescription() +"\"";
        	ps.print(description_attribute);
        }
        if ((NodeConnection)of.getSucc().get(0)!= null && (PathNode) ((NodeConnection)of.getSucc().get(0)).getTarget()!= null  ){
        	PathNode target = (PathNode) ((NodeConnection)of.getSucc().get(0)).getTarget(); 
        	String target_attribute = "target= \"h" +target.getId() +"\"";
        	ps.print(" " + target_attribute);
        }
        if ((NodeConnection)of.getPred().get(0) != null && (PathNode) ((NodeConnection)of.getPred().get(0)).getSource() != null){
        	PathNode source = (PathNode) ((NodeConnection)of.getPred().get(0)).getSource();
        	String source_attribute = "source= \"h" + source.getId() +"\"";
        	ps.print(" " + source_attribute);
        }
        // output to file
        ps.println(closing_attribute);
        ps.flush();                    
    }
}