package iwToJavaInstantiator;

import intermediateWorkflow.IwNode;

public class SkipNodeInstantiationStrategy extends NodeInstantiationStrategy {
	//only to respect pattern: all strategies must be initialized
	public SkipNodeInstantiationStrategy(IwNode node) {
		super(node);
	}

	@Override
	public void jiAppendBuildStatement(WorkflowInstantiator workflowInstantiator) {
		//do nothing
	}
	
	@Override
	public void jiAppendLinkNodesToNextNodesStatement(WorkflowInstantiator workflowInstantiator) {
		//do nothing
	}
	
	@Override
	public void jiAppendLinkNodesToWorkflowStatement(WorkflowInstantiator workflowInstantiator) {
		//do nothing
	}
	
	@Override
	public void jiAppendLinkStartNodesToWorkflowStatement(WorkflowInstantiator workflowInstantiator) {
		//do nothing
	}
	
}
