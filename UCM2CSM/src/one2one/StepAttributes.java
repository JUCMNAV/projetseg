package one2one;

import java.io.PrintStream;

import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * Prints Step optional attributes to CSM file 
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */
public class StepAttributes {
    public void OptionalAttributes(PathNode af,
                                   PrintStream ps){                                   
                printDescription(ps, af);
    }
    // step optional attributes -- to be implemented
    public static void hostDemand(PrintStream ps) {        
    }
    public static void probability(PrintStream ps) {        
    }
    public static void repCount(PrintStream ps) {        
    }
    public static void externalDelay(PrintStream ps) {        
    }
    public static void Component(PrintStream ps) {        
    }
    public static void perfMeasureTrigger(PrintStream ps) {        
    }
    public static void perfMeasureEnd(PrintStream ps) {        
    }
    public static void externalDemand(PrintStream ps) {        
    }
    public static void tracebilityLink(PrintStream ps) {        
    }
    //  prints description attribute
    public static void printDescription(PrintStream ps, PathNode pathnode) {
        if (pathnode.getDescription() != null){
            String description_attribute = " description=\"" + pathnode.getDescription() +"\"";
            ps.print(description_attribute);
        }
    }
}
