/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package grl.kpimodel.util;

import grl.GRLLinkableElement;
import grl.GRLNode;
import grl.IntentionalElement;

import grl.kpimodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import urncore.GRLmodelElement;
import urncore.IURNConnection;
import urncore.IURNNode;
import urncore.URNmodelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see grl.kpimodel.KpimodelPackage
 * @generated
 */
public class KpimodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KpimodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpimodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KpimodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KpimodelSwitch<Adapter> modelSwitch =
		new KpimodelSwitch<Adapter>() {
			@Override
			public Adapter caseIndicatorGroup(IndicatorGroup object) {
				return createIndicatorGroupAdapter();
			}
			@Override
			public Adapter caseIndicator(Indicator object) {
				return createIndicatorAdapter();
			}
			@Override
			public Adapter caseKPIInformationElement(KPIInformationElement object) {
				return createKPIInformationElementAdapter();
			}
			@Override
			public Adapter caseKPIInformationElementRef(KPIInformationElementRef object) {
				return createKPIInformationElementRefAdapter();
			}
			@Override
			public Adapter caseKPIModelLink(KPIModelLink object) {
				return createKPIModelLinkAdapter();
			}
			@Override
			public Adapter caseKPIModelLinkRef(KPIModelLinkRef object) {
				return createKPIModelLinkRefAdapter();
			}
			@Override
			public Adapter caseKPIEvalValueSet(KPIEvalValueSet object) {
				return createKPIEvalValueSetAdapter();
			}
			@Override
			public Adapter caseKPIInformationConfig(KPIInformationConfig object) {
				return createKPIInformationConfigAdapter();
			}
			@Override
			public Adapter caseKPINewEvalValue(KPINewEvalValue object) {
				return createKPINewEvalValueAdapter();
			}
			@Override
			public Adapter caseKPIConversion(KPIConversion object) {
				return createKPIConversionAdapter();
			}
			@Override
			public Adapter caseQualitativeMappings(QualitativeMappings object) {
				return createQualitativeMappingsAdapter();
			}
			@Override
			public Adapter caseQualitativeMapping(QualitativeMapping object) {
				return createQualitativeMappingAdapter();
			}
			@Override
			public Adapter caseURNmodelElement(URNmodelElement object) {
				return createURNmodelElementAdapter();
			}
			@Override
			public Adapter caseGRLmodelElement(GRLmodelElement object) {
				return createGRLmodelElementAdapter();
			}
			@Override
			public Adapter caseGRLLinkableElement(GRLLinkableElement object) {
				return createGRLLinkableElementAdapter();
			}
			@Override
			public Adapter caseIntentionalElement(IntentionalElement object) {
				return createIntentionalElementAdapter();
			}
			@Override
			public Adapter caseIURNNode(IURNNode object) {
				return createIURNNodeAdapter();
			}
			@Override
			public Adapter caseGRLNode(GRLNode object) {
				return createGRLNodeAdapter();
			}
			@Override
			public Adapter caseIURNConnection(IURNConnection object) {
				return createIURNConnectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.IndicatorGroup <em>Indicator Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.IndicatorGroup
	 * @generated
	 */
	public Adapter createIndicatorGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.Indicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.Indicator
	 * @generated
	 */
	public Adapter createIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.KPIInformationElement <em>KPI Information Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.KPIInformationElement
	 * @generated
	 */
	public Adapter createKPIInformationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.KPIInformationElementRef <em>KPI Information Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.KPIInformationElementRef
	 * @generated
	 */
	public Adapter createKPIInformationElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.KPIModelLink <em>KPI Model Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.KPIModelLink
	 * @generated
	 */
	public Adapter createKPIModelLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.KPIModelLinkRef <em>KPI Model Link Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.KPIModelLinkRef
	 * @generated
	 */
	public Adapter createKPIModelLinkRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.KPIEvalValueSet <em>KPI Eval Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.KPIEvalValueSet
	 * @generated
	 */
	public Adapter createKPIEvalValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.KPIInformationConfig <em>KPI Information Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.KPIInformationConfig
	 * @generated
	 */
	public Adapter createKPIInformationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.KPINewEvalValue <em>KPI New Eval Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.KPINewEvalValue
	 * @generated
	 */
	public Adapter createKPINewEvalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.KPIConversion <em>KPI Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.KPIConversion
	 * @generated
	 */
	public Adapter createKPIConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.QualitativeMappings <em>Qualitative Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.QualitativeMappings
	 * @generated
	 */
	public Adapter createQualitativeMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.kpimodel.QualitativeMapping <em>Qualitative Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.kpimodel.QualitativeMapping
	 * @generated
	 */
	public Adapter createQualitativeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.URNmodelElement <em>UR Nmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.URNmodelElement
	 * @generated
	 */
	public Adapter createURNmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.GRLmodelElement <em>GR Lmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.GRLmodelElement
	 * @generated
	 */
	public Adapter createGRLmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.GRLLinkableElement <em>GRL Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.GRLLinkableElement
	 * @generated
	 */
	public Adapter createGRLLinkableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.IntentionalElement <em>Intentional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.IntentionalElement
	 * @generated
	 */
	public Adapter createIntentionalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.IURNNode <em>IURN Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.IURNNode
	 * @generated
	 */
	public Adapter createIURNNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.GRLNode <em>GRL Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.GRLNode
	 * @generated
	 */
	public Adapter createGRLNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.IURNConnection <em>IURN Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.IURNConnection
	 * @generated
	 */
	public Adapter createIURNConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KpimodelAdapterFactory
