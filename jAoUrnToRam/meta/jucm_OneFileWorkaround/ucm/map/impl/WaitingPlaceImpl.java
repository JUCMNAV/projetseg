/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.map.impl;

import intermediateWorkflow.IntermediateWorkflowFactory;
import intermediateWorkflow.IwWaitingPlace;
import jucm_OneFileWorkaround.ucm.map.MapPackage;
import jucm_OneFileWorkaround.ucm.map.WaitKind;
import jucm_OneFileWorkaround.ucm.map.WaitingPlace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waiting Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.impl.WaitingPlaceImpl#getWaitType <em>Wait Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaitingPlaceImpl extends PathNodeImpl implements WaitingPlace {
	private IwWaitingPlace iwWaitingPlace;
	@Override
	public void buildIwNodeTemplate() {
		iwWaitingPlace = IntermediateWorkflowFactory.eINSTANCE.createIwWaitingPlace();
		iwWaitingPlace.setName(nameOrPrefixId("WaitingPlace"));
		iwWaitingPlace.setTransient(getWaitType().equals(WaitKind.TRANSIENT));
		addIwEquivalentNodeAfterOutIn(iwWaitingPlace);
	}

	@Override
	public IwWaitingPlace getIwWaitingPlace() {
		return iwWaitingPlace;
	}
	
	/**
	 * The default value of the '{@link #getWaitType() <em>Wait Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitType()
	 * @generated
	 * @ordered
	 */
	protected static final WaitKind WAIT_TYPE_EDEFAULT = WaitKind.TRANSIENT;

	/**
	 * The cached value of the '{@link #getWaitType() <em>Wait Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitType()
	 * @generated
	 * @ordered
	 */
	protected WaitKind waitType = WAIT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitingPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapPackage.Literals.WAITING_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitKind getWaitType() {
		return waitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitType(WaitKind newWaitType) {
		WaitKind oldWaitType = waitType;
		waitType = newWaitType == null ? WAIT_TYPE_EDEFAULT : newWaitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.WAITING_PLACE__WAIT_TYPE, oldWaitType, waitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapPackage.WAITING_PLACE__WAIT_TYPE:
				return getWaitType();
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
			case MapPackage.WAITING_PLACE__WAIT_TYPE:
				setWaitType((WaitKind)newValue);
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
			case MapPackage.WAITING_PLACE__WAIT_TYPE:
				setWaitType(WAIT_TYPE_EDEFAULT);
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
			case MapPackage.WAITING_PLACE__WAIT_TYPE:
				return waitType != WAIT_TYPE_EDEFAULT;
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
		result.append(" (waitType: ");
		result.append(waitType);
		result.append(')');
		return result.toString();
	}



	

} //WaitingPlaceImpl
