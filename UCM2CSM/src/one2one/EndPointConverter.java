package one2one;

import java.io.PrintStream;

import ucm.map.EndPoint;
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
    // constructors
    public EndPointConverter(EndPoint ep){
       this.ep = ep;       
    }
    
    // prints XML representation of object to output file
    public void Convert(PrintStream ps){
       /********************** How can I obtain the source attribute? ***************/
       // object attributes 
       String object_attributes = "<End id=\"h" + ep.getId() + "\"" + " " +
                                   "name =\"" + ep.getName() +"\"" + " " + 
                                   "source= \"h" + " " +"\"/>";
                         
       // output to file             
       ps.println("         " + object_attributes);                        
       ps.flush();                    
                        
    }
}

