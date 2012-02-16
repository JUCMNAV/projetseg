package ram.reactiveworkflow;

import ram.workflow.Condition;

public abstract class WorkflowInstantiator{
	protected CustomizableNode createCustomizableNode(String fullyQualifiedClassName){return null;}	
	protected Condition createCondition(String fullyQualifiedClassName){return null;}
	
	public abstract void link();

}
