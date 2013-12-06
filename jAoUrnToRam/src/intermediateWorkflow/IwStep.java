/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import iwToRam.RamWorkspace;
import iwToStepView.StepView;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ram.Aspect;
import ram.Class;
import ram.Instantiation;
import ram.MappableElement;
import ram.Mapping;
import ram.Operation;
import ram.StructuralView;
import ram.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwStep#getName <em>Name</em>}</li>
 *   <li>{@link intermediateWorkflow.IwStep#getNodes <em>Nodes</em>}</li>
 *   <li>{@link intermediateWorkflow.IwStep#getConcern <em>Concern</em>}</li>
 *   <li>{@link intermediateWorkflow.IwStep#getOutboundStubs <em>Outbound Stubs</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStep()
 * @model
 * @generated
 */
public interface IwStep extends EObject {
	boolean isEmptyStartupStep(); 
	boolean isNodePartOfEmptyStep(IwNode node);
	IwModel getModel();
	
	void merge(IwStep stepToMerge);
	void mergeName(IwStep stepToMerge);
	void combineNameInAlphabeticalOrder(IwStep stepToMerge);
	String combineName(String name1,String name2);
	void mergeIsStartupStep(IwStep stepToMerge);
	void delete();
	
	void setStartupStep(boolean isStartupStep);
	boolean isStartupStep();
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStep_Name()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwStep#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwNode}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwNode#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStep_Nodes()
	 * @see intermediateWorkflow.IwNode#getStep
	 * @model opposite="step" required="true"
	 * @generated
	 */
	EList<IwNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Concern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwConcern#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern</em>' container reference.
	 * @see #setConcern(IwConcern)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStep_Concern()
	 * @see intermediateWorkflow.IwConcern#getSteps
	 * @model opposite="steps" transient="false"
	 * @generated
	 */
	IwConcern getConcern();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwStep#getConcern <em>Concern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concern</em>' container reference.
	 * @see #getConcern()
	 * @generated
	 */
	void setConcern(IwConcern value);

	/**
	 * Returns the value of the '<em><b>Outbound Stubs</b></em>' reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwStub}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwStub#getOutboundInSteps <em>Outbound In Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Stubs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Stubs</em>' reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStep_OutboundStubs()
	 * @see intermediateWorkflow.IwStub#getOutboundInSteps
	 * @model opposite="outboundInSteps"
	 * @generated
	 */
	EList<IwStub> getOutboundStubs();
	StepView toStepView(String imgFolderWindowsPath);
	void appendStepViewPre(StepView stepView);
	void appendStepViewPost(StepView stepView);
	void appendWorkflows(StepView stepView);
	void appendWorkflowNodes(StepView stepView, Set<IwNode> workflowNodes);
	void appendNodeAfterStartPointFirstThenOtherNodes(StepView stepView,
			Set<IwNode> workflowNodes);
	Set<IwNode> getNodeAfterStartPoints(StepView stepView,
			Set<IwNode> workflowNodes);
	void appendBindings(StepView stepView);
	List<IwWorkflow> pluginsFromDifferentConcern();
	List<IwStub> inBoundStubs();
	Hashtable<IwWorkflow, Set<IwNode>> nodesPerWorkflow();
	void buildNodesPerWorkflowOnDemand();
	void addToNodeSetPerWorkflow(IwNode node);
	
	/***********iw to ram**********/
	Aspect getRamAspect();
	void setRamAspect(Aspect ramAspect);
	void setRamCustomizableNodeMapping(Mapping ramCustomizableNodeMapping);
	Mapping getRamCustomizableNodeMapping();
	void setRamCustomizableNodeClasses(
			Hashtable<String, Class> ramCustomizableNodeClasses);
	Hashtable<String, Class> getRamCustomizableNodeClasses();
	void setRamRVoid(Type ramRVoid);
	Type getRamRVoid();
	void setRamLocalContextClass(Class ramLocalContextClass);
	Class getRamLocalContextClass();
	Mapping getRamCustomizableInputDataMapping();
	void setRamExecuteOperationMapping(Mapping ramExecuteOperationMapping);
	Mapping getRamExecuteOperationMapping();
	void setRamWorkflowInstantiation(Instantiation ramWorkflowInstantiation);
	Instantiation getRamWorkflowInstantiation();
	void setRamOutputInstantiation(Instantiation ramOutputInstantiation);
	Instantiation getRamOutputInstantiation();
	void setRamInputInstantiation(Instantiation ramInputInstantiation);
	Instantiation getRamInputInstantiation();
	void setRamCustomizableOutputDataMapping(
			Mapping ramCustomizableOutputDataMapping);
	Mapping getRamCustomizableOutputDataMapping();
	void setRamCustomizableInputDataMapping(
			Mapping ramCustomizableInputDataMapping);
	StructuralView ramStructuralView();
	List<IwCustomizableNode> customizableNodes();
	void buildCustomizableNodeClasses();
	void buildMappings();
	Instantiation createInstantiation_Extends();
	void buildInstantiations();
	void buildRamAspect();
	void build();
	Mapping mapExternalClass(Class ramClass, Class externalRamClass,
			Instantiation instantiation);
	boolean hasAtLeastOneOutputClass();
	boolean hasAtLeastOneInputClass();
	void linkMapping(Mapping mapping, MappableElement fromElement,
			Instantiation instantiation);
	void linkInstantiation(Instantiation instantiation, Aspect externalAspect);
	void linkOutputInstantiation(RamWorkspace ramWorkspace);
	void linkInputInstantiation(RamWorkspace ramWorkspace);
	void linkWorkflowInstantiation(RamWorkspace ramWorkspace);
	void linkInstantiations(RamWorkspace ramWorkspace);
	boolean isEmtpyStepClassDiagram();
	void addAspectToRamWorkspace(RamWorkspace ramWorkspace);
	void linkCustomizableNodeClasses();
	void link(RamWorkspace ramWorkspace);
	void linkClassToClassDiagram(Class ramClass);
	void linkExecuteOperation(Operation executeOperation);
	void linkCustomizableNode(Class customizableNode);
	void linkOutputData(Class outputData);
	void linkInputData(Class inputData);
	

} // IwStep
