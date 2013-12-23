/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ram.AbstractMessageView;
import ram.AspectMessageView;
import ram.RamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Message View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.AbstractMessageViewImpl#getAffectedBy <em>Affected By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractMessageViewImpl extends EObjectImpl implements AbstractMessageView {
	/**
	 * The cached value of the '{@link #getAffectedBy() <em>Affected By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<AspectMessageView> affectedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMessageViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.ABSTRACT_MESSAGE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AspectMessageView> getAffectedBy() {
		if (affectedBy == null) {
			affectedBy = new EObjectResolvingEList<AspectMessageView>(AspectMessageView.class, this, RamPackage.ABSTRACT_MESSAGE_VIEW__AFFECTED_BY);
		}
		return affectedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RamPackage.ABSTRACT_MESSAGE_VIEW__AFFECTED_BY:
				return getAffectedBy();
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
			case RamPackage.ABSTRACT_MESSAGE_VIEW__AFFECTED_BY:
				getAffectedBy().clear();
				getAffectedBy().addAll((Collection<? extends AspectMessageView>)newValue);
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
			case RamPackage.ABSTRACT_MESSAGE_VIEW__AFFECTED_BY:
				getAffectedBy().clear();
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
			case RamPackage.ABSTRACT_MESSAGE_VIEW__AFFECTED_BY:
				return affectedBy != null && !affectedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractMessageViewImpl
