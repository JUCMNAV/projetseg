/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RCollection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.RCollection#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getRCollection()
 * @model abstract="true"
 * @generated
 */
public interface RCollection extends Type, ImplementationClass {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ObjectType)
	 * @see ram.RamPackage#getRCollection_Type()
	 * @model required="true"
	 * @generated
	 */
	ObjectType getType();

	/**
	 * Sets the value of the '{@link ram.RCollection#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ObjectType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let partial : String = if type.oclIsTypeOf(Class) and type.oclAsType(Class).partial or type.oclIsTypeOf(Operation) and type.oclAsType(Operation).partial then \'|\' else \'\' endif in let typeName : String = self.oclType().toString() in let name : String = typeName.substring(typeName.lastIndexOf(\':\') + 1, typeName.size()) in if type.name.oclIsUndefined() then name else name + \'<\' + partial + type.name + \'>\' endif'"
	 * @generated
	 */
	String getName();

} // RCollection
