package one2one;

import java.io.PrintStream;

import ucm.map.EndPoint;
import ucm.map.NodeConnection;
import ucm.map.OutBinding;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(End) of the End-Point object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class EndPointConverter implements AbstractConverter {
    private EndPoint ep; 

    //private PathNode source;
    PathConnAttributes oa = new PathConnAttributes();

    // constructors
    public EndPointConverter(EndPoint ep){
       this.ep = ep;       
    }
    
    // prints XML representation of object to output file
    public void Convert(PrintStream ps, String source, String target){
       
       
       String mandatory_attribute = "<End id=\"" + "h" + ep.getId() + "\" ";
       ps.print("			" + mandatory_attribute);
       String closing_attribute = "/>";
       
       //     optional attributes
       oa.OptionalAttributes((PathNode) ep,  ps, source, target);
   
       // output to file             
       ps.println(closing_attribute);                        
       ps.flush();      
       }
      
                    
                        
    }


