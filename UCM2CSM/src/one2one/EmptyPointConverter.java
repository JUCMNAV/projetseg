package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.EmptyPoint;
import ucm.map.PathNode;

/**
* <!-- begin-user-doc -->
* Creates the CSM representation(Sequence) of the EmptyPoint object
* <!-- end-user-doc -->
* @see one2one
* @generated
*/

public class EmptyPointConverter implements AbstractConverter{
        private EmptyPoint ep;
        PathConnAttributes oa = new PathConnAttributes();
        // constructors
        public EmptyPointConverter(EmptyPoint ep){
           this.ep = ep;
        }

        // prints XML representation of object to output file
        public void Convert(PrintStream ps, ArrayList source, ArrayList target){

            // object attributes
            String Object_attributes = "<Sequence id=\"" + "h" + ep.getId() + "\""; 
                                     
            ps.print("			" + Object_attributes);
            String closing_attribute = "/>";
           
          /*  if (ep.getDescription() != null){
            	String description_attribute = "description=\"" + ep.getDescription() +"\"";
            	ps.print(description_attribute);
            }
            if ((NodeConnection)ep.getSucc().get(0)!= null && (PathNode) ((NodeConnection)ep.getSucc().get(0)).getTarget()!= null  ){
            	PathNode target = (PathNode) ((NodeConnection)ep.getSucc().get(0)).getTarget(); 
            	String target_attribute = "target= \"h" +target.getId() +"\"";
            	ps.print(" " + target_attribute);
            }
            if ((NodeConnection)ep.getPred().get(0) != null && (PathNode) ((NodeConnection)ep.getPred().get(0)).getSource() != null){
            	PathNode source = (PathNode) ((NodeConnection)ep.getPred().get(0)).getSource();
            	String source_attribute = "source= \"h" + source.getId() +"\"";
            	ps.print(" " + source_attribute);
            }*/
            oa.OptionalAttributes((PathNode) ep,  ps, source, target);
  
            // output to file
            ps.println(closing_attribute);
            ps.flush();
        }

}




