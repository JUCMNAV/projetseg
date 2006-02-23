package one2one;

import java.io.PrintStream;

import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.RespRef;

public class ResponsibilityRefConverter implements AbstractConverter {
    private RespRef resp;
    PathNode successor;
    PathNode predecessor;
    
    // constructors
    public ResponsibilityRefConverter(RespRef resp){
      this.resp = resp;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
        
        // retrieve target/source        
        successor = (PathNode) ((NodeConnection)resp.getSucc().get(0)).getTarget();
        predecessor = (PathNode) ((NodeConnection)resp.getPred().get(0)).getSource(); 
        System.out.println("successor: " + successor.getId());
        System.out.println("predecessor: " + predecessor.getId());
        
        // object attributes
        String object_attributes = "<Step id=\"h" + resp.getId() + "\"" + " " +
                                   "name =\"" + resp.getName() +"\"" + " " +
                                   "description =\"" + resp.getDescription() +"\"" + " " +                                   
                                   "host-demand =\"" + "1" + "\"" + " " +
                                   "predecessor =\"h" + predecessor.getId() +"\"" + " " +
                                   "successor= \"h" + successor.getId() +"\"/>";
        
        // output to file
        ps.println("            " + object_attributes);
        ps.flush();                    
    }
}
