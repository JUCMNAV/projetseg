/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwConcern;
import intermediateWorkflow.IwCustomizableNode;
import intermediateWorkflow.IwInput;
import intermediateWorkflow.IwModel;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwOutput;
import intermediateWorkflow.IwStartPoint;
import intermediateWorkflow.IwStep;
import intermediateWorkflow.IwStub;
import intermediateWorkflow.IwWorkflow;
import iwToRam.RamWorkspace;
import iwToStepView.StepView;

import jAoUrnToRam.util.StringExtensions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.Aspect;
import ram.Classifier;
import ram.ClassifierMapping;
import ram.Instantiation;
import ram.InstantiationType;
import ram.MappableElement;
import ram.Mapping;
import ram.Operation;
import ram.OperationMapping;
import ram.Parameter;
import ram.RamFactory;
import ram.StructuralView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwStepImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwStepImpl#getConcern <em>Concern</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwStepImpl#getOutboundStubs <em>Outbound Stubs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwStepImpl extends EObjectImpl implements IwStep {
	
	/*private Mapping ramCustomizableNodeMapping;
	private Mapping ramExecuteOperationMapping;
	private Mapping ramCustomizableInputDataMapping;
	private Mapping ramCustomizableOutputDataMapping;*/
	
	/*private ClassifierMapping ramCustomizableNodeMapping;
	private OperationMapping ramExecuteOperationMapping;
	private ClassifierMapping ramCustomizableInputDataMapping;
	private ClassifierMapping ramCustomizableOutputDataMapping;*/
	
	private List<ClassifierMapping> ramCustomizableNodeMappings;
	private List<OperationMapping> ramExecuteOperationMappings;
	private List<ClassifierMapping> ramCustomizableInputDataMappings;
	private List<ClassifierMapping> ramCustomizableOutputDataMappings;
	
	/*@Override
	public void setRamCustomizableNodeMapping( ClassifierMapping ramCustomizableNodeMapping) {
		this.ramCustomizableNodeMapping = ramCustomizableNodeMapping;
	}
	
	@Override
	public void setRamCustomizableInputDataMapping(
			ClassifierMapping ramCustomizableInputDataMapping) {
		this.ramCustomizableInputDataMapping = ramCustomizableInputDataMapping;
	}
	@Override
	public void setRamCustomizableOutputDataMapping(
			ClassifierMapping ramCustomizableOutputDataMapping) {
		this.ramCustomizableOutputDataMapping = ramCustomizableOutputDataMapping;
	}
	@Override
	public void setRamExecuteOperationMapping( OperationMapping ramExecuteOperationMapping) {
		this.ramExecuteOperationMapping = ramExecuteOperationMapping;
	}*/
	/*********************************************************
	Add Ram Class API
	*********************************************************/
	@Override
	public void linkClassToClassDiagram(ram.Class ramClass) {
		//ramStructuralView.classes.add(ramClass)
		ramStructuralView().getClasses().add(ramClass);
	}
	
	@Override
	public void linkInputData(ram.Class inputData) {
		/*linkClassToClassDiagram(inputData)
		ramCustomizableInputDataMapping.toElements.add(inputData)*/
		
		linkClassToClassDiagram(inputData);
		//ramCustomizableInputDataMapping.getToElements().add(inputData);
		
		//ramCustomizableInputDataMapping.setToElement(inputData);
		
		ClassifierMapping cm = RamFactory.eINSTANCE.createClassifierMapping();
		cm.setToElement(inputData);
		ramCustomizableInputDataMappings.add(cm);
	}
	
	@Override
	public void linkOutputData(ram.Class outputData) {
		linkClassToClassDiagram(outputData);
		//ramCustomizableOutputDataMapping.getToElements().add(outputData);
		
		//ramCustomizableOutputDataMapping.setToElement(outputData);
		
		ClassifierMapping cm = RamFactory.eINSTANCE.createClassifierMapping();
		cm.setToElement(outputData);
		ramCustomizableOutputDataMappings.add(cm);
	}
	
	@Override
	public void linkCustomizableNode(ram.Class customizableNode) {
		/*linkClassToClassDiagram(customizableNode)
		ramCustomizableNodeMapping.toElements.add(customizableNode)
		
		linkExecuteOperation(colExtSingle(customizableNode.operations))*/
		
		linkClassToClassDiagram(customizableNode);
		//ramCustomizableNodeMapping.getToElements().add(customizableNode);
		
		//ramCustomizableNodeMapping.setToElement(customizableNode);
		ClassifierMapping cm = RamFactory.eINSTANCE.createClassifierMapping();
		cm.setToElement(customizableNode);
		ramCustomizableNodeMappings.add(cm);
		
		Operation executeOperation = customizableNode.getOperations().get(0);
		OperationMapping om = RamFactory.eINSTANCE.createOperationMapping();
		om.setToElement(executeOperation);
		ramExecuteOperationMappings.add(om);
		
		executeOperation.setReturnType(ramRVoid);
		
		cm.getOperationMappings().add(om);
		
		Parameter cParam = executeOperation.getParameters().get(0);
		cParam.setType(ramLocalContextClass);
		
		//linkExecuteOperation(customizableNode.getOperations().get(0));
	}
	
	@Override
	public void linkExecuteOperation(Operation executeOperation) {
		/*ramExecuteOperationMapping.toElements.add(executeOperation)
		executeOperation.returnType:=ramRVoid

		var cParam:Parameter init colExtSingle(executeOperation.parameters)
		cParam.type:=ramLocalContextClass*/
		
		//ramExecuteOperationMapping.getToElements().add(executeOperation);
		//ramExecuteOperationMapping.setToElement(executeOperation);
		
		OperationMapping om = RamFactory.eINSTANCE.createOperationMapping();
		om.setToElement(executeOperation);
		ramExecuteOperationMappings.add(om);
		
		executeOperation.setReturnType(ramRVoid);
		
		Parameter cParam = executeOperation.getParameters().get(0);
		cParam.setType(ramLocalContextClass);
	}
	
	/*@Override
	public void linkMapping(Mapping mapping, MappableElement fromElement, Instantiation instantiation) {
		/*mapping.fromElement:=fromElement
		instantiation.mappings.add(mapping)*/
		
		/*mapping.setFromElement(fromElement);
		instantiation.getMappings().add(mapping);
	}*/
	
	@Override
	public void linkMapping(ClassifierMapping mapping, Classifier fromElement, Instantiation instantiation) {
		/*mapping.fromElement:=fromElement
		instantiation.mappings.add(mapping)*/
		
		mapping.setFromElement(fromElement);
		instantiation.getMappings().add(mapping);
	}
	
	@Override
	public void linkOperationMapping(OperationMapping mapping, Operation fromElement, Instantiation instantiation) {
		/*mapping.fromElement:=fromElement
		instantiation.mappings.add(mapping)*/
		
		mapping.setFromElement(fromElement);
		
		//instantiation.getMappings().get(0).getOperationMappings().add(mapping);
		//instantiation.getMappings().add(mapping);
	}
	
	
	@Override
	public Mapping mapExternalClass(ram.Class ramClass, ram.Class externalRamClass, Instantiation instantiation) {
		/*result:=Mapping.new
		result.fromElement:=externalRamClass
		result.toElements.add(ramClass)
		instantiation.mappings.add(result)*/
		
		/*Mapping mapping = RamFactory.eINSTANCE.createMapping();
		mapping.setFromElement(externalRamClass);
		System.out.println(mapping.getToElements().size());
		mapping.getToElements().add(ramClass);
		System.out.println(mapping.getToElements().size());
		instantiation.getMappings().add(mapping);
		
		return mapping;*/
		return null;
	}
	
	
	/*********** iw to ram ***********************/
	private RamFactory ramFactory;
	private Aspect ramAspect;
	private ram.Class ramLocalContextClass;
	private ram.Type ramRVoid;
	private Hashtable<String,ram.Class> ramCustomizableNodeClasses;
	
	private Instantiation ramInputInstantiation;
	private Instantiation ramOutputInstantiation;
	private Instantiation ramWorkflowInstantiation;
	
	@Override
	public Aspect getRamAspect() {
		return ramAspect;
	}
	@Override
	public void setRamAspect(Aspect ramAspect) {
		this.ramAspect = ramAspect;
	}
	@Override
	public ram.Class getRamLocalContextClass() {
		return ramLocalContextClass;
	}
	@Override
	public void setRamLocalContextClass(ram.Class ramLocalContextClass) {
		this.ramLocalContextClass = ramLocalContextClass;
	}
	@Override
	public ram.Type getRamRVoid() {
		return ramRVoid;
	}
	@Override
	public void setRamRVoid(ram.Type ramRVoid) {
		this.ramRVoid = ramRVoid;
	}
	@Override
	public Hashtable<String, ram.Class> getRamCustomizableNodeClasses() {
		return ramCustomizableNodeClasses;
	}
	@Override
	public void setRamCustomizableNodeClasses(
			Hashtable<String, ram.Class> ramCustomizableNodeClasses) {
		this.ramCustomizableNodeClasses = ramCustomizableNodeClasses;
	}
	/*@Override
	public Mapping getRamCustomizableNodeMapping() {
		return ramCustomizableNodeMapping;
	}
	
	@Override
	public Mapping getRamCustomizableInputDataMapping() {
		return ramCustomizableInputDataMapping;
	}
	
	@Override
	public Mapping getRamCustomizableOutputDataMapping() {
		return ramCustomizableOutputDataMapping;
	}*/
	
	@Override
	public Instantiation getRamInputInstantiation() {
		return ramInputInstantiation;
	}
	@Override
	public void setRamInputInstantiation(Instantiation ramInputInstantiation) {
		this.ramInputInstantiation = ramInputInstantiation;
	}
	@Override
	public Instantiation getRamOutputInstantiation() {
		return ramOutputInstantiation;
	}
	@Override
	public void setRamOutputInstantiation(Instantiation ramOutputInstantiation) {
		this.ramOutputInstantiation = ramOutputInstantiation;
	}
	@Override
	public Instantiation getRamWorkflowInstantiation() {
		return ramWorkflowInstantiation;
	}
	@Override
	public void setRamWorkflowInstantiation(Instantiation ramWorkflowInstantiation) {
		this.ramWorkflowInstantiation = ramWorkflowInstantiation;
	}
	/*@Override
	public Mapping getRamExecuteOperationMapping() {
		return ramExecuteOperationMapping;
	}*/
	

	@Override
	public  StructuralView ramStructuralView() {
		return ramAspect.getStructuralView();
	}
	
	@Override
	public List<IwCustomizableNode> customizableNodes() {
		//result:=OrderedSet<IwCustomizableNode>.new
		//colExtSelectOfType(nodes,result)
		
		List<IwCustomizableNode> nodes = new ArrayList<IwCustomizableNode>();
		for(IwNode node : getNodes()){
			if(node instanceof IwCustomizableNode){
				nodes.add((IwCustomizableNode)node);
			}
		}
		return nodes;
	}
	
	@Override
	public void build() {
		/*buildRamAspect
		buildInstantiations
		buildMappings
		buildCustomizableNodeClasses
		ramLocalContextClass:=createRamClass("LocalContext")
		ramRVoid:=createRVoid
		nodes.each{node|node.build}*/
		ramFactory = RamFactory.eINSTANCE; //init ram factory

		buildRamAspect();
		buildInstantiations();
		buildMappings();
		buildCustomizableNodeClasses();
		ramLocalContextClass = ramFactory.createRamClass("LocalContext");
		//ramRVoid = ramFactory.createRVoidWname();
		ramRVoid = ramFactory.createRVoid();
		
		for(IwNode node : getNodes()){
			node.build();
		}
	}
	
	@Override
	public void buildRamAspect() {
		ramAspect = RamFactory.eINSTANCE.createAspect();
		ramAspect.setName(name);
		ramAspect.setStructuralView(RamFactory.eINSTANCE.createStructuralView());
	}
	
	@Override
	public void buildInstantiations() {
		ramInputInstantiation = createInstantiation_Extends();
		ramOutputInstantiation = createInstantiation_Extends();
		ramWorkflowInstantiation = createInstantiation_Extends();
	}
	
	@Override
	public Instantiation createInstantiation_Extends() {
		//result:=Instantiation.new
		//result.type:=InstantiationType.Extends
		
		Instantiation instntn = RamFactory.eINSTANCE.createInstantiation();
		instntn.setType(InstantiationType.EXTENDS);
		
		return instntn;
	}
	
	@Override
	public void buildMappings() {
		/*ramCustomizableNodeMapping:=Mapping.new
		ramExecuteOperationMapping:=Mapping.new
		ramCustomizableInputDataMapping:=Mapping.new
		ramCustomizableOutputDataMapping:=Mapping.new*/
		
		/*ramCustomizableNodeMapping = RamFactory.eINSTANCE.createClassifierMapping(); //RamFactory.eINSTANCE.createMapping()
		ramExecuteOperationMapping =  RamFactory.eINSTANCE.createOperationMapping(); //RamFactory.eINSTANCE.createMapping()
		ramCustomizableInputDataMapping = RamFactory.eINSTANCE.createClassifierMapping(); //RamFactory.eINSTANCE.createMapping()
		ramCustomizableOutputDataMapping = RamFactory.eINSTANCE.createClassifierMapping(); //RamFactory.eINSTANCE.createMapping()*/
		
		ramCustomizableNodeMappings = new ArrayList<ClassifierMapping>();
		ramExecuteOperationMappings = new ArrayList<OperationMapping>();
		ramCustomizableInputDataMappings = new ArrayList<ClassifierMapping>();
		ramCustomizableOutputDataMappings = new ArrayList<ClassifierMapping>();
	}	
		
	@Override //For rational see @RamCustomizableNodeClassBuildByIwStep  
	public void buildCustomizableNodeClasses() {
			/*ramCustomizableNodeClasses:=Hashtable<String,Class>.new
			customizableNodes.each{customizableNode|
				if(ramCustomizableNodeClasses.containsKey(customizableNode.name)==false) then
					ramCustomizableNodeClasses.put(customizableNode.name,createRamCustomizableNodeClass(customizableNode.name))
				end
			}*/
		ramCustomizableNodeClasses = new Hashtable<String,ram.Class>();
		for(IwCustomizableNode customizableNode : customizableNodes()){
			if(ramCustomizableNodeClasses.containsKey(customizableNode.getName()) == false){
				ramCustomizableNodeClasses.put(customizableNode.getName(),
						ramFactory.createRamCustomizableNodeClass(customizableNode.getName()));
			}
		}
	}
	
	/*********************************************************
	Link
	*********************************************************/
	@Override
	public void link(RamWorkspace ramWorkspace) {
		linkClassToClassDiagram(ramLocalContextClass);
		ramStructuralView().getTypes().add(ramRVoid);
		linkCustomizableNodeClasses();
		
		for(IwNode node: getNodes()){
			node.link();	//nodes.each{node|node.link}
		}
		linkInstantiations(ramWorkspace);
		addAspectToRamWorkspace(ramWorkspace);
	}
	
	@Override 
	public void linkCustomizableNodeClasses() {
		/*ramCustomizableNodeClasses.values.each{ramClass|
			linkCustomizableNode(ramClass)
		}*/
		
		for(ram.Class ramClass : ramCustomizableNodeClasses.values()){
			linkCustomizableNode(ramClass);
		}
	}
	
	@Override
	public void addAspectToRamWorkspace(RamWorkspace ramWorkspace) {
		//Filter out empty aspect
		/*if(isEmtpyStepClassDiagram==false) then
			var workspacePath:String init "Steps".uriAppend(concern.name).uriAppend(name)
			ramWorkspace.aspectPerWorkspacePath.put(workspacePath,ramAspect) 
		end*/
		
		if(isEmtpyStepClassDiagram()==false) {
			//var workspacePath:String init "Steps".uriAppend(concern.name).uriAppend(name)
			//ramWorkspace.aspectPerWorkspacePath.put(workspacePath,ramAspect) 
			
			String workspacePath = StringExtensions.uriAppend("Steps", getConcern().getName());
			
			workspacePath = StringExtensions.uriAppend(workspacePath, getName());
			
			//System.out.println(workspacePath);
			ramWorkspace.getAspectPerWorkspacePath().put(workspacePath,ramAspect); 
		}
	}
	
	@Override
	public boolean isEmtpyStepClassDiagram() {
		// by default a LocalContext class is generated all the time; at least one other class needs to exist
		//result:=ramStructuralView.classes.size==1
		
		boolean isEmpty = ramStructuralView().getClasses().size() == 1; 
		return isEmpty;
	}
	
	@Override
	public void linkInstantiations(RamWorkspace ramWorkspace) {
		/*linkWorkflowInstantiation(ramWorkspace)
		linkInputInstantiation(ramWorkspace)
		linkOutputInstantiation(ramWorkspace)*/
		
		linkWorkflowInstantiation(ramWorkspace);
		linkInputInstantiation(ramWorkspace);
		linkOutputInstantiation(ramWorkspace);
	}
	
	@Override
	public void linkWorkflowInstantiation(RamWorkspace ramWorkspace) {
		/*linkInstantiation(ramWorkflowInstantiation,ramWorkspace.workflow)
		linkMapping(
			ramCustomizableNodeMapping,
			ramWorkspace.customizableNode,
			ramWorkflowInstantiation
		)
		linkMapping(
			ramExecuteOperationMapping,
			ramWorkspace.executeOperation,
			ramWorkflowInstantiation
		)*/
		
		linkInstantiation(ramWorkflowInstantiation, 
				ramWorkspace.getWorkflow());
		
		/*linkMapping(ramCustomizableNodeMapping, 
				ramWorkspace.getCustomizableNode(), 
				ramWorkflowInstantiation);*/
		
		for(ClassifierMapping ramCustomizableNodeMapping : ramCustomizableNodeMappings) {
			linkMapping(ramCustomizableNodeMapping, 
					ramWorkspace.getCustomizableNode(), 
					ramWorkflowInstantiation);
		}
		
		/*linkMapping(ramExecuteOperationMapping, 
				ramWorkspace.getExecuteOperation(), 
				ramWorkflowInstantiation);*/
		
		/*linkOperationMapping(ramExecuteOperationMapping, 
				ramWorkspace.getExecuteOperation(), 
				ramWorkflowInstantiation);*/
		for(OperationMapping ramExecuteOperationMapping : ramExecuteOperationMappings) {
			linkOperationMapping(ramExecuteOperationMapping, 
					ramWorkspace.getExecuteOperation(), 
					ramWorkflowInstantiation);
		}
	}
	
	@Override
	public void linkInputInstantiation(RamWorkspace ramWorkspace) {
		/*if(hasAtLeastOneInputClass) then
			linkInstantiation(ramInputInstantiation,ramWorkspace.inputAspect)
			linkMapping(
				ramCustomizableInputDataMapping,
				ramWorkspace.customizableInputData,
				ramInputInstantiation
			)
		end*/
		if(hasAtLeastOneInputClass()){
			linkInstantiation(ramInputInstantiation,ramWorkspace.getInputAspect());
			/*linkMapping(ramCustomizableInputDataMapping,
					ramWorkspace.getCustomizableInputData(),
					ramInputInstantiation);*/
			for(ClassifierMapping ramCustomizableInputDataMapping : ramCustomizableInputDataMappings){
				linkMapping(ramCustomizableInputDataMapping,
						ramWorkspace.getCustomizableInputData(),
						ramInputInstantiation);
			}
		}
	}
	
	@Override
	public void linkOutputInstantiation(RamWorkspace ramWorkspace){
		/*
		 * if(hasAtLeastOneOutputClass) then
			linkInstantiation(ramOutputInstantiation,ramWorkspace.outputAspect)
			linkMapping(
				ramCustomizableOutputDataMapping,
				ramWorkspace.customizableOutputData,
				ramOutputInstantiation
			)
		end
		 */
		if(hasAtLeastOneOutputClass()){
			linkInstantiation(ramOutputInstantiation,ramWorkspace.getOutputAspect());
			/*linkMapping(ramCustomizableOutputDataMapping,
					ramWorkspace.getCustomizableOutputData(),
					ramOutputInstantiation);*/
			
			for(ClassifierMapping ramCustomizableOutputDataMapping : ramCustomizableOutputDataMappings){
				linkMapping(ramCustomizableOutputDataMapping,
						ramWorkspace.getCustomizableOutputData(),
						ramOutputInstantiation);
			}
		}
	}
	
	
	@Override
	public void linkInstantiation(Instantiation instantiation, Aspect externalAspect) {
		/*instantiation.externalAspect:=externalAspect
		ramAspect.instantiations.add(instantiation)*/
		
		instantiation.setExternalAspect(externalAspect);
		ramAspect.getInstantiations().add(instantiation);
	}
	
	
	
	@Override
	public boolean hasAtLeastOneInputClass() {
		//result:=nodes.exists{node|node.isInstanceOf(IwInput)}
		
		for(IwNode node : getNodes()){
			if(node instanceof IwInput) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean hasAtLeastOneOutputClass() {
		//result:=nodes.exists{node|node.isInstanceOf(IwOutput)}
		
		for(IwNode node : getNodes()){
			if(node instanceof IwOutput){
				return true;
			}
		}
		return false;
	}
	
	
	/*********** Step View Transformation ***********************/
	private Hashtable<IwWorkflow,Set<IwNode>> _nodesPerWorkflow;
	
	@Override
	public StepView toStepView(String imgFolderWindowsPath){
		StepView result = new StepView();
		result.setImgFolderWindowsPath(imgFolderWindowsPath);
		result.setStep(this);
		
		//result.workspacePath("Steps".uriAppend(concern.name).uriAppend(name));
		String uri = jAoUrnToRam.util.StringExtensions.uriAppend("Steps", getConcern().getName());
		uri = jAoUrnToRam.util.StringExtensions.uriAppend(uri, getName());
		
		result.setWorkspacePath(uri);
		result.setDot(new StringBuffer());
		
		appendStepViewPre(result);
		appendWorkflows(result);
		appendBindings(result);
		appendStepViewPost(result);
		
		return result; 
	}
	
	@Override
	public void appendStepViewPre(StepView stepView) {
		stepView.append("digraph ");
		stepView.append(stepView.dotEscape(name));
		stepView.appendLine("{");
		stepView.appendLine("    rankdir=TD;");
		stepView.appendLine("    node[");
		stepView.appendLine("        shape=box,");
		stepView.appendLine("        width=0.1,");
		stepView.appendLine("        height=.45,");
		stepView.appendLine("        fontsize=12");
		stepView.appendLine("    ];");
	}
	
	@Override
	public void appendStepViewPost(StepView stepView) {
		stepView.appendLine("}");
	}
	
	@Override
	public void appendWorkflows(StepView stepView) {
		for(IwWorkflow workflow : nodesPerWorkflow().keySet()){
			workflow.appendStepViewPre(stepView);
			appendWorkflowNodes(stepView,nodesPerWorkflow().get(workflow));
			workflow.appendStepViewPost(stepView);
		}
	}
	
	@Override
	public void appendWorkflowNodes(StepView stepView, Set<IwNode> workflowNodes) {
		appendNodeAfterStartPointFirstThenOtherNodes(stepView,workflowNodes);
		
		for(IwNode node : workflowNodes){
			node.appendFirstVerticesFromNextStep(stepView);
		}
		for(IwNode node : workflowNodes){
			node.appendEdges(stepView);
		}
	}
	
	@Override
	public void appendNodeAfterStartPointFirstThenOtherNodes(StepView stepView, Set<IwNode> workflowNodes) {
		Set<IwNode> nodesAfterStartPoints = getNodeAfterStartPoints(stepView,workflowNodes);
		//First startNodes to enforce startNodes to be on top in case of cycle
		for(IwNode node : nodesAfterStartPoints){
			node.appendVertex(stepView);
		}
		//Then, all other nodes
		//workflowNodes.select{node|nodesAfterStartPoints.contains(node)==false}					
		// .each{node|node.appendVertex(stepView)} 
		List<IwNode> nodes = new ArrayList<IwNode>();
		for(IwNode node : workflowNodes) {
			if(nodesAfterStartPoints.contains(node)==false)
				nodes.add(node);
		}
		for(IwNode node : nodes){
			node.appendVertex(stepView);
		}
	}
	
	@Override
	public Set<IwNode> getNodeAfterStartPoints(StepView stepView, Set<IwNode> workflowNodes) {
		Set<IwNode> result = new LinkedHashSet<IwNode>();
		
		List<IwStartPoint> startPoints = new ArrayList<IwStartPoint>();
		for(IwNode node : workflowNodes){
			if(node instanceof IwStartPoint) {
				startPoints.add((IwStartPoint)node);
			}
		}
		for(IwStartPoint startPoint : startPoints){
			IwNode nodeAfterStartPoint = startPoint.getSuccs().get(0).getTarget(); 
			if(nodeAfterStartPoint.isFromCurrentStep(stepView)){
				result.add(nodeAfterStartPoint);
			}
		}
		return result;
	}
	
	@Override
	public void appendBindings(StepView stepView) {
		for(IwNode node : getNodes()){
			node.appendBindings(stepView);
		}
		stepView.appendStubFromOtherConcerPlaceholder();
		
		for(IwWorkflow plugin : pluginsFromDifferentConcern()){
			plugin.appendWorkflow_DifferentConcern(stepView);
		}
		
		for(IwStub inBoundStub : inBoundStubs()) {
			inBoundStub.appendAccrosConcernBindings(stepView);
		}
	}
	
	@Override
	public List<IwWorkflow> pluginsFromDifferentConcern() {
		List<IwWorkflow> result = new ArrayList<IwWorkflow>();
		for(IwStub inBoundStub : inBoundStubs()){
			if(inBoundStub.isExplicitlyBoundAccrosConcerns()){
				result.add(inBoundStub.getStaticPlugin());
			}
		}
		return result;
	}
	
	@Override
	public List<IwStub> inBoundStubs() {
		List<IwStub> stubs = new ArrayList<IwStub>();
		for(IwNode node : getNodes()){
			if(node instanceof IwStub){
				stubs.add((IwStub)node);
			}
		}
		return stubs;
	}
	
	@Override
	public Hashtable<IwWorkflow,Set<IwNode>> nodesPerWorkflow() {
		buildNodesPerWorkflowOnDemand();
		return _nodesPerWorkflow;
	}
	
	@Override
	public void buildNodesPerWorkflowOnDemand() {
		if(_nodesPerWorkflow == null) {
			_nodesPerWorkflow = new Hashtable<IwWorkflow, Set<IwNode>>();
			for(IwNode node : getNodes()){
				addToNodeSetPerWorkflow(node);
			}
			//Node cannot be added twice to an OrderedSet
			for(IwStub outboundStub : getOutboundStubs()) {
				addToNodeSetPerWorkflow(outboundStub);
			}
		}
	}
	
	@Override
	public void addToNodeSetPerWorkflow(IwNode node) {
		if(_nodesPerWorkflow.containsKey(node.getWorkflow())==false){
			_nodesPerWorkflow.put(node.getWorkflow(),new LinkedHashSet<IwNode>());
		}
		Set<IwNode> nodes = nodesPerWorkflow().get(node.getWorkflow());
		nodes.add(node); 
	}
	/*********** Step View Transformation ***********************/
	//Step 3
	
	@Override
	public void combineNameInAlphabeticalOrder(IwStep stepToMerge) {
		if(getName().compareTo(stepToMerge.getName()) < 0) 
			setName(combineName(getName(),stepToMerge.getName()));
		else
			setName(combineName(stepToMerge.getName(),getName()));
	}
	
	@Override
	public String combineName(String name1, String name2) {
		StringBuffer name = new StringBuffer(name1);
		name.append("_");
		name.append(name2);
		
		return name.toString();
	}
	
	@Override
	public void mergeIsStartupStep(IwStep stepToMerge) {
		if(isStartupStep()==false || stepToMerge.isStartupStep()==false) 
			setStartupStep(false);
	}
	
	@Override
	public void delete() {
		getNodes().clear();
		setConcern(null);
		getOutboundStubs().clear();
	}
	
	@Override
	public boolean isEmptyStartupStep() {
		if(isStartupStep()==false) 
			return false;
		else {
			//result:=self.nodes.forAll{node|isNodePartOfEmptyStep(node)}
			for(IwNode node : getNodes()){
				if(isNodePartOfEmptyStep(node)==false)
					return false;
			}
			return true;
		}
	}

	@Override
	public boolean isNodePartOfEmptyStep(IwNode node) {
		if(node instanceof IwStartPoint) 
			return true;
		else {
			if(node instanceof IwStub) {
				IwStub stub = (IwStub)node;
				return stub.isAspectMarker();
			}
			else
				return false;
		}
	}

	@Override
	public IwModel getModel() {
		// TODO Auto-generated method stub
		return getConcern().getModel();
	}

	@Override
	public void merge(IwStep stepToMerge) {
		mergeName(stepToMerge);
		mergeIsStartupStep(stepToMerge);
		
		getNodes().addAll(stepToMerge.getNodes());
		getOutboundStubs().addAll(stepToMerge.getOutboundStubs());
		stepToMerge.delete();
	}

	@Override
	public void mergeName(IwStep stepToMerge) {
		if(isStartupStep()==stepToMerge.isStartupStep()) 
			combineNameInAlphabeticalOrder(stepToMerge);
		else {
			if(isStartupStep()==true && stepToMerge.isStartupStep()==false) 
				setName(stepToMerge.getName());
		}
	}

	private boolean isStartupStep;
	
	public boolean isStartupStep() {
		return isStartupStep;
	}

	public void setStartupStep(boolean isStartupStep) {
		this.isStartupStep = isStartupStep;
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
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<IwNode> nodes;

	/**
	 * The cached value of the '{@link #getOutboundStubs() <em>Outbound Stubs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundStubs()
	 * @generated
	 * @ordered
	 */
	protected EList<IwStub> outboundStubs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectWithInverseResolvingEList<IwNode>(IwNode.class, this, IntermediateWorkflowPackage.IW_STEP__NODES, IntermediateWorkflowPackage.IW_NODE__STEP);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwConcern getConcern() {
		if (eContainerFeatureID() != IntermediateWorkflowPackage.IW_STEP__CONCERN) return null;
		return (IwConcern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcern(IwConcern newConcern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConcern, IntermediateWorkflowPackage.IW_STEP__CONCERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcern(IwConcern newConcern) {
		if (newConcern != eInternalContainer() || (eContainerFeatureID() != IntermediateWorkflowPackage.IW_STEP__CONCERN && newConcern != null)) {
			if (EcoreUtil.isAncestor(this, newConcern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConcern != null)
				msgs = ((InternalEObject)newConcern).eInverseAdd(this, IntermediateWorkflowPackage.IW_CONCERN__STEPS, IwConcern.class, msgs);
			msgs = basicSetConcern(newConcern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_STEP__CONCERN, newConcern, newConcern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwStub> getOutboundStubs() {
		if (outboundStubs == null) {
			outboundStubs = new EObjectWithInverseResolvingEList.ManyInverse<IwStub>(IwStub.class, this, IntermediateWorkflowPackage.IW_STEP__OUTBOUND_STUBS, IntermediateWorkflowPackage.IW_STUB__OUTBOUND_IN_STEPS);
		}
		return outboundStubs;
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
			case IntermediateWorkflowPackage.IW_STEP__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_STEP__CONCERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConcern((IwConcern)otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_STEP__OUTBOUND_STUBS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutboundStubs()).basicAdd(otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_STEP__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_STEP__CONCERN:
				return basicSetConcern(null, msgs);
			case IntermediateWorkflowPackage.IW_STEP__OUTBOUND_STUBS:
				return ((InternalEList<?>)getOutboundStubs()).basicRemove(otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_STEP__CONCERN:
				return eInternalContainer().eInverseRemove(this, IntermediateWorkflowPackage.IW_CONCERN__STEPS, IwConcern.class, msgs);
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
			case IntermediateWorkflowPackage.IW_STEP__NAME:
				return getName();
			case IntermediateWorkflowPackage.IW_STEP__NODES:
				return getNodes();
			case IntermediateWorkflowPackage.IW_STEP__CONCERN:
				return getConcern();
			case IntermediateWorkflowPackage.IW_STEP__OUTBOUND_STUBS:
				return getOutboundStubs();
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
			case IntermediateWorkflowPackage.IW_STEP__NAME:
				setName((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_STEP__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends IwNode>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_STEP__CONCERN:
				setConcern((IwConcern)newValue);
				return;
			case IntermediateWorkflowPackage.IW_STEP__OUTBOUND_STUBS:
				getOutboundStubs().clear();
				getOutboundStubs().addAll((Collection<? extends IwStub>)newValue);
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
			case IntermediateWorkflowPackage.IW_STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_STEP__NODES:
				getNodes().clear();
				return;
			case IntermediateWorkflowPackage.IW_STEP__CONCERN:
				setConcern((IwConcern)null);
				return;
			case IntermediateWorkflowPackage.IW_STEP__OUTBOUND_STUBS:
				getOutboundStubs().clear();
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
			case IntermediateWorkflowPackage.IW_STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediateWorkflowPackage.IW_STEP__NODES:
				return nodes != null && !nodes.isEmpty();
			case IntermediateWorkflowPackage.IW_STEP__CONCERN:
				return getConcern() != null;
			case IntermediateWorkflowPackage.IW_STEP__OUTBOUND_STUBS:
				return outboundStubs != null && !outboundStubs.isEmpty();
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

	

} //IwStepImpl
