/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package seg.network.model.network;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seg.network.model.network.Component#getModelelements <em>Modelelements</em>}</li>
 * </ul>
 * </p>
 *
 * @see seg.network.model.network.NetworkPackage#getComponent()
 * @model 
 * @generated
 */
public interface Component extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Modelelements</b></em>' reference list.
	 * The list contents are of type {@link seg.network.model.network.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelelements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelelements</em>' reference list.
	 * @see seg.network.model.network.NetworkPackage#getComponent_Modelelements()
	 * @model type="seg.network.model.network.ModelElement"
	 * @generated
	 */
	EList getModelelements();

} // Component
