/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package seg.network.model.network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seg.network.model.network.Link#getNetwork <em>Network</em>}</li>
 * </ul>
 * </p>
 *
 * @see seg.network.model.network.NetworkPackage#getLink()
 * @model 
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link seg.network.model.network.Network#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(Network)
	 * @see seg.network.model.network.NetworkPackage#getLink_Network()
	 * @see seg.network.model.network.Network#getLinks
	 * @model opposite="links" required="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link seg.network.model.network.Link#getNetwork <em>Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' container reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

} // Link
