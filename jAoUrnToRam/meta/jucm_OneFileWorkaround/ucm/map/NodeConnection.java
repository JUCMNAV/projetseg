/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.map;


import java.util.LinkedHashSet;
import java.util.List;

import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;
import jucm_OneFileWorkaround.urncore.Condition;
import jucm_OneFileWorkaround.urncore.IURNConnection;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.NodeConnection#getProbability <em>Probability</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.NodeConnection#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.NodeConnection#getInBindings <em>In Bindings</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.NodeConnection#getOutBindings <em>Out Bindings</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.NodeConnection#getCondition <em>Condition</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.NodeConnection#getOutBindingsPlugin <em>Out Bindings Plugin</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.NodeConnection#getInBindingsPlugin <em>In Bindings Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getNodeConnection()
 * @model
 * @generated
 */
public interface NodeConnection extends IURNConnection {
	IwNodeConnection getIwNodeConnection();
	IwNode iwSingleTarget();
	void initStubEntryIndex(Integer stubEntryIndex);
	LinkedHashSet<IwNodeConnection> iwDisjunctivePredNodeConnections();
	void iwDisjunctivePredNodeConnections_Recurse(LinkedHashSet<IwNodeConnection> disjunctivePredNodeConnections);
	Boolean iwIsTrigger();
	NodeConnection iwNextNodeConnection();
	String conditionLabel();
	PathNode targetAsPathNode();
	PathNode sourceAsPathNode();
	UCMmap ucmMap(); 
	void build();
	void link();
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getNodeConnection_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.NodeConnection#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(String)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getNodeConnection_Threshold()
	 * @model
	 * @generated
	 */
	String getThreshold();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.NodeConnection#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(String value);

	/**
	 * Returns the value of the '<em><b>In Bindings</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.map.InBinding}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.map.InBinding#getStubEntry <em>Stub Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Bindings</em>' reference list.
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getNodeConnection_InBindings()
	 * @see jucm_OneFileWorkaround.ucm.map.InBinding#getStubEntry
	 * @model opposite="stubEntry"
	 * @generated
	 */
	EList<InBinding> getInBindings();

	/**
	 * Returns the value of the '<em><b>Out Bindings</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.map.OutBinding}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.map.OutBinding#getStubExit <em>Stub Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Bindings</em>' reference list.
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getNodeConnection_OutBindings()
	 * @see jucm_OneFileWorkaround.ucm.map.OutBinding#getStubExit
	 * @model opposite="stubExit"
	 * @generated
	 */
	EList<OutBinding> getOutBindings();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Condition#getNodeConnection <em>Node Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getNodeConnection_Condition()
	 * @see jucm_OneFileWorkaround.urncore.Condition#getNodeConnection
	 * @model opposite="nodeConnection" containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.NodeConnection#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Out Bindings Plugin</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.map.OutBinding}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.map.OutBinding#getPointcutEntry <em>Pointcut Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Bindings Plugin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Bindings Plugin</em>' reference list.
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getNodeConnection_OutBindingsPlugin()
	 * @see jucm_OneFileWorkaround.ucm.map.OutBinding#getPointcutEntry
	 * @model opposite="pointcutEntry"
	 * @generated
	 */
	EList<OutBinding> getOutBindingsPlugin();

	/**
	 * Returns the value of the '<em><b>In Bindings Plugin</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.map.InBinding}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.map.InBinding#getPointcutExit <em>Pointcut Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Bindings Plugin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Bindings Plugin</em>' reference list.
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getNodeConnection_InBindingsPlugin()
	 * @see jucm_OneFileWorkaround.ucm.map.InBinding#getPointcutExit
	 * @model opposite="pointcutExit"
	 * @generated
	 */
	EList<InBinding> getInBindingsPlugin();

} // NodeConnection
