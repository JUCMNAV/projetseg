/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwInBinding;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwOutBinding;
import intermediateWorkflow.IwPluginBinding;
import intermediateWorkflow.IwStep;
import intermediateWorkflow.IwStub;
import intermediateWorkflow.IwWorkflow;
import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.WorkflowNodeInstantiationStrategy;
import iwToStepView.StepView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Stub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwStubImpl#getStubType <em>Stub Type</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwStubImpl#getPluginBindings <em>Plugin Bindings</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwStubImpl#getOutboundInSteps <em>Outbound In Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwStubImpl extends IwNodeImpl implements IwStub {
	/*********** Step View Transformation ***********************/
	@Override
	public String getImageName() {
		return "Stub24.gif";
	}
	@Override
	public void appendVertex(StepView stepView) {
		if(isAspectMarker()==false) 
			super.appendVertex(stepView);
	}
	@Override
	public void appendEdges(StepView stepView) {
		if(isAspectMarker()==false) 
			super.appendEdges(stepView);
	}
	@Override
	public void appendVertexContent(StepView stepView) {
		stepView.appendLine("            shape=plaintext,");
		stepView.appendLine("            label=");
		stepView.appendLine("            <<table border=\"0\" cellborder=\"1\" cellpadding=\"0\" cellspacing=\"0\" >");
		appendStubEntry(stepView);
		appendStub(stepView);
		appendStubExit(stepView);
		stepView.appendLine("            </table>>");
	}
	@Override
	public void appendStubEntry(StepView stepView) {
		stepView.appendLine("                <tr><td>");
		stepView.appendLine("                    <table border=\"0\" cellborder=\"1\" cellpadding=\"0\" cellspacing=\"0\" >");
		stepView.appendLine("                        <tr>");
		appendStubPorts(stepView,"in",numOfStubEntries());
		stepView.appendLine("                        </tr>");
		stepView.appendLine("                    </table>");
		stepView.appendLine("                </td></tr>");
	}
	@Override
	public void appendStub(StepView stepView) {
		stepView.appendLine("                <tr><td>");
		stepView.appendLine("                    <table border=\"1\" cellborder=\"0\" cellpadding=\"0\" cellspacing=\"0\" >");
		appendNodeTitleRow(stepView)	;	
		stepView.appendLine("                    </table>");
		stepView.appendLine("                </td></tr>");
	}
	@Override
	public void appendStubExit(StepView stepView) {
		if(numOfStubExits()>0) {
			stepView.appendLine("                <tr><td>");
			stepView.appendLine("                    <table border=\"0\" cellborder=\"1\" cellpadding=\"0\" cellspacing=\"0\" >");
			stepView.appendLine("                        <tr>");
			appendStubPorts(stepView,"out",numOfStubExits())	;
			stepView.appendLine("                        </tr>");
			stepView.appendLine("                    </table>");
			stepView.appendLine("                </td></tr>");
		}
	}
	
	//virtual
	@Override
	public int getMinWidth() {
    	int stubEntries = numOfStubEntries();
    	int stubExits = numOfStubExits();
		if(stubEntries > stubExits)
    		return stubEntries*15;
    	else
    		return stubExits*15;
    			
		/*var maxOf:Set<Integer> init Set<Integer>.new
			maxOf.add(numOfStubEntries)
	    	maxOf.add(numOfStubExits)
			var maxNumOfPorts:Integer init colExtMax(maxOf) 
			result:=maxNumOfPorts*15*/
	}
	
	@Override
	public Integer numOfStubEntries() {
		//result:= colExtMax(preds.collect{nodeConnection|nodeConnection.stubEntryIndex})	
		List<Integer> stubEntryIndexes = new ArrayList<Integer>();
		for(IwNodeConnection nodeConnection : getPreds()){
			Integer stubEntryIndex = nodeConnection.getStubEntryIndex();
			stubEntryIndexes.add(stubEntryIndex);
		}
		Integer max = 0;
		for(Integer stubEntryIndex : stubEntryIndexes){
			if(stubEntryIndex > max){
				max = stubEntryIndex;
			}
		}
		return max;
	}
	
	@Override
	public Integer numOfStubExits() {
		//result:= colExtMax(succs.collect{nodeConnection|nodeConnection.stubExitIndex})
		List<Integer> stubExitIndexes = new ArrayList<Integer>();
		for(IwNodeConnection nodeConnection : getSuccs()){
			Integer stubExitIndex = nodeConnection.getStubExitIndex();
			stubExitIndexes.add(stubExitIndex);
		}
		Integer max = 0;
		for(Integer stubExitIndex : stubExitIndexes){
			if(stubExitIndex > max){
				max = stubExitIndex;
			}
		}
		return max;
	}
	
	@Override
	public void appendStubPorts(StepView stepView,String prefix,Integer maxIndex) {
		for(int i=0; i<maxIndex; i++){
			stepView.append("                            <td port=\"");
			stepView.append(prefix);
			stepView.append(Integer.toString(i+1));
			stepView.appendLine("\" height=\"10\"></td>");
		}
		/*maxIndex.times{i|
			stepView.append("                            <td port=\"") stepView.append(prefix) stepView.append((i+1).toString) stepView.appendLine("\" height=\"10\"></td>")
		}*/
	}
	
	@Override
	public void appendAccrosConcernBindings(StepView stepView) {
		if(isExplicitlyBoundAccrosConcerns()) {
			IwPluginBinding pluginBinding = getStaticPluginBinding();
			for(IwInBinding inBinding : pluginBinding.getInBindings()){
				inBinding.appendBinding(stepView);
			}
			for(IwOutBinding outBinding : pluginBinding.getOutBindings()){
				outBinding.appendBinding(stepView);
			}
		}
	}
	
	@Override
	public boolean isExplicitlyBoundAccrosConcerns() {
		return isAspectMarker()==false && getStaticPlugin().getConcern()!=getConcern();
	}
	
	/*********** iw to java  ***********************/
	
	public NodeInstantiationStrategy createStrategy() {
		return new WorkflowNodeInstantiationStrategy(this, "StubNode");
	}
	
	/**********************************************/
	public void explore(IwStep currentStep){
		if(isStaticPluginInSameStep()) {
			setStep(currentStep); 
			for(IwInBinding inBinding : getStaticPluginBinding().getInBindings()){
				inBinding.getPluginStartPoint().step_DeepFirstSearch(getStep());
			}
			//staticPluginBinding.inBindings.each{inBinding|inBinding.pluginStartPoint.step_DeepFirstSearch(step)}
		} else {
			super.explore(currentStep);
		}
	}
	
	
	public boolean isStaticPluginInSameStep() {
		if(isAspectMarker()==true) {
			return false;
		}
		else {
			//warning: refactor on dynamic stub:Only aspect and static stub for now
			if(getConcern() != getStaticPlugin().getConcern()) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	@Override
	public String getInputProcessingNodeAction(){
		if(isAspectMarker())	
			return "continue";
		else
			return "insert";
	}
	
	@Override
	public IwPluginBinding getStaticPluginBinding() {
		return getPluginBindings().get(0);
	}

	@Override
	public IwWorkflow getStaticPlugin() {
		return getStaticPluginBinding().getPlugin();
	}

	@Override
	public boolean isAspectMarker() {
		return getStubType().equals("aspectMarker");
	}
	
	
	
	/**
	 * The default value of the '{@link #getStubType() <em>Stub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubType()
	 * @generated
	 * @ordered
	 */
	protected static final String STUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStubType() <em>Stub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubType()
	 * @generated
	 * @ordered
	 */
	protected String stubType = STUB_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPluginBindings() <em>Plugin Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<IwPluginBinding> pluginBindings;

	/**
	 * The cached value of the '{@link #getOutboundInSteps() <em>Outbound In Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundInSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<IwStep> outboundInSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwStubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_STUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStubType() {
		return stubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStubType(String newStubType) {
		String oldStubType = stubType;
		stubType = newStubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_STUB__STUB_TYPE, oldStubType, stubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwPluginBinding> getPluginBindings() {
		if (pluginBindings == null) {
			pluginBindings = new EObjectContainmentWithInverseEList<IwPluginBinding>(IwPluginBinding.class, this, IntermediateWorkflowPackage.IW_STUB__PLUGIN_BINDINGS, IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB);
		}
		return pluginBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwStep> getOutboundInSteps() {
		if (outboundInSteps == null) {
			outboundInSteps = new EObjectWithInverseResolvingEList.ManyInverse<IwStep>(IwStep.class, this, IntermediateWorkflowPackage.IW_STUB__OUTBOUND_IN_STEPS, IntermediateWorkflowPackage.IW_STEP__OUTBOUND_STUBS);
		}
		return outboundInSteps;
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
			case IntermediateWorkflowPackage.IW_STUB__PLUGIN_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPluginBindings()).basicAdd(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_STUB__OUTBOUND_IN_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutboundInSteps()).basicAdd(otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_STUB__PLUGIN_BINDINGS:
				return ((InternalEList<?>)getPluginBindings()).basicRemove(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_STUB__OUTBOUND_IN_STEPS:
				return ((InternalEList<?>)getOutboundInSteps()).basicRemove(otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_STUB__STUB_TYPE:
				return getStubType();
			case IntermediateWorkflowPackage.IW_STUB__PLUGIN_BINDINGS:
				return getPluginBindings();
			case IntermediateWorkflowPackage.IW_STUB__OUTBOUND_IN_STEPS:
				return getOutboundInSteps();
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
			case IntermediateWorkflowPackage.IW_STUB__STUB_TYPE:
				setStubType((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_STUB__PLUGIN_BINDINGS:
				getPluginBindings().clear();
				getPluginBindings().addAll((Collection<? extends IwPluginBinding>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_STUB__OUTBOUND_IN_STEPS:
				getOutboundInSteps().clear();
				getOutboundInSteps().addAll((Collection<? extends IwStep>)newValue);
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
			case IntermediateWorkflowPackage.IW_STUB__STUB_TYPE:
				setStubType(STUB_TYPE_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_STUB__PLUGIN_BINDINGS:
				getPluginBindings().clear();
				return;
			case IntermediateWorkflowPackage.IW_STUB__OUTBOUND_IN_STEPS:
				getOutboundInSteps().clear();
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
			case IntermediateWorkflowPackage.IW_STUB__STUB_TYPE:
				return STUB_TYPE_EDEFAULT == null ? stubType != null : !STUB_TYPE_EDEFAULT.equals(stubType);
			case IntermediateWorkflowPackage.IW_STUB__PLUGIN_BINDINGS:
				return pluginBindings != null && !pluginBindings.isEmpty();
			case IntermediateWorkflowPackage.IW_STUB__OUTBOUND_IN_STEPS:
				return outboundInSteps != null && !outboundInSteps.isEmpty();
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
		result.append(" (stubType: ");
		result.append(stubType);
		result.append(')');
		return result.toString();
	}

	

} //IwStubImpl
