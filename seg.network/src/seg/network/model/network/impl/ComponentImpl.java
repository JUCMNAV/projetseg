/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package seg.network.model.network.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import seg.network.model.network.Component;
import seg.network.model.network.ModelElement;
import seg.network.model.network.Network;
import seg.network.model.network.NetworkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seg.network.model.network.impl.ComponentImpl#getModelelements <em>Modelelements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends ModelElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getModelelements() <em>Modelelements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelelements()
	 * @generated
	 * @ordered
	 */
	protected EList modelelements = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NetworkPackage.eINSTANCE.getComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getModelelements() {
		if (modelelements == null) {
			modelelements = new EObjectResolvingEList(ModelElement.class, this, NetworkPackage.COMPONENT__MODELELEMENTS);
		}
		return modelelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NetworkPackage.COMPONENT__NETWORK:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, NetworkPackage.COMPONENT__NETWORK, msgs);
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
				case NetworkPackage.COMPONENT__NETWORK:
					return eBasicSetContainer(null, NetworkPackage.COMPONENT__NETWORK, msgs);
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
				case NetworkPackage.COMPONENT__NETWORK:
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
			case NetworkPackage.COMPONENT__X:
				return new Integer(getX());
			case NetworkPackage.COMPONENT__Y:
				return new Integer(getY());
			case NetworkPackage.COMPONENT__WIDTH:
				return new Integer(getWidth());
			case NetworkPackage.COMPONENT__HEIGHT:
				return new Integer(getHeight());
			case NetworkPackage.COMPONENT__ID:
				return getId();
			case NetworkPackage.COMPONENT__NETWORK:
				return getNetwork();
			case NetworkPackage.COMPONENT__MODELELEMENTS:
				return getModelelements();
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
			case NetworkPackage.COMPONENT__X:
				setX(((Integer)newValue).intValue());
				return;
			case NetworkPackage.COMPONENT__Y:
				setY(((Integer)newValue).intValue());
				return;
			case NetworkPackage.COMPONENT__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case NetworkPackage.COMPONENT__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case NetworkPackage.COMPONENT__ID:
				setId((String)newValue);
				return;
			case NetworkPackage.COMPONENT__NETWORK:
				setNetwork((Network)newValue);
				return;
			case NetworkPackage.COMPONENT__MODELELEMENTS:
				getModelelements().clear();
				getModelelements().addAll((Collection)newValue);
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
			case NetworkPackage.COMPONENT__X:
				setX(X_EDEFAULT);
				return;
			case NetworkPackage.COMPONENT__Y:
				setY(Y_EDEFAULT);
				return;
			case NetworkPackage.COMPONENT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case NetworkPackage.COMPONENT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case NetworkPackage.COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case NetworkPackage.COMPONENT__NETWORK:
				setNetwork((Network)null);
				return;
			case NetworkPackage.COMPONENT__MODELELEMENTS:
				getModelelements().clear();
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
			case NetworkPackage.COMPONENT__X:
				return x != X_EDEFAULT;
			case NetworkPackage.COMPONENT__Y:
				return y != Y_EDEFAULT;
			case NetworkPackage.COMPONENT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case NetworkPackage.COMPONENT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case NetworkPackage.COMPONENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NetworkPackage.COMPONENT__NETWORK:
				return getNetwork() != null;
			case NetworkPackage.COMPONENT__MODELELEMENTS:
				return modelelements != null && !modelelements.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //ComponentImpl
