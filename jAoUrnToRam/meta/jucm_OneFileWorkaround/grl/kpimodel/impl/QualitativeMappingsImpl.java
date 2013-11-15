/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl.kpimodel.impl;

import java.util.Collection;

import jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage;
import jucm_OneFileWorkaround.grl.kpimodel.QualitativeMapping;
import jucm_OneFileWorkaround.grl.kpimodel.QualitativeMappings;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualitative Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.impl.QualitativeMappingsImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualitativeMappingsImpl extends KPIConversionImpl implements QualitativeMappings {
	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<QualitativeMapping> mapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualitativeMappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KpimodelPackage.Literals.QUALITATIVE_MAPPINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualitativeMapping> getMapping() {
		if (mapping == null) {
			mapping = new EObjectContainmentEList<QualitativeMapping>(QualitativeMapping.class, this, KpimodelPackage.QUALITATIVE_MAPPINGS__MAPPING);
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpimodelPackage.QUALITATIVE_MAPPINGS__MAPPING:
				return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
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
			case KpimodelPackage.QUALITATIVE_MAPPINGS__MAPPING:
				return getMapping();
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
			case KpimodelPackage.QUALITATIVE_MAPPINGS__MAPPING:
				getMapping().clear();
				getMapping().addAll((Collection<? extends QualitativeMapping>)newValue);
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
			case KpimodelPackage.QUALITATIVE_MAPPINGS__MAPPING:
				getMapping().clear();
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
			case KpimodelPackage.QUALITATIVE_MAPPINGS__MAPPING:
				return mapping != null && !mapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualitativeMappingsImpl
