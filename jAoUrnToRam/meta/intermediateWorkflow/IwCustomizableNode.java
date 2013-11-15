/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Customizable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwCustomizableNode#getCustomizableNodeRefId <em>Customizable Node Ref Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwCustomizableNode()
 * @model
 * @generated
 */
public interface IwCustomizableNode extends IwNode {
	
	/**************** iw to ram **************************************/
	void build();
	void link();
	/****************************************************************/
	
	/************* Step View Transformation ***********************/
	boolean getIsCustomizable();
	/**************************************************************/
	
	
	boolean isShared();
	/**
	 * Returns the value of the '<em><b>Customizable Node Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customizable Node Ref Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customizable Node Ref Id</em>' attribute.
	 * @see #setCustomizableNodeRefId(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwCustomizableNode_CustomizableNodeRefId()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getCustomizableNodeRefId();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwCustomizableNode#getCustomizableNodeRefId <em>Customizable Node Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customizable Node Ref Id</em>' attribute.
	 * @see #getCustomizableNodeRefId()
	 * @generated
	 */
	void setCustomizableNodeRefId(String value);
	
	
	

} // IwCustomizableNode
