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
 *   <li>{@link seg.network.model.network.Link#getSource <em>Source</em>}</li>
 *   <li>{@link seg.network.model.network.Link#getNetwork <em>Network</em>}</li>
 *   <li>{@link seg.network.model.network.Link#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see seg.network.model.network.NetworkPackage#getLink()
 * @model 
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link seg.network.model.network.Node#getDownstreamLinks <em>Downstream Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see seg.network.model.network.NetworkPackage#getLink_Source()
	 * @see seg.network.model.network.Node#getDownstreamLinks
	 * @model opposite="downstreamLinks" required="true"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link seg.network.model.network.Link#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

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
	 * @model opposite="Links" required="true"
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

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link seg.network.model.network.Node#getUpstreamLinks <em>Upstream Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see seg.network.model.network.NetworkPackage#getLink_Target()
	 * @see seg.network.model.network.Node#getUpstreamLinks
	 * @model opposite="upstreamLinks" required="true"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link seg.network.model.network.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

} // Link
