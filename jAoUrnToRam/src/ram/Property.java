/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Property#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link ram.Property#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link ram.Property#getReferenceType <em>Reference Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getProperty()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validUpperBound validLowerBound validMultiplicity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validUpperBound='self.upperBound > 0 or self.upperBound = -1' validUpperBound$message='\'The upperbound must be greater than zero or -1 representing *\'' validLowerBound='self.lowerBound >= 0' validLowerBound$message='\'The lowerbound must be greater than or equal to zero\'' validMultiplicity='self.lowerBound <= self.upperBound or self.upperBound = -1' validMultiplicity$message='\'The lowerBound must be less than or equal to the upperBound\''"
 * @generated
 */
public interface Property extends StructuralFeature {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see ram.RamPackage#getProperty_LowerBound()
	 * @model default="0"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link ram.Property#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see ram.RamPackage#getProperty_UpperBound()
	 * @model default="1"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link ram.Property#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
	 * The default value is <code>"Regular"</code>.
	 * The literals are from the enumeration {@link ram.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' attribute.
	 * @see ram.ReferenceType
	 * @see #setReferenceType(ReferenceType)
	 * @see ram.RamPackage#getProperty_ReferenceType()
	 * @model default="Regular"
	 * @generated
	 */
	ReferenceType getReferenceType();

	/**
	 * Sets the value of the '{@link ram.Property#getReferenceType <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' attribute.
	 * @see ram.ReferenceType
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(ReferenceType value);

} // Property
