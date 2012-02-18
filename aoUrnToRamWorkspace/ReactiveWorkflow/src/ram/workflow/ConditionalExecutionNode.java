package ram.workflow;

public class ConditionalExecutionNode extends WorkflowNode {
	public void addNextNode(String outPathname, WorkflowNode n, Condition c){}
	public void addNextNode(String outPathname, WorkflowNode n, String inPathName, Condition c){}
}
