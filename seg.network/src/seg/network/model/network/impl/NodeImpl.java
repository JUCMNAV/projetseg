/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package seg.network.model.network.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import seg.network.model.network.Link;
import seg.network.model.network.Network;
import seg.network.model.network.NetworkPackage;
import seg.network.model.network.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seg.network.model.network.impl.NodeImpl#getUpstreamLinks <em>Upstream Links</em>}</li>
 *   <li>{@link seg.network.model.network.impl.NodeImpl#getDownstreamLinks <em>Downstream Links</em>}</li>
 *   <li>{@link seg.network.model.network.impl.NodeImpl#getX <em>X</em>}</li>
 *   <li>{@link seg.network.model.network.impl.NodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link seg.network.model.network.impl.NodeImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link seg.network.model.network.impl.NodeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The cached value of the '{@link #getUpstreamLinks() <em>Upstream Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamLinks()
	 * @generated
	 * @ordered
	 */
	protected EList upstreamLinks = null;

	/**
	 * The cached value of the '{@link #getDownstreamLinks() <em>Downstream Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamLinks()
	 * @generated
	 * @ordered
	 */
	protected EList downstreamLinks = null;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NetworkPackage.eINSTANCE.getNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUpstreamLinks() {
		if (upstreamLinks == null) {
			upstreamLinks = new EObjectWithInverseResolvingEList(Link.class, this, NetworkPackage.NODE__UPSTREAM_LINKS, NetworkPackage.LINK__TARGET);
		}
		return upstreamLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDownstreamLinks() {
		if (downstreamLinks == null) {
			downstreamLinks = new EObjectWithInverseResolvingEList(Link.class, this, NetworkPackage.NODE__DOWNSTREAM_LINKS, NetworkPackage.LINK__SOURCE);
		}
		return downstreamLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.NODE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.NODE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getNetwork() {
		if (eContainerFeatureID != NetworkPackage.NODE__NETWORK) return null;
		return (Network)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Network newNetwork) {
		if (newNetwork != eContainer || (eContainerFeatureID != NetworkPackage.NODE__NETWORK && newNetwork != null)) {
			if (EcoreUtil.isAncestor(this, newNetwork))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, NetworkPackage.NETWORK__NODES, Network.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newNetwork, NetworkPackage.NODE__NETWORK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.NODE__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NetworkPackage.NODE__UPSTREAM_LINKS:
					return ((InternalEList)getUpstreamLinks()).basicAdd(otherEnd, msgs);
				case NetworkPackage.NODE__DOWNSTREAM_LINKS:
					return ((InternalEList)getDownstreamLinks()).basicAdd(otherEnd, msgs);
				case NetworkPackage.NODE__NETWORK:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, NetworkPackage.NODE__NETWORK, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NetworkPackage.NODE__UPSTREAM_LINKS:
					return ((InternalEList)getUpstreamLinks()).basicRemove(otherEnd, msgs);
				case NetworkPackage.NODE__DOWNSTREAM_LINKS:
					return ((InternalEList)getDownstreamLinks()).basicRemove(otherEnd, msgs);
				case NetworkPackage.NODE__NETWORK:
					return eBasicSetContainer(null, NetworkPackage.NODE__NETWORK, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case NetworkPackage.NODE__NETWORK:
					return ((InternalEObject)eContainer).eInverseRemove(this, NetworkPackage.NETWORK__NODES, Network.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return ((InternalEObject)eContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NetworkPackage.NODE__UPSTREAM_LINKS:
				return getUpstreamLinks();
			case NetworkPackage.NODE__DOWNSTREAM_LINKS:
				return getDownstreamLinks();
			case NetworkPackage.NODE__X:
				return new Integer(getX());
			case NetworkPackage.NODE__Y:
				return new Integer(getY());
			case NetworkPackage.NODE__NETWORK:
				return getNetwork();
			case NetworkPackage.NODE__ID:
				return getId();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NetworkPackage.NODE__UPSTREAM_LINKS:
				getUpstreamLinks().clear();
				getUpstreamLinks().addAll((Collection)newValue);
				return;
			case NetworkPackage.NODE__DOWNSTREAM_LINKS:
				getDownstreamLinks().clear();
				getDownstreamLinks().addAll((Collection)newValue);
				return;
			case NetworkPackage.NODE__X:
				setX(((Integer)newValue).intValue());
				return;
			case NetworkPackage.NODE__Y:
				setY(((Integer)newValue).intValue());
				return;
			case NetworkPackage.NODE__NETWORK:
				setNetwork((Network)newValue);
				return;
			case NetworkPackage.NODE__ID:
				setId((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NetworkPackage.NODE__UPSTREAM_LINKS:
				getUpstreamLinks().clear();
				return;
			case NetworkPackage.NODE__DOWNSTREAM_LINKS:
				getDownstreamLinks().clear();
				return;
			case NetworkPackage.NODE__X:
				setX(X_EDEFAULT);
				return;
			case NetworkPackage.NODE__Y:
				setY(Y_EDEFAULT);
				return;
			case NetworkPackage.NODE__NETWORK:
				setNetwork((Network)null);
				return;
			case NetworkPackage.NODE__ID:
				setId(ID_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NetworkPackage.NODE__UPSTREAM_LINKS:
				return upstreamLinks != null && !upstreamLinks.isEmpty();
			case NetworkPackage.NODE__DOWNSTREAM_LINKS:
				return downstreamLinks != null && !downstreamLinks.isEmpty();
			case NetworkPackage.NODE__X:
				return x != X_EDEFAULT;
			case NetworkPackage.NODE__Y:
				return y != Y_EDEFAULT;
			case NetworkPackage.NODE__NETWORK:
				return getNetwork() != null;
			case NetworkPackage.NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
