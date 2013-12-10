/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ram.Constraint;
import ram.Operation;
import ram.RamPackage;
import ram.State;
import ram.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.TransitionImpl#getEndState <em>End State</em>}</li>
 *   <li>{@link ram.impl.TransitionImpl#getStartState <em>Start State</em>}</li>
 *   <li>{@link ram.impl.TransitionImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link ram.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getEndState() <em>End State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndState()
	 * @generated
	 * @ordered
	 */
	protected State endState;

	/**
	 * The cached value of the '{@link #getStartState() <em>Start State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartState()
	 * @generated
	 * @ordered
	 */
	protected State startState;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected Operation signature;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Constraint guard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getEndState() {
		if (endState != null && endState.eIsProxy()) {
			InternalEObject oldEndState = (InternalEObject)endState;
			endState = (State)eResolveProxy(oldEndState);
			if (endState != oldEndState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.TRANSITION__END_STATE, oldEndState, endState));
			}
		}
		return endState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetEndState() {
		return endState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndState(State newEndState, NotificationChain msgs) {
		State oldEndState = endState;
		endState = newEndState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RamPackage.TRANSITION__END_STATE, oldEndState, newEndState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndState(State newEndState) {
		if (newEndState != endState) {
			NotificationChain msgs = null;
			if (endState != null)
				msgs = ((InternalEObject)endState).eInverseRemove(this, RamPackage.STATE__INCOMINGS, State.class, msgs);
			if (newEndState != null)
				msgs = ((InternalEObject)newEndState).eInverseAdd(this, RamPackage.STATE__INCOMINGS, State.class, msgs);
			msgs = basicSetEndState(newEndState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.TRANSITION__END_STATE, newEndState, newEndState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStartState() {
		if (startState != null && startState.eIsProxy()) {
			InternalEObject oldStartState = (InternalEObject)startState;
			startState = (State)eResolveProxy(oldStartState);
			if (startState != oldStartState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.TRANSITION__START_STATE, oldStartState, startState));
			}
		}
		return startState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStartState() {
		return startState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartState(State newStartState, NotificationChain msgs) {
		State oldStartState = startState;
		startState = newStartState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RamPackage.TRANSITION__START_STATE, oldStartState, newStartState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartState(State newStartState) {
		if (newStartState != startState) {
			NotificationChain msgs = null;
			if (startState != null)
				msgs = ((InternalEObject)startState).eInverseRemove(this, RamPackage.STATE__OUTGOINGS, State.class, msgs);
			if (newStartState != null)
				msgs = ((InternalEObject)newStartState).eInverseAdd(this, RamPackage.STATE__OUTGOINGS, State.class, msgs);
			msgs = basicSetStartState(newStartState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.TRANSITION__START_STATE, newStartState, newStartState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject)signature;
			signature = (Operation)eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.TRANSITION__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(Operation newSignature) {
		Operation oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.TRANSITION__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Constraint newGuard, NotificationChain msgs) {
		Constraint oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RamPackage.TRANSITION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Constraint newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RamPackage.TRANSITION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RamPackage.TRANSITION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.TRANSITION__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.TRANSITION__END_STATE:
				if (endState != null)
					msgs = ((InternalEObject)endState).eInverseRemove(this, RamPackage.STATE__INCOMINGS, State.class, msgs);
				return basicSetEndState((State)otherEnd, msgs);
			case RamPackage.TRANSITION__START_STATE:
				if (startState != null)
					msgs = ((InternalEObject)startState).eInverseRemove(this, RamPackage.STATE__OUTGOINGS, State.class, msgs);
				return basicSetStartState((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.TRANSITION__END_STATE:
				return basicSetEndState(null, msgs);
			case RamPackage.TRANSITION__START_STATE:
				return basicSetStartState(null, msgs);
			case RamPackage.TRANSITION__GUARD:
				return basicSetGuard(null, msgs);
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
			case RamPackage.TRANSITION__END_STATE:
				if (resolve) return getEndState();
				return basicGetEndState();
			case RamPackage.TRANSITION__START_STATE:
				if (resolve) return getStartState();
				return basicGetStartState();
			case RamPackage.TRANSITION__SIGNATURE:
				if (resolve) return getSignature();
				return basicGetSignature();
			case RamPackage.TRANSITION__GUARD:
				return getGuard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RamPackage.TRANSITION__END_STATE:
				setEndState((State)newValue);
				return;
			case RamPackage.TRANSITION__START_STATE:
				setStartState((State)newValue);
				return;
			case RamPackage.TRANSITION__SIGNATURE:
				setSignature((Operation)newValue);
				return;
			case RamPackage.TRANSITION__GUARD:
				setGuard((Constraint)newValue);
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
			case RamPackage.TRANSITION__END_STATE:
				setEndState((State)null);
				return;
			case RamPackage.TRANSITION__START_STATE:
				setStartState((State)null);
				return;
			case RamPackage.TRANSITION__SIGNATURE:
				setSignature((Operation)null);
				return;
			case RamPackage.TRANSITION__GUARD:
				setGuard((Constraint)null);
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
			case RamPackage.TRANSITION__END_STATE:
				return endState != null;
			case RamPackage.TRANSITION__START_STATE:
				return startState != null;
			case RamPackage.TRANSITION__SIGNATURE:
				return signature != null;
			case RamPackage.TRANSITION__GUARD:
				return guard != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
