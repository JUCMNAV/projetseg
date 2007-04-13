package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.Connect;

public class ConnectConverter implements AbstractConverter {

    /**
     * <!-- begin-user-doc --> Creates the CSM representation(Sequence) of the Connect object <!-- end-user-doc -->
     * 
     * @see one2one
     * @generated
     */

    private Connect ep;

    PathConnAttributes oa = new PathConnAttributes();

    // constructors
    public ConnectConverter(Connect ep) {
	this.ep = ep;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {

        String name = "Connect";
        String successor = (String) target.get(0);
        String predecessor = (String) source.get(0);
        String hostDemand = "hostDemand=\"0\" ";
        // at the moment, jUCMNav does not permit to set the description of a Connect 
        String description = ((ep.getDescription() != null )) ? "description=\"" + ep.getDescription() + "\" " : "";
	
	// object attributes
	String Object_attributes = "<Step id=\"" + "h" + ep.getId() + "\" name=\"" + name + "\" "
        	+ "predecessor=\"" + predecessor + "\" "
        	+ "successor=\"" + successor + "\" " + hostDemand + description;
	String traceabilityLink = "traceabilityLink=\"" + ep.getId() + "\" ";
	ps.print("            " + Object_attributes + traceabilityLink);
	String closing_attribute = "/> <!-- Connect -->";

	// Connect is converted to a Dummy Step so it's no longer considered a connection
//	oa.OptionalAttributes(ep, ps, source, target);

	// output to file
	ps.println(closing_attribute);
	ps.flush();
    }
}
