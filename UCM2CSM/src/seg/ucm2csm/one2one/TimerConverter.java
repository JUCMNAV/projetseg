package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.Timer;

/**
 * Creates the CSM representation(Sequence) of the Timer object.
 * 
 * @see seg.ucm2csm.one2one
 */

public class TimerConverter implements AbstractConverter {

    private Timer timerNode;

    private PathConnAttributes pathConnAttribs = new PathConnAttributes();

    // constructors
    public TimerConverter(Timer ep) {
        this.timerNode = ep;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        String Object_attributes;
        String traceabilityLink;
        String closing_attribute;
        // object attributes vary according to the type of Timer
        // needs a Join
        if (source.size() > 1) {
            // no other need
            if (target.size() == 1) {
                // join
                Object_attributes = "<Join id=\"" + "h" + this.timerNode.getId() + "\" ";
                traceabilityLink = "traceabilityLink=\"" + this.timerNode.getId() + "\" ";
                ps.print("            " + Object_attributes + traceabilityLink);
                closing_attribute = "/> <!-- Timer -->";
                this.pathConnAttribs.OptionalAttributes(this.timerNode, ps, source, target);

                // output to file
                ps.println(closing_attribute);
                ps.flush();
                // requires Join; DummyStep; Branch
            } else {
                // join
                Object_attributes = "<Join id=\"" + "h" + this.timerNode.getId() + "\" ";
                traceabilityLink = "traceabilityLink=\"" + this.timerNode.getId() + "\" ";
                ps.print("            " + Object_attributes + traceabilityLink);
                closing_attribute = "/> <!-- Timer 1/3 -->";
                ArrayList tgt = new ArrayList();
                tgt.add("h" + this.timerNode.getId() + "_t");
                this.pathConnAttribs.OptionalAttributes(this.timerNode, ps, source, tgt);

                // output to file
                ps.println(closing_attribute);
                ps.flush();
                // DummyStep
                ArrayList tgt2 = new ArrayList();
                tgt2.add("h" + this.timerNode.getId() + "__t");
                String Object_attributes2 = "<Step id=\"" + "h" + this.timerNode.getId() + "_t\" name=\"Timer\" predecessor=\"" + "h" + this.timerNode.getId() + "\" successor=\""
                        + tgt2.get(0) + "\" ";
                String traceabilityLink2 = "traceabilityLink=\"" + this.timerNode.getId() + "\" ";
                ps.print("            " + Object_attributes2 + traceabilityLink2);
                String closing_attribute2 = "/> <!-- Timer 2/3 -->";

                // output to file
                ps.println(closing_attribute2);
                ps.flush();

                // Branch
                String Object_attributes3 = "<Branch id=\"" + "h" + this.timerNode.getId() + "__t\" ";
                String traceabilityLink3 = "traceabilityLink=\"" + this.timerNode.getId() + "\" ";
                ps.print("            " + Object_attributes3 + traceabilityLink3);
                String closing_attribute3 = "/> <!-- Timer 3/3 -->";
                this.pathConnAttribs.OptionalAttributes(this.timerNode, ps, tgt, target);

                // output to file
                ps.println(closing_attribute3);
                ps.flush();
            }
        } else {
            // replace by a sequence
            if (target.size() == 1) {
                // sequence
                Object_attributes = "<Sequence id=\"" + "h" + this.timerNode.getId() + "\" ";
                traceabilityLink = "traceabilityLink=\"" + this.timerNode.getId() + "\" ";
                ps.print("            " + Object_attributes + traceabilityLink);
                closing_attribute = "/> <!-- Timer -->";
                this.pathConnAttribs.OptionalAttributes(this.timerNode, ps, source, target);

                // output to file
                ps.println(closing_attribute);
                ps.flush();
                // implement as a Branch
            } else {
                // branch
                Object_attributes = "<Branch id=\"" + "h" + this.timerNode.getId() + "\" ";
                traceabilityLink = "traceabilityLink=\"" + this.timerNode.getId() + "\" ";
                ps.print("            " + Object_attributes + traceabilityLink);
                closing_attribute = "/> <!-- Timer -->";
                this.pathConnAttribs.OptionalAttributes(this.timerNode, ps, source, target);

                // output to file
                ps.println(closing_attribute);
                ps.flush();
            }
        }

    }
}
