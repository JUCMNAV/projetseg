package iwToJavaInstantiator;

import intermediateWorkflow.IwNode;

public class WorkflowNodeInstantiationStrategy extends NodeInstantiationStrategy {
	
	private String workflowNodeType;
	
	public String getWorkflowNodeType() {
		return workflowNodeType;
	}

	public void setWorkflowNodeType(String workflowNodeType) {
		this.workflowNodeType = workflowNodeType;
	}

	public WorkflowNodeInstantiationStrategy(IwNode node, String workflowNodeType) {
		super(node);
		this.workflowNodeType = workflowNodeType;
	}	
	
	@Override
	public void jiAppendBuildStatement(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendPublicMemberDefaultConstructor(workflowNodeType, getNode().jiMemberName());
	}
}
