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
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link ram.CombinedFragment#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getCombinedFragment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validOperands'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validOperands='if self.interactionOperator = InteractionOperatorKind::opt or self.interactionOperator = InteractionOperatorKind::loop or self.interactionOperator = InteractionOperatorKind::critical then self.operands->size() = 1 else true endif' validOperands$message='\'opt and loop fragments may only have one operand\''"
 * @generated
 */
public interface CombinedFragment extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ram.InteractionOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Operator</em>' attribute.
	 * @see ram.InteractionOperatorKind
	 * @see #setInteractionOperator(InteractionOperatorKind)
	 * @see ram.RamPackage#getCombinedFragment_InteractionOperator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InteractionOperatorKind getInteractionOperator();

	/**
	 * Sets the value of the '{@link ram.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Operator</em>' attribute.
	 * @see ram.InteractionOperatorKind
	 * @see #getInteractionOperator()
	 * @generated
	 */
	void setInteractionOperator(InteractionOperatorKind value);

	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link ram.InteractionOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see ram.RamPackage#getCombinedFragment_Operands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InteractionOperand> getOperands();

} // CombinedFragment
