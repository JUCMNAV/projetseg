/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Message View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.AspectMessageView#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link ram.AspectMessageView#getAdvice <em>Advice</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getAspectMessageView()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='notAffectedBySelf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot notAffectedBySelf='not self.affectedBy->includes(self)' notAffectedBySelf$message='\'Message View may not be affected by itself\''"
 * @generated
 */
public interface AspectMessageView extends AbstractMessageView, NamedElement {
	/**
	 * Returns the value of the '<em><b>Pointcut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointcut</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcut</em>' reference.
	 * @see #setPointcut(Operation)
	 * @see ram.RamPackage#getAspectMessageView_Pointcut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getPointcut();

	/**
	 * Sets the value of the '{@link ram.AspectMessageView#getPointcut <em>Pointcut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointcut</em>' reference.
	 * @see #getPointcut()
	 * @generated
	 */
	void setPointcut(Operation value);

	/**
	 * Returns the value of the '<em><b>Advice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice</em>' containment reference.
	 * @see #setAdvice(Interaction)
	 * @see ram.RamPackage#getAspectMessageView_Advice()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Interaction getAdvice();

	/**
	 * Sets the value of the '{@link ram.AspectMessageView#getAdvice <em>Advice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice</em>' containment reference.
	 * @see #getAdvice()
	 * @generated
	 */
	void setAdvice(Interaction value);

} // AspectMessageView
