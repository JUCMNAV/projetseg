/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package seg.network.model.network.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import seg.network.model.network.Network;
import seg.network.model.network.NetworkPackage;
import seg.network.model.network.Responsibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResponsibilityImpl extends NodeImpl implements Responsibility {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NetworkPackage.eINSTANCE.getResponsibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NetworkPackage.RESPONSIBILITY__UPSTREAM_LINKS:
					return ((InternalEList)getUpstreamLinks()).basicAdd(otherEnd, msgs);
				case NetworkPackage.RESPONSIBILITY__DOWNSTREAM_LINKS:
					return ((InternalEList)getDownstreamLinks()).basicAdd(otherEnd, msgs);
				case NetworkPackage.RESPONSIBILITY__NETWORK:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, NetworkPackage.RESPONSIBILITY__NETWORK, msgs);
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
				case NetworkPackage.RESPONSIBILITY__UPSTREAM_LINKS:
					return ((InternalEList)getUpstreamLinks()).basicRemove(otherEnd, msgs);
				case NetworkPackage.RESPONSIBILITY__DOWNSTREAM_LINKS:
					return ((InternalEList)getDownstreamLinks()).basicRemove(otherEnd, msgs);
				case NetworkPackage.RESPONSIBILITY__NETWORK:
					return eBasicSetContainer(null, NetworkPackage.RESPONSIBILITY__NETWORK, msgs);
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
				case NetworkPackage.RESPONSIBILITY__NETWORK:
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
			case NetworkPackage.RESPONSIBILITY__UPSTREAM_LINKS:
				return getUpstreamLinks();
			case NetworkPackage.RESPONSIBILITY__DOWNSTREAM_LINKS:
				return getDownstreamLinks();
			case NetworkPackage.RESPONSIBILITY__X:
				return new Integer(getX());
			case NetworkPackage.RESPONSIBILITY__Y:
				return new Integer(getY());
			case NetworkPackage.RESPONSIBILITY__NETWORK:
				return getNetwork();
			case NetworkPackage.RESPONSIBILITY__ID:
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
			case NetworkPackage.RESPONSIBILITY__UPSTREAM_LINKS:
				getUpstreamLinks().clear();
				getUpstreamLinks().addAll((Collection)newValue);
				return;
			case NetworkPackage.RESPONSIBILITY__DOWNSTREAM_LINKS:
				getDownstreamLinks().clear();
				getDownstreamLinks().addAll((Collection)newValue);
				return;
			case NetworkPackage.RESPONSIBILITY__X:
				setX(((Integer)newValue).intValue());
				return;
			case NetworkPackage.RESPONSIBILITY__Y:
				setY(((Integer)newValue).intValue());
				return;
			case NetworkPackage.RESPONSIBILITY__NETWORK:
				setNetwork((Network)newValue);
				return;
			case NetworkPackage.RESPONSIBILITY__ID:
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
			case NetworkPackage.RESPONSIBILITY__UPSTREAM_LINKS:
				getUpstreamLinks().clear();
				return;
			case NetworkPackage.RESPONSIBILITY__DOWNSTREAM_LINKS:
				getDownstreamLinks().clear();
				return;
			case NetworkPackage.RESPONSIBILITY__X:
				setX(X_EDEFAULT);
				return;
			case NetworkPackage.RESPONSIBILITY__Y:
				setY(Y_EDEFAULT);
				return;
			case NetworkPackage.RESPONSIBILITY__NETWORK:
				setNetwork((Network)null);
				return;
			case NetworkPackage.RESPONSIBILITY__ID:
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
			case NetworkPackage.RESPONSIBILITY__UPSTREAM_LINKS:
				return upstreamLinks != null && !upstreamLinks.isEmpty();
			case NetworkPackage.RESPONSIBILITY__DOWNSTREAM_LINKS:
				return downstreamLinks != null && !downstreamLinks.isEmpty();
			case NetworkPackage.RESPONSIBILITY__X:
				return x != X_EDEFAULT;
			case NetworkPackage.RESPONSIBILITY__Y:
				return y != Y_EDEFAULT;
			case NetworkPackage.RESPONSIBILITY__NETWORK:
				return getNetwork() != null;
			case NetworkPackage.RESPONSIBILITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return eDynamicIsSet(eFeature);
	}

} //ResponsibilityImpl
