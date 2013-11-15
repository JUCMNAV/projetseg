/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.map;

import intermediateWorkflow.IwWorkflow;

import java.util.LinkedHashSet;
import java.util.List;

import jucm_OneFileWorkaround.urn.URNspec;
import jucm_OneFileWorkaround.urncore.IURNDiagram;
import jucm_OneFileWorkaround.urncore.UCMmodelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Mmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.UCMmap#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.UCMmap#getParentStub <em>Parent Stub</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getUCMmap()
 * @model
 * @generated
 */
public interface UCMmap extends UCMmodelElement, IURNDiagram {
	//Extension
	IwWorkflow getIwWorkflow();
	void build();
	void link();
	void linkWorkflowToConcern();
	List<PathNode> pathNodes();
	URNspec urnSpec();
	List<UCMmap> plugins();
	List<Stub> getStubs();
	boolean isPointcutExpression();
	LinkedHashSet<Stub> boundAsPluginInStubs();
	LinkedHashSet<PluginBinding> boundAsPluginInPluginBindings();
	LinkedHashSet<InBinding> boundAsPluginInInBindings();
	List<StartPoint> startPoints();
	LinkedHashSet<OutBinding> boundAsPluginInOutBindings();
	List<EndPoint> getEndPoints(); 
	//
	/**
	 * Returns the value of the '<em><b>Singleton</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton</em>' attribute.
	 * @see #setSingleton(boolean)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getUCMmap_Singleton()
	 * @model default="true"
	 * @generated
	 */
	boolean isSingleton();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.UCMmap#isSingleton <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton</em>' attribute.
	 * @see #isSingleton()
	 * @generated
	 */
	void setSingleton(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Stub</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.map.PluginBinding}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.map.PluginBinding#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Stub</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Stub</em>' reference list.
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getUCMmap_ParentStub()
	 * @see jucm_OneFileWorkaround.ucm.map.PluginBinding#getPlugin
	 * @model opposite="plugin"
	 * @generated
	 */
	EList<PluginBinding> getParentStub();

} // UCMmap
