package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.ArrayList;

import ucm.map.EndPoint;
import ucm.map.PathNode;
import ucm.map.StartPoint;

/**
 * Prints PathConnection optional attributes to CSM file.
 * 
 * @see one2one
 */

public class PathConnAttributes {

    public void OptionalAttributes(PathNode af, PrintStream ps, ArrayList source, ArrayList target) {
        printDescription(ps, af);
        printSource(ps, af, source);
        printTarget(ps, af, target);
    }

    // prints the source attribute
    public static void printSource(PrintStream ps, PathNode pathnode, ArrayList source) {
        if (source != null) {
            String str_source = source.toString().substring(1, (source.toString().length() - 1));
            String refined_source = str_source.replaceAll(",", "");
            String source_attribute = "source=\"" + refined_source + "\" ";
            ps.print(source_attribute);
        }
    }

    // prints the target attribute
    public static void printTarget(PrintStream ps, PathNode pathnode, ArrayList target) {
        if (target != null) {
            // special case for StartPoint
            if (pathnode instanceof StartPoint) {
                String str_target = target.toString().substring(1, (target.toString().length() - 1));
                String refined_target = str_target.replaceAll(",", ""); // can a StartPoint have multiple targets?
                String target_attribute = "target=\"" + refined_target + "\" " + ">";
                ps.println(" " + target_attribute);
            } else {
                String str_target = target.toString().substring(1, (target.toString().length() - 1));
                String refined_target = str_target.replaceAll(",", "");
                String target_attribute = "target=\"" + refined_target + "\" ";
                ps.print(target_attribute);
            }
        }
    }

    // prints description attribute
    public static void printDescription(PrintStream ps, PathNode pathnode) {
        if (pathnode.getDescription() != null) {
            String description_attribute = "description=\"" + pathnode.getDescription() + "\" ";
            ps.print(description_attribute);
        }
    }

    // prints inbinding attribute
    public void inbinding(PrintStream ps, StartPoint sp) {
        if (!sp.getInBindings().isEmpty()) {
            String inbind = "";
            for (int i = 0; i < sp.getInBindings().size(); i++) {
                String in_bind_str = sp.getInBindings().get(i).toString();
                String in_bind_id = in_bind_str.substring(28, (in_bind_str.length() - 1));
                inbind += in_bind_id;
            }
            String source_attribute = "Inbinding=\"" + inbind + "\" ";
            ps.print(source_attribute);
        }
    }

    // prints outbinding attribute
    public void outbinding(PrintStream ps, EndPoint ep) {
        if (!ep.getOutBindings().isEmpty()) {
            String outbind = "";
            for (int i = 0; i < ep.getOutBindings().size(); i++) {
                String out_bind_str = ep.getOutBindings().get(i).toString();
                String out_bind_id = out_bind_str.substring(28, (out_bind_str.length() - 1));
                outbind += out_bind_id;
            }
            String source_attribute = "Outbinding=\"" + outbind + "\" ";
            ps.print(source_attribute);
        }
    }
}
