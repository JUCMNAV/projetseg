/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ucm.map;

import intermediateWorkflow.IwInput;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwOutput;

import jAoUrnToIw.InOutExpression;

import java.util.LinkedList;
import java.util.List;

import urncore.Concern;
import urncore.IURNNode;
import urncore.Metadata;
import urncore.UCMmodelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ucm.map.MapPackage#getPathNode()
 * @model abstract="true"
 * @generated
 */
public interface PathNode extends UCMmodelElement, IURNNode {
	
	/**************jAoUrnToIw******************************************************/
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
	NodeConnection getFirstPred();
	NodeConnection getFirstSucc();
	/********************************************************************************/
	NodeConnection getSucc(int index);
	int getNumSucc();
	PathNode getNext(int index);
	boolean isConnect();
	NodeConnection getPred(int index);
	int getNumPred();
} // PathNode
