/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Classifier#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link ram.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see ram.RamPackage#getClassifier_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Classifier
