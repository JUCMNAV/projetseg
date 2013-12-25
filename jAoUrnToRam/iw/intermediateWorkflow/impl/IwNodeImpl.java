/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowFactory;
import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwConcern;
import intermediateWorkflow.IwModel;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwStep;
import intermediateWorkflow.IwWorkflow;
import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.WorkflowInstantiator;
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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.RamFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeImpl#getSuccs <em>Succs</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeImpl#getPreds <em>Preds</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeImpl#getStep <em>Step</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeImpl#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IwNodeImpl extends EObjectImpl implements IwNode {
	
	@Override
	public IwNodeConnection getFirstSucc() {
		return getSucc(0);
	}
	
	@Override
	public IwNodeConnection getSucc(int index) {
		return getSuccs().get(index);
	}
	
	@Override
	public void addSucc(IwNodeConnection succ){
		this.getSuccs().add(succ);
	}
	
	/*********** iw to ram ***********************/
	
	/*********kermeta's multiple inheritance doesn't work in Java, so inheritance simulated by aggregation******/
	protected RamFactory ramFactory;
	@Override
	public RamFactory getRamFactory() {
		return ramFactory;
	}
	@Override
	public void setRamFactory(RamFactory ramFactory) {
		this.ramFactory = ramFactory;
	}
	/*****************************************************************/
	
	@Override
	public String INPUT_DATA_SUFFIX() {
		return "Input";
	}
	@Override
	public String OUTPUT_DATA_SUFFIX() {
		return "Output";
	}
	
	@Override
	public void build() {
		//default: do nothing
		ramFactory = RamFactory.eINSTANCE;
	}
		
	@Override
	public void link() {
		//default: do nothing
	}
	/*********** Step View Transformation ***********************/
	@Override
	public String getTargetPortDotEscaped(StepView stepView, Integer stubEntryIndex) {
		StringBuilder result = new StringBuilder();
		
		String id = getId();
		String stepViewDotEscape = stepView.dotEscape(id);
		
		result.append(stepViewDotEscape);
		
		if(stubEntryIndex != null && isFromCurrentStep(stepView)) {
			result.append(":in");
			
			String stubEntryIndexAsStr = stubEntryIndex.toString();
			result.append(stubEntryIndexAsStr);
		}
		return result.toString();
	}
	
	@Override
	public void appendVertex(StepView stepView) {
		stepView.appendLine("");
		stepView.append("        "+stepView.dotEscape(getId()));
		stepView.appendLine("[");
		if(getIsCustomizable()){ 
			stepView.appendLine("            style=filled,");
			stepView.appendLine("            fillcolor="+stepView.getCustomizableClassColor()+",");
		}
		appendVertexContent(stepView);
		stepView.appendLine("        ]");
	}
	@Override
	public void appendVertexContent(StepView stepView) {
		stepView.appendLine("");
		stepView.appendLine("            label=");
		stepView.appendLine("            <<table border=\"0\" cellborder=\"0\" cellpadding=\"0\" cellspacing=\"0\">");
		appendNodeTitleRow(stepView);
		stepView.appendLine("            </table>>");
	}
	@Override
	public void appendNodeTitleRow(StepView stepView) {
		stepView.appendLine("                <tr>");
		stepView.append("                    <td cellpadding=\"3\">");
		stepView.appendImg(getImageName());
		stepView.appendLine("</td>");
		stepView.append("                    <td align=\"center\" width=\"");
		stepView.append(Integer.toString(getMinWidth()));
		stepView.append("\">");
		stepView.append(name);
		stepView.appendLine("</td>");
		stepView.appendLine("                </tr>");
	}
	@Override
	public void appendVertex_NextStep(StepView stepView) {
		stepView.appendLine("");
		stepView.append("        "+stepView.dotEscape(getId()));
		stepView.append("[label=");
		
		if(name==step.getName()) 
			stepView.append(stepView.dotEscape(name));
		else
			stepView.append("\""+stepView.dotEscapeInner(step.getName())+"\\n"+stepView.dotEscapeInner(name)+"\"");
	
		stepView.appendLine(",style=dashed]");
	}
	@Override
	public void appendEdges(StepView stepView) {
		List<IwNodeConnection> nodeConnections = getNodeConnectionFromCurrentStep(stepView);
		
		for(IwNodeConnection nodeConnection : nodeConnections) {
			nodeConnection.appendNodeConnection(stepView);
			stepView.appendLine("");
		}
	}
	@Override
	public void appendFirstVerticesFromNextStep(StepView stepView) {
		List<IwNodeConnection> nodeConnections = getNodeConnectionFromCurrentStep(stepView);
		
		for(IwNodeConnection nodeConnection : nodeConnections) {
			if(nodeConnection.getTarget().isFromCurrentStep(stepView)==false) {
				nodeConnection.getTarget().appendVertex_NextStep(stepView);
			}
		}
	}
	@Override
	public List<IwNodeConnection> getNodeConnectionFromCurrentStep(StepView stepView) {
		List<IwNodeConnection> nodeConnections = new ArrayList<IwNodeConnection>();
		for(IwNodeConnection nodeConnection :  getSuccs()){
			if(nodeConnection.isFromCurrentStep(stepView)) {
				nodeConnections.add(nodeConnection);
			}
		}
		return nodeConnections;
	}
	
	public void appendBindings(StepView stepView) {
		//DO nothing
	}
	
	@Override
	public String getId() {
		return getWorkflow().getName()+ "_"+ getName(); //Use workflow name as prefix to enforce node names are unique
	}
	
	@Override
	public boolean isFromCurrentStep(StepView stepView) {
		return step.equals(stepView.getStep());
	}
	@Override
	public  int getMinWidth() {
		return 0;
	}
	@Override
	public boolean getIsCustomizable() {
		return false;
	}
	@Override
	public String getImageName() {
		return "";
	}
	/*********** iw to java instantiator ***********************/
	@Override
	public String jiMemberName() {
		return "_"+ getName();
	}
	
	private NodeInstantiationStrategy  _strategy;
	
	//????LazyLoad because the creation of IwNode is not under our control
	@Override
	public NodeInstantiationStrategy strategy() {
		if(_strategy == null) {
			_strategy = createStrategy();
		}
		return _strategy;
	}
	
	@Override
	public void setStrategy(NodeInstantiationStrategy strategy){
		_strategy = strategy;
	}
	
	@Override
	public  NodeInstantiationStrategy createStrategy() {
		//throw exception in this case because abstract in aspect produces meaningless excpetion msg
		//raise kermeta::exceptions::NotImplementedException.new
		throw new UnsupportedOperationException(); 
	}
	
	@Override
	public void jiAppendBuildStatement(WorkflowInstantiator workflowInstantiator) {
		strategy().jiAppendBuildStatement(workflowInstantiator);
	}
	
	@Override
	public void jiAppendLinkNodesToNextNodesStatement(WorkflowInstantiator workflowInstantiator) {
		strategy().jiAppendLinkNodesToNextNodesStatement(workflowInstantiator);
	}
	
	@Override
	public void jiAppendLinkNodesToWorkflowStatement(WorkflowInstantiator workflowInstantiator) {
		strategy().jiAppendLinkNodesToWorkflowStatement(workflowInstantiator);
	}
	
	@Override
	public void jiAppendLinkStartNodesToWorkflowStatement(WorkflowInstantiator workflowInstantiator) {
		strategy().jiAppendLinkStartNodesToWorkflowStatement(workflowInstantiator);
	}
	
	//Step 3
	@Override
	public void step_DeepFirstSearch(IwStep currentStep) {
		if(isUnexplored()) {
			explore(currentStep);
		}
		else {
			if(isPartOfStep(currentStep)==false) {
				currentStep.merge(step);
			}
		}
	}
	
	@Override
	public void explore(IwStep currentStep) {
		setStep(currentStep);
		//succs.each{nodeConnection|nodeConnection.target.step_DeepFirstSearch(step)}
		for(IwNodeConnection nodeConnection : getSuccs()) {
			nodeConnection.getTarget().step_DeepFirstSearch(getStep());
		}
	}
	
	@Override
	public boolean isPartOfStep(IwStep currentStep) {
		return getStep()==currentStep;
	}
	
	@Override
	public boolean isUnexplored() {
		return getStep()==null; //step.isVoid 
	}
	
	@Override
	public IwStep createStep(boolean isStartupStep) {
		IwStep result = IntermediateWorkflowFactory.eINSTANCE.createIwStep();
		result.setName(name);
		result.setStartupStep(isStartupStep);
		getConcern().getSteps().add(result);
		
		return result;
	}
	
	//Step 2
	@Override
	public void insertInputProcessingNode() {
		//Do nothing
	}
	
	@Override
	public IwConcern getConcern() {
		return getWorkflow().getConcern();
	}
	
	@Override
	public Set<IwNode> getTargets() {
		Set<IwNode> nodes = new LinkedHashSet<IwNode>();
		//succs.collect{succ|succ.target}.asOrderedSet
		for(IwNodeConnection succ : getSuccs()){
			nodes.add(succ.getTarget());
		}
		return nodes;
	}
	
	@Override
	public Set<IwNode> sources(){
		Set<IwNode> nodes = new LinkedHashSet<IwNode>();
		
		for(IwNodeConnection pred : getPreds()){
			nodes.add(pred.getSource());
		}
		return nodes;
	}
	
	@Override
	public IwModel model(){
		return getWorkflow().getModel();
	}
	
	@Override
	public String getInputProcessingNodeAction() {
		return "insert";
	}
	
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuccs() <em>Succs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccs()
	 * @generated
	 * @ordered
	 */
	protected EList<IwNodeConnection> succs;

	/**
	 * The cached value of the '{@link #getPreds() <em>Preds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreds()
	 * @generated
	 * @ordered
	 */
	protected EList<IwNodeConnection> preds;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected IwStep step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwNodeConnection> getSuccs() {
		if (succs == null) {
			succs = new EObjectContainmentWithInverseEList<IwNodeConnection>(IwNodeConnection.class, this, IntermediateWorkflowPackage.IW_NODE__SUCCS, IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE);
		}
		return succs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwNodeConnection> getPreds() {
		if (preds == null) {
			preds = new EObjectWithInverseResolvingEList<IwNodeConnection>(IwNodeConnection.class, this, IntermediateWorkflowPackage.IW_NODE__PREDS, IntermediateWorkflowPackage.IW_NODE_CONNECTION__TARGET);
		}
		return preds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwStep getStep() {
		if (step != null && step.eIsProxy()) {
			InternalEObject oldStep = (InternalEObject)step;
			step = (IwStep)eResolveProxy(oldStep);
			if (step != oldStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateWorkflowPackage.IW_NODE__STEP, oldStep, step));
			}
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwStep basicGetStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(IwStep newStep, NotificationChain msgs) {
		IwStep oldStep = step;
		step = newStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE__STEP, oldStep, newStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(IwStep newStep) {
		if (newStep != step) {
			NotificationChain msgs = null;
			if (step != null)
				msgs = ((InternalEObject)step).eInverseRemove(this, IntermediateWorkflowPackage.IW_STEP__NODES, IwStep.class, msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, IntermediateWorkflowPackage.IW_STEP__NODES, IwStep.class, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE__STEP, newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwWorkflow getWorkflow() {
		if (eContainerFeatureID() != IntermediateWorkflowPackage.IW_NODE__WORKFLOW) return null;
		return (IwWorkflow)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflow(IwWorkflow newWorkflow, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorkflow, IntermediateWorkflowPackage.IW_NODE__WORKFLOW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(IwWorkflow newWorkflow) {
		if (newWorkflow != eInternalContainer() || (eContainerFeatureID() != IntermediateWorkflowPackage.IW_NODE__WORKFLOW && newWorkflow != null)) {
			if (EcoreUtil.isAncestor(this, newWorkflow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkflow != null)
				msgs = ((InternalEObject)newWorkflow).eInverseAdd(this, IntermediateWorkflowPackage.IW_WORKFLOW__NODES, IwWorkflow.class, msgs);
			msgs = basicSetWorkflow(newWorkflow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE__WORKFLOW, newWorkflow, newWorkflow));
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
			case IntermediateWorkflowPackage.IW_NODE__SUCCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuccs()).basicAdd(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_NODE__PREDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreds()).basicAdd(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_NODE__STEP:
				if (step != null)
					msgs = ((InternalEObject)step).eInverseRemove(this, IntermediateWorkflowPackage.IW_STEP__NODES, IwStep.class, msgs);
				return basicSetStep((IwStep)otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_NODE__WORKFLOW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkflow((IwWorkflow)otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_NODE__SUCCS:
				return ((InternalEList<?>)getSuccs()).basicRemove(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_NODE__PREDS:
				return ((InternalEList<?>)getPreds()).basicRemove(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_NODE__STEP:
				return basicSetStep(null, msgs);
			case IntermediateWorkflowPackage.IW_NODE__WORKFLOW:
				return basicSetWorkflow(null, msgs);
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
			case IntermediateWorkflowPackage.IW_NODE__WORKFLOW:
				return eInternalContainer().eInverseRemove(this, IntermediateWorkflowPackage.IW_WORKFLOW__NODES, IwWorkflow.class, msgs);
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
			case IntermediateWorkflowPackage.IW_NODE__NAME:
				return getName();
			case IntermediateWorkflowPackage.IW_NODE__SUCCS:
				return getSuccs();
			case IntermediateWorkflowPackage.IW_NODE__PREDS:
				return getPreds();
			case IntermediateWorkflowPackage.IW_NODE__STEP:
				if (resolve) return getStep();
				return basicGetStep();
			case IntermediateWorkflowPackage.IW_NODE__WORKFLOW:
				return getWorkflow();
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
			case IntermediateWorkflowPackage.IW_NODE__NAME:
				setName((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE__SUCCS:
				getSuccs().clear();
				getSuccs().addAll((Collection<? extends IwNodeConnection>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE__PREDS:
				getPreds().clear();
				getPreds().addAll((Collection<? extends IwNodeConnection>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE__STEP:
				setStep((IwStep)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE__WORKFLOW:
				setWorkflow((IwWorkflow)newValue);
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
			case IntermediateWorkflowPackage.IW_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_NODE__SUCCS:
				getSuccs().clear();
				return;
			case IntermediateWorkflowPackage.IW_NODE__PREDS:
				getPreds().clear();
				return;
			case IntermediateWorkflowPackage.IW_NODE__STEP:
				setStep((IwStep)null);
				return;
			case IntermediateWorkflowPackage.IW_NODE__WORKFLOW:
				setWorkflow((IwWorkflow)null);
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
			case IntermediateWorkflowPackage.IW_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediateWorkflowPackage.IW_NODE__SUCCS:
				return succs != null && !succs.isEmpty();
			case IntermediateWorkflowPackage.IW_NODE__PREDS:
				return preds != null && !preds.isEmpty();
			case IntermediateWorkflowPackage.IW_NODE__STEP:
				return step != null;
			case IntermediateWorkflowPackage.IW_NODE__WORKFLOW:
				return getWorkflow() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IwNodeImpl
