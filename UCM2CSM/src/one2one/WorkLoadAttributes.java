package one2one;

import java.io.PrintStream;

import ucm.performance.Workload;

/**
 * <!-- begin-user-doc --> Print optional workload attributes to CSM file Component-Ref object <!-- end-user-doc -->
 * 
 * @see one2one
 * @generated
 */

public class WorkLoadAttributes {
    public void workAttributes(Workload work, PrintStream ps) {
        printArrivalPattern(ps, work);
        printArrivalParam1(ps, work);
        printArrivalParam2(ps, work);
        externalDelay(ps, work);
        value(ps, work);
        coeffSeq(ps, work);
        description(ps, work);
        tracebilityLink(ps, work);
    }

    // *** To be implemented ***
    public static void printArrivalPattern(PrintStream ps, Workload work) {
        if (work.getArrivalPattern() != null) {
        	String arrivalPatternType = work.getArrivalPattern().toString();
        	// Fix the mapping between what the URN spec says and what CSM expects. 1st letter is lowercase
        	arrivalPatternType = arrivalPatternType.substring(0, 1).toLowerCase() + arrivalPatternType.substring(1);
        	if (arrivalPatternType.equals("phaseType"))
        		arrivalPatternType = "phase_Type";
            String print_aPattern = "arrivalPattern=\"" + arrivalPatternType + "\" ";
            ps.print(print_aPattern);
        }
    }

    public static void printArrivalParam1(PrintStream ps, Workload work) {
        if (work.getArrivalParam1() != null) {
            String print_aParam1 = "arrivalParam1=\"" + work.getArrivalParam1() + "\" ";
            ps.print(print_aParam1);
        }
    }

    public static void printArrivalParam2(PrintStream ps, Workload work) {
        if (work.getArrivalParam2() != null) {
            String print_aParam2 = "arrivalParam2=\"" + work.getArrivalParam2() + "\" ";
            ps.print(print_aParam2);
        }
    }

    public static void externalDelay(PrintStream ps, Workload work) {
        if (work.getExternalDelay() != null) {
            String print_delay = "externalDelay=\"" + work.getExternalDelay() + "\" ";
            ps.print(print_delay);
        }
    }

    public static void value(PrintStream ps, Workload work) {
        if (work.getValue() != null) {
            String print_value = "value=\"" + work.getValue() + "\" ";
            ps.print(print_value);
        }

    }

    public static void coeffSeq(PrintStream ps, Workload work) {
        if (work.getCoeffVarSeq() != null) {
            String print_coeffVar = "coeffVarSq=\"" + work.getCoeffVarSeq() + "\" ";
            ps.print(print_coeffVar);
        }

    }

    public static void description(PrintStream ps, Workload work) {
        if (work.getDescription() != null) {
            String print_description = "description=\"" + work.getDescription() + "\" ";
            ps.print(print_description);
        }
    }

    public static void tracebilityLink(PrintStream ps, Workload work) {
        if (work.getId() != null) {
            String print_tracebility = "traceabilityLink =\"" + work.getId() + "\" ";
            ps.print(print_tracebility);
        }
    }
}
