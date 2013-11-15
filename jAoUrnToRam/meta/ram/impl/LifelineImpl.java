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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.InteractionFragment;
import ram.Lifeline;
import ram.RamPackage;
import ram.TemporaryProperty;
import ram.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.LifelineImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link ram.impl.LifelineImpl#getLocalProperties <em>Local Properties</em>}</li>
 *   <li>{@link ram.impl.LifelineImpl#getCoveredBy <em>Covered By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineImpl extends EObjectImpl implements Lifeline {
	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected TypedElement represents;

	/**
	 * The cached value of the '{@link #getLocalProperties() <em>Local Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporaryProperty> localProperties;

	/**
	 * The cached value of the '{@link #getCoveredBy() <em>Covered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> coveredBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.LIFELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (TypedElement)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.LIFELINE__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(TypedElement newRepresents) {
		TypedElement oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.LIFELINE__REPRESENTS, oldRepresents, represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporaryProperty> getLocalProperties() {
		if (localProperties == null) {
			localProperties = new EObjectContainmentEList<TemporaryProperty>(TemporaryProperty.class, this, RamPackage.LIFELINE__LOCAL_PROPERTIES);
		}
		return localProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getCoveredBy() {
		if (coveredBy == null) {
			coveredBy = new EObjectWithInverseResolvingEList.ManyInverse<InteractionFragment>(InteractionFragment.class, this, RamPackage.LIFELINE__COVERED_BY, RamPackage.INTERACTION_FRAGMENT__COVERED);
		}
		return coveredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.LIFELINE__COVERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoveredBy()).basicAdd(otherEnd, msgs);
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
			case RamPackage.LIFELINE__LOCAL_PROPERTIES:
				return ((InternalEList<?>)getLocalProperties()).basicRemove(otherEnd, msgs);
			case RamPackage.LIFELINE__COVERED_BY:
				return ((InternalEList<?>)getCoveredBy()).basicRemove(otherEnd, msgs);
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
			case RamPackage.LIFELINE__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
			case RamPackage.LIFELINE__LOCAL_PROPERTIES:
				return getLocalProperties();
			case RamPackage.LIFELINE__COVERED_BY:
				return getCoveredBy();
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
			case RamPackage.LIFELINE__REPRESENTS:
				setRepresents((TypedElement)newValue);
				return;
			case RamPackage.LIFELINE__LOCAL_PROPERTIES:
				getLocalProperties().clear();
				getLocalProperties().addAll((Collection<? extends TemporaryProperty>)newValue);
				return;
			case RamPackage.LIFELINE__COVERED_BY:
				getCoveredBy().clear();
				getCoveredBy().addAll((Collection<? extends InteractionFragment>)newValue);
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
			case RamPackage.LIFELINE__REPRESENTS:
				setRepresents((TypedElement)null);
				return;
			case RamPackage.LIFELINE__LOCAL_PROPERTIES:
				getLocalProperties().clear();
				return;
			case RamPackage.LIFELINE__COVERED_BY:
				getCoveredBy().clear();
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
			case RamPackage.LIFELINE__REPRESENTS:
				return represents != null;
			case RamPackage.LIFELINE__LOCAL_PROPERTIES:
				return localProperties != null && !localProperties.isEmpty();
			case RamPackage.LIFELINE__COVERED_BY:
				return coveredBy != null && !coveredBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LifelineImpl
