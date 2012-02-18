package ram.workflow;

public class WorkflowNode {
	public void addNextNode(WorkflowNode nextNode){}
	public void addNextNode(String outPathname, WorkflowNode n){}
	public void addNextNode(WorkflowNode n, String inPathName){}
	public void addNextNode(String outPathname, WorkflowNode n, String inPathName){}
}
