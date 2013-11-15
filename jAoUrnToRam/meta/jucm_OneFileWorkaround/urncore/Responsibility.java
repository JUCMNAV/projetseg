/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.urncore;

import jucm_OneFileWorkaround.ucm.map.RespRef;
import jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding;

import jucm_OneFileWorkaround.ucm.performance.Demand;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Responsibility#isEmpty <em>Empty</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Responsibility#getExpression <em>Expression</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Responsibility#isContext <em>Context</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Responsibility#getUrndefinition <em>Urndefinition</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Responsibility#getDemands <em>Demands</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Responsibility#getRespRefs <em>Resp Refs</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Responsibility#getParentBindings <em>Parent Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getResponsibility()
 * @model
 * @generated
 */
public interface Responsibility extends UCMmodelElement {
	/**
	 * Returns the value of the '<em><b>Empty</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty</em>' attribute.
	 * @see #setEmpty(boolean)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getResponsibility_Empty()
	 * @model default="false"
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Responsibility#isEmpty <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty</em>' attribute.
	 * @see #isEmpty()
	 * @generated
	 */
	void setEmpty(boolean value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getResponsibility_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Responsibility#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(boolean)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getResponsibility_Context()
	 * @model default="false"
	 * @generated
	 */
	boolean isContext();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Responsibility#isContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #isContext()
	 * @generated
	 */
	void setContext(boolean value);

	/**
	 * Returns the value of the '<em><b>Urndefinition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.URNdefinition#getResponsibilities <em>Responsibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urndefinition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urndefinition</em>' container reference.
	 * @see #setUrndefinition(URNdefinition)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getResponsibility_Urndefinition()
	 * @see jucm_OneFileWorkaround.urncore.URNdefinition#getResponsibilities
	 * @model opposite="responsibilities" required="true"
	 * @generated
	 */
	URNdefinition getUrndefinition();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Responsibility#getUrndefinition <em>Urndefinition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urndefinition</em>' container reference.
	 * @see #getUrndefinition()
	 * @generated
	 */
	void setUrndefinition(URNdefinition value);

	/**
	 * Returns the value of the '<em><b>Demands</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.performance.Demand}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.performance.Demand#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demands</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getResponsibility_Demands()
	 * @see jucm_OneFileWorkaround.ucm.performance.Demand#getResponsibility
	 * @model opposite="responsibility" containment="true"
	 * @generated
	 */
	EList<Demand> getDemands();

	/**
	 * Returns the value of the '<em><b>Resp Refs</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.map.RespRef}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.map.RespRef#getRespDef <em>Resp Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resp Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resp Refs</em>' reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getResponsibility_RespRefs()
	 * @see jucm_OneFileWorkaround.ucm.map.RespRef#getRespDef
	 * @model opposite="respDef" required="true"
	 * @generated
	 */
	EList<RespRef> getRespRefs();

	/**
	 * Returns the value of the '<em><b>Parent Bindings</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding#getParentResp <em>Parent Resp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Bindings</em>' reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getResponsibility_ParentBindings()
	 * @see jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding#getParentResp
	 * @model opposite="parentResp"
	 * @generated
	 */
	EList<ResponsibilityBinding> getParentBindings();

} // Responsibility
