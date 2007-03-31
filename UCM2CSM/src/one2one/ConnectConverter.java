package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.Connect;
import ucm.map.PathNode;

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

	// object attributes
	String Object_attributes = "<Connect id=\"" + "h" + ep.getId() + "\"";

	ps.print("			" + Object_attributes);
	String closing_attribute = "/>";

	oa.OptionalAttributes(ep, ps, source, target);

	// output to file
	ps.println(closing_attribute);
	ps.flush();
    }
}
