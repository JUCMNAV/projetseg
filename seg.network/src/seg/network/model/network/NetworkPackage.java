/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package seg.network.model.network;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see seg.network.model.network.NetworkFactory
 * @generated
 */
public interface NetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "network";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.redbooks.ibm.com/sal330r/network";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Network";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkPackage eINSTANCE = seg.network.model.network.impl.NetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link seg.network.model.network.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seg.network.model.network.impl.NodeImpl
	 * @see seg.network.model.network.impl.NetworkPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Upstream Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UPSTREAM_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Downstream Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DOWNSTREAM_LINKS = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__X = 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__Y = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 5;

	/**
	 * The number of structural features of the the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link seg.network.model.network.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seg.network.model.network.impl.NetworkImpl
	 * @see seg.network.model.network.impl.NetworkPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NODES = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LINKS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = 2;

	/**
	 * The number of structural features of the the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link seg.network.model.network.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seg.network.model.network.impl.LinkImpl
	 * @see seg.network.model.network.impl.NetworkPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NETWORK = 0;

	/**
	 * The number of structural features of the the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link seg.network.model.network.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see seg.network.model.network.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the container reference '{@link seg.network.model.network.Node#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see seg.network.model.network.Node#getNetwork()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Network();

	/**
	 * Returns the meta object for the reference list '{@link seg.network.model.network.Node#getUpstreamLinks <em>Upstream Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upstream Links</em>'.
	 * @see seg.network.model.network.Node#getUpstreamLinks()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_UpstreamLinks();

	/**
	 * Returns the meta object for the reference list '{@link seg.network.model.network.Node#getDownstreamLinks <em>Downstream Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Downstream Links</em>'.
	 * @see seg.network.model.network.Node#getDownstreamLinks()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_DownstreamLinks();

	/**
	 * Returns the meta object for the attribute '{@link seg.network.model.network.Node#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see seg.network.model.network.Node#getX()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_X();

	/**
	 * Returns the meta object for the attribute '{@link seg.network.model.network.Node#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see seg.network.model.network.Node#getY()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Y();

	/**
	 * Returns the meta object for the attribute '{@link seg.network.model.network.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see seg.network.model.network.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for class '{@link seg.network.model.network.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see seg.network.model.network.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link seg.network.model.network.Network#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see seg.network.model.network.Network#getNodes()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link seg.network.model.network.Network#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see seg.network.model.network.Network#getLinks()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Links();

	/**
	 * Returns the meta object for the attribute '{@link seg.network.model.network.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see seg.network.model.network.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for class '{@link seg.network.model.network.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see seg.network.model.network.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the container reference '{@link seg.network.model.network.Link#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see seg.network.model.network.Link#getNetwork()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Network();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkFactory getNetworkFactory();

} //NetworkPackage
