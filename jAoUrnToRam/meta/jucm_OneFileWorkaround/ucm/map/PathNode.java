/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.map;

import intermediateWorkflow.IwInput;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwOutput;

import jAoUrnToIw.InOutExpression;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import jucm_OneFileWorkaround.urncore.Concern;
import jucm_OneFileWorkaround.urncore.IURNNode;
import jucm_OneFileWorkaround.urncore.Metadata;
import jucm_OneFileWorkaround.urncore.UCMmodelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getPathNode()
 * @model abstract="true"
 * @generated
 */
public interface PathNode extends UCMmodelElement, IURNNode {
	LinkedList<IwNode> getIwNodes();
	IwOutput getIwOutput();
	IwInput getIwInput();
	IwNode getIwEquivalentNode();
	void build();
	void link();

	void buildIwOutputNode();
	void buildIwInputNode();
	void invokeBuildOnNodeConnections();
	void buildIwNodeTemplate();
	void addIwEquivalentNodeAfterOutIn(intermediateWorkflow.IwNode iwNode);
	void addIwEquivalentNodeBeforeOutIn(intermediateWorkflow.IwNode iwNode);
	void linkUcmMap();
	void linkInternal();
	void invokeLinkOnSuccs();
	boolean iwHasNodes();
	IwNode iwGetEntryNode(NodeConnection nodeConnection);
	IwNode iwGetExitNode(NodeConnection nodeConnection);
	InOutExpression inOutExpression();
	Metadata getRamMetadata();
	List<NodeConnection> predAsNodeConnection();
	List<NodeConnection> succAsNodeConnection();
	UCMmap getUCMmap(); 
	Concern getConcern();
} // PathNode



