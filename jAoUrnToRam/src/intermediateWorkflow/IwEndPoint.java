/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwEndPoint#getOutBindings <em>Out Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwEndPoint()
 * @model
 * @generated
 */
public interface IwEndPoint extends IwNode {
	void explore(IwStep currentStep);
	
	/**
	 * Returns the value of the '<em><b>Out Bindings</b></em>' reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwOutBinding}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwOutBinding#getPluginEndPoint <em>Plugin End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Bindings</em>' reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwEndPoint_OutBindings()
	 * @see intermediateWorkflow.IwOutBinding#getPluginEndPoint
	 * @model opposite="pluginEndPoint"
	 * @generated
	 */
	EList<IwOutBinding> getOutBindings();

} // IwEndPoint
