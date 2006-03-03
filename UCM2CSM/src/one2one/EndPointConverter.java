package one2one;

import java.io.PrintStream;

import ucm.map.EndPoint;
import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.impl.EndPointImpl;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(End) of the End-Point object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class EndPointConverter implements AbstractConverter {
    private EndPoint ep; 
    private PathNode source;
    
    // constructors
    public EndPointConverter(EndPoint ep){
       this.ep = ep;       
    }
    
    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
       
       //retrieve target/source        
       source = (PathNode) ((NodeConnection)ep.getPred().get(0)).getSource();
      
       // object attributes 
       String object_attributes = "<End id=\"h" + ep.getId() + "\"" + " " +                              
                                   "source= \"h" + source.getId() +"\"/>";
                         
       // output to file             
       ps.println("            " + object_attributes);                        
       ps.flush();                    
                        
    }
}

