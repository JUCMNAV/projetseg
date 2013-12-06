/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.ParameterValue#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getParameterValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validValueType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validValueType='self.parameter.type.oclIsTypeOf(self.ParameterValueMapping.parameter.type.oclType())' validValueType$message='\'Type of value must match the type of the parameter\''"
 * @generated
 */
public interface ParameterValue extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see ram.RamPackage#getParameterValue_Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link ram.ParameterValue#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParameterValue
