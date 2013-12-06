/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import iwToJavaInstantiator.WorkflowInstantiator;
import iwToStepView.StepView;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw In Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwInBinding#getDisjunctiveStubEntries <em>Disjunctive Stub Entries</em>}</li>
 *   <li>{@link intermediateWorkflow.IwInBinding#getPluginStartPoint <em>Plugin Start Point</em>}</li>
 *   <li>{@link intermediateWorkflow.IwInBinding#getPluginBinding <em>Plugin Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwInBinding()
 * @model
 * @generated
 */
public interface IwInBinding extends EObject {
	/*********** Step View Transformation ***********************/
	void appendBinding(StepView stepView);
	void appendBindingToStubsFromOtherConcernsPlaceholder(StepView stepView);
	String getPluginStartPointTargetPortDotEscaped(StepView stepView);
	/*********** Step View Transformation ***********************/
	boolean isInboundByAspectMarkerOrInDifferentConcern();
	IwStub getStub();
	int getStubEntryIndex();
	IwNodeConnection getAnyOfTheDisjunctiveStubEntries();
	
	/**
	 * Returns the value of the '<em><b>Disjunctive Stub Entries</b></em>' reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwNodeConnection}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwNodeConnection#getInBinding <em>In Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjunctive Stub Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjunctive Stub Entries</em>' reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwInBinding_DisjunctiveStubEntries()
	 * @see intermediateWorkflow.IwNodeConnection#getInBinding
	 * @model opposite="inBinding" required="true"
	 * @generated
	 */
	EList<IwNodeConnection> getDisjunctiveStubEntries();

	/**
	 * Returns the value of the '<em><b>Plugin Start Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwStartPoint#getInBindings <em>In Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Start Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Start Point</em>' reference.
	 * @see #setPluginStartPoint(IwStartPoint)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwInBinding_PluginStartPoint()
	 * @see intermediateWorkflow.IwStartPoint#getInBindings
	 * @model opposite="inBindings"
	 * @generated
	 */
	IwStartPoint getPluginStartPoint();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwInBinding#getPluginStartPoint <em>Plugin Start Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Start Point</em>' reference.
	 * @see #getPluginStartPoint()
	 * @generated
	 */
	void setPluginStartPoint(IwStartPoint value);

	/**
	 * Returns the value of the '<em><b>Plugin Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwPluginBinding#getInBindings <em>In Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Binding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Binding</em>' container reference.
	 * @see #setPluginBinding(IwPluginBinding)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwInBinding_PluginBinding()
	 * @see intermediateWorkflow.IwPluginBinding#getInBindings
	 * @model opposite="inBindings" transient="false"
	 * @generated
	 */
	IwPluginBinding getPluginBinding();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwInBinding#getPluginBinding <em>Plugin Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Binding</em>' container reference.
	 * @see #getPluginBinding()
	 * @generated
	 */
	void setPluginBinding(IwPluginBinding value);
	void jiAppendBindStatement(WorkflowInstantiator workflowInstantiator);

} // IwInBinding
