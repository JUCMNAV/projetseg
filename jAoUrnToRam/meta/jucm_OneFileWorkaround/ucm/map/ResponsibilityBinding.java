/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.map;

import jucm_OneFileWorkaround.urncore.Responsibility;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsibility Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding#getBinding <em>Binding</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding#getPluginResp <em>Plugin Resp</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding#getParentResp <em>Parent Resp</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getResponsibilityBinding()
 * @model
 * @generated
 */
public interface ResponsibilityBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.map.PluginBinding#getResponsibilities <em>Responsibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' container reference.
	 * @see #setBinding(PluginBinding)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getResponsibilityBinding_Binding()
	 * @see jucm_OneFileWorkaround.ucm.map.PluginBinding#getResponsibilities
	 * @model opposite="responsibilities" required="true"
	 * @generated
	 */
	PluginBinding getBinding();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding#getBinding <em>Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' container reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(PluginBinding value);

	/**
	 * Returns the value of the '<em><b>Plugin Resp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.map.RespRef#getPluginBindings <em>Plugin Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Resp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Resp</em>' reference.
	 * @see #setPluginResp(RespRef)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getResponsibilityBinding_PluginResp()
	 * @see jucm_OneFileWorkaround.ucm.map.RespRef#getPluginBindings
	 * @model opposite="pluginBindings" required="true"
	 * @generated
	 */
	RespRef getPluginResp();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding#getPluginResp <em>Plugin Resp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Resp</em>' reference.
	 * @see #getPluginResp()
	 * @generated
	 */
	void setPluginResp(RespRef value);

	/**
	 * Returns the value of the '<em><b>Parent Resp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Responsibility#getParentBindings <em>Parent Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Resp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Resp</em>' reference.
	 * @see #setParentResp(Responsibility)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getResponsibilityBinding_ParentResp()
	 * @see jucm_OneFileWorkaround.urncore.Responsibility#getParentBindings
	 * @model opposite="parentBindings" required="true"
	 * @generated
	 */
	Responsibility getParentResp();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding#getParentResp <em>Parent Resp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resp</em>' reference.
	 * @see #getParentResp()
	 * @generated
	 */
	void setParentResp(Responsibility value);

} // ResponsibilityBinding
