/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.urncore;

import jucm_OneFileWorkaround.ucm.performance.PassiveResource;
import jucm_OneFileWorkaround.ucm.performance.ProcessingResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Component instance, which can be of a specific ComponentType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Component#getKind <em>Kind</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Component#isProtected <em>Protected</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Component#isSlot <em>Slot</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Component#isContext <em>Context</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Component#getType <em>Type</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Component#getUrndefinition <em>Urndefinition</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Component#getIncludedComponent <em>Included Component</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Component#getIncludingComponent <em>Including Component</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Component#getResource <em>Resource</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Component#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends UCMmodelElement, IURNContainer {
	boolean isSystem(); 
	boolean recurseIncludingComponentIsSystem();
	
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link jucm_OneFileWorkaround.urncore.ComponentKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see jucm_OneFileWorkaround.urncore.ComponentKind
	 * @see #setKind(ComponentKind)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent_Kind()
	 * @model
	 * @generated
	 */
	ComponentKind getKind();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Component#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see jucm_OneFileWorkaround.urncore.ComponentKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ComponentKind value);

	/**
	 * Returns the value of the '<em><b>Protected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected</em>' attribute.
	 * @see #setProtected(boolean)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent_Protected()
	 * @model default="false"
	 * @generated
	 */
	boolean isProtected();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Component#isProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected</em>' attribute.
	 * @see #isProtected()
	 * @generated
	 */
	void setProtected(boolean value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' attribute.
	 * @see #setSlot(boolean)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent_Slot()
	 * @model default="false"
	 * @generated
	 */
	boolean isSlot();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Component#isSlot <em>Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' attribute.
	 * @see #isSlot()
	 * @generated
	 */
	void setSlot(boolean value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(boolean)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent_Context()
	 * @model default="false"
	 * @generated
	 */
	boolean isContext();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Component#isContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #isContext()
	 * @generated
	 */
	void setContext(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.ComponentType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent_Type()
	 * @see jucm_OneFileWorkaround.urncore.ComponentType#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Component#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Urndefinition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.URNdefinition#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urndefinition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urndefinition</em>' container reference.
	 * @see #setUrndefinition(URNdefinition)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent_Urndefinition()
	 * @see jucm_OneFileWorkaround.urncore.URNdefinition#getComponents
	 * @model opposite="components" required="true"
	 * @generated
	 */
	URNdefinition getUrndefinition();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Component#getUrndefinition <em>Urndefinition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urndefinition</em>' container reference.
	 * @see #getUrndefinition()
	 * @generated
	 */
	void setUrndefinition(URNdefinition value);

	/**
	 * Returns the value of the '<em><b>Included Component</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.Component}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Component#getIncludingComponent <em>Including Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Component</em>' reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent_IncludedComponent()
	 * @see jucm_OneFileWorkaround.urncore.Component#getIncludingComponent
	 * @model opposite="includingComponent"
	 * @generated
	 */
	EList<Component> getIncludedComponent();

	/**
	 * Returns the value of the '<em><b>Including Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Component#getIncludedComponent <em>Included Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Including Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Including Component</em>' reference.
	 * @see #setIncludingComponent(Component)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent_IncludingComponent()
	 * @see jucm_OneFileWorkaround.urncore.Component#getIncludedComponent
	 * @model opposite="includedComponent"
	 * @generated
	 */
	Component getIncludingComponent();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Component#getIncludingComponent <em>Including Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Including Component</em>' reference.
	 * @see #getIncludingComponent()
	 * @generated
	 */
	void setIncludingComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.performance.PassiveResource#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(PassiveResource)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent_Resource()
	 * @see jucm_OneFileWorkaround.ucm.performance.PassiveResource#getComponent
	 * @model opposite="component"
	 * @generated
	 */
	PassiveResource getResource();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Component#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(PassiveResource value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.performance.ProcessingResource#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(ProcessingResource)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getComponent_Host()
	 * @see jucm_OneFileWorkaround.ucm.performance.ProcessingResource#getComponents
	 * @model opposite="components"
	 * @generated
	 */
	ProcessingResource getHost();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Component#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ProcessingResource value);

} // Component
