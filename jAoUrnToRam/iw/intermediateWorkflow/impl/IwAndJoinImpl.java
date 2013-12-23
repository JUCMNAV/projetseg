/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwAndJoin;
import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.WorkflowNodeInstantiationStrategy;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw And Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IwAndJoinImpl extends IwNodeImpl implements IwAndJoin {
	/*********** Step View Transformation ***********************/
	@Override
	public String getImageName(){
		return "AndJoin16.gif";
	}
	/*********** iw to java ***********************/
	
	@Override
	public NodeInstantiationStrategy createStrategy() {
		return new WorkflowNodeInstantiationStrategy(this,"SynchronizationNode");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwAndJoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_AND_JOIN;
	}

} //IwAndJoinImpl
