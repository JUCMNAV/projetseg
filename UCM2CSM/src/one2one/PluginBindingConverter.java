package one2one;

import java.io.PrintStream;

import ucm.map.InBinding;
import ucm.map.OutBinding;
import ucm.map.PluginBinding;



public class PluginBindingConverter implements AbstractConverter{
	private PluginBinding p_bind;
	private InBinding in_bind;
	private OutBinding out_bind;

	// constructors
    public PluginBindingConverter(PluginBinding p_bind){
       this.p_bind = p_bind;
    }
    
    // prints XML representation of object to output file
	public void Convert(PrintStream ps){
		        
	    // object attributes
	    String object_attributes = "<Refinement parant=\"" + "h" + p_bind.getId() + "\"" + " " +
                                    "start=\"" + "h" + p_bind.getStub() +"\"/>";
	    

	    String inbinding_attributes = "<InBinding id=\"" + "si" + in_bind.getBinding() + "\"" + " " +
        								"start=\"" + "h" + in_bind.getStartPoint()  + "\"" + " " + 
        								"in=\"" + "h" + in_bind.getStubEntry() +"\"/>";

	    String outbinding_attributes = "<outbinding id=\"" + "so" + out_bind.getBinding() + "\"" + " " +
        								"end=\"" + "h" + out_bind.getEndPoint()  + "\"" + " " + 
        								"out=\"" + "h" + out_bind.getStubExit() +"\"/>";
	    String object_attributes_close = "</Refinement>";

		        
	    // output to file
	    ps.println("            " + object_attributes);
	    ps.println("            " + inbinding_attributes);
	    ps.println("            " + outbinding_attributes);
	    ps.println("            " + object_attributes_close);
	    ps.flush();                    
 }

}
