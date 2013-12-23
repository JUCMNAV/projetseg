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
 * A representation of the model object '<em><b>Classifier Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.ClassifierMapping#getOperationMappings <em>Operation Mappings</em>}</li>
 *   <li>{@link ram.ClassifierMapping#getAttributeMappings <em>Attribute Mappings</em>}</li>
 *   <li>{@link ram.ClassifierMapping#getFromElement <em>From Element</em>}</li>
 *   <li>{@link ram.ClassifierMapping#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getClassifierMapping()
 * @model
 * @generated
 */
public interface ClassifierMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Operation Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link ram.OperationMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Mappings</em>' containment reference list.
	 * @see ram.RamPackage#getClassifierMapping_OperationMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationMapping> getOperationMappings();

	/**
	 * Returns the value of the '<em><b>Attribute Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link ram.AttributeMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Mappings</em>' containment reference list.
	 * @see ram.RamPackage#getClassifierMapping_AttributeMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeMapping> getAttributeMappings();

	/**
	 * Returns the value of the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Element</em>' reference.
	 * @see #setFromElement(Classifier)
	 * @see ram.RamPackage#getClassifierMapping_FromElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getFromElement();

	/**
	 * Sets the value of the '{@link ram.ClassifierMapping#getFromElement <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element</em>' reference.
	 * @see #getFromElement()
	 * @generated
	 */
	void setFromElement(Classifier value);

	/**
	 * Returns the value of the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' reference.
	 * @see #setToElement(Classifier)
	 * @see ram.RamPackage#getClassifierMapping_ToElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getToElement();

	/**
	 * Sets the value of the '{@link ram.ClassifierMapping#getToElement <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element</em>' reference.
	 * @see #getToElement()
	 * @generated
	 */
	void setToElement(Classifier value);

} // ClassifierMapping
