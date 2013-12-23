/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ucm.map.impl;

import org.eclipse.emf.ecore.EClass;

import ucm.map.Connect;
import ucm.map.MapPackage;
import ucm.map.WaitingPlace;
import urncore.IURNConnection;
import urncore.IURNNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConnectImpl extends PathNodeImpl implements Connect {
	
	@Override
	public WaitingPlace getWaitingPlace() {
		IURNConnection firstSucc = this.getFirstSucc();
		IURNNode target = firstSucc.getTarget();
		
		if(target instanceof WaitingPlace){
			WaitingPlace waitingPlace = (WaitingPlace)target;
			return waitingPlace;
		} 
		else {
			return null;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapPackage.Literals.CONNECT;
	}

} //ConnectImpl
