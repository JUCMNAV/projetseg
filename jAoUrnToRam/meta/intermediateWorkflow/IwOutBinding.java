/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import iwToJavaInstantiator.WorkflowInstantiator;
import iwToStepView.StepView;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Out Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwOutBinding#getStubExit <em>Stub Exit</em>}</li>
 *   <li>{@link intermediateWorkflow.IwOutBinding#getPluginEndPoint <em>Plugin End Point</em>}</li>
 *   <li>{@link intermediateWorkflow.IwOutBinding#getPluginBinding <em>Plugin Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwOutBinding()
 * @model
 * @generated
 */
public interface IwOutBinding extends EObject {
	/*********** Step View Transformation ***********************/
	void appendBinding(StepView stepView);
	void appendBindingToStubsFromOtherConcernsPlaceholder(StepView stepView);
	/*********** java to iw ***********************/
	void jiAppendBindStatement(WorkflowInstantiator workflowInstantiator);
	/********************************************/
	boolean isOutboundByAspectMarkerOrInDifferentConcern();
	IwStub getStub();
	void explore(IwStep currentStep);
	
	/**
	 * Returns the value of the '<em><b>Stub Exit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwNodeConnection#getOutBinding <em>Out Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stub Exit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stub Exit</em>' reference.
	 * @see #setStubExit(IwNodeConnection)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwOutBinding_StubExit()
	 * @see intermediateWorkflow.IwNodeConnection#getOutBinding
	 * @model opposite="outBinding"
	 * @generated
	 */
	IwNodeConnection getStubExit();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwOutBinding#getStubExit <em>Stub Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stub Exit</em>' reference.
	 * @see #getStubExit()
	 * @generated
	 */
	void setStubExit(IwNodeConnection value);

	/**
	 * Returns the value of the '<em><b>Plugin End Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwEndPoint#getOutBindings <em>Out Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin End Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin End Point</em>' reference.
	 * @see #setPluginEndPoint(IwEndPoint)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwOutBinding_PluginEndPoint()
	 * @see intermediateWorkflow.IwEndPoint#getOutBindings
	 * @model opposite="outBindings"
	 * @generated
	 */
	IwEndPoint getPluginEndPoint();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwOutBinding#getPluginEndPoint <em>Plugin End Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin End Point</em>' reference.
	 * @see #getPluginEndPoint()
	 * @generated
	 */
	void setPluginEndPoint(IwEndPoint value);

	/**
	 * Returns the value of the '<em><b>Plugin Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwPluginBinding#getOutBindings <em>Out Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Binding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Binding</em>' container reference.
	 * @see #setPluginBinding(IwPluginBinding)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwOutBinding_PluginBinding()
	 * @see intermediateWorkflow.IwPluginBinding#getOutBindings
	 * @model opposite="outBindings" transient="false"
	 * @generated
	 */
	IwPluginBinding getPluginBinding();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwOutBinding#getPluginBinding <em>Plugin Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Binding</em>' container reference.
	 * @see #getPluginBinding()
	 * @generated
	 */
	void setPluginBinding(IwPluginBinding value);

} // IwOutBinding
