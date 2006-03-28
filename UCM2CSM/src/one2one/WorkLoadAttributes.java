package one2one;
import java.io.PrintStream;

import ucm.performance.Workload;

/**
 * <!-- begin-user-doc -->
 * Print optional workload attributes to CSM file
 * Component-Ref object
 *  <!-- end-user-doc -->
 * @see one2one
 * @generated
 */

public class WorkLoadAttributes {
    public void workAttributes(Workload work, PrintStream ps){
    	printArrivalPattern(ps, work);
    	printArrivalParam1(ps, work);
    	printArrivalParam2(ps, work);
    	externalDelay(ps, work);
    	value(ps, work);
    	coeffSeq(ps, work);
    	description(ps, work);
    	responseTime(ps, work);
    }
    // workload optional attributes -- to be implemented
    public static void printArrivalPattern(PrintStream ps, Workload work) {
    	 if (work.getArrivalPattern() != null){
    		 String print_aPattren = "arrivalPattern=\"" + work.getArrivalPattern() + "\"" + " " ;
	        ps.print(print_aPattren);
	       }
    }
    public static void printArrivalParam1(PrintStream ps, Workload work) {
    	if (work.getArrivalParam1() != 0.0){
    		String print_aParam1 = "arrivalParam1=\"" + work.getArrivalParam1() + "\"" + " " ;
	        ps.print(print_aParam1);
	       }
    }
    public static void printArrivalParam2(PrintStream ps, Workload work) {
    	if (work.getArrivalParam2() != 0.0){
    		String print_aParam2 = "arrivalParam2=\"" + work.getArrivalParam2() + "\"" + " " ;
	        ps.print(print_aParam2);
	       }
    }
    public static void externalDelay(PrintStream ps, Workload work) { 
    	if (work.getExternalDelay() != 0.0){
    		String print_delay = "externalDelay=\"" + work.getExternalDelay() + "\"" + " " ;
	        ps.print(print_delay);
	       }
    }
    public static void value(PrintStream ps, Workload work) {
    	if (work.getValue() != 0.0){
    		String print_value = "Value=\"" + work.getValue() + "\"" + " " ;
	        ps.print(print_value);
	       }
    	
    }
    public static void coeffSeq(PrintStream ps, Workload work) {
    	if (work.getCoeffVarSeq() != 0.0){
    		String print_coeffVar = "coeffVarSq=\"" + work.getCoeffVarSeq() + "\"" + " " ;
	        ps.print(print_coeffVar);
	       }
    	
    }
    public static void description(PrintStream ps, Workload work) {
    	if (work.getDescription() != null){
    		String print_description = "Description=\"" + work.getDescription() + "\"" + " " ;
	        ps.print(print_description);
	       }
    }
    public static void tracebilityLink(PrintStream ps, Workload work) {
    	if(work.getId() != null){
    		String print_tracebility = "TracebilityLink =\"" + work.getId() + "\"" + " " ;
    		ps.print(print_tracebility);
    	}
    }
    public static void responseTime(PrintStream ps, Workload work) { 
    	if (work.getRespTime() != null){
    		String print_respTime = "ResponesTime=\"" + work.getRespTime() + "\"" + " " ;
	        ps.print(print_respTime);
	       }
    }
}
