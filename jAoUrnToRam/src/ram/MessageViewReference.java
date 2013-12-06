/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message View Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.MessageViewReference#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getMessageViewReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isAffectedBy'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isAffectedBy='self.affectedBy->size() > 0' isAffectedBy$message='\'The MessageViewReference must have at least one affectedBy\''"
 * @generated
 */
public interface MessageViewReference extends AbstractMessageView {
	/**
	 * Returns the value of the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference.
	 * @see #setReferences(MessageView)
	 * @see ram.RamPackage#getMessageViewReference_References()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageView getReferences();

	/**
	 * Sets the value of the '{@link ram.MessageViewReference#getReferences <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(MessageView value);

} // MessageViewReference
