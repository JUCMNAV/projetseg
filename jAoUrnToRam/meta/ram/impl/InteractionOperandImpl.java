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

import ram.InteractionOperand;
import ram.RamPackage;
import ram.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.InteractionOperandImpl#getInteractionConstraint <em>Interaction Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionOperandImpl extends FragmentContainerImpl implements InteractionOperand {
	/**
	 * The cached value of the '{@link #getInteractionConstraint() <em>Interaction Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionConstraint()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification interactionConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.INTERACTION_OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getInteractionConstraint() {
		return interactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionConstraint(ValueSpecification newInteractionConstraint, NotificationChain msgs) {
		ValueSpecification oldInteractionConstraint = interactionConstraint;
		interactionConstraint = newInteractionConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RamPackage.INTERACTION_OPERAND__INTERACTION_CONSTRAINT, oldInteractionConstraint, newInteractionConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionConstraint(ValueSpecification newInteractionConstraint) {
		if (newInteractionConstraint != interactionConstraint) {
			NotificationChain msgs = null;
			if (interactionConstraint != null)
				msgs = ((InternalEObject)interactionConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RamPackage.INTERACTION_OPERAND__INTERACTION_CONSTRAINT, null, msgs);
			if (newInteractionConstraint != null)
				msgs = ((InternalEObject)newInteractionConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RamPackage.INTERACTION_OPERAND__INTERACTION_CONSTRAINT, null, msgs);
			msgs = basicSetInteractionConstraint(newInteractionConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.INTERACTION_OPERAND__INTERACTION_CONSTRAINT, newInteractionConstraint, newInteractionConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.INTERACTION_OPERAND__INTERACTION_CONSTRAINT:
				return basicSetInteractionConstraint(null, msgs);
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
			case RamPackage.INTERACTION_OPERAND__INTERACTION_CONSTRAINT:
				return getInteractionConstraint();
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
			case RamPackage.INTERACTION_OPERAND__INTERACTION_CONSTRAINT:
				setInteractionConstraint((ValueSpecification)newValue);
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
			case RamPackage.INTERACTION_OPERAND__INTERACTION_CONSTRAINT:
				setInteractionConstraint((ValueSpecification)null);
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
			case RamPackage.INTERACTION_OPERAND__INTERACTION_CONSTRAINT:
				return interactionConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionOperandImpl
