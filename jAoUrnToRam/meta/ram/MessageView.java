/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.MessageView#getSpecifies <em>Specifies</em>}</li>
 *   <li>{@link ram.MessageView#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getMessageView()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='specifiesIsFirstMessage specificationDefined isAffectedBy'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot specifiesIsFirstMessage='if not self.specification.oclIsUndefined() and self.specification.messages->size() > 0 then self.specifies = self.specification.messages->select(message : Message | not message.sendEvent.oclIsTypeOf(MessageOccurrenceSpecification))->asOrderedSet()->at(1).signature else true endif' specifiesIsFirstMessage$message='\'The first message in the MessageView must match specifies of the MessageView\'' specificationDefined='if not self.specifies.oclIsUndefined() then if not self.specifies.partial then not self.specification.oclIsUndefined() else true endif else true endif' specificationDefined$message='\'A MessageView for a non-partial operation must have a specification\'' isAffectedBy='if self.specification.oclIsUndefined() and self.specifies.partial then self.affectedBy->notEmpty() else true endif' isAffectedBy$message='\'An empty MessageView must have at least one affectedBy\''"
 * @generated
 */
public interface MessageView extends AbstractMessageView {
	/**
	 * Returns the value of the '<em><b>Specifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifies</em>' reference.
	 * @see #setSpecifies(Operation)
	 * @see ram.RamPackage#getMessageView_Specifies()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getSpecifies();

	/**
	 * Sets the value of the '{@link ram.MessageView#getSpecifies <em>Specifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifies</em>' reference.
	 * @see #getSpecifies()
	 * @generated
	 */
	void setSpecifies(Operation value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(Interaction)
	 * @see ram.RamPackage#getMessageView_Specification()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Interaction getSpecification();

	/**
	 * Sets the value of the '{@link ram.MessageView#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Interaction value);

} // MessageView
