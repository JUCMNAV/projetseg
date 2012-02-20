package ram.reactiveworkflow;

import ram.workflow.Condition;

public abstract class WorkflowInstantiator{
	protected CustomizableNode createCustomizableNode(String fullyQualifiedClassName){
		return new CustomizableNode();//Fake
	}	
	
	protected Condition createCondition(String fullyQualifiedClassName){
		return new Condition();//Fake
	}
	
	public abstract void link();

}
