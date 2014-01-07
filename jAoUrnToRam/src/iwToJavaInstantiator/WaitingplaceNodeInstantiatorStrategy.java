package iwToJavaInstantiator;

import intermediateWorkflow.IwNode;

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
}
