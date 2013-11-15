/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwAndFork;
import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.WorkflowNodeInstantiationStrategy;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw And Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IwAndForkImpl extends IwNodeImpl implements IwAndFork {
	/*********** Step View Transformation ***********************/
	@Override
	public String getImageName(){
		return "AndFork16.gif";
	}
	/*********** iw to java ***********************/
	
	@Override
	public NodeInstantiationStrategy createStrategy() {
		return new WorkflowNodeInstantiationStrategy(this,"ParallelExecutionNode");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwAndForkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_AND_FORK;
	}

} //IwAndForkImpl
