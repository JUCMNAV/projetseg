package iwToJavaInstantiator;

import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;

public abstract class NodeInstantiationStrategy {
	private IwNode node;

	public IwNode getNode() {
		return node;
	}

	public void setNode(IwNode node) {
		this.node = node;
	}
	
	public NodeInstantiationStrategy(IwNode node) {
		this.node = node;
	}
	
	public void jiAppendBuildStatement(WorkflowInstantiator workflowInstantiator) {
		//default: do nothing
	}
	
	public void jiAppendLinkNodesToNextNodesStatement(WorkflowInstantiator workflowInstantiator) {
		//node.succs.each{succ|succ.jiAppendAddNextNodeStatements(workflowInstantiator)}
		for(IwNodeConnection succ : node.getSuccs()) {
			succ.jiAppendAddNextNodeStatements(workflowInstantiator);
		}
	}
	
	public void jiAppendLinkNodesToWorkflowStatement(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_1Param(
			node.getWorkflow().workflowMemberName(),
			"addNode",
			node.jiMemberName()
		);
	}
	
	public void jiAppendLinkStartNodesToWorkflowStatement(WorkflowInstantiator workflowInstantiator) {
		//default: do nothing
	}
}
