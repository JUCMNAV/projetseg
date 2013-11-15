/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl.kpimodel.impl;

import java.util.Collection;

import jucm_OneFileWorkaround.grl.impl.IntentionalElementImpl;

import jucm_OneFileWorkaround.grl.kpimodel.Indicator;
import jucm_OneFileWorkaround.grl.kpimodel.IndicatorGroup;
import jucm_OneFileWorkaround.grl.kpimodel.KPIModelLink;
import jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.impl.IndicatorImpl#getKpiModelLinksDest <em>Kpi Model Links Dest</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.impl.IndicatorImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndicatorImpl extends IntentionalElementImpl implements Indicator {
	/**
	 * The cached value of the '{@link #getKpiModelLinksDest() <em>Kpi Model Links Dest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiModelLinksDest()
	 * @generated
	 * @ordered
	 */
	protected EList<KPIModelLink> kpiModelLinksDest;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<IndicatorGroup> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndicatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KpimodelPackage.Literals.INDICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KPIModelLink> getKpiModelLinksDest() {
		if (kpiModelLinksDest == null) {
			kpiModelLinksDest = new EObjectWithInverseResolvingEList<KPIModelLink>(KPIModelLink.class, this, KpimodelPackage.INDICATOR__KPI_MODEL_LINKS_DEST, KpimodelPackage.KPI_MODEL_LINK__IND_DEST);
		}
		return kpiModelLinksDest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndicatorGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectWithInverseResolvingEList.ManyInverse<IndicatorGroup>(IndicatorGroup.class, this, KpimodelPackage.INDICATOR__GROUPS, KpimodelPackage.INDICATOR_GROUP__INDICATORS);
		}
		return groups;
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
			case KpimodelPackage.INDICATOR__KPI_MODEL_LINKS_DEST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKpiModelLinksDest()).basicAdd(otherEnd, msgs);
			case KpimodelPackage.INDICATOR__GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroups()).basicAdd(otherEnd, msgs);
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
			case KpimodelPackage.INDICATOR__KPI_MODEL_LINKS_DEST:
				return ((InternalEList<?>)getKpiModelLinksDest()).basicRemove(otherEnd, msgs);
			case KpimodelPackage.INDICATOR__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case KpimodelPackage.INDICATOR__KPI_MODEL_LINKS_DEST:
				return getKpiModelLinksDest();
			case KpimodelPackage.INDICATOR__GROUPS:
				return getGroups();
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
			case KpimodelPackage.INDICATOR__KPI_MODEL_LINKS_DEST:
				getKpiModelLinksDest().clear();
				getKpiModelLinksDest().addAll((Collection<? extends KPIModelLink>)newValue);
				return;
			case KpimodelPackage.INDICATOR__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends IndicatorGroup>)newValue);
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
			case KpimodelPackage.INDICATOR__KPI_MODEL_LINKS_DEST:
				getKpiModelLinksDest().clear();
				return;
			case KpimodelPackage.INDICATOR__GROUPS:
				getGroups().clear();
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
			case KpimodelPackage.INDICATOR__KPI_MODEL_LINKS_DEST:
				return kpiModelLinksDest != null && !kpiModelLinksDest.isEmpty();
			case KpimodelPackage.INDICATOR__GROUPS:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndicatorImpl
