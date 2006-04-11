package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.OutBinding;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(outbinding) of the Out-Connection object
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */

public class OutBindingConverter implements AbstractConverter{
    
	private OutBinding out_bind;
    
	// constructors
	public OutBindingConverter(OutBinding out_bind){
       this.out_bind = out_bind;
    }
		
    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target){
       
      // object attributes
      String Object_attributes = "<OutBinding end=\"" + "h" + out_bind.getEndPoint().getId()  + "\"" + " " + 
		                         "out=\"" + "h" + ((PathNode)out_bind.getStubExit().getTarget()).getId() +"\"/>";
		        
      // output to file
      ps.println("              " + Object_attributes);
      ps.flush();                    
     }
}
