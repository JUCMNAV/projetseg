package one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

import ucm.map.InBinding;
import ucm.map.OutBinding;
import ucm.map.PluginBinding;

/**
 * <!-- begin-user-doc -->
 * Creates the CSM representation(Refinement) of the PluginBinding object 
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */

public class PluginBindingConverter implements AbstractConverter{
	private PluginBinding p_bind;
	
	// constructors
    public PluginBindingConverter(PluginBinding p_bind){
       this.p_bind = p_bind;
    }
    
    // prints XML representation of object to output file
	public void Convert(PrintStream ps, ArrayList source, ArrayList target){
				
	   // object attributes

	   String object_attributes = "<Refinement parent=\"" + "h" + p_bind.getStub().getId() + "\"" + " " +
                                  "sub=\"" + "m" + p_bind.getPlugin().getId() +"\">";

       // output to file
       ps.println("            " + object_attributes);
	      
      // get inbindings        
      for (Iterator inbind_iter = p_bind.getIn().iterator(); inbind_iter.hasNext();) {
         InBinding in_bind = (InBinding) inbind_iter.next(); 
         InBindingConverter in_bind_conv = new InBindingConverter(in_bind);
         // output to file
         in_bind_conv.Convert(ps, source, target);               
      }
      
      // get outbindings      
      for (Iterator outbind_iter = p_bind.getOut().iterator(); outbind_iter.hasNext();) {
          OutBinding out_bind = (OutBinding) outbind_iter.next(); 
          OutBindingConverter out_bind_conv = new OutBindingConverter(out_bind);
          // output to file
          out_bind_conv.Convert(ps, source, target);                                        
      }
      
      String object_attributes_close = "</Refinement>";
		        
	  // output to file	           
	  ps.println("            " + object_attributes_close);
	  ps.flush();                    
 }

}
