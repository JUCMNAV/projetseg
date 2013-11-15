/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Layout#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EObject},
	 * and the value is of type list of {@link java.util.Map.Entry},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' map.
	 * @see ram.RamPackage#getLayout_Containers()
	 * @model mapType="ram.ContainerMap<org.eclipse.emf.ecore.EObject, ram.ElementMap>"
	 * @generated
	 */
	EMap<EObject, EMap<EObject, LayoutElement>> getContainers();

} // Layout
