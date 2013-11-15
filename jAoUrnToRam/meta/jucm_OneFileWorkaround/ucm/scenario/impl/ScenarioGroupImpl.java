/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.scenario.impl;

import java.util.Collection;

import jucm_OneFileWorkaround.ucm.UCMspec;
import jucm_OneFileWorkaround.ucm.UcmPackage;

import jucm_OneFileWorkaround.ucm.scenario.ScenarioDef;
import jucm_OneFileWorkaround.ucm.scenario.ScenarioGroup;
import jucm_OneFileWorkaround.ucm.scenario.ScenarioPackage;

import jucm_OneFileWorkaround.urncore.impl.UCMmodelElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.scenario.impl.ScenarioGroupImpl#getUcmspec <em>Ucmspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.scenario.impl.ScenarioGroupImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioGroupImpl extends UCMmodelElementImpl implements ScenarioGroup {
	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioDef> scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.SCENARIO_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCMspec getUcmspec() {
		if (eContainerFeatureID() != ScenarioPackage.SCENARIO_GROUP__UCMSPEC) return null;
		return (UCMspec)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUcmspec(UCMspec newUcmspec, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUcmspec, ScenarioPackage.SCENARIO_GROUP__UCMSPEC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUcmspec(UCMspec newUcmspec) {
		if (newUcmspec != eInternalContainer() || (eContainerFeatureID() != ScenarioPackage.SCENARIO_GROUP__UCMSPEC && newUcmspec != null)) {
			if (EcoreUtil.isAncestor(this, newUcmspec))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUcmspec != null)
				msgs = ((InternalEObject)newUcmspec).eInverseAdd(this, UcmPackage.UC_MSPEC__SCENARIO_GROUPS, UCMspec.class, msgs);
			msgs = basicSetUcmspec(newUcmspec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.SCENARIO_GROUP__UCMSPEC, newUcmspec, newUcmspec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScenarioDef> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentWithInverseEList<ScenarioDef>(ScenarioDef.class, this, ScenarioPackage.SCENARIO_GROUP__SCENARIOS, ScenarioPackage.SCENARIO_DEF__GROUP);
		}
		return scenarios;
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
			case ScenarioPackage.SCENARIO_GROUP__UCMSPEC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUcmspec((UCMspec)otherEnd, msgs);
			case ScenarioPackage.SCENARIO_GROUP__SCENARIOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScenarios()).basicAdd(otherEnd, msgs);
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
			case ScenarioPackage.SCENARIO_GROUP__UCMSPEC:
				return basicSetUcmspec(null, msgs);
			case ScenarioPackage.SCENARIO_GROUP__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ScenarioPackage.SCENARIO_GROUP__UCMSPEC:
				return eInternalContainer().eInverseRemove(this, UcmPackage.UC_MSPEC__SCENARIO_GROUPS, UCMspec.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO_GROUP__UCMSPEC:
				return getUcmspec();
			case ScenarioPackage.SCENARIO_GROUP__SCENARIOS:
				return getScenarios();
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
			case ScenarioPackage.SCENARIO_GROUP__UCMSPEC:
				setUcmspec((UCMspec)newValue);
				return;
			case ScenarioPackage.SCENARIO_GROUP__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends ScenarioDef>)newValue);
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
			case ScenarioPackage.SCENARIO_GROUP__UCMSPEC:
				setUcmspec((UCMspec)null);
				return;
			case ScenarioPackage.SCENARIO_GROUP__SCENARIOS:
				getScenarios().clear();
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
			case ScenarioPackage.SCENARIO_GROUP__UCMSPEC:
				return getUcmspec() != null;
			case ScenarioPackage.SCENARIO_GROUP__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioGroupImpl
