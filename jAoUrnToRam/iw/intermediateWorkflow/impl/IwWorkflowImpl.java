/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwConcern;
import intermediateWorkflow.IwEndPoint;
import intermediateWorkflow.IwModel;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwPluginBinding;
import intermediateWorkflow.IwStartPoint;
import intermediateWorkflow.IwStub;
import intermediateWorkflow.IwWorkflow;
import iwToJavaInstantiator.JavaView;
import iwToJavaInstantiator.WorkflowInstantiator;
import iwToStepView.StepView;
import jAoUrnToRam.util.StringExtensions;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwWorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwWorkflowImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwWorkflowImpl#getStartPoints <em>Start Points</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwWorkflowImpl#getConcern <em>Concern</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwWorkflowImpl#getIsParentDynStub <em>Is Parent Dyn Stub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwWorkflowImpl extends EObjectImpl implements IwWorkflow {
	@Override
	public void insertInputProcessingNodes() {
		//cannot use foreach loop because of concurrent modification exception
		for(int i = 0; i < getNodes().size(); i++){
			IwNode node = getNodes().get(i);
			node.insertInputProcessingNode();
		}
	}
	
	/*********** Iw to Java Program ***********************/
	@Override
	public void jpAppendImport(JavaView javaView) {
		javaView.appendImport(workflowInstantiatorFullyQualifiedName());
	}
	
	@Override
	public void jpAppendBuild(JavaView javaView) {
		javaView.appendLocalVarConstructor_0Param(workflowInstantiatorName(),jpLocalVar());
	}
	
	@Override
	public void jpAppendLink(JavaView javaView) {
		javaView.appendMethodInvocationOn_0Param(jpLocalVar(),"link");
	}
	
	@Override
	public void jpAppendBind(JavaView javaView) {
		List<String> dependees = new ArrayList<String>();
		
		for(IwWorkflow plugin : getPlugins()){
			dependees.add(plugin.jpLocalVar());
		}
		javaView.appendMethodInvocationOn_NParams(jpLocalVar(),"bind",dependees);
	}
	
	@Override
	public void jpAppendAddWorkflow(JavaView javaView) {
		javaView.appendMethodInvocationOn_1Param(
			getModel().reactiveWorkflowSystemLocalVar(),
			"addWorkflow",
			jpLocalVar() + "." + workflowMemberName()
		);
	}
	
	@Override
	public String jpLocalVar() {
		return "l_"+ workflowInstantiatorName();
	}
	
	/*********** Iw to Java Instantiator ***********************/
	@Override
	public String jiCustomizedClassSubPackage(){
		return getModel().getName() + ".Steps." + getConcern().getName();
	}
	
	@Override
	public String jiBindMethodParam() {
		return workflowInstantiatorFullyQualifiedName() + " " + jiBindMethod_PluginParamName();
	}
	
	@Override
	public String jiBindMethod_PluginParamName() {
		return "p_"+ getName();
	}
	
	@Override
	public String jiWorkspacePath() {
		//return jiSUBPACKAGE().uriAppend(getConcern().getName()).uriAppend(workflowInstantiatorName());
		
		String path = StringExtensions.uriAppend(jiSUBPACKAGE(), getConcern().getName());
		path = StringExtensions.uriAppend(path, workflowInstantiatorName());
		
		return path;
	}
	
	//*********************************************************
	//jiToWorkflowInstantiator
	//*********************************************************/
	@Override
	public WorkflowInstantiator jiToWorkflowInstantiator() {
		WorkflowInstantiator result = new WorkflowInstantiator(jiWorkspacePath(),jiCustomizedClassSubPackage());
		jiAppendContent(result);
		return result;
	}
	
	@Override
	public void jiAppendContent(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendPackage(jiPackageName());
		jiAppendImports(workflowInstantiator);
		
		workflowInstantiator.appendClass_Pre("public class "+name+"WorkflowInstantiator extends WorkflowInstantiator");
		
		jiAppendBuildStatements(workflowInstantiator);

		jiAppendLinkMethod(workflowInstantiator);
		jiAppendLinkNodesToNextNodesMethod(workflowInstantiator);
		jiAppendLinkNodesToWorkflowMethod(workflowInstantiator);
		jiAppendLinkStartNodesToWorkflowMethod(workflowInstantiator);

		jiAppendBindMethod(workflowInstantiator);
				
		workflowInstantiator.appendClass_Post();
	}
	
	@Override
	public void jiAppendImports(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendImport("ram.reactiveworkflow.*");
		workflowInstantiator.appendImport("ram.workflow.*");
	}
	
	@Override
	public void jiAppendBuildStatements(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendPublicMemberDefaultConstructor("Workflow",workflowMemberName());
		for(IwNode node : getNodes()){
			node.jiAppendBuildStatement(workflowInstantiator);
		}
	}
	
	@Override
	public void jiAppendLinkMethod(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethod_Pre("public void link()");
		workflowInstantiator.appendMethodInvocation_0Param("linkNodesToNextNodes");
		workflowInstantiator.appendMethodInvocation_0Param("linkNodesToWorkflow");
		workflowInstantiator.appendMethodInvocation_0Param("linkStartNodesToWorkflow");
		workflowInstantiator.appendMethod_Post();
	}
	
	@Override
	public void jiAppendLinkNodesToNextNodesMethod(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethod_Pre("public void linkNodesToNextNodes()");
		for(IwNode node : getNodes()){
			node.jiAppendLinkNodesToNextNodesStatement(workflowInstantiator);
		}
		workflowInstantiator.appendMethod_Post();
	}
	
	@Override
	public void jiAppendLinkNodesToWorkflowMethod(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethod_Pre("public void linkNodesToWorkflow()");
		for(IwNode node : getNodes()){
			node.jiAppendLinkNodesToWorkflowStatement(workflowInstantiator);
		}
		workflowInstantiator.appendMethod_Post();
	}
	
	
	@Override
	public void jiAppendLinkStartNodesToWorkflowMethod(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethod_Pre("public void linkStartNodesToWorkflow()");
		for(IwNode node : getNodes()){
			node.jiAppendLinkStartNodesToWorkflowStatement(workflowInstantiator);
		}
		workflowInstantiator.appendMethod_Post();
	}
	
	@Override
	public void jiAppendBindMethod(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendNextLine();
		workflowInstantiator.appendIndent(1,"public void bind(");
		workflowInstantiator.appendWithDelimiter(getPlugins(), ",\n                     ");
		workflowInstantiator.append("){\n");
		
		for(IwStub stub : getStubs()) {
			if(stub.isSynchStub() || stub.isBlockingStub() || stub.isDynamicStub()) {
				for(IwPluginBinding iwPluginBinding : stub.getPluginBindings()) {
					iwPluginBinding.jiAppendBindStatement(workflowInstantiator);
				}
			}
			else {
				stub.getStaticPluginBinding().jiAppendBindStatement(workflowInstantiator);
			}
		}
		workflowInstantiator.appendMethod_Post();
	}
	
	@Override
	public String jiSUBPACKAGE() { 
		return "Instantiators";
	}
	
	@Override
	public String jiWORKFLOW_INSTANTIATOR_BASE_CLASS() { 
		return "WorkflowInstantiator";
	}
	
	@Override
	public String jiPackageName() { 
		return getModel().getName() + "." + jiSUBPACKAGE() + "." + getConcern().getName();
	}
	
	@Override
	public String workflowInstantiatorName() { 
		return getName() + jiWORKFLOW_INSTANTIATOR_BASE_CLASS();
	}
	
	@Override
	public String workflowInstantiatorFullyQualifiedName() {
		return jiPackageName() + "." + workflowInstantiatorName();
	}
	
	@Override
	public String workflowMemberName() {
		return "workflow";
	}
	/*********** Iw to Java Instantiator ***********************/
	
	/*********** Step View Transformation ***********************/
	@Override
	public void appendStepViewPre(StepView stepView) {
		stepView.appendLine("");
		stepView.append("    subgraph "); 
		stepView.append(stepView.dotEscape("cluster_"+name));
		stepView.appendLine("{");
		stepView.append("        label=");
		stepView.append(stepView.dotEscape(name)); 
		if(getIsParentDynStub()) {
			stepView.append("         fontcolor=gray");
		}	
		stepView.appendLine("");
	}
	
	@Override
	public void appendStepViewPost(StepView stepView) {
		stepView.appendLine("    }");
	}
	
	@Override
	public void appendWorkflow_DifferentConcern(StepView stepView) {
		stepView.appendLine("");
		stepView.append("    subgraph ");
		stepView.append(stepView.dotEscape("cluster_"+name));
		stepView.appendLine("{");
		stepView.append("        label=\"");
		stepView.append(stepView.dotEscapeInner(getConcern().getName())+"\\n"+stepView.dotEscapeInner(name)) ;
		stepView.appendLine("\"");
		stepView.appendLine("        style=dashed");
		
		for(IwStartPoint boundStartPoint : boundStartPoints()) {
			boundStartPoint.getTarget().appendVertex_NextStep(stepView);
		}
		for(IwEndPoint boundEndPoint : boundEndPoints()) {
			boundEndPoint.appendVertex_NextStep(stepView);
		}
		enforceBoundStartPointTop_BoundEndPointDown(stepView);
		stepView.appendLine("    }");
	}
	
	@Override
	public void enforceBoundStartPointTop_BoundEndPointDown(StepView stepView) {
		for(IwStartPoint boundStartPoint : boundStartPoints()){
			for(IwEndPoint boundEndPoint : boundEndPoints()) {
				stepView.append("        ");
				stepView.append(stepView.dotEscape(boundStartPoint.getTarget().getId()));
				stepView.append("->");
				stepView.append(stepView.dotEscape(boundEndPoint.getId())); 
				stepView.appendLine("[style=\"invis\"]");
			}
		}	
	}
	
	@Override
	public List<IwStartPoint> boundStartPoints() {
				//result:=startPoints.select{startPoint|startPoint.startPointType=="bound"}.asOrderedSet
		List<IwStartPoint> result = new ArrayList<IwStartPoint>();
		for(IwStartPoint startPoint : getStartPoints()){
			if(startPoint.getStartPointType().equals("bound")) {
				result.add(startPoint);
			}
		}
		return result;
	}
	
	@Override
	public List<IwEndPoint> boundEndPoints() {
				//result:=endPoints.select{endPoint|endPoint.outBindings.size>0}.asOrderedSet
		List<IwEndPoint> result = new ArrayList<IwEndPoint>();
		for(IwEndPoint endPoint : endPoints()){
			if(endPoint.getOutBindings().size()>0) {
				result.add(endPoint);
			}
		}
		return result;
	}
	
	@Override
	public List<IwEndPoint> endPoints() {
		/*result:=OrderedSet<IwEndPoint>.new
		colExtSelectOfType(nodes,result)*/
		List<IwEndPoint> result = new ArrayList<IwEndPoint>();
		for(IwNode node : getNodes()){
			if(node instanceof IwEndPoint) {
				result.add((IwEndPoint)node);
			}
		}
		return result;
	}
	/*****************iw to link steps***********************************************/
	@Override
	public void linkSteps(IwConcern concern) {
		for(IwStartPoint node : getStartPoints()){
			node.linkStep();
		}
	}
	
	@Override
	public IwModel getModel() {
		return getConcern().getModel();
	}

	@Override
	public Set<IwWorkflow> getPlugins() {
		//OrderedSet does not have duplicate
		Set<IwWorkflow> plugins = new LinkedHashSet<IwWorkflow>();
		for(IwStub stub : getStubs()){
			if(stub.isSynchStub() || stub.isBlockingStub() || stub.isDynamicStub()) {
				for(IwWorkflow dynamicPlugin : stub.getDynamicPlugins()) {
					plugins.add(dynamicPlugin);
				}
			} else {
				plugins.add(stub.getStaticPlugin());
			}
		}
		return plugins;
	}
	
	

	@Override
	public Set<IwStub> getStubs() {
		Set<IwStub> stubs = new LinkedHashSet<IwStub>();
		for(IwNode node : this.getNodes()){
			if(node instanceof IwStub){
				stubs.add((IwStub)node);
			}
		}
		return stubs;
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
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<IwNode> nodes;

	/**
	 * The cached value of the '{@link #getStartPoints() <em>Start Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<IwStartPoint> startPoints;

	/**
	 * The default value of the '{@link #getIsParentDynStub() <em>Is Parent Dyn Stub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsParentDynStub()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PARENT_DYN_STUB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsParentDynStub() <em>Is Parent Dyn Stub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsParentDynStub()
	 * @generated
	 * @ordered
	 */
	protected Boolean isParentDynStub = IS_PARENT_DYN_STUB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwWorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_WORKFLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_WORKFLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<IwNode>(IwNode.class, this, IntermediateWorkflowPackage.IW_WORKFLOW__NODES, IntermediateWorkflowPackage.IW_NODE__WORKFLOW);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwStartPoint> getStartPoints() {
		if (startPoints == null) {
			startPoints = new EObjectResolvingEList<IwStartPoint>(IwStartPoint.class, this, IntermediateWorkflowPackage.IW_WORKFLOW__START_POINTS);
		}
		return startPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwConcern getConcern() {
		if (eContainerFeatureID() != IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN) return null;
		return (IwConcern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcern(IwConcern newConcern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConcern, IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcern(IwConcern newConcern) {
		if (newConcern != eInternalContainer() || (eContainerFeatureID() != IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN && newConcern != null)) {
			if (EcoreUtil.isAncestor(this, newConcern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConcern != null)
				msgs = ((InternalEObject)newConcern).eInverseAdd(this, IntermediateWorkflowPackage.IW_CONCERN__WORKFLOWS, IwConcern.class, msgs);
			msgs = basicSetConcern(newConcern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN, newConcern, newConcern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsParentDynStub() {
		return isParentDynStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsParentDynStub(Boolean newIsParentDynStub) {
		Boolean oldIsParentDynStub = isParentDynStub;
		isParentDynStub = newIsParentDynStub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_WORKFLOW__IS_PARENT_DYN_STUB, oldIsParentDynStub, isParentDynStub));
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
			case IntermediateWorkflowPackage.IW_WORKFLOW__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConcern((IwConcern)otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_WORKFLOW__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN:
				return basicSetConcern(null, msgs);
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
			case IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN:
				return eInternalContainer().eInverseRemove(this, IntermediateWorkflowPackage.IW_CONCERN__WORKFLOWS, IwConcern.class, msgs);
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
			case IntermediateWorkflowPackage.IW_WORKFLOW__NAME:
				return getName();
			case IntermediateWorkflowPackage.IW_WORKFLOW__NODES:
				return getNodes();
			case IntermediateWorkflowPackage.IW_WORKFLOW__START_POINTS:
				return getStartPoints();
			case IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN:
				return getConcern();
			case IntermediateWorkflowPackage.IW_WORKFLOW__IS_PARENT_DYN_STUB:
				return getIsParentDynStub();
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
			case IntermediateWorkflowPackage.IW_WORKFLOW__NAME:
				setName((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_WORKFLOW__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends IwNode>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_WORKFLOW__START_POINTS:
				getStartPoints().clear();
				getStartPoints().addAll((Collection<? extends IwStartPoint>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN:
				setConcern((IwConcern)newValue);
				return;
			case IntermediateWorkflowPackage.IW_WORKFLOW__IS_PARENT_DYN_STUB:
				setIsParentDynStub((Boolean)newValue);
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
			case IntermediateWorkflowPackage.IW_WORKFLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_WORKFLOW__NODES:
				getNodes().clear();
				return;
			case IntermediateWorkflowPackage.IW_WORKFLOW__START_POINTS:
				getStartPoints().clear();
				return;
			case IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN:
				setConcern((IwConcern)null);
				return;
			case IntermediateWorkflowPackage.IW_WORKFLOW__IS_PARENT_DYN_STUB:
				setIsParentDynStub(IS_PARENT_DYN_STUB_EDEFAULT);
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
			case IntermediateWorkflowPackage.IW_WORKFLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediateWorkflowPackage.IW_WORKFLOW__NODES:
				return nodes != null && !nodes.isEmpty();
			case IntermediateWorkflowPackage.IW_WORKFLOW__START_POINTS:
				return startPoints != null && !startPoints.isEmpty();
			case IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN:
				return getConcern() != null;
			case IntermediateWorkflowPackage.IW_WORKFLOW__IS_PARENT_DYN_STUB:
				return IS_PARENT_DYN_STUB_EDEFAULT == null ? isParentDynStub != null : !IS_PARENT_DYN_STUB_EDEFAULT.equals(isParentDynStub);
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
		result.append(", isParentDynStub: ");
		result.append(isParentDynStub);
		result.append(')');
		return result.toString();
	}

	@Override
	public void addNode(IwNode node) {
		getNodes().add(node);
	}

	

} //IwWorkflowImpl
