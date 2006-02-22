package one2one;

import java.io.PrintStream;

import ucm.map.InBinding;

public class InBindingConverter implements AbstractConverter{
	private InBinding af;
	// constructors
    public InBindingConverter(InBinding af){
       this.af = af;
    }

   
	
			
		    // prints XML representation of object to output file
		    public void Convert(PrintStream ps){
		        
		        // object attributes
		        String Object_attributes = "<inbinding id=\"" + "h" + "\"" + " " +
		                                   "description=\"" +"\"/>";
		        
		        // output to file
		        ps.println("            " + Object_attributes);
		        ps.flush();                    
		    }
		    


}
