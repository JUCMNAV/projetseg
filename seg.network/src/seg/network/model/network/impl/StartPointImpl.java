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
import seg.network.model.network.StartPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StartPointImpl extends NodeImpl implements StartPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NetworkPackage.eINSTANCE.getStartPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NetworkPackage.START_POINT__NETWORK:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, NetworkPackage.START_POINT__NETWORK, msgs);
				case NetworkPackage.START_POINT__UPSTREAM_LINKS:
					return ((InternalEList)getUpstreamLinks()).basicAdd(otherEnd, msgs);
				case NetworkPackage.START_POINT__DOWNSTREAM_LINKS:
					return ((InternalEList)getDownstreamLinks()).basicAdd(otherEnd, msgs);
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
				case NetworkPackage.START_POINT__NETWORK:
					return eBasicSetContainer(null, NetworkPackage.START_POINT__NETWORK, msgs);
				case NetworkPackage.START_POINT__UPSTREAM_LINKS:
					return ((InternalEList)getUpstreamLinks()).basicRemove(otherEnd, msgs);
				case NetworkPackage.START_POINT__DOWNSTREAM_LINKS:
					return ((InternalEList)getDownstreamLinks()).basicRemove(otherEnd, msgs);
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
				case NetworkPackage.START_POINT__NETWORK:
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
			case NetworkPackage.START_POINT__X:
				return new Integer(getX());
			case NetworkPackage.START_POINT__Y:
				return new Integer(getY());
			case NetworkPackage.START_POINT__WIDTH:
				return new Integer(getWidth());
			case NetworkPackage.START_POINT__HEIGHT:
				return new Integer(getHeight());
			case NetworkPackage.START_POINT__ID:
				return getId();
			case NetworkPackage.START_POINT__NETWORK:
				return getNetwork();
			case NetworkPackage.START_POINT__UPSTREAM_LINKS:
				return getUpstreamLinks();
			case NetworkPackage.START_POINT__DOWNSTREAM_LINKS:
				return getDownstreamLinks();
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
			case NetworkPackage.START_POINT__X:
				setX(((Integer)newValue).intValue());
				return;
			case NetworkPackage.START_POINT__Y:
				setY(((Integer)newValue).intValue());
				return;
			case NetworkPackage.START_POINT__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case NetworkPackage.START_POINT__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case NetworkPackage.START_POINT__ID:
				setId((String)newValue);
				return;
			case NetworkPackage.START_POINT__NETWORK:
				setNetwork((Network)newValue);
				return;
			case NetworkPackage.START_POINT__UPSTREAM_LINKS:
				getUpstreamLinks().clear();
				getUpstreamLinks().addAll((Collection)newValue);
				return;
			case NetworkPackage.START_POINT__DOWNSTREAM_LINKS:
				getDownstreamLinks().clear();
				getDownstreamLinks().addAll((Collection)newValue);
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
			case NetworkPackage.START_POINT__X:
				setX(X_EDEFAULT);
				return;
			case NetworkPackage.START_POINT__Y:
				setY(Y_EDEFAULT);
				return;
			case NetworkPackage.START_POINT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case NetworkPackage.START_POINT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case NetworkPackage.START_POINT__ID:
				setId(ID_EDEFAULT);
				return;
			case NetworkPackage.START_POINT__NETWORK:
				setNetwork((Network)null);
				return;
			case NetworkPackage.START_POINT__UPSTREAM_LINKS:
				getUpstreamLinks().clear();
				return;
			case NetworkPackage.START_POINT__DOWNSTREAM_LINKS:
				getDownstreamLinks().clear();
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
			case NetworkPackage.START_POINT__X:
				return x != X_EDEFAULT;
			case NetworkPackage.START_POINT__Y:
				return y != Y_EDEFAULT;
			case NetworkPackage.START_POINT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case NetworkPackage.START_POINT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case NetworkPackage.START_POINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NetworkPackage.START_POINT__NETWORK:
				return getNetwork() != null;
			case NetworkPackage.START_POINT__UPSTREAM_LINKS:
				return upstreamLinks != null && !upstreamLinks.isEmpty();
			case NetworkPackage.START_POINT__DOWNSTREAM_LINKS:
				return downstreamLinks != null && !downstreamLinks.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //StartPointImpl
