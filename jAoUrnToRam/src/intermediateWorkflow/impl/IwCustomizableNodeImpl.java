/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwCustomizableNode;
import iwToJavaInstantiator.CustomizableNodeInstantiationStrategy;
import iwToJavaInstantiator.NodeInstantiationStrategy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Customizable Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwCustomizableNodeImpl#getCustomizableNodeRefId <em>Customizable Node Ref Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwCustomizableNodeImpl extends IwNodeImpl implements IwCustomizableNode {
	/**************** iw to ram **************************************/
	
	//@RamCustomizableNodeClassBuildByIwStep
	//If many instances of a shared IwCustomizableNode are part of a step, 
	//only one CustomizableNode RamClass will be part of the step class diagram.
	//Thus,IwStep is responsible to build and link ramClass for IwCustomizableNode
	
	@Override
	public void build() { 
		//do nothing
	}
	
	@Override
	public void link() {
		//do nothing
	}
	
	/************* Step View Transformation ***********************/
	@Override
	public String getId() {
		if(isShared()) 
			return super.getId() +"_"+getCustomizableNodeRefId();
		else 
			return super.getId();
	}

	@Override
	public boolean getIsCustomizable() {
		return true;
	}

	@Override
	public String getImageName(){
		if(isShared())
			return "SharedResp24.gif";
		else
			return "Resp16.gif";
	}
	/*********** iw to java ***********************/
	
	@Override
	public NodeInstantiationStrategy  createStrategy() {
		return new CustomizableNodeInstantiationStrategy(this);
	}
	
	@Override
	public String jiMemberName() {
		//String result = super.jiMemberName();
		//result = result + "_" + customizableNodeRefId.toString();
		
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(super.jiMemberName());
		if(isShared()) {
			strBuff.append("_");
			strBuff.append(customizableNodeRefId.toString());
		}
		return strBuff.toString();
	}
	
	/********************************************/
	@Override
	public String getInputProcessingNodeAction() {
		if(isShared()) 
			return "insert";
		else
			return "stop";
	}
	
	public boolean isShared(){
		//customizableNodeRefId.isVoid==false
		return getCustomizableNodeRefId() != null;
	}
	
	/**
	 * The default value of the '{@link #getCustomizableNodeRefId() <em>Customizable Node Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizableNodeRefId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMIZABLE_NODE_REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomizableNodeRefId() <em>Customizable Node Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizableNodeRefId()
	 * @generated
	 * @ordered
	 */
	protected String customizableNodeRefId = CUSTOMIZABLE_NODE_REF_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwCustomizableNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_CUSTOMIZABLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomizableNodeRefId() {
		return customizableNodeRefId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomizableNodeRefId(String newCustomizableNodeRefId) {
		String oldCustomizableNodeRefId = customizableNodeRefId;
		customizableNodeRefId = newCustomizableNodeRefId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_CUSTOMIZABLE_NODE__CUSTOMIZABLE_NODE_REF_ID, oldCustomizableNodeRefId, customizableNodeRefId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_CUSTOMIZABLE_NODE__CUSTOMIZABLE_NODE_REF_ID:
				return getCustomizableNodeRefId();
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
			case IntermediateWorkflowPackage.IW_CUSTOMIZABLE_NODE__CUSTOMIZABLE_NODE_REF_ID:
				setCustomizableNodeRefId((String)newValue);
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
			case IntermediateWorkflowPackage.IW_CUSTOMIZABLE_NODE__CUSTOMIZABLE_NODE_REF_ID:
				setCustomizableNodeRefId(CUSTOMIZABLE_NODE_REF_ID_EDEFAULT);
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
			case IntermediateWorkflowPackage.IW_CUSTOMIZABLE_NODE__CUSTOMIZABLE_NODE_REF_ID:
				return CUSTOMIZABLE_NODE_REF_ID_EDEFAULT == null ? customizableNodeRefId != null : !CUSTOMIZABLE_NODE_REF_ID_EDEFAULT.equals(customizableNodeRefId);
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
		result.append(" (customizableNodeRefId: ");
		result.append(customizableNodeRefId);
		result.append(')');
		return result.toString();
	}

} //IwCustomizableNodeImpl
