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
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seg.network.model.network.Network#getNodes <em>Nodes</em>}</li>
 *   <li>{@link seg.network.model.network.Network#getLinks <em>Links</em>}</li>
 *   <li>{@link seg.network.model.network.Network#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see seg.network.model.network.NetworkPackage#getNetwork()
 * @model 
 * @generated
 */
public interface Network extends EObject{
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link seg.network.model.network.Node}.
	 * It is bidirectional and its opposite is '{@link seg.network.model.network.Node#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see seg.network.model.network.NetworkPackage#getNetwork_Nodes()
	 * @see seg.network.model.network.Node#getNetwork
	 * @model type="seg.network.model.network.Node" opposite="Network" containment="true"
	 * @generated
	 */
	EList getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link seg.network.model.network.Link}.
	 * It is bidirectional and its opposite is '{@link seg.network.model.network.Link#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see seg.network.model.network.NetworkPackage#getNetwork_Links()
	 * @see seg.network.model.network.Link#getNetwork
	 * @model type="seg.network.model.network.Link" opposite="Network" containment="true"
	 * @generated
	 */
	EList getLinks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(EObject)
	 * @see seg.network.model.network.NetworkPackage#getNetwork_Name()
	 * @model required="true"
	 * @generated
	 */
	EObject getName();

	/**
	 * Sets the value of the '{@link seg.network.model.network.Network#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(EObject value);

} // Network
