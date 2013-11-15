/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl;

import jucm_OneFileWorkaround.grl.kpimodel.KPIEvalValueSet;
import jucm_OneFileWorkaround.grl.kpimodel.KPINewEvalValue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.Evaluation#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.Evaluation#getQualitativeEvaluation <em>Qualitative Evaluation</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.Evaluation#isExceeds <em>Exceeds</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.Evaluation#getIntElement <em>Int Element</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.Evaluation#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.Evaluation#getKpiEvalValueSet <em>Kpi Eval Value Set</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.Evaluation#getEvalRange <em>Eval Range</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.Evaluation#getKpiNewEvalValue <em>Kpi New Eval Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.GrlPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' attribute.
	 * @see #setEvaluation(int)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getEvaluation_Evaluation()
	 * @model default="0"
	 * @generated
	 */
	int getEvaluation();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.Evaluation#getEvaluation <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' attribute.
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(int value);

	/**
	 * Returns the value of the '<em><b>Qualitative Evaluation</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link jucm_OneFileWorkaround.grl.QualitativeLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualitative Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualitative Evaluation</em>' attribute.
	 * @see jucm_OneFileWorkaround.grl.QualitativeLabel
	 * @see #setQualitativeEvaluation(QualitativeLabel)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getEvaluation_QualitativeEvaluation()
	 * @model default="None"
	 * @generated
	 */
	QualitativeLabel getQualitativeEvaluation();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.Evaluation#getQualitativeEvaluation <em>Qualitative Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualitative Evaluation</em>' attribute.
	 * @see jucm_OneFileWorkaround.grl.QualitativeLabel
	 * @see #getQualitativeEvaluation()
	 * @generated
	 */
	void setQualitativeEvaluation(QualitativeLabel value);

	/**
	 * Returns the value of the '<em><b>Exceeds</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceeds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceeds</em>' attribute.
	 * @see #setExceeds(boolean)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getEvaluation_Exceeds()
	 * @model default="false"
	 * @generated
	 */
	boolean isExceeds();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.Evaluation#isExceeds <em>Exceeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exceeds</em>' attribute.
	 * @see #isExceeds()
	 * @generated
	 */
	void setExceeds(boolean value);

	/**
	 * Returns the value of the '<em><b>Int Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Element</em>' reference.
	 * @see #setIntElement(IntentionalElement)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getEvaluation_IntElement()
	 * @model required="true"
	 * @generated
	 */
	IntentionalElement getIntElement();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.Evaluation#getIntElement <em>Int Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Element</em>' reference.
	 * @see #getIntElement()
	 * @generated
	 */
	void setIntElement(IntentionalElement value);

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.EvaluationStrategy#getEvaluations <em>Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' container reference.
	 * @see #setStrategies(EvaluationStrategy)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getEvaluation_Strategies()
	 * @see jucm_OneFileWorkaround.grl.EvaluationStrategy#getEvaluations
	 * @model opposite="evaluations" required="true"
	 * @generated
	 */
	EvaluationStrategy getStrategies();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.Evaluation#getStrategies <em>Strategies</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategies</em>' container reference.
	 * @see #getStrategies()
	 * @generated
	 */
	void setStrategies(EvaluationStrategy value);

	/**
	 * Returns the value of the '<em><b>Kpi Eval Value Set</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.kpimodel.KPIEvalValueSet#getEval <em>Eval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpi Eval Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Eval Value Set</em>' containment reference.
	 * @see #setKpiEvalValueSet(KPIEvalValueSet)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getEvaluation_KpiEvalValueSet()
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KPIEvalValueSet#getEval
	 * @model opposite="eval" containment="true"
	 * @generated
	 */
	KPIEvalValueSet getKpiEvalValueSet();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.Evaluation#getKpiEvalValueSet <em>Kpi Eval Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kpi Eval Value Set</em>' containment reference.
	 * @see #getKpiEvalValueSet()
	 * @generated
	 */
	void setKpiEvalValueSet(KPIEvalValueSet value);

	/**
	 * Returns the value of the '<em><b>Eval Range</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.EvaluationRange#getEval <em>Eval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eval Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eval Range</em>' containment reference.
	 * @see #setEvalRange(EvaluationRange)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getEvaluation_EvalRange()
	 * @see jucm_OneFileWorkaround.grl.EvaluationRange#getEval
	 * @model opposite="eval" containment="true"
	 * @generated
	 */
	EvaluationRange getEvalRange();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.Evaluation#getEvalRange <em>Eval Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eval Range</em>' containment reference.
	 * @see #getEvalRange()
	 * @generated
	 */
	void setEvalRange(EvaluationRange value);

	/**
	 * Returns the value of the '<em><b>Kpi New Eval Value</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.kpimodel.KPINewEvalValue#getEval <em>Eval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpi New Eval Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi New Eval Value</em>' containment reference.
	 * @see #setKpiNewEvalValue(KPINewEvalValue)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getEvaluation_KpiNewEvalValue()
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KPINewEvalValue#getEval
	 * @model opposite="eval" containment="true"
	 * @generated
	 */
	KPINewEvalValue getKpiNewEvalValue();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.Evaluation#getKpiNewEvalValue <em>Kpi New Eval Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kpi New Eval Value</em>' containment reference.
	 * @see #getKpiNewEvalValue()
	 * @generated
	 */
	void setKpiNewEvalValue(KPINewEvalValue value);

} // Evaluation
