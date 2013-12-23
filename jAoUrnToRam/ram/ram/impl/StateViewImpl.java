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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.Classifier;
import ram.RamPackage;
import ram.StateMachine;
import ram.StateView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.StateViewImpl#getStateMachines <em>State Machines</em>}</li>
 *   <li>{@link ram.impl.StateViewImpl#getSpecifies <em>Specifies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateViewImpl extends NamedElementImpl implements StateView {
	/**
	 * The cached value of the '{@link #getStateMachines() <em>State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> stateMachines;

	/**
	 * The cached value of the '{@link #getSpecifies() <em>Specifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifies()
	 * @generated
	 * @ordered
	 */
	protected Classifier specifies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getStateMachines() {
		if (stateMachines == null) {
			stateMachines = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, RamPackage.STATE_VIEW__STATE_MACHINES);
		}
		return stateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSpecifies() {
		if (specifies != null && specifies.eIsProxy()) {
			InternalEObject oldSpecifies = (InternalEObject)specifies;
			specifies = (Classifier)eResolveProxy(oldSpecifies);
			if (specifies != oldSpecifies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.STATE_VIEW__SPECIFIES, oldSpecifies, specifies));
			}
		}
		return specifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSpecifies() {
		return specifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifies(Classifier newSpecifies) {
		Classifier oldSpecifies = specifies;
		specifies = newSpecifies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.STATE_VIEW__SPECIFIES, oldSpecifies, specifies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.STATE_VIEW__STATE_MACHINES:
				return ((InternalEList<?>)getStateMachines()).basicRemove(otherEnd, msgs);
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
			case RamPackage.STATE_VIEW__STATE_MACHINES:
				return getStateMachines();
			case RamPackage.STATE_VIEW__SPECIFIES:
				if (resolve) return getSpecifies();
				return basicGetSpecifies();
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
			case RamPackage.STATE_VIEW__STATE_MACHINES:
				getStateMachines().clear();
				getStateMachines().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case RamPackage.STATE_VIEW__SPECIFIES:
				setSpecifies((Classifier)newValue);
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
			case RamPackage.STATE_VIEW__STATE_MACHINES:
				getStateMachines().clear();
				return;
			case RamPackage.STATE_VIEW__SPECIFIES:
				setSpecifies((Classifier)null);
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
			case RamPackage.STATE_VIEW__STATE_MACHINES:
				return stateMachines != null && !stateMachines.isEmpty();
			case RamPackage.STATE_VIEW__SPECIFIES:
				return specifies != null;
		}
		return super.eIsSet(featureID);
	}

} //StateViewImpl
