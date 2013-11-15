package iwToJavaInstantiator;

import intermediateWorkflow.IwNode;

public class CustomizableNodeInstantiationStrategy extends NodeInstantiationStrategy{

	public CustomizableNodeInstantiationStrategy(IwNode node) {
		super(node);
	}
	
	@Override
	public void jiAppendBuildStatement(WorkflowInstantiator workflowInstantiator) {
		/*String customizableNodeFullyQualifiedName = workflowInstantiator.getCustomizableClassSubPackage() + 
				"." + getNode().getStep().getName() 
				+ "."
				+ getNode().getName();*/
	
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(workflowInstantiator.getCustomizableClassSubPackage());
		strBuff.append(".");
		strBuff.append(getNode().getStep().getName());
		strBuff.append(".");
		strBuff.append(getNode().getName());
		
		String customizableNodeFullyQualifiedName = strBuff.toString();
		
		workflowInstantiator.appendPublicMember(
			"CustomizableNode",
			getNode().jiMemberName(),
			"createCustomizableNode(\""+customizableNodeFullyQualifiedName+"\")"
		);
	}

}
