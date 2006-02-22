package one2one;

import java.io.PrintStream;

import ucm.map.OutBinding;



public class OutBindingConverter implements AbstractConverter{
	private OutBinding af;
	// constructors
	public OutBindingConverter(OutBinding af){
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
