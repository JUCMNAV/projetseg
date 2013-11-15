/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Instantiation#getMappings <em>Mappings</em>}</li>
 *   <li>{@link ram.Instantiation#getExternalAspect <em>External Aspect</em>}</li>
 *   <li>{@link ram.Instantiation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getInstantiation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='aspectCannotMapSelf mandatoryAspectParametersMapped'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot aspectCannotMapSelf='not (self.externalAspect = self.Aspect)' aspectCannotMapSelf$message='\'Aspect may not depend on itself\'' mandatoryAspectParametersMapped='if self.type = InstantiationType::Depends then self.externalAspect.mandatoryAspectParameters->forAll(element : MappableElement | self.mappings->exists(fromElement = element)) else true endif' mandatoryAspectParametersMapped$message='\'Partial elements from lower-level aspects have to be mapped\''"
 * @generated
 */
public interface Instantiation extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link ram.Mapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see ram.RamPackage#getInstantiation_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>External Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Aspect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Aspect</em>' reference.
	 * @see #setExternalAspect(Aspect)
	 * @see ram.RamPackage#getInstantiation_ExternalAspect()
	 * @model required="true"
	 * @generated
	 */
	Aspect getExternalAspect();

	/**
	 * Sets the value of the '{@link ram.Instantiation#getExternalAspect <em>External Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Aspect</em>' reference.
	 * @see #getExternalAspect()
	 * @generated
	 */
	void setExternalAspect(Aspect value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link ram.InstantiationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ram.InstantiationType
	 * @see #setType(InstantiationType)
	 * @see ram.RamPackage#getInstantiation_Type()
	 * @model default="" required="true"
	 * @generated
	 */
	InstantiationType getType();

	/**
	 * Sets the value of the '{@link ram.Instantiation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ram.InstantiationType
	 * @see #getType()
	 * @generated
	 */
	void setType(InstantiationType value);

} // Instantiation
