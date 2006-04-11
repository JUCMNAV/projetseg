package one2one;

import java.io.PrintStream;
import ucm.map.Stub;
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
    
    // *** To be implemented ***
    public static void hostDemand(PrintStream ps, PathNode pathnode) {     	
    }
    
    // *** To be implemented ***
    public static void Component(PrintStream ps, PathNode pathnode) {        
    }

    //  *** To be implemented ***    
    public static void tracebilityLink(PrintStream ps, PathNode pathnode) {        
    }
    
    //  prints description attribute
    public static void printDescription(PrintStream ps, PathNode pathnode) {
        if (pathnode.getDescription() != null){
            String description_attribute = " description=\"" + pathnode.getDescription() +"\"";
            ps.print(description_attribute);
        }
    }
}
