package iwToJavaInstantiator;

import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwTimer;

public class TimedSynchronizationNodeInstantiatorStrategy extends WaitingplaceNodeInstantiatorStrategy {

	public TimedSynchronizationNodeInstantiatorStrategy(IwNode node, String workflowNodeType, Boolean isTransient) {
		super(node, workflowNodeType, isTransient);
	}
	
	@Override
	public void jiAppendLinkNodesToNextNodesStatement(WorkflowInstantiator workflowInstantiator) {
		for(IwNodeConnection succ : node.getSuccs()) {
			succ.jiAppendAddNextNodeStatementWithOutPathAndLabel(workflowInstantiator);
		}
	}
}
