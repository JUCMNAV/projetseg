package iwToJavaInstantiator;

import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwWaitingPlace;

public class WaitingplaceNodeInstantiatorStrategy extends WorkflowNodeInstantiationStrategy {
	
	private Boolean _isTransient;
	
	public WaitingplaceNodeInstantiatorStrategy(IwNode node, String workflowNodeType, Boolean isTransient) {
		super(node, workflowNodeType);
		_isTransient = isTransient;
	}
	
	private String isTransientToString(){
		return _isTransient.toString();
	}
	
	@Override
	public void jiAppendBuildStatement(WorkflowInstantiator workflowInstantiator) {
		//workflowInstantiator.appendPublicMemberDefaultConstructor(workflowNodeType, getNode().jiMemberName());
		
		workflowInstantiator.appendPublicMember_1Param(workflowNodeType, getNode().jiMemberName(), isTransientToString());
	}
	
	/*@Override
	public void jiAppendLinkNodesToNextNodesStatement(WorkflowInstantiator workflowInstantiator) {
		//node.succs.each{succ|succ.jiAppendAddNextNodeStatements(workflowInstantiator)}
		
		IwWaitingPlace waitingPlace = (IwWaitingPlace)node;
		
		IwNodeConnection waitingSucc = waitingPlace.getWaitingSucc();
		IwNodeConnection triggerSucc = waitingPlace.getTriggerSucc();
		
		waitingSucc.jiAppendAddNextNodeStatement_WaitingPlaceToNode(workflowInstantiator, "waiting");
		
		if(triggerSucc != null)
			triggerSucc.jiAppendAddNextNodeStatement_WaitingPlaceToNode(workflowInstantiator, "trigger");
	}*/
}
