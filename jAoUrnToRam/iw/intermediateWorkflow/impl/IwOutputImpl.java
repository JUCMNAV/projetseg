/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwOutput;
import iwToJavaInstantiator.CustomizableNodeInstantiationStrategy;
import iwToJavaInstantiator.NodeInstantiationStrategy;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IwOutputImpl extends IwNodeImpl implements IwOutput {
	@Override
	public String getInputProcessingNodeAction() {
		return "stop";
	}
	
	/*********** iw to ram ***********************/
	
	private ram.Class ramOutput;
	
	@Override
	public ram.Class getRamOutput() {
		return ramOutput;
	}
	@Override
	public void setRamOutput(ram.Class ramOutput) {
		this.ramOutput = ramOutput;
	}

	private ram.Class ramOutputData;
	
	@Override
	public ram.Class getRamOutputData() {
		return ramOutputData;
	}
	@Override
	public void setRamOutputData(ram.Class ramOutputData) {
		this.ramOutputData = ramOutputData;
	}
	
	@Override
	public void build() {
		super.build(); //init ramfactory
		ramOutput = ramFactory.createRamCustomizableNodeClass(getName());
		ramOutputData = ramFactory.createRamClass(getName() + OUTPUT_DATA_SUFFIX());
	}
	
	@Override
	public void link() {
		step.linkCustomizableNode(ramOutput);
		step.linkOutputData(ramOutputData);
	}
	
	/*********** Step View Transformation ***********************/
	@Override
	public String getImageName(){
		return "Output16.gif";
	}
	
	@Override
	public boolean getIsCustomizable() {
		return true;
	}
	/*********** iw to java ***********************/
	@Override
	public NodeInstantiationStrategy createStrategy() {
		return new CustomizableNodeInstantiationStrategy(this);
	}
	/***********************************************/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_OUTPUT;
	}

	

} //IwOutputImpl
