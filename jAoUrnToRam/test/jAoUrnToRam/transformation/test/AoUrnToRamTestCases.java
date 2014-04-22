package jAoUrnToRam.transformation.test;

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
	private static final String WAITINGPLACE_WITH_TRIGGER = "testcases\\in\\waiting place with trigger.jucm"; 
	private static final String WAITINGPLACE_WITH_TRIGGER_AT_ENDPOINT = "testcases\\in\\waiting place with trigger at end point.jucm"; 
	private static final String TIMER_SIMPLE = "testcases\\in\\timer simple.jucm";
	private static final String TIMER_WITH_TRIGGER = "testcases\\in\\timer with trigger.jucm";
	private static final String TIMER_WITH_TRIGGER_AT_ENDPOINT = "testcases\\in\\timer with trigger at endpoint.jucm";
	private static final String TIMER_TIMEOUTPATH = "testcases\\in\\timer with timeoutpath.jucm";
	private static final String TIMER_WITH_TRIGGER_AND_TIMEOUTPATH = "testcases\\in\\TimerWithAsyncTriggerAndTimeout.jucm";
	private static final String TIMER_WITH_TRIGGER_AT_ENDPOINT_AND_TIMEOUTPATH = "testcases\\in\\timer with trigger at endpoint and timeoutpath.jucm";
	private static final String AND_JOIN = "testcases\\in\\andjoin.jucm";
	private static final String SYNC_STUB = "testcases\\in\\syncStub.jucm";
	private static final String SYNC_STUB0 = "testcases\\in\\syncStub0.jucm";
	private static final String BLCK_STUB = "testcases\\in\\blockingStub.jucm";
	private static final String DYN_STUB = "testcases\\in\\DynStub.jucm";
	
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
				WAITINGPLACE_SIMPLE,
				WAITINGPLACE_WITH_TRIGGER,
				WAITINGPLACE_WITH_TRIGGER_AT_ENDPOINT,
				TIMER_SIMPLE,
				TIMER_WITH_TRIGGER,
				TIMER_WITH_TRIGGER_AT_ENDPOINT,
				TIMER_TIMEOUTPATH,
				TIMER_WITH_TRIGGER_AT_ENDPOINT_AND_TIMEOUTPATH,
				TIMER_WITH_TRIGGER_AND_TIMEOUTPATH,
				AND_JOIN,
				SYNC_STUB,
				BLCK_STUB,
				DYN_STUB
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
