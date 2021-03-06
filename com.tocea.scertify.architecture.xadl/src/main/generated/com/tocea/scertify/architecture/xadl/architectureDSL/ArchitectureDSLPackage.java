/**
 */
package com.tocea.scertify.architecture.xadl.architectureDSL;

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
 * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitectureDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "architectureDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tocea.com/codewatch/architecture/dsl/ArchitectureDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "architectureDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArchitectureDSLPackage eINSTANCE = com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureExtensionImpl <em>Architecture Extension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureExtensionImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getArchitectureExtension()
   * @generated
   */
  int ARCHITECTURE_EXTENSION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_EXTENSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_EXTENSION__ENTITIES = 1;

  /**
   * The number of structural features of the '<em>Architecture Extension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_EXTENSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ExtensionEntityImpl <em>Extension Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ExtensionEntityImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getExtensionEntity()
   * @generated
   */
  int EXTENSION_ENTITY = 1;

  /**
   * The number of structural features of the '<em>Extension Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_ENTITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = EXTENSION_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = EXTENSION_ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.DatatypeImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__REFERENCE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ImportImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = EXTENSION_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = EXTENSION_ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ParametrizedTypeImpl <em>Parametrized Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ParametrizedTypeImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getParametrizedType()
   * @generated
   */
  int PARAMETRIZED_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIZED_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIZED_TYPE__ABSTRACT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIZED_TYPE__PARAMETERS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIZED_TYPE__FIELDS = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Parametrized Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIZED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.PatternImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__NAME = PARAMETRIZED_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__ABSTRACT = PARAMETRIZED_TYPE__ABSTRACT;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__PARAMETERS = PARAMETRIZED_TYPE__PARAMETERS;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__FIELDS = PARAMETRIZED_TYPE__FIELDS;

  /**
   * The feature id for the '<em><b>Super Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__SUPER_PATTERN = PARAMETRIZED_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = PARAMETRIZED_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.PrimitiveRoleImpl <em>Primitive Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.PrimitiveRoleImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getPrimitiveRole()
   * @generated
   */
  int PRIMITIVE_ROLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_ROLE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_ROLE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_ROLE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.RoleImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getRole()
   * @generated
   */
  int ROLE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = PARAMETRIZED_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__ABSTRACT = PARAMETRIZED_TYPE__ABSTRACT;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__PARAMETERS = PARAMETRIZED_TYPE__PARAMETERS;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__FIELDS = PARAMETRIZED_TYPE__FIELDS;

  /**
   * The feature id for the '<em><b>Inherited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__INHERITED = PARAMETRIZED_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__ELEMENT = PARAMETRIZED_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__SUPER_ROLE = PARAMETRIZED_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__CONSTRAINTS = PARAMETRIZED_TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = PARAMETRIZED_TYPE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ExtensionConstraintImpl <em>Extension Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ExtensionConstraintImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getExtensionConstraint()
   * @generated
   */
  int EXTENSION_CONSTRAINT = 9;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_CONSTRAINT__CONSTRAINT = 0;

  /**
   * The feature id for the '<em><b>Explanation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_CONSTRAINT__EXPLANATION = 1;

  /**
   * The number of structural features of the '<em>Extension Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ConstraintImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 10;

  /**
   * The feature id for the '<em><b>Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__QUERY = 0;

  /**
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__COMPARATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__VALUE = 2;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__NAME = EXTENSION_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__ABSTRACT = EXTENSION_ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Relationship</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SUPER_RELATIONSHIP = EXTENSION_ENTITY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__CONSTRAINTS = EXTENSION_ENTITY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__FIELDS = EXTENSION_ENTITY_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = EXTENSION_ENTITY_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.NamedEntityImpl <em>Named Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.NamedEntityImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getNamedEntity()
   * @generated
   */
  int NAMED_ENTITY = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ENTITY__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ENTITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ReferencedTypeImpl <em>Referenced Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ReferencedTypeImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getReferencedType()
   * @generated
   */
  int REFERENCED_TYPE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_TYPE__NAME = NAMED_ENTITY__NAME;

  /**
   * The number of structural features of the '<em>Referenced Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_TYPE_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ParameterImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getParameter()
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
  int PARAMETER__NAME = REFERENCED_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = REFERENCED_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.FieldImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getField()
   * @generated
   */
  int FIELD = 13;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__MANDATORY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 2;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__MANY = 3;

  /**
   * The feature id for the '<em><b>Lb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LB = 4;

  /**
   * The feature id for the '<em><b>Ub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__UB = 5;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArityImpl <em>Arity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArityImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getArity()
   * @generated
   */
  int ARITY = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITY__VALUE = 0;

  /**
   * The feature id for the '<em><b>Unbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITY__UNBOUND = 1;

  /**
   * The number of structural features of the '<em>Arity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeReferenceImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipConstraintImpl <em>Relationship Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipConstraintImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getRelationshipConstraint()
   * @generated
   */
  int RELATIONSHIP_CONSTRAINT = 16;

  /**
   * The number of structural features of the '<em>Relationship Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipConjunctionConstraintImpl <em>Relationship Conjunction Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipConjunctionConstraintImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getRelationshipConjunctionConstraint()
   * @generated
   */
  int RELATIONSHIP_CONJUNCTION_CONSTRAINT = 17;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONJUNCTION_CONSTRAINT__CONSTRAINTS = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Relationship Conjunction Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONJUNCTION_CONSTRAINT_FEATURE_COUNT = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipPrimitiveConstraintImpl <em>Relationship Primitive Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipPrimitiveConstraintImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getRelationshipPrimitiveConstraint()
   * @generated
   */
  int RELATIONSHIP_PRIMITIVE_CONSTRAINT = 18;

  /**
   * The number of structural features of the '<em>Relationship Primitive Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_PRIMITIVE_CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeConstraintImpl <em>Type Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeConstraintImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getTypeConstraint()
   * @generated
   */
  int TYPE_CONSTRAINT = 19;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CONSTRAINT__SOURCE = RELATIONSHIP_PRIMITIVE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CONSTRAINT__TARGET = RELATIONSHIP_PRIMITIVE_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CONSTRAINT_FEATURE_COUNT = RELATIONSHIP_PRIMITIVE_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.EnumerationImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__ELEMENTS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.EnumerationElementImpl <em>Enumeration Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.EnumerationElementImpl
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getEnumerationElement()
   * @generated
   */
  int ENUMERATION_ELEMENT = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Enumeration Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.MetricComparator <em>Metric Comparator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.MetricComparator
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getMetricComparator()
   * @generated
   */
  int METRIC_COMPARATOR = 24;


  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension <em>Architecture Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture Extension</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension
   * @generated
   */
  EClass getArchitectureExtension();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension#getName()
   * @see #getArchitectureExtension()
   * @generated
   */
  EAttribute getArchitectureExtension_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension#getEntities()
   * @see #getArchitectureExtension()
   * @generated
   */
  EReference getArchitectureExtension_Entities();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionEntity <em>Extension Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Entity</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionEntity
   * @generated
   */
  EClass getExtensionEntity();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Datatype
   * @generated
   */
  EClass getDatatype();

  /**
   * Returns the meta object for the containment reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Datatype#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Datatype#getReference()
   * @see #getDatatype()
   * @generated
   */
  EReference getDatatype_Reference();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType <em>Parametrized Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parametrized Type</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType
   * @generated
   */
  EClass getParametrizedType();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType#isAbstract()
   * @see #getParametrizedType()
   * @generated
   */
  EAttribute getParametrizedType_Abstract();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType#getParameters()
   * @see #getParametrizedType()
   * @generated
   */
  EReference getParametrizedType_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType#getFields()
   * @see #getParametrizedType()
   * @generated
   */
  EReference getParametrizedType_Fields();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the containment reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Pattern#getSuperPattern <em>Super Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Pattern</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Pattern#getSuperPattern()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_SuperPattern();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.PrimitiveRole <em>Primitive Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Role</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.PrimitiveRole
   * @generated
   */
  EClass getPrimitiveRole();

  /**
   * Returns the meta object for the containment reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.PrimitiveRole#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.PrimitiveRole#getType()
   * @see #getPrimitiveRole()
   * @generated
   */
  EReference getPrimitiveRole_Type();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#isInherited <em>Inherited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inherited</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Role#isInherited()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Inherited();

  /**
   * Returns the meta object for the reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Role#getElement()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Element();

  /**
   * Returns the meta object for the containment reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#getSuperRole <em>Super Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Role</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Role#getSuperRole()
   * @see #getRole()
   * @generated
   */
  EReference getRole_SuperRole();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Role#getConstraints()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Constraints();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionConstraint <em>Extension Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Constraint</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionConstraint
   * @generated
   */
  EClass getExtensionConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionConstraint#getConstraint()
   * @see #getExtensionConstraint()
   * @generated
   */
  EReference getExtensionConstraint_Constraint();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionConstraint#getExplanation <em>Explanation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explanation</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionConstraint#getExplanation()
   * @see #getExtensionConstraint()
   * @generated
   */
  EAttribute getExtensionConstraint_Explanation();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Query</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getQuery()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Query();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getComparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comparator</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getComparator()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Comparator();

  /**
   * Returns the meta object for the containment reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getValue()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Value();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#isAbstract()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Abstract();

  /**
   * Returns the meta object for the reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#getSuperRelationship <em>Super Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Relationship</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#getSuperRelationship()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_SuperRelationship();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#getConstraints()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Constraints();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#getFields()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Fields();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Field#isMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mandatory</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Field#isMandatory()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Mandatory();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Field#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Field#isMany()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Many();

  /**
   * Returns the meta object for the containment reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Field#getLb <em>Lb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lb</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Field#getLb()
   * @see #getField()
   * @generated
   */
  EReference getField_Lb();

  /**
   * Returns the meta object for the containment reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Field#getUb <em>Ub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ub</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Field#getUb()
   * @see #getField()
   * @generated
   */
  EReference getField_Ub();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Arity <em>Arity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arity</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Arity
   * @generated
   */
  EClass getArity();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Arity#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Arity#getValue()
   * @see #getArity()
   * @generated
   */
  EAttribute getArity_Value();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Arity#isUnbound <em>Unbound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unbound</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Arity#isUnbound()
   * @see #getArity()
   * @generated
   */
  EAttribute getArity_Unbound();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.TypeReference#getReference()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Reference();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeReference#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.TypeReference#getParameters()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Parameters();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConstraint <em>Relationship Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Constraint</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConstraint
   * @generated
   */
  EClass getRelationshipConstraint();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConjunctionConstraint <em>Relationship Conjunction Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Conjunction Constraint</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConjunctionConstraint
   * @generated
   */
  EClass getRelationshipConjunctionConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConjunctionConstraint#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConjunctionConstraint#getConstraints()
   * @see #getRelationshipConjunctionConstraint()
   * @generated
   */
  EReference getRelationshipConjunctionConstraint_Constraints();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipPrimitiveConstraint <em>Relationship Primitive Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Primitive Constraint</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipPrimitiveConstraint
   * @generated
   */
  EClass getRelationshipPrimitiveConstraint();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint <em>Type Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Constraint</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint
   * @generated
   */
  EClass getTypeConstraint();

  /**
   * Returns the meta object for the reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint#getSource()
   * @see #getTypeConstraint()
   * @generated
   */
  EReference getTypeConstraint_Source();

  /**
   * Returns the meta object for the reference '{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint#getTarget()
   * @see #getTypeConstraint()
   * @generated
   */
  EReference getTypeConstraint_Target();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Enumeration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Enumeration#getElements()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_Elements();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.EnumerationElement <em>Enumeration Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Element</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.EnumerationElement
   * @generated
   */
  EClass getEnumerationElement();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.EnumerationElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.EnumerationElement#getName()
   * @see #getEnumerationElement()
   * @generated
   */
  EAttribute getEnumerationElement_Name();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.NamedEntity <em>Named Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Entity</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.NamedEntity
   * @generated
   */
  EClass getNamedEntity();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.scertify.architecture.xadl.architectureDSL.NamedEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.NamedEntity#getName()
   * @see #getNamedEntity()
   * @generated
   */
  EAttribute getNamedEntity_Name();

  /**
   * Returns the meta object for class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ReferencedType <em>Referenced Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Type</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ReferencedType
   * @generated
   */
  EClass getReferencedType();

  /**
   * Returns the meta object for enum '{@link com.tocea.scertify.architecture.xadl.architectureDSL.MetricComparator <em>Metric Comparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Metric Comparator</em>'.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.MetricComparator
   * @generated
   */
  EEnum getMetricComparator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArchitectureDSLFactory getArchitectureDSLFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureExtensionImpl <em>Architecture Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureExtensionImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getArchitectureExtension()
     * @generated
     */
    EClass ARCHITECTURE_EXTENSION = eINSTANCE.getArchitectureExtension();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARCHITECTURE_EXTENSION__NAME = eINSTANCE.getArchitectureExtension_Name();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE_EXTENSION__ENTITIES = eINSTANCE.getArchitectureExtension_Entities();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ExtensionEntityImpl <em>Extension Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ExtensionEntityImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getExtensionEntity()
     * @generated
     */
    EClass EXTENSION_ENTITY = eINSTANCE.getExtensionEntity();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.DatatypeImpl <em>Datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.DatatypeImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getDatatype()
     * @generated
     */
    EClass DATATYPE = eINSTANCE.getDatatype();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATATYPE__REFERENCE = eINSTANCE.getDatatype_Reference();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ImportImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ParametrizedTypeImpl <em>Parametrized Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ParametrizedTypeImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getParametrizedType()
     * @generated
     */
    EClass PARAMETRIZED_TYPE = eINSTANCE.getParametrizedType();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETRIZED_TYPE__ABSTRACT = eINSTANCE.getParametrizedType_Abstract();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETRIZED_TYPE__PARAMETERS = eINSTANCE.getParametrizedType_Parameters();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETRIZED_TYPE__FIELDS = eINSTANCE.getParametrizedType_Fields();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.PatternImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Super Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__SUPER_PATTERN = eINSTANCE.getPattern_SuperPattern();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.PrimitiveRoleImpl <em>Primitive Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.PrimitiveRoleImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getPrimitiveRole()
     * @generated
     */
    EClass PRIMITIVE_ROLE = eINSTANCE.getPrimitiveRole();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_ROLE__TYPE = eINSTANCE.getPrimitiveRole_Type();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.RoleImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Inherited</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__INHERITED = eINSTANCE.getRole_Inherited();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__ELEMENT = eINSTANCE.getRole_Element();

    /**
     * The meta object literal for the '<em><b>Super Role</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__SUPER_ROLE = eINSTANCE.getRole_SuperRole();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__CONSTRAINTS = eINSTANCE.getRole_Constraints();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ExtensionConstraintImpl <em>Extension Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ExtensionConstraintImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getExtensionConstraint()
     * @generated
     */
    EClass EXTENSION_CONSTRAINT = eINSTANCE.getExtensionConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENSION_CONSTRAINT__CONSTRAINT = eINSTANCE.getExtensionConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Explanation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENSION_CONSTRAINT__EXPLANATION = eINSTANCE.getExtensionConstraint_Explanation();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ConstraintImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__QUERY = eINSTANCE.getConstraint_Query();

    /**
     * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__COMPARATOR = eINSTANCE.getConstraint_Comparator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__VALUE = eINSTANCE.getConstraint_Value();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__ABSTRACT = eINSTANCE.getRelationship_Abstract();

    /**
     * The meta object literal for the '<em><b>Super Relationship</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__SUPER_RELATIONSHIP = eINSTANCE.getRelationship_SuperRelationship();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__CONSTRAINTS = eINSTANCE.getRelationship_Constraints();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__FIELDS = eINSTANCE.getRelationship_Fields();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ParameterImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.FieldImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__MANDATORY = eINSTANCE.getField_Mandatory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__MANY = eINSTANCE.getField_Many();

    /**
     * The meta object literal for the '<em><b>Lb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__LB = eINSTANCE.getField_Lb();

    /**
     * The meta object literal for the '<em><b>Ub</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__UB = eINSTANCE.getField_Ub();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArityImpl <em>Arity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArityImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getArity()
     * @generated
     */
    EClass ARITY = eINSTANCE.getArity();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARITY__VALUE = eINSTANCE.getArity_Value();

    /**
     * The meta object literal for the '<em><b>Unbound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARITY__UNBOUND = eINSTANCE.getArity_Unbound();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeReferenceImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__REFERENCE = eINSTANCE.getTypeReference_Reference();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__PARAMETERS = eINSTANCE.getTypeReference_Parameters();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipConstraintImpl <em>Relationship Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipConstraintImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getRelationshipConstraint()
     * @generated
     */
    EClass RELATIONSHIP_CONSTRAINT = eINSTANCE.getRelationshipConstraint();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipConjunctionConstraintImpl <em>Relationship Conjunction Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipConjunctionConstraintImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getRelationshipConjunctionConstraint()
     * @generated
     */
    EClass RELATIONSHIP_CONJUNCTION_CONSTRAINT = eINSTANCE.getRelationshipConjunctionConstraint();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP_CONJUNCTION_CONSTRAINT__CONSTRAINTS = eINSTANCE.getRelationshipConjunctionConstraint_Constraints();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipPrimitiveConstraintImpl <em>Relationship Primitive Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.RelationshipPrimitiveConstraintImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getRelationshipPrimitiveConstraint()
     * @generated
     */
    EClass RELATIONSHIP_PRIMITIVE_CONSTRAINT = eINSTANCE.getRelationshipPrimitiveConstraint();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeConstraintImpl <em>Type Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.TypeConstraintImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getTypeConstraint()
     * @generated
     */
    EClass TYPE_CONSTRAINT = eINSTANCE.getTypeConstraint();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CONSTRAINT__SOURCE = eINSTANCE.getTypeConstraint_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CONSTRAINT__TARGET = eINSTANCE.getTypeConstraint_Target();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.EnumerationImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__ELEMENTS = eINSTANCE.getEnumeration_Elements();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.EnumerationElementImpl <em>Enumeration Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.EnumerationElementImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getEnumerationElement()
     * @generated
     */
    EClass ENUMERATION_ELEMENT = eINSTANCE.getEnumerationElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_ELEMENT__NAME = eINSTANCE.getEnumerationElement_Name();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.NamedEntityImpl <em>Named Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.NamedEntityImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getNamedEntity()
     * @generated
     */
    EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.impl.ReferencedTypeImpl <em>Referenced Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ReferencedTypeImpl
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getReferencedType()
     * @generated
     */
    EClass REFERENCED_TYPE = eINSTANCE.getReferencedType();

    /**
     * The meta object literal for the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.MetricComparator <em>Metric Comparator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.MetricComparator
     * @see com.tocea.scertify.architecture.xadl.architectureDSL.impl.ArchitectureDSLPackageImpl#getMetricComparator()
     * @generated
     */
    EEnum METRIC_COMPARATOR = eINSTANCE.getMetricComparator();

  }

} //ArchitectureDSLPackage
