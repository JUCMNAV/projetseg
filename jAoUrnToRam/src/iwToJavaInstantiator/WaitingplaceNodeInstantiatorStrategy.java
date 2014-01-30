package iwToJavaInstantiator;

import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwWaitingPlace;

public class WaitingplaceNodeInstantiatorStrategy extends WorkflowNodeInstantiationStrategy {
	
	protected Boolean _isTransient;
	
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
	
	@Override
	public void jiAppendLinkNodesToNextNodesStatement(WorkflowInstantiator workflowInstantiator) {
		IwNodeConnection succ = node.getSucc(0); //waitingplace has only one succ
		
		succ.jiAppendAddNextNodeStatementWithoutCondition(workflowInstantiator);
		
		/*if(succ.hasLabel()) {
			succ.jiAppendAddNextNodeStatementWithLabel(workflowInstantiator);
		}
		else {
			
		}*/
		
		/*for(IwNodeConnection succ : node.getSuccs()) {
			succ.jiAppendAddNextNodeStatements(workflowInstantiator);
		}*/
	}
}
