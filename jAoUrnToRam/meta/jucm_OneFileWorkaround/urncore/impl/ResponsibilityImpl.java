/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.urncore.impl;

import java.util.Collection;

import jucm_OneFileWorkaround.ucm.map.MapPackage;
import jucm_OneFileWorkaround.ucm.map.RespRef;
import jucm_OneFileWorkaround.ucm.map.ResponsibilityBinding;

import jucm_OneFileWorkaround.ucm.performance.Demand;
import jucm_OneFileWorkaround.ucm.performance.PerformancePackage;

import jucm_OneFileWorkaround.urncore.Responsibility;
import jucm_OneFileWorkaround.urncore.URNdefinition;
import jucm_OneFileWorkaround.urncore.UrncorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.urncore.impl.ResponsibilityImpl#isEmpty <em>Empty</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.impl.ResponsibilityImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.impl.ResponsibilityImpl#isContext <em>Context</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.impl.ResponsibilityImpl#getUrndefinition <em>Urndefinition</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.impl.ResponsibilityImpl#getDemands <em>Demands</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.impl.ResponsibilityImpl#getRespRefs <em>Resp Refs</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.impl.ResponsibilityImpl#getParentBindings <em>Parent Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponsibilityImpl extends UCMmodelElementImpl implements Responsibility {
	/**
	 * The default value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean empty = EMPTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTEXT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContext()
	 * @generated
	 * @ordered
	 */
	protected boolean context = CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDemands() <em>Demands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemands()
	 * @generated
	 * @ordered
	 */
	protected EList<Demand> demands;

	/**
	 * The cached value of the '{@link #getRespRefs() <em>Resp Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<RespRef> respRefs;

	/**
	 * The cached value of the '{@link #getParentBindings() <em>Parent Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibilityBinding> parentBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrncorePackage.Literals.RESPONSIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmpty() {
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpty(boolean newEmpty) {
		boolean oldEmpty = empty;
		empty = newEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrncorePackage.RESPONSIBILITY__EMPTY, oldEmpty, empty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrncorePackage.RESPONSIBILITY__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(boolean newContext) {
		boolean oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrncorePackage.RESPONSIBILITY__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URNdefinition getUrndefinition() {
		if (eContainerFeatureID() != UrncorePackage.RESPONSIBILITY__URNDEFINITION) return null;
		return (URNdefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrndefinition(URNdefinition newUrndefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUrndefinition, UrncorePackage.RESPONSIBILITY__URNDEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrndefinition(URNdefinition newUrndefinition) {
		if (newUrndefinition != eInternalContainer() || (eContainerFeatureID() != UrncorePackage.RESPONSIBILITY__URNDEFINITION && newUrndefinition != null)) {
			if (EcoreUtil.isAncestor(this, newUrndefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUrndefinition != null)
				msgs = ((InternalEObject)newUrndefinition).eInverseAdd(this, UrncorePackage.UR_NDEFINITION__RESPONSIBILITIES, URNdefinition.class, msgs);
			msgs = basicSetUrndefinition(newUrndefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrncorePackage.RESPONSIBILITY__URNDEFINITION, newUrndefinition, newUrndefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Demand> getDemands() {
		if (demands == null) {
			demands = new EObjectContainmentWithInverseEList<Demand>(Demand.class, this, UrncorePackage.RESPONSIBILITY__DEMANDS, PerformancePackage.DEMAND__RESPONSIBILITY);
		}
		return demands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RespRef> getRespRefs() {
		if (respRefs == null) {
			respRefs = new EObjectWithInverseResolvingEList<RespRef>(RespRef.class, this, UrncorePackage.RESPONSIBILITY__RESP_REFS, MapPackage.RESP_REF__RESP_DEF);
		}
		return respRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponsibilityBinding> getParentBindings() {
		if (parentBindings == null) {
			parentBindings = new EObjectWithInverseResolvingEList<ResponsibilityBinding>(ResponsibilityBinding.class, this, UrncorePackage.RESPONSIBILITY__PARENT_BINDINGS, MapPackage.RESPONSIBILITY_BINDING__PARENT_RESP);
		}
		return parentBindings;
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
			case UrncorePackage.RESPONSIBILITY__URNDEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUrndefinition((URNdefinition)otherEnd, msgs);
			case UrncorePackage.RESPONSIBILITY__DEMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDemands()).basicAdd(otherEnd, msgs);
			case UrncorePackage.RESPONSIBILITY__RESP_REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRespRefs()).basicAdd(otherEnd, msgs);
			case UrncorePackage.RESPONSIBILITY__PARENT_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentBindings()).basicAdd(otherEnd, msgs);
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
			case UrncorePackage.RESPONSIBILITY__URNDEFINITION:
				return basicSetUrndefinition(null, msgs);
			case UrncorePackage.RESPONSIBILITY__DEMANDS:
				return ((InternalEList<?>)getDemands()).basicRemove(otherEnd, msgs);
			case UrncorePackage.RESPONSIBILITY__RESP_REFS:
				return ((InternalEList<?>)getRespRefs()).basicRemove(otherEnd, msgs);
			case UrncorePackage.RESPONSIBILITY__PARENT_BINDINGS:
				return ((InternalEList<?>)getParentBindings()).basicRemove(otherEnd, msgs);
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
			case UrncorePackage.RESPONSIBILITY__URNDEFINITION:
				return eInternalContainer().eInverseRemove(this, UrncorePackage.UR_NDEFINITION__RESPONSIBILITIES, URNdefinition.class, msgs);
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
			case UrncorePackage.RESPONSIBILITY__EMPTY:
				return isEmpty();
			case UrncorePackage.RESPONSIBILITY__EXPRESSION:
				return getExpression();
			case UrncorePackage.RESPONSIBILITY__CONTEXT:
				return isContext();
			case UrncorePackage.RESPONSIBILITY__URNDEFINITION:
				return getUrndefinition();
			case UrncorePackage.RESPONSIBILITY__DEMANDS:
				return getDemands();
			case UrncorePackage.RESPONSIBILITY__RESP_REFS:
				return getRespRefs();
			case UrncorePackage.RESPONSIBILITY__PARENT_BINDINGS:
				return getParentBindings();
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
			case UrncorePackage.RESPONSIBILITY__EMPTY:
				setEmpty((Boolean)newValue);
				return;
			case UrncorePackage.RESPONSIBILITY__EXPRESSION:
				setExpression((String)newValue);
				return;
			case UrncorePackage.RESPONSIBILITY__CONTEXT:
				setContext((Boolean)newValue);
				return;
			case UrncorePackage.RESPONSIBILITY__URNDEFINITION:
				setUrndefinition((URNdefinition)newValue);
				return;
			case UrncorePackage.RESPONSIBILITY__DEMANDS:
				getDemands().clear();
				getDemands().addAll((Collection<? extends Demand>)newValue);
				return;
			case UrncorePackage.RESPONSIBILITY__RESP_REFS:
				getRespRefs().clear();
				getRespRefs().addAll((Collection<? extends RespRef>)newValue);
				return;
			case UrncorePackage.RESPONSIBILITY__PARENT_BINDINGS:
				getParentBindings().clear();
				getParentBindings().addAll((Collection<? extends ResponsibilityBinding>)newValue);
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
			case UrncorePackage.RESPONSIBILITY__EMPTY:
				setEmpty(EMPTY_EDEFAULT);
				return;
			case UrncorePackage.RESPONSIBILITY__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case UrncorePackage.RESPONSIBILITY__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case UrncorePackage.RESPONSIBILITY__URNDEFINITION:
				setUrndefinition((URNdefinition)null);
				return;
			case UrncorePackage.RESPONSIBILITY__DEMANDS:
				getDemands().clear();
				return;
			case UrncorePackage.RESPONSIBILITY__RESP_REFS:
				getRespRefs().clear();
				return;
			case UrncorePackage.RESPONSIBILITY__PARENT_BINDINGS:
				getParentBindings().clear();
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
			case UrncorePackage.RESPONSIBILITY__EMPTY:
				return empty != EMPTY_EDEFAULT;
			case UrncorePackage.RESPONSIBILITY__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case UrncorePackage.RESPONSIBILITY__CONTEXT:
				return context != CONTEXT_EDEFAULT;
			case UrncorePackage.RESPONSIBILITY__URNDEFINITION:
				return getUrndefinition() != null;
			case UrncorePackage.RESPONSIBILITY__DEMANDS:
				return demands != null && !demands.isEmpty();
			case UrncorePackage.RESPONSIBILITY__RESP_REFS:
				return respRefs != null && !respRefs.isEmpty();
			case UrncorePackage.RESPONSIBILITY__PARENT_BINDINGS:
				return parentBindings != null && !parentBindings.isEmpty();
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
		result.append(" (empty: ");
		result.append(empty);
		result.append(", expression: ");
		result.append(expression);
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //ResponsibilityImpl
