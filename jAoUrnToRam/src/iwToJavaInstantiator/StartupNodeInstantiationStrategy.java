package iwToJavaInstantiator;

import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwStartPoint;

public class StartupNodeInstantiationStrategy extends WorkflowNodeInstantiationStrategy {

	public StartupNodeInstantiationStrategy(IwNode node) {
		super(node, "StartupNode");
	}
	
	@Override
	public void jiAppendLinkStartNodesToWorkflowStatement(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_2Params(
			getNode().getWorkflow().workflowMemberName(),
			"addStartupNode",
			getNode().jiMemberName(),
			String.valueOf(((IwStartPoint)getNode()).isLocal())	//node.asType(IwStartPoint).isLocal.toString	
		);
	}
}
