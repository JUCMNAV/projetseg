/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Operation#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ram.Operation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ram.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ram.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ram.Operation#isStatic <em>Static</em>}</li>
 *   <li>{@link ram.Operation#isPartial <em>Partial</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='messageViewDefined'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot messageViewDefined='if visibility = Visibility::public and self.Classifier.oclIsTypeOf(Class) then self.Classifier.StructuralView.Aspect.messageViews->select(messageView : AbstractMessageView | messageView.oclIsTypeOf(MessageView))->one(messageView : AbstractMessageView | messageView.oclAsType(MessageView).specifies = self) else true endif' messageViewDefined$message='\'MessageView missing for public operation\''"
 * @generated
 */
public interface Operation extends NamedElement, MappableElement {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see ram.RamPackage#getOperation_Abstract()
	 * @model default="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link ram.Operation#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link ram.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see ram.Visibility
	 * @see #setVisibility(Visibility)
	 * @see ram.RamPackage#getOperation_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link ram.Operation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see ram.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see ram.RamPackage#getOperation_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link ram.Operation#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ram.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ram.RamPackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see ram.RamPackage#getOperation_Static()
	 * @model default="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link ram.Operation#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Partial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial</em>' attribute.
	 * @see #setPartial(boolean)
	 * @see ram.RamPackage#getOperation_Partial()
	 * @model default="false"
	 * @generated
	 */
	boolean isPartial();

	/**
	 * Sets the value of the '{@link ram.Operation#isPartial <em>Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial</em>' attribute.
	 * @see #isPartial()
	 * @generated
	 */
	void setPartial(boolean value);

} // Operation
