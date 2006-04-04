package one2one;


import java.io.PrintStream;
import java.util.ArrayList;

import ucm.performance.ProcessingResource;



public class ProcessingResourceConverter implements AbstractConverter{
	private ProcessingResource pr;
	// constructors
    public ProcessingResourceConverter(ProcessingResource pr){
       this.pr = pr;
    }
    //  prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target){
    }

}
