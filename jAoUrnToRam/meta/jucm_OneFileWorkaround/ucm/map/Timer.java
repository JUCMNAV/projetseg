/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.map;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.Timer#getTimeoutPath <em>Timeout Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getTimer()
 * @model
 * @generated
 */
public interface Timer extends WaitingPlace {
	/**
	 * Returns the value of the '<em><b>Timeout Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Path</em>' reference.
	 * @see #setTimeoutPath(NodeConnection)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getTimer_TimeoutPath()
	 * @model
	 * @generated
	 */
	NodeConnection getTimeoutPath();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.Timer#getTimeoutPath <em>Timeout Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Path</em>' reference.
	 * @see #getTimeoutPath()
	 * @generated
	 */
	void setTimeoutPath(NodeConnection value);

} // Timer
