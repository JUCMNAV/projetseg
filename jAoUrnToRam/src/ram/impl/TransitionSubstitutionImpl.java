/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ram.RamPackage;
import ram.Transition;
import ram.TransitionSubstitution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.TransitionSubstitutionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link ram.impl.TransitionSubstitutionImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionSubstitutionImpl extends SubstitutionImpl implements TransitionSubstitution {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Transition from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.TRANSITION_SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Transition)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.TRANSITION_SUBSTITUTION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Transition newFrom) {
		Transition oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.TRANSITION_SUBSTITUTION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTo() {
		if (to == null) {
			to = new EObjectResolvingEList<Transition>(Transition.class, this, RamPackage.TRANSITION_SUBSTITUTION__TO);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RamPackage.TRANSITION_SUBSTITUTION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case RamPackage.TRANSITION_SUBSTITUTION__TO:
				return getTo();
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
			case RamPackage.TRANSITION_SUBSTITUTION__FROM:
				setFrom((Transition)newValue);
				return;
			case RamPackage.TRANSITION_SUBSTITUTION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends Transition>)newValue);
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
			case RamPackage.TRANSITION_SUBSTITUTION__FROM:
				setFrom((Transition)null);
				return;
			case RamPackage.TRANSITION_SUBSTITUTION__TO:
				getTo().clear();
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
			case RamPackage.TRANSITION_SUBSTITUTION__FROM:
				return from != null;
			case RamPackage.TRANSITION_SUBSTITUTION__TO:
				return to != null && !to.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransitionSubstitutionImpl
