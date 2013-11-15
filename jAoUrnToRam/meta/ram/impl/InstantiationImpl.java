/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.Aspect;
import ram.Instantiation;
import ram.InstantiationType;
import ram.Mapping;
import ram.RamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.InstantiationImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link ram.impl.InstantiationImpl#getExternalAspect <em>External Aspect</em>}</li>
 *   <li>{@link ram.impl.InstantiationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstantiationImpl extends EObjectImpl implements Instantiation {
	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The cached value of the '{@link #getExternalAspect() <em>External Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalAspect()
	 * @generated
	 * @ordered
	 */
	protected Aspect externalAspect;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final InstantiationType TYPE_EDEFAULT = InstantiationType.DEPENDS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InstantiationType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.INSTANTIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this, RamPackage.INSTANTIATION__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect getExternalAspect() {
		if (externalAspect != null && externalAspect.eIsProxy()) {
			InternalEObject oldExternalAspect = (InternalEObject)externalAspect;
			externalAspect = (Aspect)eResolveProxy(oldExternalAspect);
			if (externalAspect != oldExternalAspect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.INSTANTIATION__EXTERNAL_ASPECT, oldExternalAspect, externalAspect));
			}
		}
		return externalAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect basicGetExternalAspect() {
		return externalAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalAspect(Aspect newExternalAspect) {
		Aspect oldExternalAspect = externalAspect;
		externalAspect = newExternalAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.INSTANTIATION__EXTERNAL_ASPECT, oldExternalAspect, externalAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InstantiationType newType) {
		InstantiationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.INSTANTIATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.INSTANTIATION__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RamPackage.INSTANTIATION__MAPPINGS:
				return getMappings();
			case RamPackage.INSTANTIATION__EXTERNAL_ASPECT:
				if (resolve) return getExternalAspect();
				return basicGetExternalAspect();
			case RamPackage.INSTANTIATION__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RamPackage.INSTANTIATION__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case RamPackage.INSTANTIATION__EXTERNAL_ASPECT:
				setExternalAspect((Aspect)newValue);
				return;
			case RamPackage.INSTANTIATION__TYPE:
				setType((InstantiationType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RamPackage.INSTANTIATION__MAPPINGS:
				getMappings().clear();
				return;
			case RamPackage.INSTANTIATION__EXTERNAL_ASPECT:
				setExternalAspect((Aspect)null);
				return;
			case RamPackage.INSTANTIATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RamPackage.INSTANTIATION__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case RamPackage.INSTANTIATION__EXTERNAL_ASPECT:
				return externalAspect != null;
			case RamPackage.INSTANTIATION__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //InstantiationImpl
