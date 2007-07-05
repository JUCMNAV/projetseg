package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.Connect;

/**
 * Creates the CSM representation(Sequence) of the Connect object.
 * 
 * @see seg.ucm2csm.one2one
 */

public class ConnectConverter implements AbstractConverter {

    private Connect connectNode;

    // constructors
    public ConnectConverter(Connect ep) {
        this.connectNode = ep;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        String name = "Connect";
        String successor = (String) target.get(0);
        String predecessor = (String) source.get(0);
        String hostDemand = "hostDemand=\"0\" ";
        // at the moment, jUCMNav does not permit to set the description of a
        // Connect
        String description = ((this.connectNode.getDescription() != null)) ? "description=\"" + this.connectNode.getDescription() + "\" " : "";

        // object attributes
        String Object_attributes = "<Step id=\"" + "h" + this.connectNode.getId() + "\" name=\"" + name + "\" " + "predecessor=\"" + predecessor + "\" " + "successor=\""
                + successor + "\" " + hostDemand + description;
        String traceabilityLink = "traceabilityLink=\"" + this.connectNode.getId() + "\" ";
        ps.print("            " + Object_attributes + traceabilityLink);
        String closing_attribute = "/> <!-- Connect -->";

        // Connect is converted to a Dummy Step pathConnAttribs it's no longer considered a
        // connection
        // patthConnAttribs.OptionalAttributes(connectNode, ps, source, target);

        // output to file
        ps.println(closing_attribute);
        ps.flush();
    }
}
