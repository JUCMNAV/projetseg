/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.map;

import intermediateWorkflow.IwAndJoin;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.AndJoin#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getAndJoin()
 * @model
 * @generated
 */
public interface AndJoin extends PathNode {
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
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getAndJoin_Orientation()
	 * @model
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.AndJoin#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(String value);

	//IwAndJoin getIwAndJoin();

} // AndJoin
