/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwCustomizableNode;
import intermediateWorkflow.IwInput;
import intermediateWorkflow.IwStep;
import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.WorkflowNodeInstantiationStrategy;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IwInputImpl extends IwNodeImpl implements IwInput {
	/*********** iw to ram ***********************/
	private ram.Class ramInputData;
	
	@Override
	public ram.Class getRamInputData() {
		return ramInputData;
	}
	@Override
	public void setRamInputData(ram.Class ramInputData) {
		this.ramInputData = ramInputData;
	}
	
	@Override
	public void build() {
		//ramInputData:=createRamClass(name+INPUT_DATA_SUFFIX)
		/*operation createRamClass(name:String):Class is do
			result:=Class.new
			result.name:=name
		end*/
		
		super.build(); //init ramFactory
		ramInputData = ramFactory.createRamClass(getName() + INPUT_DATA_SUFFIX());
	}
	
	@Override
	public void link() {
		//step.linkInputData(ramInputData)
		getStep().linkInputData(ramInputData);
	}
	
	/*********** Step View Transformation ***********************/
	@Override
	public String getImageName(){
		return "Input16.gif";
	}
	/*********** iw to java ***********************/
	@Override
	public NodeInstantiationStrategy  createStrategy() {
		return new WorkflowNodeInstantiationStrategy(this,"InputNode");
	}
	
	/*********************************************/
	@Override
	public void insertInputProcessingNode() {
		getSuccs().get(0).insertInputProcessingNode(this);
		//colExtSingle(succs).insertInputProcessingNode(this);
	}
	
	public void explore(IwStep currentStep){
		IwStep newStep = createStep(false);
		
		if(currentStep.isEmptyStartupStep()) {
			currentStep.merge(newStep);
		}
		else {
			currentStep = newStep;
		}
		super.explore(currentStep);
	}
	
	private IwCustomizableNode iwInputProcessingNode;
	
	public void setIwInputProcessingNode(IwCustomizableNode iwInputProcessingNode) {
		this.iwInputProcessingNode = iwInputProcessingNode;
	}

	@Override
	public IwCustomizableNode getIwInputProcessingNode() {
		return iwInputProcessingNode;
	}
	

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_INPUT;
	}

	
} //IwInputImpl
