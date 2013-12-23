/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.ParameterValueMapping#getParameter <em>Parameter</em>}</li>
 *   <li>{@link ram.ParameterValueMapping#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getParameterValueMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validParameterValue'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validParameterValue='if self.value.oclIsTypeOf(StructuralFeatureValue) then let value : StructuralFeatureValue = self.value.oclAsType(StructuralFeatureValue).value in if not value.oclIsUndefined() then let type : Type = if value.oclIsTypeOf(Attribute) then value.oclAsType(Attribute).type else if value.oclIsTypeOf(Reference) then value.oclAsType(Reference).type else value.oclAsType(AssociationEnd).getType() endif endif in type.oclIsTypeOf(self.parameter.type.oclType()) else true endif else if self.value.oclIsKindOf(LiteralSpecification) then false else true endif endif' validParameterValue$message='\'Type of value must match the type of the parameter\''"
 * @generated
 */
public interface ParameterValueMapping extends EObject {
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
	 * @see ram.RamPackage#getParameterValueMapping_Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link ram.ParameterValueMapping#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueSpecification)
	 * @see ram.RamPackage#getParameterValueMapping_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link ram.ParameterValueMapping#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

} // ParameterValueMapping
