package iwToRam;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import ram.Classifier;
import ram.Operation;
import ram.Aspect;

public class RamWorkspace {
	private Hashtable<String, Aspect>  aspectPerWorkspacePath;
	private Aspect workflow;
	private ram.Class customizableNode;
	private Operation executeOperation;
	private ram.Class customizableInputData;
	private ram.Class customizableOutputData;
	private Aspect inputAspect;
	private Aspect outputAspect;
	
	public Hashtable<String, Aspect> getAspectPerWorkspacePath() {
		return aspectPerWorkspacePath;
	}
	public void setAspectPerWorkspacePath(Hashtable<String, Aspect> aspectPerWorkspacePath) {
		this.aspectPerWorkspacePath = aspectPerWorkspacePath;
	}
	
	public Aspect getWorkflow() {
		return workflow;
	}
	public void setWorkflow(Aspect workflow) {
		this.workflow = workflow;
	}
	
	public Operation getExecuteOperation() {
		return executeOperation;
	}
	public void setExecuteOperation(Operation executeOperation) {
		this.executeOperation = executeOperation;
	}
	
	public ram.Class getCustomizableNode() {
		return customizableNode;
	}
	public void setCustomizableNode(ram.Class customizableNode) {
		this.customizableNode = customizableNode;
	}
	
	public ram.Class getCustomizableInputData() {
		return customizableInputData;
	}
	public void setCustomizableInputData(ram.Class customizableInputData) {
		this.customizableInputData = customizableInputData;
	}
	
	public ram.Class getCustomizableOutputData() {
		return customizableOutputData;
	}
	public void setCustomizableOutputData(ram.Class customizableOutputData) {
		this.customizableOutputData = customizableOutputData;
	}
	
	public Aspect getInputAspect() {
		return inputAspect;
	}
	public void setInputAspect(Aspect inputAspect) {
		this.inputAspect = inputAspect;
	}
	
	public Aspect getOutputAspect() {
		return outputAspect;
	}
	public void setOutputAspect(Aspect outputAspect) {
		this.outputAspect = outputAspect;
	}

	public RamWorkspace (Aspect workflow, Aspect inputAspect, Aspect outputAspect) {
			/*aspectPerWorkspacePath:=Hashtable<String,Aspect>.new
			self.workflow:=workflow
			self.customizableNode:=findClass(workflow,"CustomizableNode")
			self.executeOperation:=colExtSingle(customizableNode.operations)
			self.inputAspect:=inputAspect
			self.outputAspect:=outputAspect
			self.customizableInputData:=findClass(inputAspect,"CustomizableInputData")
			self.customizableOutputData:=findClass(outputAspect,"CustomizableOutputData")
			result:=self*/
		aspectPerWorkspacePath = new Hashtable<String, Aspect>();
		this.workflow = workflow;
		this.customizableNode = findClass(workflow,"CustomizableNode");
		this.executeOperation = customizableNode.getOperations().get(0);
		this.inputAspect = inputAspect;
		this.outputAspect = outputAspect;
		this.customizableInputData = findClass(inputAspect,"CustomizableInputData");
		this.customizableOutputData = findClass(outputAspect,"CustomizableOutputData");
	}
	
	public ram.Class findClass(Aspect theAspect, String className) {
		/*result:=theAspect.structuralView.classes.select{theClass|
			theClass.name==className
		}.one.asType(Class)*/
		
		List<Classifier> classifiers = new ArrayList<Classifier>();
		for(Classifier classifier : theAspect.getStructuralView().getClasses()){
			if(classifier.getName().equals(className)){
				classifiers.add(classifier);
			}
		}
		ram.Class aClass = (ram.Class)classifiers.get(0);
		return aClass;
	}
}
