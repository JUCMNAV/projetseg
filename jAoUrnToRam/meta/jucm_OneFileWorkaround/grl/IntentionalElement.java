/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.IntentionalElement#getType <em>Type</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.IntentionalElement#getImportance <em>Importance</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.IntentionalElement#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.IntentionalElement#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.IntentionalElement#isFilled <em>Filled</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.IntentionalElement#getGrlspec <em>Grlspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.IntentionalElement#getRefs <em>Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.GrlPackage#getIntentionalElement()
 * @model
 * @generated
 */
public interface IntentionalElement extends GRLLinkableElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jucm_OneFileWorkaround.grl.IntentionalElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see jucm_OneFileWorkaround.grl.IntentionalElementType
	 * @see #setType(IntentionalElementType)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getIntentionalElement_Type()
	 * @model
	 * @generated
	 */
	IntentionalElementType getType();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.IntentionalElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see jucm_OneFileWorkaround.grl.IntentionalElementType
	 * @see #getType()
	 * @generated
	 */
	void setType(IntentionalElementType value);

	/**
	 * Returns the value of the '<em><b>Decomposition Type</b></em>' attribute.
	 * The default value is <code>"And"</code>.
	 * The literals are from the enumeration {@link jucm_OneFileWorkaround.grl.DecompositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposition Type</em>' attribute.
	 * @see jucm_OneFileWorkaround.grl.DecompositionType
	 * @see #setDecompositionType(DecompositionType)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getIntentionalElement_DecompositionType()
	 * @model default="And"
	 * @generated
	 */
	DecompositionType getDecompositionType();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposition Type</em>' attribute.
	 * @see jucm_OneFileWorkaround.grl.DecompositionType
	 * @see #getDecompositionType()
	 * @generated
	 */
	void setDecompositionType(DecompositionType value);

	/**
	 * Returns the value of the '<em><b>Importance</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link jucm_OneFileWorkaround.grl.ImportanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance</em>' attribute.
	 * @see jucm_OneFileWorkaround.grl.ImportanceType
	 * @see #setImportance(ImportanceType)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getIntentionalElement_Importance()
	 * @model default="None"
	 * @generated
	 */
	ImportanceType getImportance();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.IntentionalElement#getImportance <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance</em>' attribute.
	 * @see jucm_OneFileWorkaround.grl.ImportanceType
	 * @see #getImportance()
	 * @generated
	 */
	void setImportance(ImportanceType value);

	/**
	 * Returns the value of the '<em><b>Importance Quantitative</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance Quantitative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance Quantitative</em>' attribute.
	 * @see #setImportanceQuantitative(int)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getIntentionalElement_ImportanceQuantitative()
	 * @model default="0"
	 * @generated
	 */
	int getImportanceQuantitative();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance Quantitative</em>' attribute.
	 * @see #getImportanceQuantitative()
	 * @generated
	 */
	void setImportanceQuantitative(int value);

	/**
	 * Returns the value of the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Color</em>' attribute.
	 * @see #setLineColor(String)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getIntentionalElement_LineColor()
	 * @model
	 * @generated
	 */
	String getLineColor();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.IntentionalElement#getLineColor <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Color</em>' attribute.
	 * @see #getLineColor()
	 * @generated
	 */
	void setLineColor(String value);

	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' attribute.
	 * @see #setFillColor(String)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getIntentionalElement_FillColor()
	 * @model
	 * @generated
	 */
	String getFillColor();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.IntentionalElement#getFillColor <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' attribute.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(String value);

	/**
	 * Returns the value of the '<em><b>Filled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filled</em>' attribute.
	 * @see #setFilled(boolean)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getIntentionalElement_Filled()
	 * @model default="false"
	 * @generated
	 */
	boolean isFilled();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.IntentionalElement#isFilled <em>Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filled</em>' attribute.
	 * @see #isFilled()
	 * @generated
	 */
	void setFilled(boolean value);

	/**
	 * Returns the value of the '<em><b>Grlspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLspec#getIntElements <em>Int Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grlspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grlspec</em>' container reference.
	 * @see #setGrlspec(GRLspec)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getIntentionalElement_Grlspec()
	 * @see jucm_OneFileWorkaround.grl.GRLspec#getIntElements
	 * @model opposite="intElements" required="true"
	 * @generated
	 */
	GRLspec getGrlspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.IntentionalElement#getGrlspec <em>Grlspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grlspec</em>' container reference.
	 * @see #getGrlspec()
	 * @generated
	 */
	void setGrlspec(GRLspec value);

	/**
	 * Returns the value of the '<em><b>Refs</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.IntentionalElementRef}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.IntentionalElementRef#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getIntentionalElement_Refs()
	 * @see jucm_OneFileWorkaround.grl.IntentionalElementRef#getDef
	 * @model opposite="def"
	 * @generated
	 */
	EList<IntentionalElementRef> getRefs();

} // IntentionalElement
