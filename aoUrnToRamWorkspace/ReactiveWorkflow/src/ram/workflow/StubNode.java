package ram.workflow;

public class StubNode extends WorkflowNode {
	public void addBinding(Binding b){}
	public void addInBinding(Binding b, String inPathname, WorkflowNode w){}
	public void addOutBinding(Binding b, EndNode e, String outPathname){}

}
