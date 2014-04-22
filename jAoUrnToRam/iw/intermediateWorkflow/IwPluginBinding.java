/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import iwToJavaInstantiator.WorkflowInstantiator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Plugin Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwPluginBinding#getInBindings <em>In Bindings</em>}</li>
 *   <li>{@link intermediateWorkflow.IwPluginBinding#getOutBindings <em>Out Bindings</em>}</li>
 *   <li>{@link intermediateWorkflow.IwPluginBinding#getStub <em>Stub</em>}</li>
 *   <li>{@link intermediateWorkflow.IwPluginBinding#getConditionLabel <em>Condition Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwPluginBinding()
 * @model
 * @generated
 */
public interface IwPluginBinding extends EObject {
	IwWorkflow getPlugin(); 
	
	void jiAppendBindStatement(WorkflowInstantiator workflowInstantiator);
	String jiLocalVarName();
	
	/**
	 * Returns the value of the '<em><b>In Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwInBinding}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwInBinding#getPluginBinding <em>Plugin Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Bindings</em>' containment reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwPluginBinding_InBindings()
	 * @see intermediateWorkflow.IwInBinding#getPluginBinding
	 * @model opposite="pluginBinding" containment="true"
	 * @generated
	 */
	EList<IwInBinding> getInBindings();

	/**
	 * Returns the value of the '<em><b>Out Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwOutBinding}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwOutBinding#getPluginBinding <em>Plugin Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Bindings</em>' containment reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwPluginBinding_OutBindings()
	 * @see intermediateWorkflow.IwOutBinding#getPluginBinding
	 * @model opposite="pluginBinding" containment="true"
	 * @generated
	 */
	EList<IwOutBinding> getOutBindings();

	/**
	 * Returns the value of the '<em><b>Stub</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwStub#getPluginBindings <em>Plugin Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stub</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stub</em>' container reference.
	 * @see #setStub(IwStub)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwPluginBinding_Stub()
	 * @see intermediateWorkflow.IwStub#getPluginBindings
	 * @model opposite="pluginBindings" transient="false"
	 * @generated
	 */
	IwStub getStub();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwPluginBinding#getStub <em>Stub</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stub</em>' container reference.
	 * @see #getStub()
	 * @generated
	 */
	void setStub(IwStub value);

	/**
	 * Returns the value of the '<em><b>Condition Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Label</em>' attribute.
	 * @see #setConditionLabel(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwPluginBinding_ConditionLabel()
	 * @model dataType="intermediateWorkflow.String"
	 * @generated
	 */
	String getConditionLabel();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwPluginBinding#getConditionLabel <em>Condition Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Label</em>' attribute.
	 * @see #getConditionLabel()
	 * @generated
	 */
	void setConditionLabel(String value);

	String jiLocalVarName(String entryIndex);

	

} // IwPluginBinding
