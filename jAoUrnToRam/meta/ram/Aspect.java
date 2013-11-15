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
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Aspect#getStructuralView <em>Structural View</em>}</li>
 *   <li>{@link ram.Aspect#getMandatoryAspectParameters <em>Mandatory Aspect Parameters</em>}</li>
 *   <li>{@link ram.Aspect#getMessageViews <em>Message Views</em>}</li>
 *   <li>{@link ram.Aspect#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link ram.Aspect#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Structural View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural View</em>' containment reference.
	 * @see #setStructuralView(StructuralView)
	 * @see ram.RamPackage#getAspect_StructuralView()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StructuralView getStructuralView();

	/**
	 * Sets the value of the '{@link ram.Aspect#getStructuralView <em>Structural View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural View</em>' containment reference.
	 * @see #getStructuralView()
	 * @generated
	 */
	void setStructuralView(StructuralView value);

	/**
	 * Returns the value of the '<em><b>Mandatory Aspect Parameters</b></em>' reference list.
	 * The list contents are of type {@link ram.MappableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory Aspect Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Aspect Parameters</em>' reference list.
	 * @see ram.RamPackage#getAspect_MandatoryAspectParameters()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='let mappableElements : Set(MappableElement) = Set{} in mappableElements->union(Class.allInstances()->select(partial = true))->union(Operation.allInstances()->select(partial = true))'"
	 * @generated
	 */
	EList<MappableElement> getMandatoryAspectParameters();

	/**
	 * Returns the value of the '<em><b>Message Views</b></em>' containment reference list.
	 * The list contents are of type {@link ram.AbstractMessageView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Views</em>' containment reference list.
	 * @see ram.RamPackage#getAspect_MessageViews()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractMessageView> getMessageViews();

	/**
	 * Returns the value of the '<em><b>Instantiations</b></em>' containment reference list.
	 * The list contents are of type {@link ram.Instantiation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiations</em>' containment reference list.
	 * @see ram.RamPackage#getAspect_Instantiations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instantiation> getInstantiations();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(Layout)
	 * @see ram.RamPackage#getAspect_Layout()
	 * @model containment="true"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link ram.Aspect#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // Aspect
