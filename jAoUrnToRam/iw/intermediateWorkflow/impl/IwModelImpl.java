/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwConcern;
import intermediateWorkflow.IwModel;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwStep;
import intermediateWorkflow.IwWorkflow;
import iwToJavaInstantiator.JavaView;
import iwToJavaInstantiator.WorkflowInstantiator;
import iwToRam.RamWorkspace;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwModelImpl#getConcerns <em>Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwModelImpl extends EObjectImpl implements IwModel {
	
	/************iw to ram***********/
	@Override
	public void toStepClassDiagram(RamWorkspace ramWorkspace) {
		build();
		link(ramWorkspace);
	}
	
	@Override
	public void build() {
		//concerns.each{concern|concern.build}
		for(IwConcern concern : getConcerns()){
			concern.build();
		}
	}
	
	@Override
	public void link(RamWorkspace ramWorkspace) {
		//concerns.each{concern|concern.link(ramWorkspace)}
		for(IwConcern concern : getConcerns()){
			concern.link(ramWorkspace);
		}
	}
	/*******************************/
	
	@Override
	public List<StepView> toStepView(String imgFolderWindowsPath) {
		/*result:=OrderedSet<StepView>.new
		concerns.each{concern|
			concern.steps.each{step|
				result.add(step.toStepView(imgFolderWindowsPath))
			}
		}*/
		
		List<StepView> result = new ArrayList<StepView>();
		for(IwConcern concern : getConcerns()){
			for(IwStep step : concern.getSteps()){
				result.add(step.toStepView(imgFolderWindowsPath));
			}
		}
		return result;
	}
	
	public void linkSteps() {
		for(IwConcern concern : getConcerns()){
			concern.linkSteps();
		}
	}
	
	@Override
	public void insertInputProcessingNodes() {
		for(int i=0; i< getConcerns().size(); i++){
			IwConcern concern = getConcerns().get(i);
			
			List<IwWorkflow> workflows = concern.getWorkflows();
			for(int j=0; j<workflows.size();j++) {
				IwWorkflow workflow = workflows.get(j);
				
				List<IwNode> nodes = workflow.getNodes();
				for(int k=0; k<nodes.size(); k++){
					IwNode node = nodes.get(k);
					node.insertInputProcessingNode();
				}
			}
		}
	}

	@Override
	public Set<IwWorkflow> getWorkflows() {
		Set<IwWorkflow> result = new LinkedHashSet<IwWorkflow>();
		
		for(IwConcern concern : getConcerns()){
			List<IwWorkflow> worflows = concern.getWorkflows();
			for(IwWorkflow workflow : worflows) {
				result.add(workflow);
			}
		}
		return result;
	}

	
	/**********iw to java ***************/
	@Override
	public Set<WorkflowInstantiator> jiToJavaInstantiator() {
		/*result:=OrderedSet<WorkflowInstantiator>.new
		workflows.each{workflow|result.add(workflow.jiToWorkflowInstantiator)}*/
		
		Set<WorkflowInstantiator> result = new LinkedHashSet<WorkflowInstantiator>();
		for(IwWorkflow workflow : getWorkflows()){
			result.add(workflow.jiToWorkflowInstantiator());
		}
		return result;
	}
	
	/**********iw to java program ***************/
	@Override
	public JavaView jpToJavaProgram() {
		JavaView result = new JavaView("Program");
		jpAppendContent(result);
		return result;
	};
	
	@Override
	public void jpAppendContent(JavaView javaView) {
		javaView.appendPackage(name);
		jpAppendImports(javaView);
		
		javaView.appendClass_Pre("public class Program");
		jpAppendMainMethod(javaView);
		javaView.appendClass_Post();
	}
	
	@Override
	public void jpAppendImports(JavaView javaView) {
		javaView.appendImport("ram.reactiveworkflow.ReactiveWorkflowSystem");
		//workflows.each{workflow|workflow.jpAppendImport(javaView)}
		for(IwWorkflow workflow : getWorkflows()){
			workflow.jpAppendImport(javaView);
		}
	}
	
	@Override
	public void jpAppendMainMethod(JavaView javaView) {
		javaView.appendMethod_Pre("public static void main(String[] args)");
		javaView.appendLocalVarConstructor_0Param(reactiveWorkflowSystemType(),reactiveWorkflowSystemLocalVar());
		javaView.appendNextLine();
		//workflows.each{workflow|workflow.jpAppendBuild(javaView)}
		for(IwWorkflow workflow : getWorkflows()){
			workflow.jpAppendBuild(javaView);
		}
		jpAppendLinkAndBind(javaView);
		javaView.appendNextLine();
		javaView.appendMethodInvocationOn_0Param(reactiveWorkflowSystemLocalVar(),"start");
		javaView.appendMethod_Post();
	}
	
	@Override
	public void jpAppendLinkAndBind(JavaView javaView) {
		/*workflows.each{workflow|
			javaView.appendNextLine
			workflow.jpAppendLink(javaView)
			workflow.jpAppendBind(javaView)
			workflow.jpAppendAddWorkflow(javaView)
		}*/
		
		for(IwWorkflow workflow : getWorkflows()){
			javaView.appendNextLine();
			workflow.jpAppendLink(javaView);
			workflow.jpAppendBind(javaView);
			workflow.jpAppendAddWorkflow(javaView);
		}
	}
	
	@Override
	public String reactiveWorkflowSystemLocalVar() {
		return "reactiveWorkflowSystem";
	}
	
	@Override
	public String reactiveWorkflowSystemType() { 
		return "ReactiveWorkflowSystem";
	}
	/*****************************************************************/
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
	 * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<IwConcern> concerns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwConcern> getConcerns() {
		if (concerns == null) {
			concerns = new EObjectContainmentWithInverseEList<IwConcern>(IwConcern.class, this, IntermediateWorkflowPackage.IW_MODEL__CONCERNS, IntermediateWorkflowPackage.IW_CONCERN__MODEL);
		}
		return concerns;
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
			case IntermediateWorkflowPackage.IW_MODEL__CONCERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcerns()).basicAdd(otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_MODEL__CONCERNS:
				return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_MODEL__NAME:
				return getName();
			case IntermediateWorkflowPackage.IW_MODEL__CONCERNS:
				return getConcerns();
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
			case IntermediateWorkflowPackage.IW_MODEL__NAME:
				setName((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_MODEL__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends IwConcern>)newValue);
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
			case IntermediateWorkflowPackage.IW_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_MODEL__CONCERNS:
				getConcerns().clear();
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
			case IntermediateWorkflowPackage.IW_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediateWorkflowPackage.IW_MODEL__CONCERNS:
				return concerns != null && !concerns.isEmpty();
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

	
	
} //IwModelImpl
