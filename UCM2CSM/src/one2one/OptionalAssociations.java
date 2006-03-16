package one2one;

import java.io.PrintStream;

import ucm.map.EndPoint;
import ucm.map.NodeConnection;
import ucm.map.PathNode;

public class OptionalAssociations {
	public void OptionalAttributes(PathNode af, PrintStream ps){
		
		printDescription(ps, af);
		printSource(ps, af);
		printTarget(ps, af);
		
   /*     if ((NodeConnection)af.getogetO){
            // NodeConnection bind = (NodeConnection) ep.getOutBindings();
       	   String outbind = "";
       	   for (int i=0;i<ep.getOutBindings().size(); i++){
       		   outbind += " so" + ep.getOutBindings().get(i);    		
       	   }
       	   OutBinding
           String source_attribute = "Outbinding= \"" + outbind +"\"";
           System.out.println("CSM Rep " + source_attribute);
           System.out.println("OutBindings list: " + ep.getOutBindings());
           ps.print(" " + source_attribute);
          }*/
	}
   
public static void printSource(PrintStream ps, PathNode pathnode) {
	if ((NodeConnection)pathnode.getPred().get(0) != null && (PathNode) ((NodeConnection)pathnode.getPred().get(0)).getSource() != null){
    	PathNode source = (PathNode) ((NodeConnection)pathnode.getPred().get(0)).getSource();
    	String source_attribute = "source= \"h" + source.getId() +"\"";
    	ps.print(" " + source_attribute);
    }
}
public static void printTarget(PrintStream ps, PathNode pathnode) {
	if (!pathnode.getSucc().isEmpty() && (PathNode) ((NodeConnection)pathnode.getSucc().get(0)).getTarget()!= null  ){
    	PathNode target = (PathNode) ((NodeConnection)pathnode.getSucc().get(0)).getTarget(); 
    	String target_attribute = "target= \"h" +target.getId() +"\"";
    	ps.print(" " + target_attribute);
    }
}
public static void printDescription(PrintStream ps, PathNode pathnode) {
	if (pathnode.getDescription() != null){
    	String description_attribute = "description=\"" + pathnode.getDescription() +"\"";
    	ps.print(description_attribute);
    }
}
}
