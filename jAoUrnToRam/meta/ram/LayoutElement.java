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
 * A representation of the model object '<em><b>Layout Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.LayoutElement#getX <em>X</em>}</li>
 *   <li>{@link ram.LayoutElement#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getLayoutElement()
 * @model
 * @generated
 */
public interface LayoutElement extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see ram.RamPackage#getLayoutElement_X()
	 * @model required="true"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link ram.LayoutElement#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see ram.RamPackage#getLayoutElement_Y()
	 * @model required="true"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link ram.LayoutElement#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

} // LayoutElement
