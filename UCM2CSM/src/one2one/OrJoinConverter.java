package one2one;

import java.io.PrintStream;

import ucm.map.NodeConnection;
import ucm.map.OrJoin;
import ucm.map.PathNode;
/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Merge) of the OrJoin object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class OrJoinConverter implements AbstractConverter {
	private OrJoin oj;
	// constructors
    public OrJoinConverter(OrJoin oj){
      this.oj = oj;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
        
        // object attributes
        //String object_attributes = "<Merge id=\"" + "h" + oj.getId() + "\"" + " " +
          //                          "description=\"" + oj.getDescription() +"\"/>";
        String id_attribute = "<Merge id=\"" + "h" + oj.getId() + "\"";
        ps.print("			" + id_attribute);
        String closing_attribute = "/>";
        
        // optional attributes
        if (oj.getDescription() != null){
        	String description_attribute = "description=\"" + oj.getDescription() +"\"";
        	ps.print(description_attribute);
        }
        if ((NodeConnection)oj.getSucc().get(0)!= null && (PathNode) ((NodeConnection)oj.getSucc().get(0)).getTarget()!= null  ){
        	PathNode target = (PathNode) ((NodeConnection)oj.getSucc().get(0)).getTarget(); 
        	String target_attribute = "target= \"h" +target.getId() +"\"";
        	ps.print(" " + target_attribute);
        }
        if ((NodeConnection)oj.getPred().get(0) != null && (PathNode) ((NodeConnection)oj.getPred().get(0)).getSource() != null){
        	PathNode source = (PathNode) ((NodeConnection)oj.getPred().get(0)).getSource();
        	String source_attribute = "source= \"h" + source.getId() +"\"";
        	ps.print(" " + source_attribute);
        }
        // output to file
        ps.println(closing_attribute);
        ps.flush();                    
    }
}
