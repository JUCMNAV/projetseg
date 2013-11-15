package iwToJavaInstantiator;

public class WorkflowInstantiator extends JavaView {

	public WorkflowInstantiator(String workspacePath) {
		super(workspacePath);
	}
	
	public WorkflowInstantiator(String workspacePath, String customizableClassSubPackage) {
		super(workspacePath);
		this.customizableClassSubPackage = customizableClassSubPackage;
	}
	
	private String customizableClassSubPackage;

	public String getCustomizableClassSubPackage() {
		return customizableClassSubPackage;
	}

	public void setCustomizableClassSubPackage(String customizableClassSubPackage) {
		this.customizableClassSubPackage = customizableClassSubPackage;
	}
}
