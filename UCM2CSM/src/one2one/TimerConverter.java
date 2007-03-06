package one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.PathNode;
import ucm.map.Timer;

public class TimerConverter implements AbstractConverter {

    /**
     * <!-- begin-user-doc --> Creates the CSM representation(Sequence) of the Timer object <!-- end-user-doc -->
     * 
     * @see one2one
     * @generated
     */

    private Timer ep;

    PathConnAttributes oa = new PathConnAttributes();

    // constructors
    public TimerConverter(Timer ep) {
	this.ep = ep;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target) {

	// object attributes
//	String Object_attributes = "<Sequence id=\"" + "h" + ep.getId() + "\"";
	String Object_attributes = "<Branch id=\"" + "h" + ep.getId() + "\"";

	ps.print("			" + Object_attributes);
	String closing_attribute = "/>";

	oa.OptionalAttributes((PathNode) ep, ps, source, target);

	// output to file
	ps.println(closing_attribute);
	ps.flush();
    }
}
