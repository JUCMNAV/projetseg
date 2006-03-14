package one2one;

import java.io.PrintStream;

import ucm.map.AndFork;
import ucm.map.NodeConnection;
import ucm.map.PathNode;

public class OptionalAssociations {
	public void OptionalAttributes(PathNode af, PrintStream ps){
		System.out.print("not working ");
		if (af.getDescription() != null){
        	String description_attribute = "description=\"" + af.getDescription() +"\"";
        	ps.print(description_attribute);
        }
        if ((NodeConnection)af.getSucc().get(0) != null && (PathNode) ((NodeConnection)af.getSucc().get(0)).getTarget()!= null  ){
        	PathNode target = (PathNode) ((NodeConnection)af.getSucc().get(0)).getTarget(); 
        	String target_attribute = "target= \"h" +target.getId() +"\"";
        	ps.print(" " + target_attribute);
        }
        if ((NodeConnection)af.getPred().get(0) != null && (PathNode) ((NodeConnection)af.getPred().get(0)).getSource() != null){
        	PathNode source = (PathNode) ((NodeConnection)af.getPred().get(0)).getSource();
        	String source_attribute = "source= \"h" + source.getId() +"\"";
        	ps.print(" " + source_attribute);
        }
		
	}

}
