/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ram.RamFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.mcgill.ca/sel/ram/2.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RamPackage eINSTANCE = ram.impl.RamPackageImpl.init();

	/**
	 * The meta object id for the '{@link ram.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.NamedElementImpl
	 * @see ram.impl.RamPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ram.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.AspectImpl
	 * @see ram.impl.RamPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Structural View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__STRUCTURAL_VIEW = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory Aspect Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__MANDATORY_ASPECT_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__MESSAGE_VIEWS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instantiations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__INSTANTIATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__LAYOUT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__STATE_VIEWS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ram.impl.MappableElementImpl <em>Mappable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.MappableElementImpl
	 * @see ram.impl.RamPackageImpl#getMappableElement()
	 * @generated
	 */
	int MAPPABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Mappable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.StructuralViewImpl <em>Structural View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.StructuralViewImpl
	 * @see ram.impl.RamPackageImpl#getStructuralView()
	 * @generated
	 */
	int STRUCTURAL_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_VIEW__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_VIEW__ASSOCIATIONS = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_VIEW__TYPES = 2;

	/**
	 * The number of structural features of the '<em>Structural View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_VIEW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ram.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.TypeImpl
	 * @see ram.impl.RamPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ObjectTypeImpl
	 * @see ram.impl.RamPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ClassifierImpl
	 * @see ram.impl.RamPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OPERATIONS = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ClassImpl
	 * @see ram.impl.RamPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OPERATIONS = CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Association Ends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ASSOCIATION_ENDS = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PARTIAL = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ABSTRACT = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_TYPES = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ram.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.TypedElementImpl
	 * @see ram.impl.RamPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.StructuralFeatureImpl
	 * @see ram.impl.RamPackageImpl#getStructuralFeature()
	 * @generated
	 */
	int STRUCTURAL_FEATURE = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__STATIC = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.PropertyImpl
	 * @see ram.impl.RamPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__STATIC = STRUCTURAL_FEATURE__STATIC;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_BOUND = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_BOUND = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REFERENCE_TYPE = STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ram.impl.AssociationEndImpl <em>Association End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.AssociationEndImpl
	 * @see ram.impl.RamPackageImpl#getAssociationEnd()
	 * @generated
	 */
	int ASSOCIATION_END = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__STATIC = PROPERTY__STATIC;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__LOWER_BOUND = PROPERTY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__UPPER_BOUND = PROPERTY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__REFERENCE_TYPE = PROPERTY__REFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__NAVIGABLE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assoc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__ASSOC = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>My Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__MY_CLASS = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ram.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.AssociationImpl
	 * @see ram.impl.RamPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ENDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.InstantiationImpl <em>Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.InstantiationImpl
	 * @see ram.impl.RamPackageImpl#getInstantiation()
	 * @generated
	 */
	int INSTANTIATION = 7;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__MAPPINGS = 0;

	/**
	 * The feature id for the '<em><b>External Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__EXTERNAL_ASPECT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ram.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.MappingImpl
	 * @see ram.impl.RamPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 8;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ram.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.OperationImpl
	 * @see ram.impl.RamPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__STATIC = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARTIAL = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ram.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.AttributeImpl
	 * @see ram.impl.RamPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STATIC = STRUCTURAL_FEATURE__STATIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ParameterImpl
	 * @see ram.impl.RamPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.PrimitiveTypeImpl
	 * @see ram.impl.RamPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OPERATIONS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__INSTANCE_CLASS_NAME = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ram.impl.RVoidImpl <em>RVoid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RVoidImpl
	 * @see ram.impl.RamPackageImpl#getRVoid()
	 * @generated
	 */
	int RVOID = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVOID__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>RVoid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVOID_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.RBooleanImpl <em>RBoolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RBooleanImpl
	 * @see ram.impl.RamPackageImpl#getRBoolean()
	 * @generated
	 */
	int RBOOLEAN = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBOOLEAN__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBOOLEAN__OPERATIONS = PRIMITIVE_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBOOLEAN__INSTANCE_CLASS_NAME = PRIMITIVE_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The number of structural features of the '<em>RBoolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.RIntImpl <em>RInt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RIntImpl
	 * @see ram.impl.RamPackageImpl#getRInt()
	 * @generated
	 */
	int RINT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RINT__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RINT__OPERATIONS = PRIMITIVE_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RINT__INSTANCE_CLASS_NAME = PRIMITIVE_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The number of structural features of the '<em>RInt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RINT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.RCharImpl <em>RChar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RCharImpl
	 * @see ram.impl.RamPackageImpl#getRChar()
	 * @generated
	 */
	int RCHAR = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCHAR__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCHAR__OPERATIONS = PRIMITIVE_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCHAR__INSTANCE_CLASS_NAME = PRIMITIVE_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The number of structural features of the '<em>RChar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCHAR_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.RStringImpl <em>RString</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RStringImpl
	 * @see ram.impl.RamPackageImpl#getRString()
	 * @generated
	 */
	int RSTRING = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSTRING__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSTRING__OPERATIONS = PRIMITIVE_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSTRING__INSTANCE_CLASS_NAME = PRIMITIVE_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The number of structural features of the '<em>RString</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSTRING_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.RAnyImpl <em>RAny</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RAnyImpl
	 * @see ram.impl.RamPackageImpl#getRAny()
	 * @generated
	 */
	int RANY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANY__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>RAny</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.REnumImpl <em>REnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.REnumImpl
	 * @see ram.impl.RamPackageImpl#getREnum()
	 * @generated
	 */
	int RENUM = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENUM__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENUM__OPERATIONS = PRIMITIVE_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENUM__INSTANCE_CLASS_NAME = PRIMITIVE_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENUM__LITERALS = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>REnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENUM_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.REnumLiteralImpl <em>REnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.REnumLiteralImpl
	 * @see ram.impl.RamPackageImpl#getREnumLiteral()
	 * @generated
	 */
	int RENUM_LITERAL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENUM_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENUM_LITERAL__ENUM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>REnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENUM_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.AbstractMessageViewImpl <em>Abstract Message View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.AbstractMessageViewImpl
	 * @see ram.impl.RamPackageImpl#getAbstractMessageView()
	 * @generated
	 */
	int ABSTRACT_MESSAGE_VIEW = 23;

	/**
	 * The feature id for the '<em><b>Affected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESSAGE_VIEW__AFFECTED_BY = 0;

	/**
	 * The number of structural features of the '<em>Abstract Message View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ram.impl.MessageViewImpl <em>Message View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.MessageViewImpl
	 * @see ram.impl.RamPackageImpl#getMessageView()
	 * @generated
	 */
	int MESSAGE_VIEW = 24;

	/**
	 * The feature id for the '<em><b>Affected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VIEW__AFFECTED_BY = ABSTRACT_MESSAGE_VIEW__AFFECTED_BY;

	/**
	 * The feature id for the '<em><b>Specifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VIEW__SPECIFIES = ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VIEW__SPECIFICATION = ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VIEW_FEATURE_COUNT = ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ram.impl.MessageViewReferenceImpl <em>Message View Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.MessageViewReferenceImpl
	 * @see ram.impl.RamPackageImpl#getMessageViewReference()
	 * @generated
	 */
	int MESSAGE_VIEW_REFERENCE = 25;

	/**
	 * The feature id for the '<em><b>Affected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VIEW_REFERENCE__AFFECTED_BY = ABSTRACT_MESSAGE_VIEW__AFFECTED_BY;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VIEW_REFERENCE__REFERENCES = ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message View Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VIEW_REFERENCE_FEATURE_COUNT = ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.FragmentContainerImpl <em>Fragment Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.FragmentContainerImpl
	 * @see ram.impl.RamPackageImpl#getFragmentContainer()
	 * @generated
	 */
	int FRAGMENT_CONTAINER = 47;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_CONTAINER__FRAGMENTS = 0;

	/**
	 * The number of structural features of the '<em>Fragment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ram.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.InteractionImpl
	 * @see ram.impl.RamPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 26;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FRAGMENTS = FRAGMENT_CONTAINER__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Lifelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__LIFELINES = FRAGMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__MESSAGES = FRAGMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PROPERTIES = FRAGMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formal Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FORMAL_GATES = FRAGMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = FRAGMENT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ram.impl.AspectMessageViewImpl <em>Aspect Message View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.AspectMessageViewImpl
	 * @see ram.impl.RamPackageImpl#getAspectMessageView()
	 * @generated
	 */
	int ASPECT_MESSAGE_VIEW = 27;

	/**
	 * The feature id for the '<em><b>Affected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_MESSAGE_VIEW__AFFECTED_BY = ABSTRACT_MESSAGE_VIEW__AFFECTED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_MESSAGE_VIEW__NAME = ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pointcut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_MESSAGE_VIEW__POINTCUT = ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_MESSAGE_VIEW__ADVICE = ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aspect Message View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_MESSAGE_VIEW_FEATURE_COUNT = ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ram.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.LifelineImpl
	 * @see ram.impl.RamPackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 28;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__REPRESENTS = 0;

	/**
	 * The feature id for the '<em><b>Local Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__LOCAL_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Covered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__COVERED_BY = 2;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ram.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.MessageImpl
	 * @see ram.impl.RamPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 29;

	/**
	 * The feature id for the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SEND_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SIGNATURE = 2;

	/**
	 * The feature id for the '<em><b>Assign To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ASSIGN_TO = 3;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_SORT = 4;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ARGUMENTS = 5;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__INTERACTION = 6;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RETURNS = 7;

	/**
	 * The feature id for the '<em><b>Self Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SELF_MESSAGE = 8;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link ram.impl.MessageEndImpl <em>Message End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.MessageEndImpl
	 * @see ram.impl.RamPackageImpl#getMessageEnd()
	 * @generated
	 */
	int MESSAGE_END = 30;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Message End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ram.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.InteractionFragmentImpl
	 * @see ram.impl.RamPackageImpl#getInteractionFragment()
	 * @generated
	 */
	int INTERACTION_FRAGMENT = 34;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__COVERED = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ram.impl.OccurrenceSpecificationImpl <em>Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.OccurrenceSpecificationImpl
	 * @see ram.impl.RamPackageImpl#getOccurrenceSpecification()
	 * @generated
	 */
	int OCCURRENCE_SPECIFICATION = 32;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__CONTAINER = INTERACTION_FRAGMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.MessageOccurrenceSpecificationImpl <em>Message Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.MessageOccurrenceSpecificationImpl
	 * @see ram.impl.RamPackageImpl#getMessageOccurrenceSpecification()
	 * @generated
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION = 31;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__COVERED = OCCURRENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__CONTAINER = OCCURRENCE_SPECIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE = OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.DestructionOccurrenceSpecificationImpl <em>Destruction Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.DestructionOccurrenceSpecificationImpl
	 * @see ram.impl.RamPackageImpl#getDestructionOccurrenceSpecification()
	 * @generated
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION = 33;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__COVERED = MESSAGE_OCCURRENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__CONTAINER = MESSAGE_OCCURRENCE_SPECIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__MESSAGE = MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE;

	/**
	 * The number of structural features of the '<em>Destruction Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = MESSAGE_OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.CombinedFragmentImpl
	 * @see ram.impl.RamPackageImpl#getCombinedFragment()
	 * @generated
	 */
	int COMBINED_FRAGMENT = 35;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__CONTAINER = INTERACTION_FRAGMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Interaction Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__INTERACTION_OPERATOR = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OPERANDS = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ram.impl.OriginalBehaviorExecutionImpl <em>Original Behavior Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.OriginalBehaviorExecutionImpl
	 * @see ram.impl.RamPackageImpl#getOriginalBehaviorExecution()
	 * @generated
	 */
	int ORIGINAL_BEHAVIOR_EXECUTION = 36;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_BEHAVIOR_EXECUTION__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_BEHAVIOR_EXECUTION__CONTAINER = INTERACTION_FRAGMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Original Behavior Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_BEHAVIOR_EXECUTION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.ExecutionStatementImpl <em>Execution Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ExecutionStatementImpl
	 * @see ram.impl.RamPackageImpl#getExecutionStatement()
	 * @generated
	 */
	int EXECUTION_STATEMENT = 37;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATEMENT__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATEMENT__CONTAINER = INTERACTION_FRAGMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATEMENT__SPECIFICATION = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATEMENT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.InteractionOperandImpl <em>Interaction Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.InteractionOperandImpl
	 * @see ram.impl.RamPackageImpl#getInteractionOperand()
	 * @generated
	 */
	int INTERACTION_OPERAND = 38;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__FRAGMENTS = FRAGMENT_CONTAINER__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Interaction Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__INTERACTION_CONSTRAINT = FRAGMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND_FEATURE_COUNT = FRAGMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ValueSpecificationImpl
	 * @see ram.impl.RamPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 39;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ram.impl.StructuralFeatureValueImpl <em>Structural Feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.StructuralFeatureValueImpl
	 * @see ram.impl.RamPackageImpl#getStructuralFeatureValue()
	 * @generated
	 */
	int STRUCTURAL_FEATURE_VALUE = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_VALUE__VALUE = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structural Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_VALUE_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.ParameterValueMappingImpl <em>Parameter Value Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ParameterValueMappingImpl
	 * @see ram.impl.RamPackageImpl#getParameterValueMapping()
	 * @generated
	 */
	int PARAMETER_VALUE_MAPPING = 41;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_MAPPING__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_MAPPING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Value Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ram.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ParameterValueImpl
	 * @see ram.impl.RamPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 42;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__PARAMETER = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.OpaqueExpressionImpl
	 * @see ram.impl.RamPackageImpl#getOpaqueExpression()
	 * @generated
	 */
	int OPAQUE_EXPRESSION = 43;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__BODY = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__LANGUAGE = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ram.impl.LiteralSpecificationImpl <em>Literal Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.LiteralSpecificationImpl
	 * @see ram.impl.RamPackageImpl#getLiteralSpecification()
	 * @generated
	 */
	int LITERAL_SPECIFICATION = 44;

	/**
	 * The number of structural features of the '<em>Literal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.LiteralStringImpl <em>Literal String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.LiteralStringImpl
	 * @see ram.impl.RamPackageImpl#getLiteralString()
	 * @generated
	 */
	int LITERAL_STRING = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.LiteralIntegerImpl
	 * @see ram.impl.RamPackageImpl#getLiteralInteger()
	 * @generated
	 */
	int LITERAL_INTEGER = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.RCollectionImpl <em>RCollection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RCollectionImpl
	 * @see ram.impl.RamPackageImpl#getRCollection()
	 * @generated
	 */
	int RCOLLECTION = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCOLLECTION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCOLLECTION__OPERATIONS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCOLLECTION__INSTANCE_CLASS_NAME = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCOLLECTION__TYPE = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RCollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCOLLECTION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ram.impl.RSetImpl <em>RSet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RSetImpl
	 * @see ram.impl.RamPackageImpl#getRSet()
	 * @generated
	 */
	int RSET = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSET__NAME = RCOLLECTION__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSET__OPERATIONS = RCOLLECTION__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSET__INSTANCE_CLASS_NAME = RCOLLECTION__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSET__TYPE = RCOLLECTION__TYPE;

	/**
	 * The number of structural features of the '<em>RSet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSET_FEATURE_COUNT = RCOLLECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.RSequenceImpl <em>RSequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RSequenceImpl
	 * @see ram.impl.RamPackageImpl#getRSequence()
	 * @generated
	 */
	int RSEQUENCE = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEQUENCE__NAME = RCOLLECTION__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEQUENCE__OPERATIONS = RCOLLECTION__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEQUENCE__INSTANCE_CLASS_NAME = RCOLLECTION__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEQUENCE__TYPE = RCOLLECTION__TYPE;

	/**
	 * The number of structural features of the '<em>RSequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEQUENCE_FEATURE_COUNT = RCOLLECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.LayoutImpl
	 * @see ram.impl.RamPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 51;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CONTAINERS = 0;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ram.impl.ContainerMapImpl <em>Container Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ContainerMapImpl
	 * @see ram.impl.RamPackageImpl#getContainerMap()
	 * @generated
	 */
	int CONTAINER_MAP = 52;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Container Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ram.impl.ElementMapImpl <em>Element Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ElementMapImpl
	 * @see ram.impl.RamPackageImpl#getElementMap()
	 * @generated
	 */
	int ELEMENT_MAP = 53;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Element Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ram.impl.LayoutElementImpl <em>Layout Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.LayoutElementImpl
	 * @see ram.impl.RamPackageImpl#getLayoutElement()
	 * @generated
	 */
	int LAYOUT_ELEMENT = 54;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ELEMENT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ELEMENT__Y = 1;

	/**
	 * The number of structural features of the '<em>Layout Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ram.impl.ImplementationClassImpl <em>Implementation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ImplementationClassImpl
	 * @see ram.impl.RamPackageImpl#getImplementationClass()
	 * @generated
	 */
	int IMPLEMENTATION_CLASS = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS__OPERATIONS = CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS__INSTANCE_CLASS_NAME = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implementation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.TemporaryPropertyImpl <em>Temporary Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.TemporaryPropertyImpl
	 * @see ram.impl.RamPackageImpl#getTemporaryProperty()
	 * @generated
	 */
	int TEMPORARY_PROPERTY = 57;

	/**
	 * The number of structural features of the '<em>Temporary Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORARY_PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ram.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ReferenceImpl
	 * @see ram.impl.RamPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__STATIC = PROPERTY__STATIC;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LOWER_BOUND = PROPERTY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__UPPER_BOUND = PROPERTY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE_TYPE = PROPERTY__REFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.GateImpl
	 * @see ram.impl.RamPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 62;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__MESSAGE = MESSAGE_END__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = MESSAGE_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = MESSAGE_END_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.LiteralBooleanImpl
	 * @see ram.impl.RamPackageImpl#getLiteralBoolean()
	 * @generated
	 */
	int LITERAL_BOOLEAN = 63;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ram.impl.ClassifierMappingImpl <em>Classifier Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ClassifierMappingImpl
	 * @see ram.impl.RamPackageImpl#getClassifierMapping()
	 * @generated
	 */
	int CLASSIFIER_MAPPING = 64;

	/**
	 * The feature id for the '<em><b>Operation Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAPPING__OPERATION_MAPPINGS = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAPPING__FROM_ELEMENT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAPPING__TO_ELEMENT = MAPPING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classifier Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ram.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.AttributeMappingImpl
	 * @see ram.impl.RamPackageImpl#getAttributeMapping()
	 * @generated
	 */
	int ATTRIBUTE_MAPPING = 65;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__FROM_ELEMENT = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__TO_ELEMENT = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ram.impl.OperationMappingImpl <em>Operation Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.OperationMappingImpl
	 * @see ram.impl.RamPackageImpl#getOperationMapping()
	 * @generated
	 */
	int OPERATION_MAPPING = 66;

	/**
	 * The feature id for the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MAPPING__PARAMETER_MAPPINGS = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MAPPING__FROM_ELEMENT = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MAPPING__TO_ELEMENT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ram.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ParameterMappingImpl
	 * @see ram.impl.RamPackageImpl#getParameterMapping()
	 * @generated
	 */
	int PARAMETER_MAPPING = 67;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__FROM_ELEMENT = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__TO_ELEMENT = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ram.impl.StateViewImpl <em>State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.StateViewImpl
	 * @see ram.impl.RamPackageImpl#getStateView()
	 * @generated
	 */
	int STATE_VIEW = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VIEW__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VIEW__STATE_MACHINES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VIEW__SPECIFIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VIEW_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ram.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.StateMachineImpl
	 * @see ram.impl.RamPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 69;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__START = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__SUBSTITUTIONS = 3;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ram.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.TransitionImpl
	 * @see ram.impl.RamPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>End State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__END_STATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__START_STATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SIGNATURE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ram.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.StateImpl
	 * @see ram.impl.RamPackageImpl#getState()
	 * @generated
	 */
	int STATE = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOINGS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ram.impl.RDoubleImpl <em>RDouble</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RDoubleImpl
	 * @see ram.impl.RamPackageImpl#getRDouble()
	 * @generated
	 */
	int RDOUBLE = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDOUBLE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDOUBLE__OPERATIONS = PRIMITIVE_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDOUBLE__INSTANCE_CLASS_NAME = PRIMITIVE_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The number of structural features of the '<em>RDouble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.RFloatImpl <em>RFloat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.RFloatImpl
	 * @see ram.impl.RamPackageImpl#getRFloat()
	 * @generated
	 */
	int RFLOAT = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLOAT__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLOAT__OPERATIONS = PRIMITIVE_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLOAT__INSTANCE_CLASS_NAME = PRIMITIVE_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The number of structural features of the '<em>RFloat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLOAT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ram.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.ConstraintImpl
	 * @see ram.impl.RamPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 74;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ram.impl.SubstitutionImpl <em>Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.SubstitutionImpl
	 * @see ram.impl.RamPackageImpl#getSubstitution()
	 * @generated
	 */
	int SUBSTITUTION = 75;

	/**
	 * The number of structural features of the '<em>Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ram.impl.TransitionSubstitutionImpl <em>Transition Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.impl.TransitionSubstitutionImpl
	 * @see ram.impl.RamPackageImpl#getTransitionSubstitution()
	 * @generated
	 */
	int TRANSITION_SUBSTITUTION = 76;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SUBSTITUTION__FROM = SUBSTITUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SUBSTITUTION__TO = SUBSTITUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SUBSTITUTION_FEATURE_COUNT = SUBSTITUTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ram.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.Visibility
	 * @see ram.impl.RamPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 77;

	/**
	 * The meta object id for the '{@link ram.ReferenceType <em>Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.ReferenceType
	 * @see ram.impl.RamPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 78;

	/**
	 * The meta object id for the '{@link ram.MessageSort <em>Message Sort</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.MessageSort
	 * @see ram.impl.RamPackageImpl#getMessageSort()
	 * @generated
	 */
	int MESSAGE_SORT = 79;

	/**
	 * The meta object id for the '{@link ram.InteractionOperatorKind <em>Interaction Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.InteractionOperatorKind
	 * @see ram.impl.RamPackageImpl#getInteractionOperatorKind()
	 * @generated
	 */
	int INTERACTION_OPERATOR_KIND = 80;

	/**
	 * The meta object id for the '{@link ram.InstantiationType <em>Instantiation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ram.InstantiationType
	 * @see ram.impl.RamPackageImpl#getInstantiationType()
	 * @generated
	 */
	int INSTANTIATION_TYPE = 81;


	/**
	 * Returns the meta object for class '{@link ram.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see ram.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the containment reference '{@link ram.Aspect#getStructuralView <em>Structural View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structural View</em>'.
	 * @see ram.Aspect#getStructuralView()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_StructuralView();

	/**
	 * Returns the meta object for the reference list '{@link ram.Aspect#getMandatoryAspectParameters <em>Mandatory Aspect Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Aspect Parameters</em>'.
	 * @see ram.Aspect#getMandatoryAspectParameters()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_MandatoryAspectParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Aspect#getMessageViews <em>Message Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Views</em>'.
	 * @see ram.Aspect#getMessageViews()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_MessageViews();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Aspect#getInstantiations <em>Instantiations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instantiations</em>'.
	 * @see ram.Aspect#getInstantiations()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Instantiations();

	/**
	 * Returns the meta object for the containment reference '{@link ram.Aspect#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see ram.Aspect#getLayout()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Aspect#getStateViews <em>State Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Views</em>'.
	 * @see ram.Aspect#getStateViews()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_StateViews();

	/**
	 * Returns the meta object for class '{@link ram.MappableElement <em>Mappable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mappable Element</em>'.
	 * @see ram.MappableElement
	 * @generated
	 */
	EClass getMappableElement();

	/**
	 * Returns the meta object for class '{@link ram.StructuralView <em>Structural View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural View</em>'.
	 * @see ram.StructuralView
	 * @generated
	 */
	EClass getStructuralView();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.StructuralView#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see ram.StructuralView#getClasses()
	 * @see #getStructuralView()
	 * @generated
	 */
	EReference getStructuralView_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.StructuralView#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associations</em>'.
	 * @see ram.StructuralView#getAssociations()
	 * @see #getStructuralView()
	 * @generated
	 */
	EReference getStructuralView_Associations();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.StructuralView#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see ram.StructuralView#getTypes()
	 * @see #getStructuralView()
	 * @generated
	 */
	EReference getStructuralView_Types();

	/**
	 * Returns the meta object for class '{@link ram.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see ram.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Class#getAssociationEnds <em>Association Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Ends</em>'.
	 * @see ram.Class#getAssociationEnds()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_AssociationEnds();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ram.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link ram.Class#isPartial <em>Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partial</em>'.
	 * @see ram.Class#isPartial()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Partial();

	/**
	 * Returns the meta object for the attribute '{@link ram.Class#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see ram.Class#isAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Abstract();

	/**
	 * Returns the meta object for the reference list '{@link ram.Class#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see ram.Class#getSuperTypes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SuperTypes();

	/**
	 * Returns the meta object for class '{@link ram.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association End</em>'.
	 * @see ram.AssociationEnd
	 * @generated
	 */
	EClass getAssociationEnd();

	/**
	 * Returns the meta object for the attribute '{@link ram.AssociationEnd#isNavigable <em>Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigable</em>'.
	 * @see ram.AssociationEnd#isNavigable()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_Navigable();

	/**
	 * Returns the meta object for the reference '{@link ram.AssociationEnd#getAssoc <em>Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assoc</em>'.
	 * @see ram.AssociationEnd#getAssoc()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EReference getAssociationEnd_Assoc();

	/**
	 * Returns the meta object for the container reference '{@link ram.AssociationEnd#getMyClass <em>My Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>My Class</em>'.
	 * @see ram.AssociationEnd#getMyClass()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EReference getAssociationEnd_MyClass();

	/**
	 * Returns the meta object for class '{@link ram.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see ram.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference list '{@link ram.Association#getEnds <em>Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ends</em>'.
	 * @see ram.Association#getEnds()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Ends();

	/**
	 * Returns the meta object for class '{@link ram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ram.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ram.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ram.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ram.Instantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation</em>'.
	 * @see ram.Instantiation
	 * @generated
	 */
	EClass getInstantiation();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Instantiation#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see ram.Instantiation#getMappings()
	 * @see #getInstantiation()
	 * @generated
	 */
	EReference getInstantiation_Mappings();

	/**
	 * Returns the meta object for the reference '{@link ram.Instantiation#getExternalAspect <em>External Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Aspect</em>'.
	 * @see ram.Instantiation#getExternalAspect()
	 * @see #getInstantiation()
	 * @generated
	 */
	EReference getInstantiation_ExternalAspect();

	/**
	 * Returns the meta object for the attribute '{@link ram.Instantiation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ram.Instantiation#getType()
	 * @see #getInstantiation()
	 * @generated
	 */
	EAttribute getInstantiation_Type();

	/**
	 * Returns the meta object for class '{@link ram.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see ram.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for class '{@link ram.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ram.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link ram.Operation#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see ram.Operation#isAbstract()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link ram.Operation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see ram.Operation#getVisibility()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Visibility();

	/**
	 * Returns the meta object for the reference '{@link ram.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see ram.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see ram.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link ram.Operation#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see ram.Operation#isStatic()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Static();

	/**
	 * Returns the meta object for the attribute '{@link ram.Operation#isPartial <em>Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partial</em>'.
	 * @see ram.Operation#isPartial()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Partial();

	/**
	 * Returns the meta object for class '{@link ram.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ram.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link ram.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ram.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link ram.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see ram.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link ram.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see ram.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link ram.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ram.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link ram.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see ram.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link ram.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see ram.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for class '{@link ram.RVoid <em>RVoid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RVoid</em>'.
	 * @see ram.RVoid
	 * @generated
	 */
	EClass getRVoid();

	/**
	 * Returns the meta object for class '{@link ram.RBoolean <em>RBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RBoolean</em>'.
	 * @see ram.RBoolean
	 * @generated
	 */
	EClass getRBoolean();

	/**
	 * Returns the meta object for class '{@link ram.RInt <em>RInt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RInt</em>'.
	 * @see ram.RInt
	 * @generated
	 */
	EClass getRInt();

	/**
	 * Returns the meta object for class '{@link ram.RChar <em>RChar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RChar</em>'.
	 * @see ram.RChar
	 * @generated
	 */
	EClass getRChar();

	/**
	 * Returns the meta object for class '{@link ram.RString <em>RString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RString</em>'.
	 * @see ram.RString
	 * @generated
	 */
	EClass getRString();

	/**
	 * Returns the meta object for class '{@link ram.RAny <em>RAny</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAny</em>'.
	 * @see ram.RAny
	 * @generated
	 */
	EClass getRAny();

	/**
	 * Returns the meta object for class '{@link ram.REnum <em>REnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REnum</em>'.
	 * @see ram.REnum
	 * @generated
	 */
	EClass getREnum();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.REnum#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see ram.REnum#getLiterals()
	 * @see #getREnum()
	 * @generated
	 */
	EReference getREnum_Literals();

	/**
	 * Returns the meta object for class '{@link ram.REnumLiteral <em>REnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REnum Literal</em>'.
	 * @see ram.REnumLiteral
	 * @generated
	 */
	EClass getREnumLiteral();

	/**
	 * Returns the meta object for the container reference '{@link ram.REnumLiteral#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enum</em>'.
	 * @see ram.REnumLiteral#getEnum()
	 * @see #getREnumLiteral()
	 * @generated
	 */
	EReference getREnumLiteral_Enum();

	/**
	 * Returns the meta object for class '{@link ram.AbstractMessageView <em>Abstract Message View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Message View</em>'.
	 * @see ram.AbstractMessageView
	 * @generated
	 */
	EClass getAbstractMessageView();

	/**
	 * Returns the meta object for the reference list '{@link ram.AbstractMessageView#getAffectedBy <em>Affected By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected By</em>'.
	 * @see ram.AbstractMessageView#getAffectedBy()
	 * @see #getAbstractMessageView()
	 * @generated
	 */
	EReference getAbstractMessageView_AffectedBy();

	/**
	 * Returns the meta object for class '{@link ram.MessageView <em>Message View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message View</em>'.
	 * @see ram.MessageView
	 * @generated
	 */
	EClass getMessageView();

	/**
	 * Returns the meta object for the reference '{@link ram.MessageView#getSpecifies <em>Specifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specifies</em>'.
	 * @see ram.MessageView#getSpecifies()
	 * @see #getMessageView()
	 * @generated
	 */
	EReference getMessageView_Specifies();

	/**
	 * Returns the meta object for the containment reference '{@link ram.MessageView#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see ram.MessageView#getSpecification()
	 * @see #getMessageView()
	 * @generated
	 */
	EReference getMessageView_Specification();

	/**
	 * Returns the meta object for class '{@link ram.MessageViewReference <em>Message View Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message View Reference</em>'.
	 * @see ram.MessageViewReference
	 * @generated
	 */
	EClass getMessageViewReference();

	/**
	 * Returns the meta object for the reference '{@link ram.MessageViewReference#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>References</em>'.
	 * @see ram.MessageViewReference#getReferences()
	 * @see #getMessageViewReference()
	 * @generated
	 */
	EReference getMessageViewReference_References();

	/**
	 * Returns the meta object for class '{@link ram.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see ram.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Interaction#getLifelines <em>Lifelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifelines</em>'.
	 * @see ram.Interaction#getLifelines()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Lifelines();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Interaction#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see ram.Interaction#getMessages()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Interaction#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see ram.Interaction#getProperties()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Interaction#getFormalGates <em>Formal Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Gates</em>'.
	 * @see ram.Interaction#getFormalGates()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_FormalGates();

	/**
	 * Returns the meta object for class '{@link ram.AspectMessageView <em>Aspect Message View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Message View</em>'.
	 * @see ram.AspectMessageView
	 * @generated
	 */
	EClass getAspectMessageView();

	/**
	 * Returns the meta object for the reference '{@link ram.AspectMessageView#getPointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pointcut</em>'.
	 * @see ram.AspectMessageView#getPointcut()
	 * @see #getAspectMessageView()
	 * @generated
	 */
	EReference getAspectMessageView_Pointcut();

	/**
	 * Returns the meta object for the containment reference '{@link ram.AspectMessageView#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Advice</em>'.
	 * @see ram.AspectMessageView#getAdvice()
	 * @see #getAspectMessageView()
	 * @generated
	 */
	EReference getAspectMessageView_Advice();

	/**
	 * Returns the meta object for class '{@link ram.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see ram.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for the reference '{@link ram.Lifeline#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see ram.Lifeline#getRepresents()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Represents();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Lifeline#getLocalProperties <em>Local Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Properties</em>'.
	 * @see ram.Lifeline#getLocalProperties()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_LocalProperties();

	/**
	 * Returns the meta object for the reference list '{@link ram.Lifeline#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered By</em>'.
	 * @see ram.Lifeline#getCoveredBy()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_CoveredBy();

	/**
	 * Returns the meta object for class '{@link ram.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see ram.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link ram.Message#getSendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Event</em>'.
	 * @see ram.Message#getSendEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_SendEvent();

	/**
	 * Returns the meta object for the reference '{@link ram.Message#getReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Event</em>'.
	 * @see ram.Message#getReceiveEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ReceiveEvent();

	/**
	 * Returns the meta object for the reference '{@link ram.Message#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see ram.Message#getSignature()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Signature();

	/**
	 * Returns the meta object for the reference '{@link ram.Message#getAssignTo <em>Assign To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assign To</em>'.
	 * @see ram.Message#getAssignTo()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_AssignTo();

	/**
	 * Returns the meta object for the attribute '{@link ram.Message#getMessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Sort</em>'.
	 * @see ram.Message#getMessageSort()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageSort();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Message#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see ram.Message#getArguments()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Arguments();

	/**
	 * Returns the meta object for the container reference '{@link ram.Message#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interaction</em>'.
	 * @see ram.Message#getInteraction()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Interaction();

	/**
	 * Returns the meta object for the containment reference '{@link ram.Message#getReturns <em>Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returns</em>'.
	 * @see ram.Message#getReturns()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Returns();

	/**
	 * Returns the meta object for the attribute '{@link ram.Message#isSelfMessage <em>Self Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Message</em>'.
	 * @see ram.Message#isSelfMessage()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_SelfMessage();

	/**
	 * Returns the meta object for class '{@link ram.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message End</em>'.
	 * @see ram.MessageEnd
	 * @generated
	 */
	EClass getMessageEnd();

	/**
	 * Returns the meta object for the reference '{@link ram.MessageEnd#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see ram.MessageEnd#getMessage()
	 * @see #getMessageEnd()
	 * @generated
	 */
	EReference getMessageEnd_Message();

	/**
	 * Returns the meta object for class '{@link ram.MessageOccurrenceSpecification <em>Message Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Occurrence Specification</em>'.
	 * @see ram.MessageOccurrenceSpecification
	 * @generated
	 */
	EClass getMessageOccurrenceSpecification();

	/**
	 * Returns the meta object for class '{@link ram.OccurrenceSpecification <em>Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrence Specification</em>'.
	 * @see ram.OccurrenceSpecification
	 * @generated
	 */
	EClass getOccurrenceSpecification();

	/**
	 * Returns the meta object for class '{@link ram.DestructionOccurrenceSpecification <em>Destruction Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destruction Occurrence Specification</em>'.
	 * @see ram.DestructionOccurrenceSpecification
	 * @generated
	 */
	EClass getDestructionOccurrenceSpecification();

	/**
	 * Returns the meta object for class '{@link ram.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Fragment</em>'.
	 * @see ram.InteractionFragment
	 * @generated
	 */
	EClass getInteractionFragment();

	/**
	 * Returns the meta object for the reference list '{@link ram.InteractionFragment#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered</em>'.
	 * @see ram.InteractionFragment#getCovered()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_Covered();

	/**
	 * Returns the meta object for the container reference '{@link ram.InteractionFragment#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see ram.InteractionFragment#getContainer()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_Container();

	/**
	 * Returns the meta object for class '{@link ram.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Fragment</em>'.
	 * @see ram.CombinedFragment
	 * @generated
	 */
	EClass getCombinedFragment();

	/**
	 * Returns the meta object for the attribute '{@link ram.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Operator</em>'.
	 * @see ram.CombinedFragment#getInteractionOperator()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EAttribute getCombinedFragment_InteractionOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.CombinedFragment#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see ram.CombinedFragment#getOperands()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_Operands();

	/**
	 * Returns the meta object for class '{@link ram.OriginalBehaviorExecution <em>Original Behavior Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Original Behavior Execution</em>'.
	 * @see ram.OriginalBehaviorExecution
	 * @generated
	 */
	EClass getOriginalBehaviorExecution();

	/**
	 * Returns the meta object for class '{@link ram.ExecutionStatement <em>Execution Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Statement</em>'.
	 * @see ram.ExecutionStatement
	 * @generated
	 */
	EClass getExecutionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ram.ExecutionStatement#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see ram.ExecutionStatement#getSpecification()
	 * @see #getExecutionStatement()
	 * @generated
	 */
	EReference getExecutionStatement_Specification();

	/**
	 * Returns the meta object for class '{@link ram.InteractionOperand <em>Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Operand</em>'.
	 * @see ram.InteractionOperand
	 * @generated
	 */
	EClass getInteractionOperand();

	/**
	 * Returns the meta object for the containment reference '{@link ram.InteractionOperand#getInteractionConstraint <em>Interaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction Constraint</em>'.
	 * @see ram.InteractionOperand#getInteractionConstraint()
	 * @see #getInteractionOperand()
	 * @generated
	 */
	EReference getInteractionOperand_InteractionConstraint();

	/**
	 * Returns the meta object for class '{@link ram.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see ram.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link ram.StructuralFeatureValue <em>Structural Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature Value</em>'.
	 * @see ram.StructuralFeatureValue
	 * @generated
	 */
	EClass getStructuralFeatureValue();

	/**
	 * Returns the meta object for the reference '{@link ram.StructuralFeatureValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see ram.StructuralFeatureValue#getValue()
	 * @see #getStructuralFeatureValue()
	 * @generated
	 */
	EReference getStructuralFeatureValue_Value();

	/**
	 * Returns the meta object for class '{@link ram.ParameterValueMapping <em>Parameter Value Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value Mapping</em>'.
	 * @see ram.ParameterValueMapping
	 * @generated
	 */
	EClass getParameterValueMapping();

	/**
	 * Returns the meta object for the reference '{@link ram.ParameterValueMapping#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see ram.ParameterValueMapping#getParameter()
	 * @see #getParameterValueMapping()
	 * @generated
	 */
	EReference getParameterValueMapping_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link ram.ParameterValueMapping#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ram.ParameterValueMapping#getValue()
	 * @see #getParameterValueMapping()
	 * @generated
	 */
	EReference getParameterValueMapping_Value();

	/**
	 * Returns the meta object for class '{@link ram.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see ram.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the reference '{@link ram.ParameterValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see ram.ParameterValue#getParameter()
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_Parameter();

	/**
	 * Returns the meta object for class '{@link ram.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Expression</em>'.
	 * @see ram.OpaqueExpression
	 * @generated
	 */
	EClass getOpaqueExpression();

	/**
	 * Returns the meta object for the attribute '{@link ram.OpaqueExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see ram.OpaqueExpression#getBody()
	 * @see #getOpaqueExpression()
	 * @generated
	 */
	EAttribute getOpaqueExpression_Body();

	/**
	 * Returns the meta object for the attribute '{@link ram.OpaqueExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see ram.OpaqueExpression#getLanguage()
	 * @see #getOpaqueExpression()
	 * @generated
	 */
	EAttribute getOpaqueExpression_Language();

	/**
	 * Returns the meta object for class '{@link ram.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Specification</em>'.
	 * @see ram.LiteralSpecification
	 * @generated
	 */
	EClass getLiteralSpecification();

	/**
	 * Returns the meta object for class '{@link ram.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal String</em>'.
	 * @see ram.LiteralString
	 * @generated
	 */
	EClass getLiteralString();

	/**
	 * Returns the meta object for the attribute '{@link ram.LiteralString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ram.LiteralString#getValue()
	 * @see #getLiteralString()
	 * @generated
	 */
	EAttribute getLiteralString_Value();

	/**
	 * Returns the meta object for class '{@link ram.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Integer</em>'.
	 * @see ram.LiteralInteger
	 * @generated
	 */
	EClass getLiteralInteger();

	/**
	 * Returns the meta object for the attribute '{@link ram.LiteralInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ram.LiteralInteger#getValue()
	 * @see #getLiteralInteger()
	 * @generated
	 */
	EAttribute getLiteralInteger_Value();

	/**
	 * Returns the meta object for class '{@link ram.FragmentContainer <em>Fragment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Container</em>'.
	 * @see ram.FragmentContainer
	 * @generated
	 */
	EClass getFragmentContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.FragmentContainer#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see ram.FragmentContainer#getFragments()
	 * @see #getFragmentContainer()
	 * @generated
	 */
	EReference getFragmentContainer_Fragments();

	/**
	 * Returns the meta object for class '{@link ram.RCollection <em>RCollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RCollection</em>'.
	 * @see ram.RCollection
	 * @generated
	 */
	EClass getRCollection();

	/**
	 * Returns the meta object for the reference '{@link ram.RCollection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ram.RCollection#getType()
	 * @see #getRCollection()
	 * @generated
	 */
	EReference getRCollection_Type();

	/**
	 * Returns the meta object for class '{@link ram.RSet <em>RSet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSet</em>'.
	 * @see ram.RSet
	 * @generated
	 */
	EClass getRSet();

	/**
	 * Returns the meta object for class '{@link ram.RSequence <em>RSequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSequence</em>'.
	 * @see ram.RSequence
	 * @generated
	 */
	EClass getRSequence();

	/**
	 * Returns the meta object for class '{@link ram.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see ram.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the map '{@link ram.Layout#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Containers</em>'.
	 * @see ram.Layout#getContainers()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Containers();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Container Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject" keyRequired="true"
	 *        valueMapType="ram.ElementMap<org.eclipse.emf.ecore.EObject, ram.LayoutElement>"
	 * @generated
	 */
	EClass getContainerMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getContainerMap()
	 * @generated
	 */
	EReference getContainerMap_Key();

	/**
	 * Returns the meta object for the map '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getContainerMap()
	 * @generated
	 */
	EReference getContainerMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Element Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject" keyRequired="true"
	 *        valueType="ram.LayoutElement" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getElementMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getElementMap()
	 * @generated
	 */
	EReference getElementMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getElementMap()
	 * @generated
	 */
	EReference getElementMap_Value();

	/**
	 * Returns the meta object for class '{@link ram.LayoutElement <em>Layout Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Element</em>'.
	 * @see ram.LayoutElement
	 * @generated
	 */
	EClass getLayoutElement();

	/**
	 * Returns the meta object for the attribute '{@link ram.LayoutElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see ram.LayoutElement#getX()
	 * @see #getLayoutElement()
	 * @generated
	 */
	EAttribute getLayoutElement_X();

	/**
	 * Returns the meta object for the attribute '{@link ram.LayoutElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see ram.LayoutElement#getY()
	 * @see #getLayoutElement()
	 * @generated
	 */
	EAttribute getLayoutElement_Y();

	/**
	 * Returns the meta object for class '{@link ram.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see ram.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.Classifier#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see ram.Classifier#getOperations()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Operations();

	/**
	 * Returns the meta object for class '{@link ram.ImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Class</em>'.
	 * @see ram.ImplementationClass
	 * @generated
	 */
	EClass getImplementationClass();

	/**
	 * Returns the meta object for the attribute '{@link ram.ImplementationClass#getInstanceClassName <em>Instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class Name</em>'.
	 * @see ram.ImplementationClass#getInstanceClassName()
	 * @see #getImplementationClass()
	 * @generated
	 */
	EAttribute getImplementationClass_InstanceClassName();

	/**
	 * Returns the meta object for class '{@link ram.TemporaryProperty <em>Temporary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporary Property</em>'.
	 * @see ram.TemporaryProperty
	 * @generated
	 */
	EClass getTemporaryProperty();

	/**
	 * Returns the meta object for class '{@link ram.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see ram.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link ram.StructuralFeature#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see ram.StructuralFeature#isStatic()
	 * @see #getStructuralFeature()
	 * @generated
	 */
	EAttribute getStructuralFeature_Static();

	/**
	 * Returns the meta object for class '{@link ram.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see ram.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link ram.Reference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ram.Reference#getType()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Type();

	/**
	 * Returns the meta object for class '{@link ram.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see ram.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link ram.Property#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see ram.Property#getLowerBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ram.Property#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see ram.Property#getUpperBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link ram.Property#getReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Type</em>'.
	 * @see ram.Property#getReferenceType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_ReferenceType();

	/**
	 * Returns the meta object for class '{@link ram.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see ram.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for class '{@link ram.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see ram.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for class '{@link ram.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Boolean</em>'.
	 * @see ram.LiteralBoolean
	 * @generated
	 */
	EClass getLiteralBoolean();

	/**
	 * Returns the meta object for the attribute '{@link ram.LiteralBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ram.LiteralBoolean#isValue()
	 * @see #getLiteralBoolean()
	 * @generated
	 */
	EAttribute getLiteralBoolean_Value();

	/**
	 * Returns the meta object for class '{@link ram.ClassifierMapping <em>Classifier Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Mapping</em>'.
	 * @see ram.ClassifierMapping
	 * @generated
	 */
	EClass getClassifierMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.ClassifierMapping#getOperationMappings <em>Operation Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Mappings</em>'.
	 * @see ram.ClassifierMapping#getOperationMappings()
	 * @see #getClassifierMapping()
	 * @generated
	 */
	EReference getClassifierMapping_OperationMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.ClassifierMapping#getAttributeMappings <em>Attribute Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Mappings</em>'.
	 * @see ram.ClassifierMapping#getAttributeMappings()
	 * @see #getClassifierMapping()
	 * @generated
	 */
	EReference getClassifierMapping_AttributeMappings();

	/**
	 * Returns the meta object for the reference '{@link ram.ClassifierMapping#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Element</em>'.
	 * @see ram.ClassifierMapping#getFromElement()
	 * @see #getClassifierMapping()
	 * @generated
	 */
	EReference getClassifierMapping_FromElement();

	/**
	 * Returns the meta object for the reference '{@link ram.ClassifierMapping#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see ram.ClassifierMapping#getToElement()
	 * @see #getClassifierMapping()
	 * @generated
	 */
	EReference getClassifierMapping_ToElement();

	/**
	 * Returns the meta object for class '{@link ram.AttributeMapping <em>Attribute Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Mapping</em>'.
	 * @see ram.AttributeMapping
	 * @generated
	 */
	EClass getAttributeMapping();

	/**
	 * Returns the meta object for the reference '{@link ram.AttributeMapping#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Element</em>'.
	 * @see ram.AttributeMapping#getFromElement()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EReference getAttributeMapping_FromElement();

	/**
	 * Returns the meta object for the reference '{@link ram.AttributeMapping#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see ram.AttributeMapping#getToElement()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EReference getAttributeMapping_ToElement();

	/**
	 * Returns the meta object for class '{@link ram.OperationMapping <em>Operation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Mapping</em>'.
	 * @see ram.OperationMapping
	 * @generated
	 */
	EClass getOperationMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.OperationMapping#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mappings</em>'.
	 * @see ram.OperationMapping#getParameterMappings()
	 * @see #getOperationMapping()
	 * @generated
	 */
	EReference getOperationMapping_ParameterMappings();

	/**
	 * Returns the meta object for the reference '{@link ram.OperationMapping#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Element</em>'.
	 * @see ram.OperationMapping#getFromElement()
	 * @see #getOperationMapping()
	 * @generated
	 */
	EReference getOperationMapping_FromElement();

	/**
	 * Returns the meta object for the reference '{@link ram.OperationMapping#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see ram.OperationMapping#getToElement()
	 * @see #getOperationMapping()
	 * @generated
	 */
	EReference getOperationMapping_ToElement();

	/**
	 * Returns the meta object for class '{@link ram.ParameterMapping <em>Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Mapping</em>'.
	 * @see ram.ParameterMapping
	 * @generated
	 */
	EClass getParameterMapping();

	/**
	 * Returns the meta object for the reference '{@link ram.ParameterMapping#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Element</em>'.
	 * @see ram.ParameterMapping#getFromElement()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_FromElement();

	/**
	 * Returns the meta object for the reference '{@link ram.ParameterMapping#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see ram.ParameterMapping#getToElement()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_ToElement();

	/**
	 * Returns the meta object for class '{@link ram.StateView <em>State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State View</em>'.
	 * @see ram.StateView
	 * @generated
	 */
	EClass getStateView();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.StateView#getStateMachines <em>State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Machines</em>'.
	 * @see ram.StateView#getStateMachines()
	 * @see #getStateView()
	 * @generated
	 */
	EReference getStateView_StateMachines();

	/**
	 * Returns the meta object for the reference '{@link ram.StateView#getSpecifies <em>Specifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specifies</em>'.
	 * @see ram.StateView#getSpecifies()
	 * @see #getStateView()
	 * @generated
	 */
	EReference getStateView_Specifies();

	/**
	 * Returns the meta object for class '{@link ram.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see ram.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the reference '{@link ram.StateMachine#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see ram.StateMachine#getStart()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see ram.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.StateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ram.StateMachine#getTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link ram.StateMachine#getSubstitutions <em>Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substitutions</em>'.
	 * @see ram.StateMachine#getSubstitutions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Substitutions();

	/**
	 * Returns the meta object for class '{@link ram.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ram.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link ram.Transition#getEndState <em>End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End State</em>'.
	 * @see ram.Transition#getEndState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_EndState();

	/**
	 * Returns the meta object for the reference '{@link ram.Transition#getStartState <em>Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start State</em>'.
	 * @see ram.Transition#getStartState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_StartState();

	/**
	 * Returns the meta object for the reference '{@link ram.Transition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see ram.Transition#getSignature()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Signature();

	/**
	 * Returns the meta object for the containment reference '{@link ram.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see ram.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for class '{@link ram.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see ram.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link ram.State#getIncomings <em>Incomings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomings</em>'.
	 * @see ram.State#getIncomings()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incomings();

	/**
	 * Returns the meta object for the reference list '{@link ram.State#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoings</em>'.
	 * @see ram.State#getOutgoings()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoings();

	/**
	 * Returns the meta object for class '{@link ram.RDouble <em>RDouble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDouble</em>'.
	 * @see ram.RDouble
	 * @generated
	 */
	EClass getRDouble();

	/**
	 * Returns the meta object for class '{@link ram.RFloat <em>RFloat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RFloat</em>'.
	 * @see ram.RFloat
	 * @generated
	 */
	EClass getRFloat();

	/**
	 * Returns the meta object for class '{@link ram.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see ram.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link ram.Constraint#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see ram.Constraint#getSpecification()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Specification();

	/**
	 * Returns the meta object for class '{@link ram.Substitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substitution</em>'.
	 * @see ram.Substitution
	 * @generated
	 */
	EClass getSubstitution();

	/**
	 * Returns the meta object for class '{@link ram.TransitionSubstitution <em>Transition Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Substitution</em>'.
	 * @see ram.TransitionSubstitution
	 * @generated
	 */
	EClass getTransitionSubstitution();

	/**
	 * Returns the meta object for the reference '{@link ram.TransitionSubstitution#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see ram.TransitionSubstitution#getFrom()
	 * @see #getTransitionSubstitution()
	 * @generated
	 */
	EReference getTransitionSubstitution_From();

	/**
	 * Returns the meta object for the reference list '{@link ram.TransitionSubstitution#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see ram.TransitionSubstitution#getTo()
	 * @see #getTransitionSubstitution()
	 * @generated
	 */
	EReference getTransitionSubstitution_To();

	/**
	 * Returns the meta object for enum '{@link ram.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see ram.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link ram.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Type</em>'.
	 * @see ram.ReferenceType
	 * @generated
	 */
	EEnum getReferenceType();

	/**
	 * Returns the meta object for enum '{@link ram.MessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Sort</em>'.
	 * @see ram.MessageSort
	 * @generated
	 */
	EEnum getMessageSort();

	/**
	 * Returns the meta object for enum '{@link ram.InteractionOperatorKind <em>Interaction Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interaction Operator Kind</em>'.
	 * @see ram.InteractionOperatorKind
	 * @generated
	 */
	EEnum getInteractionOperatorKind();

	/**
	 * Returns the meta object for enum '{@link ram.InstantiationType <em>Instantiation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instantiation Type</em>'.
	 * @see ram.InstantiationType
	 * @generated
	 */
	EEnum getInstantiationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RamFactory getRamFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ram.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.AspectImpl
		 * @see ram.impl.RamPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Structural View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__STRUCTURAL_VIEW = eINSTANCE.getAspect_StructuralView();

		/**
		 * The meta object literal for the '<em><b>Mandatory Aspect Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__MANDATORY_ASPECT_PARAMETERS = eINSTANCE.getAspect_MandatoryAspectParameters();

		/**
		 * The meta object literal for the '<em><b>Message Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__MESSAGE_VIEWS = eINSTANCE.getAspect_MessageViews();

		/**
		 * The meta object literal for the '<em><b>Instantiations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__INSTANTIATIONS = eINSTANCE.getAspect_Instantiations();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__LAYOUT = eINSTANCE.getAspect_Layout();

		/**
		 * The meta object literal for the '<em><b>State Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__STATE_VIEWS = eINSTANCE.getAspect_StateViews();

		/**
		 * The meta object literal for the '{@link ram.impl.MappableElementImpl <em>Mappable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.MappableElementImpl
		 * @see ram.impl.RamPackageImpl#getMappableElement()
		 * @generated
		 */
		EClass MAPPABLE_ELEMENT = eINSTANCE.getMappableElement();

		/**
		 * The meta object literal for the '{@link ram.impl.StructuralViewImpl <em>Structural View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.StructuralViewImpl
		 * @see ram.impl.RamPackageImpl#getStructuralView()
		 * @generated
		 */
		EClass STRUCTURAL_VIEW = eINSTANCE.getStructuralView();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_VIEW__CLASSES = eINSTANCE.getStructuralView_Classes();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_VIEW__ASSOCIATIONS = eINSTANCE.getStructuralView_Associations();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_VIEW__TYPES = eINSTANCE.getStructuralView_Types();

		/**
		 * The meta object literal for the '{@link ram.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ClassImpl
		 * @see ram.impl.RamPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Association Ends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ASSOCIATION_ENDS = eINSTANCE.getClass_AssociationEnds();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Partial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__PARTIAL = eINSTANCE.getClass_Partial();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ABSTRACT = eINSTANCE.getClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPER_TYPES = eINSTANCE.getClass_SuperTypes();

		/**
		 * The meta object literal for the '{@link ram.impl.AssociationEndImpl <em>Association End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.AssociationEndImpl
		 * @see ram.impl.RamPackageImpl#getAssociationEnd()
		 * @generated
		 */
		EClass ASSOCIATION_END = eINSTANCE.getAssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__NAVIGABLE = eINSTANCE.getAssociationEnd_Navigable();

		/**
		 * The meta object literal for the '<em><b>Assoc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_END__ASSOC = eINSTANCE.getAssociationEnd_Assoc();

		/**
		 * The meta object literal for the '<em><b>My Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_END__MY_CLASS = eINSTANCE.getAssociationEnd_MyClass();

		/**
		 * The meta object literal for the '{@link ram.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.AssociationImpl
		 * @see ram.impl.RamPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Ends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ENDS = eINSTANCE.getAssociation_Ends();

		/**
		 * The meta object literal for the '{@link ram.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.NamedElementImpl
		 * @see ram.impl.RamPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ram.impl.InstantiationImpl <em>Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.InstantiationImpl
		 * @see ram.impl.RamPackageImpl#getInstantiation()
		 * @generated
		 */
		EClass INSTANTIATION = eINSTANCE.getInstantiation();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION__MAPPINGS = eINSTANCE.getInstantiation_Mappings();

		/**
		 * The meta object literal for the '<em><b>External Aspect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION__EXTERNAL_ASPECT = eINSTANCE.getInstantiation_ExternalAspect();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIATION__TYPE = eINSTANCE.getInstantiation_Type();

		/**
		 * The meta object literal for the '{@link ram.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.MappingImpl
		 * @see ram.impl.RamPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '{@link ram.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.OperationImpl
		 * @see ram.impl.RamPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ABSTRACT = eINSTANCE.getOperation_Abstract();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__VISIBILITY = eINSTANCE.getOperation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__STATIC = eINSTANCE.getOperation_Static();

		/**
		 * The meta object literal for the '<em><b>Partial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__PARTIAL = eINSTANCE.getOperation_Partial();

		/**
		 * The meta object literal for the '{@link ram.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.AttributeImpl
		 * @see ram.impl.RamPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link ram.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.TypeImpl
		 * @see ram.impl.RamPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link ram.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ParameterImpl
		 * @see ram.impl.RamPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link ram.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.PrimitiveTypeImpl
		 * @see ram.impl.RamPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link ram.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ObjectTypeImpl
		 * @see ram.impl.RamPackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '{@link ram.impl.RVoidImpl <em>RVoid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RVoidImpl
		 * @see ram.impl.RamPackageImpl#getRVoid()
		 * @generated
		 */
		EClass RVOID = eINSTANCE.getRVoid();

		/**
		 * The meta object literal for the '{@link ram.impl.RBooleanImpl <em>RBoolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RBooleanImpl
		 * @see ram.impl.RamPackageImpl#getRBoolean()
		 * @generated
		 */
		EClass RBOOLEAN = eINSTANCE.getRBoolean();

		/**
		 * The meta object literal for the '{@link ram.impl.RIntImpl <em>RInt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RIntImpl
		 * @see ram.impl.RamPackageImpl#getRInt()
		 * @generated
		 */
		EClass RINT = eINSTANCE.getRInt();

		/**
		 * The meta object literal for the '{@link ram.impl.RCharImpl <em>RChar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RCharImpl
		 * @see ram.impl.RamPackageImpl#getRChar()
		 * @generated
		 */
		EClass RCHAR = eINSTANCE.getRChar();

		/**
		 * The meta object literal for the '{@link ram.impl.RStringImpl <em>RString</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RStringImpl
		 * @see ram.impl.RamPackageImpl#getRString()
		 * @generated
		 */
		EClass RSTRING = eINSTANCE.getRString();

		/**
		 * The meta object literal for the '{@link ram.impl.RAnyImpl <em>RAny</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RAnyImpl
		 * @see ram.impl.RamPackageImpl#getRAny()
		 * @generated
		 */
		EClass RANY = eINSTANCE.getRAny();

		/**
		 * The meta object literal for the '{@link ram.impl.REnumImpl <em>REnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.REnumImpl
		 * @see ram.impl.RamPackageImpl#getREnum()
		 * @generated
		 */
		EClass RENUM = eINSTANCE.getREnum();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENUM__LITERALS = eINSTANCE.getREnum_Literals();

		/**
		 * The meta object literal for the '{@link ram.impl.REnumLiteralImpl <em>REnum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.REnumLiteralImpl
		 * @see ram.impl.RamPackageImpl#getREnumLiteral()
		 * @generated
		 */
		EClass RENUM_LITERAL = eINSTANCE.getREnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENUM_LITERAL__ENUM = eINSTANCE.getREnumLiteral_Enum();

		/**
		 * The meta object literal for the '{@link ram.impl.AbstractMessageViewImpl <em>Abstract Message View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.AbstractMessageViewImpl
		 * @see ram.impl.RamPackageImpl#getAbstractMessageView()
		 * @generated
		 */
		EClass ABSTRACT_MESSAGE_VIEW = eINSTANCE.getAbstractMessageView();

		/**
		 * The meta object literal for the '<em><b>Affected By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MESSAGE_VIEW__AFFECTED_BY = eINSTANCE.getAbstractMessageView_AffectedBy();

		/**
		 * The meta object literal for the '{@link ram.impl.MessageViewImpl <em>Message View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.MessageViewImpl
		 * @see ram.impl.RamPackageImpl#getMessageView()
		 * @generated
		 */
		EClass MESSAGE_VIEW = eINSTANCE.getMessageView();

		/**
		 * The meta object literal for the '<em><b>Specifies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_VIEW__SPECIFIES = eINSTANCE.getMessageView_Specifies();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_VIEW__SPECIFICATION = eINSTANCE.getMessageView_Specification();

		/**
		 * The meta object literal for the '{@link ram.impl.MessageViewReferenceImpl <em>Message View Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.MessageViewReferenceImpl
		 * @see ram.impl.RamPackageImpl#getMessageViewReference()
		 * @generated
		 */
		EClass MESSAGE_VIEW_REFERENCE = eINSTANCE.getMessageViewReference();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_VIEW_REFERENCE__REFERENCES = eINSTANCE.getMessageViewReference_References();

		/**
		 * The meta object literal for the '{@link ram.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.InteractionImpl
		 * @see ram.impl.RamPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Lifelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__LIFELINES = eINSTANCE.getInteraction_Lifelines();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__MESSAGES = eINSTANCE.getInteraction_Messages();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__PROPERTIES = eINSTANCE.getInteraction_Properties();

		/**
		 * The meta object literal for the '<em><b>Formal Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__FORMAL_GATES = eINSTANCE.getInteraction_FormalGates();

		/**
		 * The meta object literal for the '{@link ram.impl.AspectMessageViewImpl <em>Aspect Message View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.AspectMessageViewImpl
		 * @see ram.impl.RamPackageImpl#getAspectMessageView()
		 * @generated
		 */
		EClass ASPECT_MESSAGE_VIEW = eINSTANCE.getAspectMessageView();

		/**
		 * The meta object literal for the '<em><b>Pointcut</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_MESSAGE_VIEW__POINTCUT = eINSTANCE.getAspectMessageView_Pointcut();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_MESSAGE_VIEW__ADVICE = eINSTANCE.getAspectMessageView_Advice();

		/**
		 * The meta object literal for the '{@link ram.impl.LifelineImpl <em>Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.LifelineImpl
		 * @see ram.impl.RamPackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__REPRESENTS = eINSTANCE.getLifeline_Represents();

		/**
		 * The meta object literal for the '<em><b>Local Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__LOCAL_PROPERTIES = eINSTANCE.getLifeline_LocalProperties();

		/**
		 * The meta object literal for the '<em><b>Covered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__COVERED_BY = eINSTANCE.getLifeline_CoveredBy();

		/**
		 * The meta object literal for the '{@link ram.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.MessageImpl
		 * @see ram.impl.RamPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Send Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SEND_EVENT = eINSTANCE.getMessage_SendEvent();

		/**
		 * The meta object literal for the '<em><b>Receive Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RECEIVE_EVENT = eINSTANCE.getMessage_ReceiveEvent();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SIGNATURE = eINSTANCE.getMessage_Signature();

		/**
		 * The meta object literal for the '<em><b>Assign To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__ASSIGN_TO = eINSTANCE.getMessage_AssignTo();

		/**
		 * The meta object literal for the '<em><b>Message Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_SORT = eINSTANCE.getMessage_MessageSort();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__ARGUMENTS = eINSTANCE.getMessage_Arguments();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__INTERACTION = eINSTANCE.getMessage_Interaction();

		/**
		 * The meta object literal for the '<em><b>Returns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RETURNS = eINSTANCE.getMessage_Returns();

		/**
		 * The meta object literal for the '<em><b>Self Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__SELF_MESSAGE = eINSTANCE.getMessage_SelfMessage();

		/**
		 * The meta object literal for the '{@link ram.impl.MessageEndImpl <em>Message End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.MessageEndImpl
		 * @see ram.impl.RamPackageImpl#getMessageEnd()
		 * @generated
		 */
		EClass MESSAGE_END = eINSTANCE.getMessageEnd();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_END__MESSAGE = eINSTANCE.getMessageEnd_Message();

		/**
		 * The meta object literal for the '{@link ram.impl.MessageOccurrenceSpecificationImpl <em>Message Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.MessageOccurrenceSpecificationImpl
		 * @see ram.impl.RamPackageImpl#getMessageOccurrenceSpecification()
		 * @generated
		 */
		EClass MESSAGE_OCCURRENCE_SPECIFICATION = eINSTANCE.getMessageOccurrenceSpecification();

		/**
		 * The meta object literal for the '{@link ram.impl.OccurrenceSpecificationImpl <em>Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.OccurrenceSpecificationImpl
		 * @see ram.impl.RamPackageImpl#getOccurrenceSpecification()
		 * @generated
		 */
		EClass OCCURRENCE_SPECIFICATION = eINSTANCE.getOccurrenceSpecification();

		/**
		 * The meta object literal for the '{@link ram.impl.DestructionOccurrenceSpecificationImpl <em>Destruction Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.DestructionOccurrenceSpecificationImpl
		 * @see ram.impl.RamPackageImpl#getDestructionOccurrenceSpecification()
		 * @generated
		 */
		EClass DESTRUCTION_OCCURRENCE_SPECIFICATION = eINSTANCE.getDestructionOccurrenceSpecification();

		/**
		 * The meta object literal for the '{@link ram.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.InteractionFragmentImpl
		 * @see ram.impl.RamPackageImpl#getInteractionFragment()
		 * @generated
		 */
		EClass INTERACTION_FRAGMENT = eINSTANCE.getInteractionFragment();

		/**
		 * The meta object literal for the '<em><b>Covered</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__COVERED = eINSTANCE.getInteractionFragment_Covered();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__CONTAINER = eINSTANCE.getInteractionFragment_Container();

		/**
		 * The meta object literal for the '{@link ram.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.CombinedFragmentImpl
		 * @see ram.impl.RamPackageImpl#getCombinedFragment()
		 * @generated
		 */
		EClass COMBINED_FRAGMENT = eINSTANCE.getCombinedFragment();

		/**
		 * The meta object literal for the '<em><b>Interaction Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_FRAGMENT__INTERACTION_OPERATOR = eINSTANCE.getCombinedFragment_InteractionOperator();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__OPERANDS = eINSTANCE.getCombinedFragment_Operands();

		/**
		 * The meta object literal for the '{@link ram.impl.OriginalBehaviorExecutionImpl <em>Original Behavior Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.OriginalBehaviorExecutionImpl
		 * @see ram.impl.RamPackageImpl#getOriginalBehaviorExecution()
		 * @generated
		 */
		EClass ORIGINAL_BEHAVIOR_EXECUTION = eINSTANCE.getOriginalBehaviorExecution();

		/**
		 * The meta object literal for the '{@link ram.impl.ExecutionStatementImpl <em>Execution Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ExecutionStatementImpl
		 * @see ram.impl.RamPackageImpl#getExecutionStatement()
		 * @generated
		 */
		EClass EXECUTION_STATEMENT = eINSTANCE.getExecutionStatement();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_STATEMENT__SPECIFICATION = eINSTANCE.getExecutionStatement_Specification();

		/**
		 * The meta object literal for the '{@link ram.impl.InteractionOperandImpl <em>Interaction Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.InteractionOperandImpl
		 * @see ram.impl.RamPackageImpl#getInteractionOperand()
		 * @generated
		 */
		EClass INTERACTION_OPERAND = eINSTANCE.getInteractionOperand();

		/**
		 * The meta object literal for the '<em><b>Interaction Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OPERAND__INTERACTION_CONSTRAINT = eINSTANCE.getInteractionOperand_InteractionConstraint();

		/**
		 * The meta object literal for the '{@link ram.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ValueSpecificationImpl
		 * @see ram.impl.RamPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link ram.impl.StructuralFeatureValueImpl <em>Structural Feature Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.StructuralFeatureValueImpl
		 * @see ram.impl.RamPackageImpl#getStructuralFeatureValue()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE_VALUE = eINSTANCE.getStructuralFeatureValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_FEATURE_VALUE__VALUE = eINSTANCE.getStructuralFeatureValue_Value();

		/**
		 * The meta object literal for the '{@link ram.impl.ParameterValueMappingImpl <em>Parameter Value Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ParameterValueMappingImpl
		 * @see ram.impl.RamPackageImpl#getParameterValueMapping()
		 * @generated
		 */
		EClass PARAMETER_VALUE_MAPPING = eINSTANCE.getParameterValueMapping();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE_MAPPING__PARAMETER = eINSTANCE.getParameterValueMapping_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE_MAPPING__VALUE = eINSTANCE.getParameterValueMapping_Value();

		/**
		 * The meta object literal for the '{@link ram.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ParameterValueImpl
		 * @see ram.impl.RamPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__PARAMETER = eINSTANCE.getParameterValue_Parameter();

		/**
		 * The meta object literal for the '{@link ram.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.OpaqueExpressionImpl
		 * @see ram.impl.RamPackageImpl#getOpaqueExpression()
		 * @generated
		 */
		EClass OPAQUE_EXPRESSION = eINSTANCE.getOpaqueExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_EXPRESSION__BODY = eINSTANCE.getOpaqueExpression_Body();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_EXPRESSION__LANGUAGE = eINSTANCE.getOpaqueExpression_Language();

		/**
		 * The meta object literal for the '{@link ram.impl.LiteralSpecificationImpl <em>Literal Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.LiteralSpecificationImpl
		 * @see ram.impl.RamPackageImpl#getLiteralSpecification()
		 * @generated
		 */
		EClass LITERAL_SPECIFICATION = eINSTANCE.getLiteralSpecification();

		/**
		 * The meta object literal for the '{@link ram.impl.LiteralStringImpl <em>Literal String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.LiteralStringImpl
		 * @see ram.impl.RamPackageImpl#getLiteralString()
		 * @generated
		 */
		EClass LITERAL_STRING = eINSTANCE.getLiteralString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_STRING__VALUE = eINSTANCE.getLiteralString_Value();

		/**
		 * The meta object literal for the '{@link ram.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.LiteralIntegerImpl
		 * @see ram.impl.RamPackageImpl#getLiteralInteger()
		 * @generated
		 */
		EClass LITERAL_INTEGER = eINSTANCE.getLiteralInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_INTEGER__VALUE = eINSTANCE.getLiteralInteger_Value();

		/**
		 * The meta object literal for the '{@link ram.impl.FragmentContainerImpl <em>Fragment Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.FragmentContainerImpl
		 * @see ram.impl.RamPackageImpl#getFragmentContainer()
		 * @generated
		 */
		EClass FRAGMENT_CONTAINER = eINSTANCE.getFragmentContainer();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_CONTAINER__FRAGMENTS = eINSTANCE.getFragmentContainer_Fragments();

		/**
		 * The meta object literal for the '{@link ram.impl.RCollectionImpl <em>RCollection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RCollectionImpl
		 * @see ram.impl.RamPackageImpl#getRCollection()
		 * @generated
		 */
		EClass RCOLLECTION = eINSTANCE.getRCollection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCOLLECTION__TYPE = eINSTANCE.getRCollection_Type();

		/**
		 * The meta object literal for the '{@link ram.impl.RSetImpl <em>RSet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RSetImpl
		 * @see ram.impl.RamPackageImpl#getRSet()
		 * @generated
		 */
		EClass RSET = eINSTANCE.getRSet();

		/**
		 * The meta object literal for the '{@link ram.impl.RSequenceImpl <em>RSequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RSequenceImpl
		 * @see ram.impl.RamPackageImpl#getRSequence()
		 * @generated
		 */
		EClass RSEQUENCE = eINSTANCE.getRSequence();

		/**
		 * The meta object literal for the '{@link ram.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.LayoutImpl
		 * @see ram.impl.RamPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__CONTAINERS = eINSTANCE.getLayout_Containers();

		/**
		 * The meta object literal for the '{@link ram.impl.ContainerMapImpl <em>Container Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ContainerMapImpl
		 * @see ram.impl.RamPackageImpl#getContainerMap()
		 * @generated
		 */
		EClass CONTAINER_MAP = eINSTANCE.getContainerMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_MAP__KEY = eINSTANCE.getContainerMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_MAP__VALUE = eINSTANCE.getContainerMap_Value();

		/**
		 * The meta object literal for the '{@link ram.impl.ElementMapImpl <em>Element Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ElementMapImpl
		 * @see ram.impl.RamPackageImpl#getElementMap()
		 * @generated
		 */
		EClass ELEMENT_MAP = eINSTANCE.getElementMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_MAP__KEY = eINSTANCE.getElementMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_MAP__VALUE = eINSTANCE.getElementMap_Value();

		/**
		 * The meta object literal for the '{@link ram.impl.LayoutElementImpl <em>Layout Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.LayoutElementImpl
		 * @see ram.impl.RamPackageImpl#getLayoutElement()
		 * @generated
		 */
		EClass LAYOUT_ELEMENT = eINSTANCE.getLayoutElement();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_ELEMENT__X = eINSTANCE.getLayoutElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_ELEMENT__Y = eINSTANCE.getLayoutElement_Y();

		/**
		 * The meta object literal for the '{@link ram.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ClassifierImpl
		 * @see ram.impl.RamPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__OPERATIONS = eINSTANCE.getClassifier_Operations();

		/**
		 * The meta object literal for the '{@link ram.impl.ImplementationClassImpl <em>Implementation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ImplementationClassImpl
		 * @see ram.impl.RamPackageImpl#getImplementationClass()
		 * @generated
		 */
		EClass IMPLEMENTATION_CLASS = eINSTANCE.getImplementationClass();

		/**
		 * The meta object literal for the '<em><b>Instance Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_CLASS__INSTANCE_CLASS_NAME = eINSTANCE.getImplementationClass_InstanceClassName();

		/**
		 * The meta object literal for the '{@link ram.impl.TemporaryPropertyImpl <em>Temporary Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.TemporaryPropertyImpl
		 * @see ram.impl.RamPackageImpl#getTemporaryProperty()
		 * @generated
		 */
		EClass TEMPORARY_PROPERTY = eINSTANCE.getTemporaryProperty();

		/**
		 * The meta object literal for the '{@link ram.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.StructuralFeatureImpl
		 * @see ram.impl.RamPackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE__STATIC = eINSTANCE.getStructuralFeature_Static();

		/**
		 * The meta object literal for the '{@link ram.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ReferenceImpl
		 * @see ram.impl.RamPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TYPE = eINSTANCE.getReference_Type();

		/**
		 * The meta object literal for the '{@link ram.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.PropertyImpl
		 * @see ram.impl.RamPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LOWER_BOUND = eINSTANCE.getProperty_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UPPER_BOUND = eINSTANCE.getProperty_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Reference Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__REFERENCE_TYPE = eINSTANCE.getProperty_ReferenceType();

		/**
		 * The meta object literal for the '{@link ram.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.TypedElementImpl
		 * @see ram.impl.RamPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '{@link ram.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.GateImpl
		 * @see ram.impl.RamPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '{@link ram.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.LiteralBooleanImpl
		 * @see ram.impl.RamPackageImpl#getLiteralBoolean()
		 * @generated
		 */
		EClass LITERAL_BOOLEAN = eINSTANCE.getLiteralBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_BOOLEAN__VALUE = eINSTANCE.getLiteralBoolean_Value();

		/**
		 * The meta object literal for the '{@link ram.impl.ClassifierMappingImpl <em>Classifier Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ClassifierMappingImpl
		 * @see ram.impl.RamPackageImpl#getClassifierMapping()
		 * @generated
		 */
		EClass CLASSIFIER_MAPPING = eINSTANCE.getClassifierMapping();

		/**
		 * The meta object literal for the '<em><b>Operation Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_MAPPING__OPERATION_MAPPINGS = eINSTANCE.getClassifierMapping_OperationMappings();

		/**
		 * The meta object literal for the '<em><b>Attribute Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS = eINSTANCE.getClassifierMapping_AttributeMappings();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_MAPPING__FROM_ELEMENT = eINSTANCE.getClassifierMapping_FromElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_MAPPING__TO_ELEMENT = eINSTANCE.getClassifierMapping_ToElement();

		/**
		 * The meta object literal for the '{@link ram.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.AttributeMappingImpl
		 * @see ram.impl.RamPackageImpl#getAttributeMapping()
		 * @generated
		 */
		EClass ATTRIBUTE_MAPPING = eINSTANCE.getAttributeMapping();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_MAPPING__FROM_ELEMENT = eINSTANCE.getAttributeMapping_FromElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_MAPPING__TO_ELEMENT = eINSTANCE.getAttributeMapping_ToElement();

		/**
		 * The meta object literal for the '{@link ram.impl.OperationMappingImpl <em>Operation Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.OperationMappingImpl
		 * @see ram.impl.RamPackageImpl#getOperationMapping()
		 * @generated
		 */
		EClass OPERATION_MAPPING = eINSTANCE.getOperationMapping();

		/**
		 * The meta object literal for the '<em><b>Parameter Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_MAPPING__PARAMETER_MAPPINGS = eINSTANCE.getOperationMapping_ParameterMappings();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_MAPPING__FROM_ELEMENT = eINSTANCE.getOperationMapping_FromElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_MAPPING__TO_ELEMENT = eINSTANCE.getOperationMapping_ToElement();

		/**
		 * The meta object literal for the '{@link ram.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ParameterMappingImpl
		 * @see ram.impl.RamPackageImpl#getParameterMapping()
		 * @generated
		 */
		EClass PARAMETER_MAPPING = eINSTANCE.getParameterMapping();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__FROM_ELEMENT = eINSTANCE.getParameterMapping_FromElement();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__TO_ELEMENT = eINSTANCE.getParameterMapping_ToElement();

		/**
		 * The meta object literal for the '{@link ram.impl.StateViewImpl <em>State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.StateViewImpl
		 * @see ram.impl.RamPackageImpl#getStateView()
		 * @generated
		 */
		EClass STATE_VIEW = eINSTANCE.getStateView();

		/**
		 * The meta object literal for the '<em><b>State Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VIEW__STATE_MACHINES = eINSTANCE.getStateView_StateMachines();

		/**
		 * The meta object literal for the '<em><b>Specifies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VIEW__SPECIFIES = eINSTANCE.getStateView_Specifies();

		/**
		 * The meta object literal for the '{@link ram.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.StateMachineImpl
		 * @see ram.impl.RamPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__START = eINSTANCE.getStateMachine_Start();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITIONS = eINSTANCE.getStateMachine_Transitions();

		/**
		 * The meta object literal for the '<em><b>Substitutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__SUBSTITUTIONS = eINSTANCE.getStateMachine_Substitutions();

		/**
		 * The meta object literal for the '{@link ram.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.TransitionImpl
		 * @see ram.impl.RamPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>End State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__END_STATE = eINSTANCE.getTransition_EndState();

		/**
		 * The meta object literal for the '<em><b>Start State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__START_STATE = eINSTANCE.getTransition_StartState();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SIGNATURE = eINSTANCE.getTransition_Signature();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '{@link ram.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.StateImpl
		 * @see ram.impl.RamPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Incomings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMINGS = eINSTANCE.getState_Incomings();

		/**
		 * The meta object literal for the '<em><b>Outgoings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOINGS = eINSTANCE.getState_Outgoings();

		/**
		 * The meta object literal for the '{@link ram.impl.RDoubleImpl <em>RDouble</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RDoubleImpl
		 * @see ram.impl.RamPackageImpl#getRDouble()
		 * @generated
		 */
		EClass RDOUBLE = eINSTANCE.getRDouble();

		/**
		 * The meta object literal for the '{@link ram.impl.RFloatImpl <em>RFloat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.RFloatImpl
		 * @see ram.impl.RamPackageImpl#getRFloat()
		 * @generated
		 */
		EClass RFLOAT = eINSTANCE.getRFloat();

		/**
		 * The meta object literal for the '{@link ram.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.ConstraintImpl
		 * @see ram.impl.RamPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__SPECIFICATION = eINSTANCE.getConstraint_Specification();

		/**
		 * The meta object literal for the '{@link ram.impl.SubstitutionImpl <em>Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.SubstitutionImpl
		 * @see ram.impl.RamPackageImpl#getSubstitution()
		 * @generated
		 */
		EClass SUBSTITUTION = eINSTANCE.getSubstitution();

		/**
		 * The meta object literal for the '{@link ram.impl.TransitionSubstitutionImpl <em>Transition Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.impl.TransitionSubstitutionImpl
		 * @see ram.impl.RamPackageImpl#getTransitionSubstitution()
		 * @generated
		 */
		EClass TRANSITION_SUBSTITUTION = eINSTANCE.getTransitionSubstitution();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SUBSTITUTION__FROM = eINSTANCE.getTransitionSubstitution_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SUBSTITUTION__TO = eINSTANCE.getTransitionSubstitution_To();

		/**
		 * The meta object literal for the '{@link ram.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.Visibility
		 * @see ram.impl.RamPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link ram.ReferenceType <em>Reference Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.ReferenceType
		 * @see ram.impl.RamPackageImpl#getReferenceType()
		 * @generated
		 */
		EEnum REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '{@link ram.MessageSort <em>Message Sort</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.MessageSort
		 * @see ram.impl.RamPackageImpl#getMessageSort()
		 * @generated
		 */
		EEnum MESSAGE_SORT = eINSTANCE.getMessageSort();

		/**
		 * The meta object literal for the '{@link ram.InteractionOperatorKind <em>Interaction Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.InteractionOperatorKind
		 * @see ram.impl.RamPackageImpl#getInteractionOperatorKind()
		 * @generated
		 */
		EEnum INTERACTION_OPERATOR_KIND = eINSTANCE.getInteractionOperatorKind();

		/**
		 * The meta object literal for the '{@link ram.InstantiationType <em>Instantiation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ram.InstantiationType
		 * @see ram.impl.RamPackageImpl#getInstantiationType()
		 * @generated
		 */
		EEnum INSTANTIATION_TYPE = eINSTANCE.getInstantiationType();

	}

} //RamPackage
