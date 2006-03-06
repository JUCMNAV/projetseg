package one2one;

import java.io.PrintStream;

import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.Stub;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Step) of the Stub object
 * Component-Ref object
 *  <!-- end-user-doc -->
 * @see one2one
 * @generated
 */
public class StubConverter implements AbstractConverter {
    private Stub stub;        
    private PathNode predecessor; 
    private PathNode successor;
    
    // constructors
    public StubConverter(Stub stub){
       this.stub = stub;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
                    
       // retrieve successor/predecessor           
       successor = (PathNode) ((NodeConnection)stub.getSucc().get(0)).getTarget();
       predecessor = (PathNode) ((NodeConnection)stub.getPred().get(0)).getSource();       
       
       // object attributes         
       String object_attributes = "<Step id=\"" + "h" + stub.getId() + "\"" + " " +
                                  "name=\"" + stub.getName() + "\"" + " " +
                                  "hostDemand=\"" + "1" + "\"" + " " +
                                  "description=\"" + stub.getDescription() + " " +
       							  "predecessor=\"" + "h" + predecessor.getId() + "\"" + " " +
                                  "successor=\"" + "h" + successor.getId() +"\"/>"; 
       
       							//"hostDemand=\"" + "1" + "\"" + " " +
       // output to file       
       
       ps.println("            " + object_attributes);
       ps.flush();                    
                       
    }
}
