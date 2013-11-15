/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ram.AbstractMessageView;
import ram.Aspect;
import ram.AspectMessageView;
import ram.Association;
import ram.AssociationEnd;
import ram.Attribute;
import ram.Classifier;
import ram.CombinedFragment;
import ram.DestructionOccurrenceSpecification;
import ram.ExecutionStatement;
import ram.FragmentContainer;
import ram.Gate;
import ram.ImplementationClass;
import ram.Instantiation;
import ram.InstantiationType;
import ram.Interaction;
import ram.InteractionFragment;
import ram.InteractionOperand;
import ram.InteractionOperatorKind;
import ram.Layout;
import ram.LayoutElement;
import ram.Lifeline;
import ram.LiteralBoolean;
import ram.LiteralInteger;
import ram.LiteralSpecification;
import ram.LiteralString;
import ram.MappableElement;
import ram.Mapping;
import ram.Message;
import ram.MessageEnd;
import ram.MessageOccurrenceSpecification;
import ram.MessageSort;
import ram.MessageView;
import ram.MessageViewReference;
import ram.NamedElement;
import ram.ObjectType;
import ram.OccurrenceSpecification;
import ram.OpaqueExpression;
import ram.Operation;
import ram.OriginalBehaviorExecution;
import ram.Parameter;
import ram.ParameterValue;
import ram.ParameterValueMapping;
import ram.PrimitiveType;
import ram.Property;
import ram.RAny;
import ram.RBoolean;
import ram.RChar;
import ram.RCollection;
import ram.REnum;
import ram.REnumLiteral;
import ram.RInt;
import ram.RList;
import ram.RSet;
import ram.RString;
import ram.RVoid;
import ram.RamFactory;
import ram.RamPackage;
import ram.Reference;
import ram.ReferenceType;
import ram.StructuralFeature;
import ram.StructuralFeatureValue;
import ram.StructuralView;
import ram.TemporaryProperty;
import ram.Type;
import ram.TypedElement;
import ram.ValueSpecification;
import ram.Visibility;

