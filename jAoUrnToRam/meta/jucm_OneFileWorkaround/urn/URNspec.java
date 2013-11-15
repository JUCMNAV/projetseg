/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.urn;

import java.util.List;

import intermediateWorkflow.IwModel;
import jucm_OneFileWorkaround.grl.GRLspec;

import jucm_OneFileWorkaround.ucm.UCMspec;
import jucm_OneFileWorkaround.ucm.map.UCMmap;

import jucm_OneFileWorkaround.urncore.Concern;
import jucm_OneFileWorkaround.urncore.Metadata;
import jucm_OneFileWorkaround.urncore.URNdefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UR Nspec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A URNspec contains basic definitions, and optionally GRL specs and/or UCM specs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getName <em>Name</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getDescription <em>Description</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getAuthor <em>Author</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getCreated <em>Created</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getModified <em>Modified</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getSpecVersion <em>Spec Version</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getUrnVersion <em>Urn Version</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getNextGlobalID <em>Next Global ID</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getUcmspec <em>Ucmspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getGrlspec <em>Grlspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getUrndef <em>Urndef</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getUrnLinks <em>Urn Links</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNspec#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec()
 * @model
 * @generated
 */
public interface URNspec extends EObject {
	//Extension
	IwModel toIw();
	IwModel iwModel();
	void build();
	void buildIwModel();
	void buildIwWithoutConcern();
	void link();
	void linkConcerns();
	List<UCMmap> ucmMaps();
	List<Concern> concerns();
	intermediateWorkflow.IwConcern iwWithoutConcern();
	//Extension
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
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(String)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_Created()
	 * @model
	 * @generated
	 */
	String getCreated();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(String value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(String)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_Modified()
	 * @model
	 * @generated
	 */
	String getModified();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(String value);

	/**
	 * Returns the value of the '<em><b>Spec Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Version</em>' attribute.
	 * @see #setSpecVersion(String)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_SpecVersion()
	 * @model
	 * @generated
	 */
	String getSpecVersion();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getSpecVersion <em>Spec Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Version</em>' attribute.
	 * @see #getSpecVersion()
	 * @generated
	 */
	void setSpecVersion(String value);

	/**
	 * Returns the value of the '<em><b>Urn Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urn Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urn Version</em>' attribute.
	 * @see #setUrnVersion(String)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_UrnVersion()
	 * @model
	 * @generated
	 */
	String getUrnVersion();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getUrnVersion <em>Urn Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urn Version</em>' attribute.
	 * @see #getUrnVersion()
	 * @generated
	 */
	void setUrnVersion(String value);

	/**
	 * Returns the value of the '<em><b>Next Global ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Global ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Global ID</em>' attribute.
	 * @see #setNextGlobalID(String)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_NextGlobalID()
	 * @model
	 * @generated
	 */
	String getNextGlobalID();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getNextGlobalID <em>Next Global ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Global ID</em>' attribute.
	 * @see #getNextGlobalID()
	 * @generated
	 */
	void setNextGlobalID(String value);

	/**
	 * Returns the value of the '<em><b>Ucmspec</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.UCMspec#getUrnspec <em>Urnspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ucmspec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ucmspec</em>' containment reference.
	 * @see #setUcmspec(UCMspec)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_Ucmspec()
	 * @see jucm_OneFileWorkaround.ucm.UCMspec#getUrnspec
	 * @model opposite="urnspec" containment="true"
	 * @generated
	 */
	UCMspec getUcmspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getUcmspec <em>Ucmspec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ucmspec</em>' containment reference.
	 * @see #getUcmspec()
	 * @generated
	 */
	void setUcmspec(UCMspec value);

	/**
	 * Returns the value of the '<em><b>Grlspec</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLspec#getUrnspec <em>Urnspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grlspec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grlspec</em>' containment reference.
	 * @see #setGrlspec(GRLspec)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_Grlspec()
	 * @see jucm_OneFileWorkaround.grl.GRLspec#getUrnspec
	 * @model opposite="urnspec" containment="true"
	 * @generated
	 */
	GRLspec getGrlspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getGrlspec <em>Grlspec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grlspec</em>' containment reference.
	 * @see #getGrlspec()
	 * @generated
	 */
	void setGrlspec(GRLspec value);

	/**
	 * Returns the value of the '<em><b>Urndef</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.URNdefinition#getUrnspec <em>Urnspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urndef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urndef</em>' containment reference.
	 * @see #setUrndef(URNdefinition)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_Urndef()
	 * @see jucm_OneFileWorkaround.urncore.URNdefinition#getUrnspec
	 * @model opposite="urnspec" containment="true" required="true"
	 * @generated
	 */
	URNdefinition getUrndef();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNspec#getUrndef <em>Urndef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urndef</em>' containment reference.
	 * @see #getUrndef()
	 * @generated
	 */
	void setUrndef(URNdefinition value);

	/**
	 * Returns the value of the '<em><b>Urn Links</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urn.URNlink}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urn.URNlink#getUrnspec <em>Urnspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urn Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urn Links</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_UrnLinks()
	 * @see jucm_OneFileWorkaround.urn.URNlink#getUrnspec
	 * @model opposite="urnspec" containment="true"
	 * @generated
	 */
	EList<URNlink> getUrnLinks();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.Metadata}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNspec_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getMetadata();

} // URNspec
