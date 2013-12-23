/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwOrFork;
import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.WorkflowNodeInstantiationStrategy;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Or Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IwOrForkImpl extends IwNodeImpl implements IwOrFork {
	/*********** Step View Transformation ***********************/
	@Override
	public String getImageName(){
		return "OrFork16.gif";
	}
	/*********** iw to java ***********************/
	@Override
	public NodeInstantiationStrategy  createStrategy() {
		return new WorkflowNodeInstantiationStrategy(this,"ConditionalExecutionNode");
	}
	/*********************************************/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwOrForkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_OR_FORK;
	}

} //IwOrForkImpl
