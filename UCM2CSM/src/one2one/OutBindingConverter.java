package one2one;

import java.io.PrintStream;

import ucm.map.OutBinding;

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
    public void Convert(PrintStream ps){
        
      // object attributes
      String Object_attributes = "<outbinding id=\"" + "so" + out_bind.getBinding() + "\"" + " " +
                                 "end=\"" + "h" + out_bind.getEndPoint().getId()  + "\"" + " " + 
		                         "out=\"" + "h" + out_bind.getStubExit().getTarget() +"\"/>";
		        
      // output to file
      ps.println("              " + Object_attributes);
      ps.flush();                    
     }
		    


}
