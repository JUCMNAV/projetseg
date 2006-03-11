package one2one;

import java.io.PrintStream;

import ucm.map.NodeConnection;
import ucm.map.PathNode;

public class OptionalAssociations {
	public void OptionalAttributes(NodeConnection af, PrintStream ps){
		if (af.getCondition().getDescription() != null){
        	String description_attribute = "description=\"" + af.getCondition().getDescription() +"\"";
        	ps.print(description_attribute);
        }
        if ((NodeConnection)af.getTarget()!= null  ){
        	PathNode target = (PathNode) (NodeConnection)af.getTarget(); 
        	String target_attribute = "target= \"h" +target.getId() +"\"";
        	ps.print(" " + target_attribute);
        }
        if ((NodeConnection)af.getSource() != null){
        	PathNode source = (PathNode) (NodeConnection)af.getSource();
        	String source_attribute = "source= \"h" + source.getId() +"\"";
        	ps.print(" " + source_attribute);
        }
		
	}

}
