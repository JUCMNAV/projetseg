/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package seg.network.model.network;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seg.network.model.network.Node#getUpstreamLinks <em>Upstream Links</em>}</li>
 *   <li>{@link seg.network.model.network.Node#getDownstreamLinks <em>Downstream Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see seg.network.model.network.NetworkPackage#getNode()
 * @model 
 * @generated
 */
public interface Node extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Upstream Links</b></em>' reference list.
	 * The list contents are of type {@link seg.network.model.network.Link}.
	 * It is bidirectional and its opposite is '{@link seg.network.model.network.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upstream Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream Links</em>' reference list.
	 * @see seg.network.model.network.NetworkPackage#getNode_UpstreamLinks()
	 * @see seg.network.model.network.Link#getTarget
	 * @model type="seg.network.model.network.Link" opposite="target"
	 * @generated
	 */
	EList getUpstreamLinks();

	/**
	 * Returns the value of the '<em><b>Downstream Links</b></em>' reference list.
	 * The list contents are of type {@link seg.network.model.network.Link}.
	 * It is bidirectional and its opposite is '{@link seg.network.model.network.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Downstream Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream Links</em>' reference list.
	 * @see seg.network.model.network.NetworkPackage#getNode_DownstreamLinks()
	 * @see seg.network.model.network.Link#getSource
	 * @model type="seg.network.model.network.Link" opposite="source"
	 * @generated
	 */
	EList getDownstreamLinks();

} // Node