import ram.util.RamValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RamPackageImpl extends EPackageImpl implements RamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rVoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rAnyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMessageViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageViewReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectMessageViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destructionOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originalBehaviorExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporaryPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSortEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instantiationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ram.RamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RamPackageImpl() {
		super(eNS_URI, RamFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RamPackage init() {
		if (isInited) return (RamPackage)EPackage.Registry.INSTANCE.getEPackage(RamPackage.eNS_URI);

		// Obtain or create and register package
		RamPackageImpl theRamPackage = (RamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RamPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRamPackage.createPackageContents();

		// Initialize created meta-data
		theRamPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRamPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RamValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRamPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RamPackage.eNS_URI, theRamPackage);
		return theRamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspect() {
		return aspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_StructuralView() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_MandatoryAspectParameters() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_MessageViews() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Instantiations() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Layout() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappableElement() {
		return mappableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralView() {
		return structuralViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralView_Classes() {
		return (EReference)structuralViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralView_Associations() {
		return (EReference)structuralViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralView_Types() {
		return (EReference)structuralViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_AssociationEnds() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Attributes() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Partial() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Abstract() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperTypes() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEnd() {
		return associationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEnd_Navigable() {
		return (EAttribute)associationEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationEnd_Assoc() {
		return (EReference)associationEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationEnd_MyClass() {
		return (EReference)associationEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Ends() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantiation() {
		return instantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiation_Mappings() {
		return (EReference)instantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiation_ExternalAspect() {
		return (EReference)instantiationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstantiation_Type() {
		return (EAttribute)instantiationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_ToElements() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_FromElement() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Abstract() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Visibility() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_ReturnType() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Parameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Static() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Partial() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Type() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRVoid() {
		return rVoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBoolean() {
		return rBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRInt() {
		return rIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRChar() {
		return rCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRString() {
		return rStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRAny() {
		return rAnyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREnum() {
		return rEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREnum_Literals() {
		return (EReference)rEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREnumLiteral() {
		return rEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREnumLiteral_Enum() {
		return (EReference)rEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMessageView() {
		return abstractMessageViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMessageView_AffectedBy() {
		return (EReference)abstractMessageViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageView() {
		return messageViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageView_Specifies() {
		return (EReference)messageViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageView_Specification() {
		return (EReference)messageViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageViewReference() {
		return messageViewReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageViewReference_References() {
		return (EReference)messageViewReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Lifelines() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Messages() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Properties() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_FormalGates() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspectMessageView() {
		return aspectMessageViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspectMessageView_Pointcut() {
		return (EReference)aspectMessageViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspectMessageView_Advice() {
		return (EReference)aspectMessageViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeline() {
		return lifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Represents() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_LocalProperties() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_CoveredBy() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_SendEvent() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_ReceiveEvent() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Signature() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_AssignTo() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageSort() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Arguments() {
		return (EReference)messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Interaction() {
		return (EReference)messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Returns() {
		return (EReference)messageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_SelfMessage() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEnd() {
		return messageEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEnd_Message() {
		return (EReference)messageEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageOccurrenceSpecification() {
		return messageOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccurrenceSpecification() {
		return occurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestructionOccurrenceSpecification() {
		return destructionOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFragment() {
		return interactionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_Covered() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_Container() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedFragment() {
		return combinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinedFragment_InteractionOperator() {
		return (EAttribute)combinedFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_Operands() {
		return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOriginalBehaviorExecution() {
		return originalBehaviorExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionStatement() {
		return executionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionStatement_Specification() {
		return (EReference)executionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOperand() {
		return interactionOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_InteractionConstraint() {
		return (EReference)interactionOperandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureValue() {
		return structuralFeatureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureValue_Value() {
		return (EReference)structuralFeatureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValueMapping() {
		return parameterValueMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueMapping_Parameter() {
		return (EReference)parameterValueMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueMapping_Value() {
		return (EReference)parameterValueMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_Parameter() {
		return (EReference)parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueExpression() {
		return opaqueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Body() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Language() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralSpecification() {
		return literalSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralString() {
		return literalStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralString_Value() {
		return (EAttribute)literalStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralInteger() {
		return literalIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralInteger_Value() {
		return (EAttribute)literalIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragmentContainer() {
		return fragmentContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentContainer_Fragments() {
		return (EReference)fragmentContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRCollection() {
		return rCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRCollection_Type() {
		return (EReference)rCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSet() {
		return rSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRList() {
		return rListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Containers() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerMap() {
		return containerMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerMap_Key() {
		return (EReference)containerMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerMap_Value() {
		return (EReference)containerMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementMap() {
		return elementMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementMap_Key() {
		return (EReference)elementMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementMap_Value() {
		return (EReference)elementMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutElement() {
		return layoutElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutElement_X() {
		return (EAttribute)layoutElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutElement_Y() {
		return (EAttribute)layoutElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Operations() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationClass() {
		return implementationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationClass_InstanceClassName() {
		return (EAttribute)implementationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporaryProperty() {
		return temporaryPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_Static() {
		return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Type() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_LowerBound() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_UpperBound() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_ReferenceType() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBoolean() {
		return literalBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralBoolean_Value() {
		return (EAttribute)literalBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceType() {
		return referenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSort() {
		return messageSortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionOperatorKind() {
		return interactionOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstantiationType() {
		return instantiationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RamFactory getRamFactory() {
		return (RamFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aspectEClass = createEClass(ASPECT);
		createEReference(aspectEClass, ASPECT__STRUCTURAL_VIEW);
		createEReference(aspectEClass, ASPECT__MANDATORY_ASPECT_PARAMETERS);
		createEReference(aspectEClass, ASPECT__MESSAGE_VIEWS);
		createEReference(aspectEClass, ASPECT__INSTANTIATIONS);
		createEReference(aspectEClass, ASPECT__LAYOUT);

		mappableElementEClass = createEClass(MAPPABLE_ELEMENT);

		structuralViewEClass = createEClass(STRUCTURAL_VIEW);
		createEReference(structuralViewEClass, STRUCTURAL_VIEW__CLASSES);
		createEReference(structuralViewEClass, STRUCTURAL_VIEW__ASSOCIATIONS);
		createEReference(structuralViewEClass, STRUCTURAL_VIEW__TYPES);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__ASSOCIATION_ENDS);
		createEReference(classEClass, CLASS__ATTRIBUTES);
		createEAttribute(classEClass, CLASS__PARTIAL);
		createEAttribute(classEClass, CLASS__ABSTRACT);
		createEReference(classEClass, CLASS__SUPER_TYPES);

		associationEndEClass = createEClass(ASSOCIATION_END);
		createEAttribute(associationEndEClass, ASSOCIATION_END__NAVIGABLE);
		createEReference(associationEndEClass, ASSOCIATION_END__ASSOC);
		createEReference(associationEndEClass, ASSOCIATION_END__MY_CLASS);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__ENDS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		instantiationEClass = createEClass(INSTANTIATION);
		createEReference(instantiationEClass, INSTANTIATION__MAPPINGS);
		createEReference(instantiationEClass, INSTANTIATION__EXTERNAL_ASPECT);
		createEAttribute(instantiationEClass, INSTANTIATION__TYPE);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__TO_ELEMENTS);
		createEReference(mappingEClass, MAPPING__FROM_ELEMENT);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__ABSTRACT);
		createEAttribute(operationEClass, OPERATION__VISIBILITY);
		createEReference(operationEClass, OPERATION__RETURN_TYPE);
		createEReference(operationEClass, OPERATION__PARAMETERS);
		createEAttribute(operationEClass, OPERATION__STATIC);
		createEAttribute(operationEClass, OPERATION__PARTIAL);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__TYPE);

		typeEClass = createEClass(TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__TYPE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		objectTypeEClass = createEClass(OBJECT_TYPE);

		rVoidEClass = createEClass(RVOID);

		rBooleanEClass = createEClass(RBOOLEAN);

		rIntEClass = createEClass(RINT);

		rCharEClass = createEClass(RCHAR);

		rStringEClass = createEClass(RSTRING);

		rAnyEClass = createEClass(RANY);

		rEnumEClass = createEClass(RENUM);
		createEReference(rEnumEClass, RENUM__LITERALS);

		rEnumLiteralEClass = createEClass(RENUM_LITERAL);
		createEReference(rEnumLiteralEClass, RENUM_LITERAL__ENUM);

		abstractMessageViewEClass = createEClass(ABSTRACT_MESSAGE_VIEW);
		createEReference(abstractMessageViewEClass, ABSTRACT_MESSAGE_VIEW__AFFECTED_BY);

		messageViewEClass = createEClass(MESSAGE_VIEW);
		createEReference(messageViewEClass, MESSAGE_VIEW__SPECIFIES);
		createEReference(messageViewEClass, MESSAGE_VIEW__SPECIFICATION);

		messageViewReferenceEClass = createEClass(MESSAGE_VIEW_REFERENCE);
		createEReference(messageViewReferenceEClass, MESSAGE_VIEW_REFERENCE__REFERENCES);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__LIFELINES);
		createEReference(interactionEClass, INTERACTION__MESSAGES);
		createEReference(interactionEClass, INTERACTION__PROPERTIES);
		createEReference(interactionEClass, INTERACTION__FORMAL_GATES);

		aspectMessageViewEClass = createEClass(ASPECT_MESSAGE_VIEW);
		createEReference(aspectMessageViewEClass, ASPECT_MESSAGE_VIEW__POINTCUT);
		createEReference(aspectMessageViewEClass, ASPECT_MESSAGE_VIEW__ADVICE);

		lifelineEClass = createEClass(LIFELINE);
		createEReference(lifelineEClass, LIFELINE__REPRESENTS);
		createEReference(lifelineEClass, LIFELINE__LOCAL_PROPERTIES);
		createEReference(lifelineEClass, LIFELINE__COVERED_BY);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__SEND_EVENT);
		createEReference(messageEClass, MESSAGE__RECEIVE_EVENT);
		createEReference(messageEClass, MESSAGE__SIGNATURE);
		createEReference(messageEClass, MESSAGE__ASSIGN_TO);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_SORT);
		createEReference(messageEClass, MESSAGE__ARGUMENTS);
		createEReference(messageEClass, MESSAGE__INTERACTION);
		createEReference(messageEClass, MESSAGE__RETURNS);
		createEAttribute(messageEClass, MESSAGE__SELF_MESSAGE);

		messageEndEClass = createEClass(MESSAGE_END);
		createEReference(messageEndEClass, MESSAGE_END__MESSAGE);

		messageOccurrenceSpecificationEClass = createEClass(MESSAGE_OCCURRENCE_SPECIFICATION);

		occurrenceSpecificationEClass = createEClass(OCCURRENCE_SPECIFICATION);

		destructionOccurrenceSpecificationEClass = createEClass(DESTRUCTION_OCCURRENCE_SPECIFICATION);

		interactionFragmentEClass = createEClass(INTERACTION_FRAGMENT);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__COVERED);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__CONTAINER);

		combinedFragmentEClass = createEClass(COMBINED_FRAGMENT);
		createEAttribute(combinedFragmentEClass, COMBINED_FRAGMENT__INTERACTION_OPERATOR);
		createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__OPERANDS);

		originalBehaviorExecutionEClass = createEClass(ORIGINAL_BEHAVIOR_EXECUTION);

		executionStatementEClass = createEClass(EXECUTION_STATEMENT);
		createEReference(executionStatementEClass, EXECUTION_STATEMENT__SPECIFICATION);

		interactionOperandEClass = createEClass(INTERACTION_OPERAND);
		createEReference(interactionOperandEClass, INTERACTION_OPERAND__INTERACTION_CONSTRAINT);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

		structuralFeatureValueEClass = createEClass(STRUCTURAL_FEATURE_VALUE);
		createEReference(structuralFeatureValueEClass, STRUCTURAL_FEATURE_VALUE__VALUE);

		parameterValueMappingEClass = createEClass(PARAMETER_VALUE_MAPPING);
		createEReference(parameterValueMappingEClass, PARAMETER_VALUE_MAPPING__PARAMETER);
		createEReference(parameterValueMappingEClass, PARAMETER_VALUE_MAPPING__VALUE);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEReference(parameterValueEClass, PARAMETER_VALUE__PARAMETER);

		opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__BODY);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__LANGUAGE);

		literalSpecificationEClass = createEClass(LITERAL_SPECIFICATION);

		literalStringEClass = createEClass(LITERAL_STRING);
		createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

		literalIntegerEClass = createEClass(LITERAL_INTEGER);
		createEAttribute(literalIntegerEClass, LITERAL_INTEGER__VALUE);

		fragmentContainerEClass = createEClass(FRAGMENT_CONTAINER);
		createEReference(fragmentContainerEClass, FRAGMENT_CONTAINER__FRAGMENTS);

		rCollectionEClass = createEClass(RCOLLECTION);
		createEReference(rCollectionEClass, RCOLLECTION__TYPE);

		rSetEClass = createEClass(RSET);

		rListEClass = createEClass(RLIST);

		layoutEClass = createEClass(LAYOUT);
		createEReference(layoutEClass, LAYOUT__CONTAINERS);

		containerMapEClass = createEClass(CONTAINER_MAP);
		createEReference(containerMapEClass, CONTAINER_MAP__KEY);
		createEReference(containerMapEClass, CONTAINER_MAP__VALUE);

		elementMapEClass = createEClass(ELEMENT_MAP);
		createEReference(elementMapEClass, ELEMENT_MAP__KEY);
		createEReference(elementMapEClass, ELEMENT_MAP__VALUE);

		layoutElementEClass = createEClass(LAYOUT_ELEMENT);
		createEAttribute(layoutElementEClass, LAYOUT_ELEMENT__X);
		createEAttribute(layoutElementEClass, LAYOUT_ELEMENT__Y);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__OPERATIONS);

		implementationClassEClass = createEClass(IMPLEMENTATION_CLASS);
		createEAttribute(implementationClassEClass, IMPLEMENTATION_CLASS__INSTANCE_CLASS_NAME);

		temporaryPropertyEClass = createEClass(TEMPORARY_PROPERTY);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);
		createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__STATIC);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__TYPE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__LOWER_BOUND);
		createEAttribute(propertyEClass, PROPERTY__UPPER_BOUND);
		createEAttribute(propertyEClass, PROPERTY__REFERENCE_TYPE);

		typedElementEClass = createEClass(TYPED_ELEMENT);

		gateEClass = createEClass(GATE);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
		referenceTypeEEnum = createEEnum(REFERENCE_TYPE);
		messageSortEEnum = createEEnum(MESSAGE_SORT);
		interactionOperatorKindEEnum = createEEnum(INTERACTION_OPERATOR_KIND);
		instantiationTypeEEnum = createEEnum(INSTANTIATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aspectEClass.getESuperTypes().add(this.getNamedElement());
		mappableElementEClass.getESuperTypes().add(this.getNamedElement());
		classEClass.getESuperTypes().add(this.getClassifier());
		associationEndEClass.getESuperTypes().add(this.getProperty());
		associationEClass.getESuperTypes().add(this.getNamedElement());
		operationEClass.getESuperTypes().add(this.getNamedElement());
		operationEClass.getESuperTypes().add(this.getMappableElement());
		attributeEClass.getESuperTypes().add(this.getStructuralFeature());
		attributeEClass.getESuperTypes().add(this.getTemporaryProperty());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getTypedElement());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		primitiveTypeEClass.getESuperTypes().add(this.getImplementationClass());
		objectTypeEClass.getESuperTypes().add(this.getType());
		objectTypeEClass.getESuperTypes().add(this.getMappableElement());
		rVoidEClass.getESuperTypes().add(this.getType());
		rBooleanEClass.getESuperTypes().add(this.getPrimitiveType());
		rIntEClass.getESuperTypes().add(this.getPrimitiveType());
		rCharEClass.getESuperTypes().add(this.getPrimitiveType());
		rStringEClass.getESuperTypes().add(this.getPrimitiveType());
		rAnyEClass.getESuperTypes().add(this.getType());
		rEnumEClass.getESuperTypes().add(this.getPrimitiveType());
		rEnumLiteralEClass.getESuperTypes().add(this.getNamedElement());
		messageViewEClass.getESuperTypes().add(this.getAbstractMessageView());
		messageViewReferenceEClass.getESuperTypes().add(this.getAbstractMessageView());
		interactionEClass.getESuperTypes().add(this.getFragmentContainer());
		aspectMessageViewEClass.getESuperTypes().add(this.getAbstractMessageView());
		aspectMessageViewEClass.getESuperTypes().add(this.getNamedElement());
		messageOccurrenceSpecificationEClass.getESuperTypes().add(this.getOccurrenceSpecification());
		messageOccurrenceSpecificationEClass.getESuperTypes().add(this.getMessageEnd());
		occurrenceSpecificationEClass.getESuperTypes().add(this.getInteractionFragment());
		destructionOccurrenceSpecificationEClass.getESuperTypes().add(this.getMessageOccurrenceSpecification());
		combinedFragmentEClass.getESuperTypes().add(this.getInteractionFragment());
		originalBehaviorExecutionEClass.getESuperTypes().add(this.getInteractionFragment());
		executionStatementEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionOperandEClass.getESuperTypes().add(this.getFragmentContainer());
		structuralFeatureValueEClass.getESuperTypes().add(this.getValueSpecification());
		parameterValueEClass.getESuperTypes().add(this.getValueSpecification());
		opaqueExpressionEClass.getESuperTypes().add(this.getValueSpecification());
		literalSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		literalStringEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalIntegerEClass.getESuperTypes().add(this.getLiteralSpecification());
		rCollectionEClass.getESuperTypes().add(this.getType());
		rCollectionEClass.getESuperTypes().add(this.getImplementationClass());
		rSetEClass.getESuperTypes().add(this.getRCollection());
		rListEClass.getESuperTypes().add(this.getRCollection());
		classifierEClass.getESuperTypes().add(this.getObjectType());
		implementationClassEClass.getESuperTypes().add(this.getClassifier());
		structuralFeatureEClass.getESuperTypes().add(this.getTypedElement());
		referenceEClass.getESuperTypes().add(this.getProperty());
		referenceEClass.getESuperTypes().add(this.getTemporaryProperty());
		propertyEClass.getESuperTypes().add(this.getStructuralFeature());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		gateEClass.getESuperTypes().add(this.getMessageEnd());
		gateEClass.getESuperTypes().add(this.getNamedElement());
		literalBooleanEClass.getESuperTypes().add(this.getLiteralSpecification());

		// Initialize classes and features; add operations and parameters
		initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspect_StructuralView(), this.getStructuralView(), null, "structuralView", null, 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_MandatoryAspectParameters(), this.getMappableElement(), null, "mandatoryAspectParameters", null, 0, -1, Aspect.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAspect_MessageViews(), this.getAbstractMessageView(), null, "messageViews", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAspect_Instantiations(), this.getInstantiation(), null, "instantiations", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_Layout(), this.getLayout(), null, "layout", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappableElementEClass, MappableElement.class, "MappableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralViewEClass, StructuralView.class, "StructuralView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralView_Classes(), this.getClassifier(), null, "classes", null, 0, -1, StructuralView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralView_Associations(), this.getAssociation(), null, "associations", null, 0, -1, StructuralView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralView_Types(), this.getType(), null, "types", null, 0, -1, StructuralView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classEClass, ram.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_AssociationEnds(), this.getAssociationEnd(), this.getAssociationEnd_MyClass(), "associationEnds", null, 0, -1, ram.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, ram.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Partial(), ecorePackage.getEBoolean(), "partial", "false", 0, 1, ram.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, ram.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SuperTypes(), this.getClassifier(), null, "superTypes", null, 0, -1, ram.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEndEClass, AssociationEnd.class, "AssociationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationEnd_Navigable(), ecorePackage.getEBoolean(), "navigable", "true", 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationEnd_Assoc(), this.getAssociation(), this.getAssociation_Ends(), "assoc", null, 1, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationEnd_MyClass(), this.getClass_(), this.getClass_AssociationEnds(), "myClass", null, 1, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(associationEndEClass, this.getType(), "getType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Ends(), this.getAssociationEnd(), this.getAssociationEnd_Assoc(), "ends", null, 2, 2, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantiationEClass, Instantiation.class, "Instantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstantiation_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, Instantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstantiation_ExternalAspect(), this.getAspect(), null, "externalAspect", null, 1, 1, Instantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstantiation_Type(), this.getInstantiationType(), "type", "", 1, 1, Instantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_ToElements(), this.getMappableElement(), null, "toElements", null, 1, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_FromElement(), this.getMappableElement(), null, "fromElement", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Abstract(), ecorePackage.getEBoolean(), "abstract", "false", 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_ReturnType(), this.getType(), null, "returnType", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Static(), ecorePackage.getEBoolean(), "static", "false", 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Partial(), ecorePackage.getEBoolean(), "partial", "false", 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Type(), this.getPrimitiveType(), null, "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Type(), this.getType(), null, "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rVoidEClass, RVoid.class, "RVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rVoidEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rBooleanEClass, RBoolean.class, "RBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rBooleanEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(rBooleanEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rIntEClass, RInt.class, "RInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rIntEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(rIntEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rCharEClass, RChar.class, "RChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rCharEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(rCharEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rStringEClass, RString.class, "RString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rStringEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(rStringEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rAnyEClass, RAny.class, "RAny", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rAnyEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rEnumEClass, REnum.class, "REnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getREnum_Literals(), this.getREnumLiteral(), this.getREnumLiteral_Enum(), "literals", null, 1, -1, REnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rEnumLiteralEClass, REnumLiteral.class, "REnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getREnumLiteral_Enum(), this.getREnum(), this.getREnum_Literals(), "enum", null, 1, 1, REnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMessageViewEClass, AbstractMessageView.class, "AbstractMessageView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMessageView_AffectedBy(), this.getAspectMessageView(), null, "affectedBy", null, 0, -1, AbstractMessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageViewEClass, MessageView.class, "MessageView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageView_Specifies(), this.getOperation(), null, "specifies", null, 1, 1, MessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessageView_Specification(), this.getInteraction(), null, "specification", null, 0, 1, MessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageViewReferenceEClass, MessageViewReference.class, "MessageViewReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageViewReference_References(), this.getMessageView(), null, "references", null, 1, 1, MessageViewReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Lifelines(), this.getLifeline(), null, "lifelines", null, 1, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Messages(), this.getMessage(), this.getMessage_Interaction(), "messages", null, 1, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Properties(), this.getReference(), null, "properties", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_FormalGates(), this.getGate(), null, "formalGates", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aspectMessageViewEClass, AspectMessageView.class, "AspectMessageView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspectMessageView_Pointcut(), this.getOperation(), null, "pointcut", null, 1, 1, AspectMessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAspectMessageView_Advice(), this.getInteraction(), null, "advice", null, 1, 1, AspectMessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifeline_Represents(), this.getTypedElement(), null, "represents", null, 1, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_LocalProperties(), this.getTemporaryProperty(), null, "localProperties", null, 0, -1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_CoveredBy(), this.getInteractionFragment(), this.getInteractionFragment_Covered(), "coveredBy", null, 1, -1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_SendEvent(), this.getMessageEnd(), null, "sendEvent", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_ReceiveEvent(), this.getMessageEnd(), null, "receiveEvent", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Signature(), this.getOperation(), null, "signature", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_AssignTo(), this.getStructuralFeature(), null, "assignTo", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_MessageSort(), this.getMessageSort(), "messageSort", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Arguments(), this.getParameterValueMapping(), null, "arguments", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Interaction(), this.getInteraction(), this.getInteraction_Messages(), "interaction", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Returns(), this.getValueSpecification(), null, "returns", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_SelfMessage(), ecorePackage.getEBoolean(), "selfMessage", "false", 1, 1, Message.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(messageEndEClass, MessageEnd.class, "MessageEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageEnd_Message(), this.getMessage(), null, "message", null, 1, 1, MessageEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageOccurrenceSpecificationEClass, MessageOccurrenceSpecification.class, "MessageOccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(occurrenceSpecificationEClass, OccurrenceSpecification.class, "OccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(destructionOccurrenceSpecificationEClass, DestructionOccurrenceSpecification.class, "DestructionOccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionFragmentEClass, InteractionFragment.class, "InteractionFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFragment_Covered(), this.getLifeline(), this.getLifeline_CoveredBy(), "covered", null, 1, -1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_Container(), this.getFragmentContainer(), this.getFragmentContainer_Fragments(), "container", null, 1, 1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(combinedFragmentEClass, CombinedFragment.class, "CombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCombinedFragment_InteractionOperator(), this.getInteractionOperatorKind(), "interactionOperator", null, 1, 1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCombinedFragment_Operands(), this.getInteractionOperand(), null, "operands", null, 1, -1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(originalBehaviorExecutionEClass, OriginalBehaviorExecution.class, "OriginalBehaviorExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionStatementEClass, ExecutionStatement.class, "ExecutionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionStatement_Specification(), this.getValueSpecification(), null, "specification", null, 1, 1, ExecutionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionOperandEClass, InteractionOperand.class, "InteractionOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionOperand_InteractionConstraint(), this.getValueSpecification(), null, "interactionConstraint", null, 0, 1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralFeatureValueEClass, StructuralFeatureValue.class, "StructuralFeatureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralFeatureValue_Value(), this.getStructuralFeature(), null, "value", null, 1, 1, StructuralFeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterValueMappingEClass, ParameterValueMapping.class, "ParameterValueMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValueMapping_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ParameterValueMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterValueMapping_Value(), this.getValueSpecification(), null, "value", null, 1, 1, ParameterValueMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValue_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpaqueExpression_Language(), ecorePackage.getEString(), "language", null, 1, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalSpecificationEClass, LiteralSpecification.class, "LiteralSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralString_Value(), ecorePackage.getEString(), "value", null, 1, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalIntegerEClass, LiteralInteger.class, "LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralInteger_Value(), ecorePackage.getEInt(), "value", null, 1, 1, LiteralInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fragmentContainerEClass, FragmentContainer.class, "FragmentContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragmentContainer_Fragments(), this.getInteractionFragment(), this.getInteractionFragment_Container(), "fragments", null, 1, -1, FragmentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rCollectionEClass, RCollection.class, "RCollection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRCollection_Type(), this.getObjectType(), null, "type", null, 1, 1, RCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(rCollectionEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rSetEClass, RSet.class, "RSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rListEClass, RList.class, "RList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayout_Containers(), this.getContainerMap(), null, "containers", null, 1, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerMapEClass, Map.Entry.class, "ContainerMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerMap_Key(), ecorePackage.getEObject(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerMap_Value(), this.getElementMap(), null, "value", null, 1, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementMapEClass, Map.Entry.class, "ElementMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementMap_Key(), ecorePackage.getEObject(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementMap_Value(), this.getLayoutElement(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutElementEClass, LayoutElement.class, "LayoutElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayoutElement_X(), ecorePackage.getEFloat(), "x", null, 1, 1, LayoutElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutElement_Y(), ecorePackage.getEFloat(), "y", null, 1, 1, LayoutElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_Operations(), this.getOperation(), null, "operations", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationClassEClass, ImplementationClass.class, "ImplementationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationClass_InstanceClassName(), ecorePackage.getEString(), "instanceClassName", null, 1, 1, ImplementationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporaryPropertyEClass, TemporaryProperty.class, "TemporaryProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralFeature_Static(), ecorePackage.getEBoolean(), "static", "false", 1, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Type(), this.getObjectType(), null, "type", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_LowerBound(), ecorePackage.getEInt(), "lowerBound", "0", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_ReferenceType(), this.getReferenceType(), "referenceType", "Regular", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(typedElementEClass, this.getType(), "getType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
		addEEnumLiteral(visibilityEEnum, Visibility.PROTECTED);
		addEEnumLiteral(visibilityEEnum, Visibility.PACKAGE);

		initEEnum(referenceTypeEEnum, ReferenceType.class, "ReferenceType");
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.COMPOSITION);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.AGGREGATION);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.REGULAR);

		initEEnum(messageSortEEnum, MessageSort.class, "MessageSort");
		addEEnumLiteral(messageSortEEnum, MessageSort.SYNCH_CALL);
		addEEnumLiteral(messageSortEEnum, MessageSort.CREATE_MESSAGE);
		addEEnumLiteral(messageSortEEnum, MessageSort.DELETE_MESSAGE);
		addEEnumLiteral(messageSortEEnum, MessageSort.REPLY);

		initEEnum(interactionOperatorKindEEnum, InteractionOperatorKind.class, "InteractionOperatorKind");
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.ALT);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.OPT);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.LOOP);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.DISRUPTABLE);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.CRITICAL);

		initEEnum(instantiationTypeEEnum, InstantiationType.class, "InstantiationType");
		addEEnumLiteral(instantiationTypeEEnum, InstantiationType.DEPENDS);
		addEEnumLiteral(instantiationTypeEEnum, InstantiationType.EXTENDS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });			
		addAnnotation
		  (structuralViewEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueTypes noTwoClassesWithSameName"
		   });			
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "constraints", "notSelfSuperType"
		   });			
		addAnnotation
		  (associationEndEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueName"
		   });				
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "validName"
		   });			
		addAnnotation
		  (instantiationEClass, 
		   source, 
		   new String[] {
			 "constraints", "aspectCannotMapSelf mandatoryAspectParametersMapped"
		   });			
		addAnnotation
		  (mappingEClass, 
		   source, 
		   new String[] {
			 "constraints", "validSourceModelElement sameTypesMapped validMapping"
		   });			
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "constraints", "messageViewDefined"
		   });			
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "constraints", "notVoid"
		   });													
		addAnnotation
		  (messageViewEClass, 
		   source, 
		   new String[] {
			 "constraints", "specifiesIsFirstMessage specificationDefined isAffectedBy"
		   });			
		addAnnotation
		  (messageViewReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "isAffectedBy"
		   });			
		addAnnotation
		  (aspectMessageViewEClass, 
		   source, 
		   new String[] {
			 "constraints", "notAffectedBySelf"
		   });			
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "constraints", "validSelfMessage argumentsSpecified createMessageIsFirst returnsSpecified boundariesNotCrossed validReturns validAssignTo deleteMessageIsLast validReturnsValue assignToAllowed noCrossingMessages validSignature"
		   });				
		addAnnotation
		  (interactionFragmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "validCoveredMultiplicity"
		   });			
		addAnnotation
		  (combinedFragmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "validOperands"
		   });			
		addAnnotation
		  (parameterValueMappingEClass, 
		   source, 
		   new String[] {
			 "constraints", "validParameterValue"
		   });			
		addAnnotation
		  (parameterValueEClass, 
		   source, 
		   new String[] {
			 "constraints", "validValueType"
		   });				
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "validUpperBound validLowerBound validMultiplicity"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";			
		addAnnotation
		  (getAspect_MandatoryAspectParameters(), 
		   source, 
		   new String[] {
			 "derivation", "let mappableElements : Set(MappableElement) = Set{} in mappableElements->union(Class.allInstances()->select(partial = true))->union(Operation.allInstances()->select(partial = true))"
		   });			
		addAnnotation
		  (structuralViewEClass, 
		   source, 
		   new String[] {
			 "uniqueTypes", "self.types->isUnique(name)",
			 "uniqueTypes$message", "\'There may be only one type of the same type\'",
			 "noTwoClassesWithSameName", "self.classes->isUnique(name)",
			 "noTwoClassesWithSameName$message", "\'Name of a class has to be unique\'"
		   });			
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "notSelfSuperType", "not self.superTypes->includes(self)",
			 "notSelfSuperType$message", "\'A class may not be it\\\'s own supertype\'"
		   });			
		addAnnotation
		  (associationEndEClass, 
		   source, 
		   new String[] {
			 "uniqueName", "self.myClass.associationEnds->select(associationEnd : AssociationEnd | associationEnd.name <> null and associationEnd.name <> \'\')->isUnique(name)",
			 "uniqueName$message", "\'AssociationEnds of a class must be unique\'"
		   });		
		addAnnotation
		  (associationEndEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.assoc.ends->select(end : AssociationEnd | end <> self)->at(1).myClass"
		   });			
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "validName", "if self.oclIsTypeOf(AssociationEnd) and self.oclAsType(AssociationEnd).navigable = false then true else self.name <> \'\' endif",
			 "validName$message", "\'Name of RAM elements may not be empty\'"
		   });			
		addAnnotation
		  (instantiationEClass, 
		   source, 
		   new String[] {
			 "aspectCannotMapSelf", "not (self.externalAspect = self.Aspect)",
			 "aspectCannotMapSelf$message", "\'Aspect may not depend on itself\'",
			 "mandatoryAspectParametersMapped", "if self.type = InstantiationType::Depends then self.externalAspect.mandatoryAspectParameters->forAll(element : MappableElement | self.mappings->exists(fromElement = element)) else true endif",
			 "mandatoryAspectParametersMapped$message", "\'Partial elements from lower-level aspects have to be mapped\'"
		   });			
		addAnnotation
		  (mappingEClass, 
		   source, 
		   new String[] {
			 "validSourceModelElement", "self.fromElement.oclIsTypeOf(Class) or self.fromElement.oclIsTypeOf(Operation)",
			 "validSourceModelElement$message", "\'The source model element may only be of type Class or Operation\'",
			 "sameTypesMapped", "self.toElements->forAll(element : MappableElement | if element.oclIsKindOf(Classifier) then self.fromElement.oclIsKindOf(Classifier) else element.oclIsTypeOf(self.fromElement.oclType()) endif)",
			 "sameTypesMapped$message", "\'Mapping must be between same types of elements\'",
			 "validMapping", "let clazz : Class = if fromElement.oclIsTypeOf(Operation) then fromElement.oclAsType(Operation).Classifier else fromElement endif in self.Instantiation.externalAspect.structuralView.classes->includes(clazz) and self.toElements->forAll(element : MappableElement | let clazz : Class = if element.oclIsTypeOf(Operation) then element.oclAsType(Operation).Classifier else element endif in if clazz.oclIsKindOf(PrimitiveType) then self.Instantiation.Aspect.structuralView.types->includes(clazz) else self.Instantiation.Aspect.structuralView.classes->includes(clazz) endif)",
			 "validMapping$message", "\'Source must be from depending aspect and targets must be from current aspect\'"
		   });			
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "messageViewDefined", "if visibility = Visibility::public and self.Classifier.oclIsTypeOf(Class) then self.Classifier.StructuralView.Aspect.messageViews->select(messageView : AbstractMessageView | messageView.oclIsTypeOf(MessageView))->one(messageView : AbstractMessageView | messageView.oclAsType(MessageView).specifies = self) else true endif",
			 "messageViewDefined$message", "\'MessageView missing for public operation\'"
		   });			
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "notVoid", "not self.type.oclIsTypeOf(RVoid)",
			 "notVoid$message", "\'The type of the parameter may not be void\'"
		   });		
		addAnnotation
		  (rVoidEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "\'void\'"
		   });		
		addAnnotation
		  (rBooleanEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "\'boolean\'"
		   });		
		addAnnotation
		  (rBooleanEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "\'java.lang.Boolean\'"
		   });		
		addAnnotation
		  (rIntEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "\'int\'"
		   });		
		addAnnotation
		  (rIntEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "\'java.lang.Integer\'"
		   });		
		addAnnotation
		  (rCharEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "\'char\'"
		   });		
		addAnnotation
		  (rCharEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "\'java.lang.Character\'"
		   });		
		addAnnotation
		  (rStringEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "\'String\'"
		   });		
		addAnnotation
		  (rStringEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "\'java.lang.String\'"
		   });		
		addAnnotation
		  (rAnyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "\'*\'"
		   });			
		addAnnotation
		  (messageViewEClass, 
		   source, 
		   new String[] {
			 "specifiesIsFirstMessage", "if not self.specification.oclIsUndefined() and self.specification.messages->size() > 0 then self.specifies = self.specification.messages->select(message : Message | not message.sendEvent.oclIsTypeOf(MessageOccurrenceSpecification))->asOrderedSet()->at(1).signature else true endif",
			 "specifiesIsFirstMessage$message", "\'The first message in the MessageView must match specifies of the MessageView\'",
			 "specificationDefined", "if not self.specifies.oclIsUndefined() then if not self.specifies.partial then not self.specification.oclIsUndefined() else true endif else true endif",
			 "specificationDefined$message", "\'A MessageView for a non-partial operation must have a specification\'",
			 "isAffectedBy", "if self.specification.oclIsUndefined() and self.specifies.partial then self.affectedBy->notEmpty() else true endif",
			 "isAffectedBy$message", "\'An empty MessageView must have at least one affectedBy\'"
		   });			
		addAnnotation
		  (messageViewReferenceEClass, 
		   source, 
		   new String[] {
			 "isAffectedBy", "self.affectedBy->size() > 0",
			 "isAffectedBy$message", "\'The MessageViewReference must have at least one affectedBy\'"
		   });			
		addAnnotation
		  (aspectMessageViewEClass, 
		   source, 
		   new String[] {
			 "notAffectedBySelf", "not self.affectedBy->includes(self)",
			 "notAffectedBySelf$message", "\'Message View may not be affected by itself\'"
		   });			
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "validSelfMessage", "if not self.receiveEvent.oclIsUndefined() and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) then if self.sendEvent.oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()->at(1) = self.receiveEvent.oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()->at(1) then self.interaction.fragments->indexOf(self.sendEvent) < self.interaction.fragments->indexOf(self.receiveEvent) else true endif else true endif",
			 "validSelfMessage$message", "\'receiveEvent of a self message may not come before the sendEvent\'",
			 "argumentsSpecified", "if self.messageSort <> MessageSort::reply and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.signature.oclIsUndefined() then let container : FragmentContainer = self.sendEvent.oclAsType(MessageOccurrenceSpecification).container in if container.fragments->includes(self.sendEvent) then self.signature.parameters->size() = self.arguments->size() and self.signature.parameters->forAll(currentParameter : Parameter | self.arguments->one(argument : ParameterValueMapping | argument.parameter = currentParameter)) else true endif else true endif",
			 "argumentsSpecified$message", "\'All arguments of the operation must be specified\'",
			 "createMessageIsFirst", "if self.messageSort = MessageSort::createMessage then if not self.receiveEvent.oclIsUndefined() and not self.receiveEvent.oclAsType(InteractionFragment).covered->isEmpty() then let event : InteractionFragment = self.receiveEvent.oclAsType(InteractionFragment) in event.covered->asOrderedSet()->at(1).coveredBy->forAll(fragment : InteractionFragment | if event.container.fragments->includes(fragment) then event.container.fragments->indexOf(fragment) >= event.container.fragments->indexOf(event) else true endif) else true endif else true endif",
			 "createMessageIsFirst$message", "\'The create message occurrence may not come after any other occurrence on this lifeline\'",
			 "returnsSpecified", "if self.messageSort = MessageSort::reply then if not self.signature.returnType.oclIsTypeOf(RVoid) then not self.returns.oclIsUndefined() else self.returns.oclIsUndefined() endif else true endif",
			 "returnsSpecified$message", "\'Reply message must have returns specified if return type is not void\'",
			 "boundariesNotCrossed", "let send : MessageOccurrenceSpecification = self.sendEvent in let receive : MessageOccurrenceSpecification = self.receiveEvent in if send.container.oclIsTypeOf(InteractionOperand) and receive.container.oclIsTypeOf(InteractionOperand) then send.container.oclAsType(InteractionOperand).CombinedFragment.covered->includes(send.covered->asOrderedSet()->at(1)) and receive.container.oclAsType(InteractionOperand).CombinedFragment.covered->includes(receive.covered->asOrderedSet()->at(1)) else true endif",
			 "boundariesNotCrossed$message", "\'Messages may not cross boundaries of CombinedFragments or their operands\'",
			 "validReturns", "if not self.returns.oclIsUndefined() then self.messageSort = MessageSort::reply else true endif",
			 "validReturns$message", "\'Returns may only be specified if message sort is reply message\'",
			 "validAssignTo", "if not self.assignTo.oclIsUndefined() then let type : Type = if self.assignTo.oclIsTypeOf(Attribute) then self.assignTo.oclAsType(Attribute).type else if self.assignTo.oclIsTypeOf(Reference) then self.assignTo.oclAsType(Reference).type else self.assignTo.oclAsType(AssociationEnd).getType() endif endif in type.oclIsKindOf(self.signature.returnType.oclType()) else true endif",
			 "validAssignTo$message", "\'Return type of signature operation must match the type of assignTo\'",
			 "deleteMessageIsLast", "if self.messageSort = MessageSort::deleteMessage then if not self.receiveEvent.oclIsUndefined() and not self.receiveEvent.oclAsType(InteractionFragment).covered->isEmpty() then let event : InteractionFragment = self.receiveEvent.oclAsType(InteractionFragment) in event.covered->asOrderedSet()->at(1).coveredBy->forAll(fragment : InteractionFragment | if event.container.fragments->includes(fragment) then event.container.fragments->indexOf(fragment) <= event.container.fragments->indexOf(event) else true endif) else true endif else true endif",
			 "deleteMessageIsLast$message", "\'The destruction occurrence may not come before any other occurrence on this lifeline\'",
			 "validReturnsValue", "if self.returns.oclIsTypeOf(StructuralFeatureValue) then let value : StructuralFeatureValue = self.returns.oclAsType(StructuralFeatureValue).value in if not value.oclIsUndefined() then let type : Type = if value.oclIsTypeOf(Attribute) then value.oclAsType(Attribute).type else if value.oclIsTypeOf(Reference) then value.oclAsType(Reference).type else value.oclAsType(AssociationEnd).getType() endif endif in type.oclIsTypeOf(self.signature.returnType.oclType()) else true endif else if self.returns.oclIsKindOf(LiteralSpecification) then false else true endif endif",
			 "validReturnsValue$message", "\'Type of return value must match the type of the return\'",
			 "assignToAllowed", "if self.signature.returnType.oclIsTypeOf(RVoid) then self.assignTo = null else true endif",
			 "assignToAllowed$message", "\'assignTo may not be specified for operations whose return type is void\'",
			 "noCrossingMessages", "if not self.receiveEvent.oclIsUndefined() and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) then let container : FragmentContainer = self.receiveEvent.oclAsType(MessageOccurrenceSpecification).container in let indexDifference : Integer = container.fragments->indexOf(self.receiveEvent) - container.fragments->indexOf(self.sendEvent) in indexDifference = 1 else true endif",
			 "noCrossingMessages$message", "\'Messages may not cross each other, MessageEnds of one message must come one after the other (also, send must come before receive)\'",
			 "validSignature", "if self.messageSort <> MessageSort::reply and not self.receiveEvent.oclIsUndefined() then let typedElement : TypedElement = self.receiveEvent.oclAsType(InteractionFragment).covered->asOrderedSet()->at(1).represents in if not typedElement.oclIsUndefined() then let type : Type = if typedElement.oclIsTypeOf(Parameter) then typedElement.oclAsType(Parameter).type else if typedElement.oclIsTypeOf(Attribute) then typedElement.oclAsType(Attribute).type else if typedElement.oclIsTypeOf(Reference) then typedElement.oclAsType(Reference).type else typedElement.oclAsType(AssociationEnd).getType() endif endif endif in if type.oclIsKindOf(Classifier) then type.oclAsType(Classifier).operations->includes(self.signature) else true endif else true endif else true endif",
			 "validSignature$message", "\'Message signature must be an operation of the classifier that is represented by the lifeline of the receive event\'"
		   });		
		addAnnotation
		  (getMessage_SelfMessage(), 
		   source, 
		   new String[] {
			 "derivation", "if self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) then self.sendEvent.oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()->at(1) = self.receiveEvent.oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()->at(1) else false endif"
		   });			
		addAnnotation
		  (interactionFragmentEClass, 
		   source, 
		   new String[] {
			 "validCoveredMultiplicity", "if not self.oclIsTypeOf(CombinedFragment) and covered->notEmpty() then covered->size() = 1 else true endif",
			 "validCoveredMultiplicity$message", "\'InteractionFragment may only have one Lifeline it covers (except CombinedFragment)\'"
		   });			
		addAnnotation
		  (combinedFragmentEClass, 
		   source, 
		   new String[] {
			 "validOperands", "if self.interactionOperator = InteractionOperatorKind::opt or self.interactionOperator = InteractionOperatorKind::loop or self.interactionOperator = InteractionOperatorKind::critical then self.operands->size() = 1 else true endif",
			 "validOperands$message", "\'opt and loop fragments may only have one operand\'"
		   });			
		addAnnotation
		  (parameterValueMappingEClass, 
		   source, 
		   new String[] {
			 "validParameterValue", "if self.value.oclIsTypeOf(StructuralFeatureValue) then let value : StructuralFeatureValue = self.value.oclAsType(StructuralFeatureValue).value in if not value.oclIsUndefined() then let type : Type = if value.oclIsTypeOf(Attribute) then value.oclAsType(Attribute).type else if value.oclIsTypeOf(Reference) then value.oclAsType(Reference).type else value.oclAsType(AssociationEnd).getType() endif endif in type.oclIsTypeOf(self.parameter.type.oclType()) else true endif else if self.value.oclIsKindOf(LiteralSpecification) then false else true endif endif",
			 "validParameterValue$message", "\'Type of value must match the type of the parameter\'"
		   });			
		addAnnotation
		  (parameterValueEClass, 
		   source, 
		   new String[] {
			 "validValueType", "self.parameter.type.oclIsTypeOf(self.ParameterValueMapping.parameter.type.oclType())",
			 "validValueType$message", "\'Type of value must match the type of the parameter\'"
		   });		
		addAnnotation
		  (rCollectionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "let partial : String = if type.oclIsTypeOf(Class) and type.oclAsType(Class).partial or type.oclIsTypeOf(Operation) and type.oclAsType(Operation).partial then \'|\' else \'\' endif in let name : String = self.oclType().name.substring(2, self.oclType().name.size()) in if type.name.oclIsUndefined() then name else name + \'<\' + partial + type.name + \'>\' endif"
		   });			
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "validUpperBound", "self.upperBound > 0 or self.upperBound = - 1",
			 "validUpperBound$message", "\'The upperbound must be greater than zero or -1 representing *\'",
			 "validLowerBound", "self.lowerBound >= 0",
			 "validLowerBound$message", "\'The lowerbound must be greater than or equal to zero\'",
			 "validMultiplicity", "self.lowerBound <= self.upperBound or self.upperBound = - 1",
			 "validMultiplicity$message", "\'The lowerBound must be less than or equal to the upperBound\'"
		   });
	}

} //RamPackageImpl
