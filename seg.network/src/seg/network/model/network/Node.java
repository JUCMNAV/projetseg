/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package seg.network.model.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seg.network.model.network.Node#getNetwork <em>Network</em>}</li>
 *   <li>{@link seg.network.model.network.Node#getUpstreamLinks <em>Upstream Links</em>}</li>
 *   <li>{@link seg.network.model.network.Node#getDownstreamLinks <em>Downstream Links</em>}</li>
 *   <li>{@link seg.network.model.network.Node#getX <em>X</em>}</li>
 *   <li>{@link seg.network.model.network.Node#getY <em>Y</em>}</li>
 *   <li>{@link seg.network.model.network.Node#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see seg.network.model.network.NetworkPackage#getNode()
 * @model 
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link seg.network.model.network.Network#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(Network)
	 * @see seg.network.model.network.NetworkPackage#getNode_Network()
	 * @see seg.network.model.network.Network#getNodes
	 * @model opposite="nodes" required="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link seg.network.model.network.Node#getNetwork <em>Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' container reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Upstream Links</b></em>' reference list.
	 * The list contents are of type {@link seg.network.model.network.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upstream Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream Links</em>' reference list.
	 * @see seg.network.model.network.NetworkPackage#getNode_UpstreamLinks()
	 * @model type="seg.network.model.network.Link"
	 * @generated
	 */
	EList getUpstreamLinks();

	/**
	 * Returns the value of the '<em><b>Downstream Links</b></em>' reference list.
	 * The list contents are of type {@link seg.network.model.network.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Downstream Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream Links</em>' reference list.
	 * @see seg.network.model.network.NetworkPackage#getNode_DownstreamLinks()
	 * @model type="seg.network.model.network.Link"
	 * @generated
	 */
	EList getDownstreamLinks();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see seg.network.model.network.NetworkPackage#getNode_X()
	 * @model 
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link seg.network.model.network.Node#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see seg.network.model.network.NetworkPackage#getNode_Y()
	 * @model 
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link seg.network.model.network.Node#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see seg.network.model.network.NetworkPackage#getNode_Id()
	 * @model 
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link seg.network.model.network.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Node
