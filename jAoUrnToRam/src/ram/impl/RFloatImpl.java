/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import ram.RFloat;
import ram.RamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RFloat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RFloatImpl extends PrimitiveTypeImpl implements RFloat {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RFloatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.RFLOAT;
	}

	/**
	 * The cached invocation delegate for the '{@link #getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)RamPackage.Literals.RFLOAT.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		try {
			return (String)GET_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInstanceClassName() <em>Get Instance Class Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INSTANCE_CLASS_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)RamPackage.Literals.RFLOAT.getEOperations().get(1)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceClassName() {
		try {
			return (String)GET_INSTANCE_CLASS_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

} //RFloatImpl
