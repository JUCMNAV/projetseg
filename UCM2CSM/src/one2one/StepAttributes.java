package one2one;

import java.io.PrintStream;

import ucm.map.ComponentRef;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.map.Stub;
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
        printRepCount(ps, af);
        // tracebilityLink(ps, af);
    }

    public static ProcessingResource pr;

    // print hostDemand
    public static void hostDemand(PrintStream ps, PathNode pathnode) {
	String hostDemand;
	String hostDemand_attribute = " hostDemand = \"" + "1" + "\"";
	if (pathnode instanceof RespRef) {
	    hostDemand = ((RespRef) pathnode).getHostDemand();
	    if ((hostDemand != null) && (hostDemand != "1")) {
		hostDemand_attribute = " hostDemand=\"" + hostDemand + "\"";
	    }
	}
	ps.print(hostDemand_attribute);
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
    
    // prints repitition count (repCount)
    public static void printRepCount(PrintStream ps, PathNode pathnode) {
	String repCount;
	String repCount_attribute = " repCount=\"" + "1" + "\"";
	if (pathnode instanceof RespRef) {
	    repCount = ((RespRef) pathnode).getRepetitionCount();
	    if ((repCount != null) && (repCount != "1")) {
		repCount_attribute = " repCount=\"" + repCount + "\"";
	    }
	}
	if (pathnode instanceof Stub) {
	    repCount = ((Stub) pathnode).getRepetitionCount();
	    if ((repCount != null) && (repCount != "1")) {
		repCount_attribute = " repCount=\"" + repCount + "\"";
	    }
	}
	ps.print(repCount_attribute);
    }
}
