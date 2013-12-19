package jAoUrnToRam.test;

public class AoUrnToRamTestCases {
	private static final String ASSIGN_VEHICLE_BASIC = "testcases\\in\\AssignVehicleBasic.jucm";  
	private static final String BELLAIRS = "testcases\\in\\Bellairs.jucm"; 
	private static final String DEMO2_SP4_WITH_AUT_ASPECT = "testcases\\in\\Demo2_Sp4_WithAutAspect.jucm";
	private static final String DEMO_SP5_WITH_AUT_DIFFERENT_CONCERN = "testcases\\in\\DemoSp5_WithAutDifferentConcern.jucm"; 
	private static final String DEMO_SP5_WITH_AUT_SAME_CONCERN = "testcases\\in\\DemoSp5_WithAutSameConcern.jucm";
	private static final String OR_JOIN = "testcases\\in\\OrJoin.jucm"; 
	private static final String SIMPLE  = "testcases\\in\\Simple.jucm";
	private static final String START_UP_NODE_AND_SHARED_RESP = "testcases\\in\\StartupNodeAndSharedResp.jucm";  
	private static final String WAITINGPLACE_SIMPLE = "testcases\\in\\waiting place simple.jucm"; 
	
	public static String[] getTestCases(){
		return new String[] {
				ASSIGN_VEHICLE_BASIC,
				BELLAIRS,
				DEMO2_SP4_WITH_AUT_ASPECT,
				DEMO_SP5_WITH_AUT_DIFFERENT_CONCERN,
				DEMO_SP5_WITH_AUT_SAME_CONCERN,
				OR_JOIN,
				SIMPLE,
				START_UP_NODE_AND_SHARED_RESP,
				WAITINGPLACE_SIMPLE
		};
	}

	//static String IN_URI_STR = "platform:/plugin/jAoUrnToRam/testcases/in/DemoSp5_WithAutSameConcern.jucm"	
	//static String aoUrnToRamPlateformUrl = "platform:/resource/jAoUrnToRam";
	
	/*private static final String ASSIGN_VEHICLE_BASIC = "testcases\\in\\AssignVehicleBasic.jucm";  
	private static final String BELLAIRS = "testcases\\in\\Bellairs.jucm"; 
	private static final String DEMO2_SP4_WITH_AUT_ASPECT = "testcases\\in\\Demo2_Sp4_WithAutAspect.jucm";
	private static final String DEMO_SP5_WITH_AUT_DIFFERENT_CONCERN = "testcases\\in\\DemoSp5_WithAutDifferentConcern.jucm"; 
	private static final String DEMO_SP5_WITH_AUT_SAME_CONCERN = "testcases\\in\\DemoSp5_WithAutSameConcern.jucm";
	private static final String OR_JOIN = "testcases\\in\\OrJoin.jucm"; 
	private static final String SIMPLE  = "testcases\\in\\Simple.jucm";
	private static final String START_UP_NODE_AND_SHARED_RESP = "testcases\\in\\StartupNodeAndSharedResp.jucm";*/
}
