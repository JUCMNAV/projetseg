package one2one;

import java.io.PrintStream;

import ucm.map.ComponentRef;
import ucm.map.PathNode;
import ucm.performance.ProcessingResource;
import urncore.Component;

/**
 * <!-- begin-user-doc --> Prints Step optional attributes to CSM file <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */
public class StepAttributes {
    public void OptionalAttributes(PathNode af, PrintStream ps) {
        printDescription(ps, af);
        Component(ps, af);
        hostDemand(ps, af);
        // tracebilityLink(ps, af);
    }

    public static ProcessingResource pr;

    // print hostDemand
    public static void hostDemand(PrintStream ps, PathNode pathnode) {
        String host_attribute = " hostDemand = \"" + "1" + "\"";
        ps.print(host_attribute);
    }

    // print component id
    public static void Component(PrintStream ps, PathNode pathnode) {
        if ((ComponentRef) pathnode.getContRef() != null && ((ComponentRef) pathnode.getContRef()).getId() != null) {
            String comp_id = ((Component)(((ComponentRef) pathnode.getContRef()).getContDef())) .getId();
            String comp_attribute = " component=\"" + "c" + comp_id + "\"";
            ps.print(comp_attribute);
        }
    }

    // prints description attribute
    public static void printDescription(PrintStream ps, PathNode pathnode) {
        if (pathnode.getDescription() != null) {
            String description_attribute = " description=\"" + pathnode.getDescription() + "\"";
            ps.print(description_attribute);
        }
    }
}
