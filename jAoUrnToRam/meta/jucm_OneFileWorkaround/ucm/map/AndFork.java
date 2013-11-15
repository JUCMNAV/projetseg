/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.map;

import intermediateWorkflow.IwAndFork;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.AndFork#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getAndFork()
 * @model
 * @generated
 */
public interface AndFork extends PathNode {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(String)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getAndFork_Orientation()
	 * @model
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.AndFork#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(String value);

	//IwAndFork getIwAndFork();

} // AndFork
