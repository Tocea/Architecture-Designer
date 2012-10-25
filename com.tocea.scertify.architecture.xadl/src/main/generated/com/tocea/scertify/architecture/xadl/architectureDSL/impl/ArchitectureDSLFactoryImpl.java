/**
 */
package com.tocea.scertify.architecture.xadl.architectureDSL.impl;

import com.tocea.scertify.architecture.xadl.architectureDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureDSLFactoryImpl extends EFactoryImpl implements ArchitectureDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArchitectureDSLFactory init()
  {
    try
    {
      ArchitectureDSLFactory theArchitectureDSLFactory = (ArchitectureDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tocea.com/codewatch/architecture/dsl/ArchitectureDSL"); 
      if (theArchitectureDSLFactory != null)
      {
        return theArchitectureDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArchitectureDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ArchitectureDSLPackage.ARCHITECTURE_EXTENSION: return createArchitectureExtension();
      case ArchitectureDSLPackage.EXTENSION_ENTITY: return createExtensionEntity();
      case ArchitectureDSLPackage.DATATYPE: return createDatatype();
      case ArchitectureDSLPackage.IMPORT: return createImport();
      case ArchitectureDSLPackage.TYPE: return createType();
      case ArchitectureDSLPackage.PARAMETRIZED_TYPE: return createParametrizedType();
      case ArchitectureDSLPackage.PATTERN: return createPattern();
      case ArchitectureDSLPackage.PRIMITIVE_ROLE: return createPrimitiveRole();
      case ArchitectureDSLPackage.ROLE: return createRole();
      case ArchitectureDSLPackage.EXTENSION_CONSTRAINT: return createExtensionConstraint();
      case ArchitectureDSLPackage.CONSTRAINT: return createConstraint();
      case ArchitectureDSLPackage.RELATIONSHIP: return createRelationship();
      case ArchitectureDSLPackage.PARAMETER: return createParameter();
      case ArchitectureDSLPackage.FIELD: return createField();
      case ArchitectureDSLPackage.ARITY: return createArity();
      case ArchitectureDSLPackage.TYPE_REFERENCE: return createTypeReference();
      case ArchitectureDSLPackage.RELATIONSHIP_CONSTRAINT: return createRelationshipConstraint();
      case ArchitectureDSLPackage.RELATIONSHIP_CONJUNCTION_CONSTRAINT: return createRelationshipConjunctionConstraint();
      case ArchitectureDSLPackage.RELATIONSHIP_PRIMITIVE_CONSTRAINT: return createRelationshipPrimitiveConstraint();
      case ArchitectureDSLPackage.TYPE_CONSTRAINT: return createTypeConstraint();
      case ArchitectureDSLPackage.ENUMERATION: return createEnumeration();
      case ArchitectureDSLPackage.ENUMERATION_ELEMENT: return createEnumerationElement();
      case ArchitectureDSLPackage.NAMED_ENTITY: return createNamedEntity();
      case ArchitectureDSLPackage.REFERENCED_TYPE: return createReferencedType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ArchitectureDSLPackage.METRIC_COMPARATOR:
        return createMetricComparatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ArchitectureDSLPackage.METRIC_COMPARATOR:
        return convertMetricComparatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureExtension createArchitectureExtension()
  {
    ArchitectureExtensionImpl architectureExtension = new ArchitectureExtensionImpl();
    return architectureExtension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionEntity createExtensionEntity()
  {
    ExtensionEntityImpl extensionEntity = new ExtensionEntityImpl();
    return extensionEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype createDatatype()
  {
    DatatypeImpl datatype = new DatatypeImpl();
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParametrizedType createParametrizedType()
  {
    ParametrizedTypeImpl parametrizedType = new ParametrizedTypeImpl();
    return parametrizedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveRole createPrimitiveRole()
  {
    PrimitiveRoleImpl primitiveRole = new PrimitiveRoleImpl();
    return primitiveRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionConstraint createExtensionConstraint()
  {
    ExtensionConstraintImpl extensionConstraint = new ExtensionConstraintImpl();
    return extensionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship createRelationship()
  {
    RelationshipImpl relationship = new RelationshipImpl();
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arity createArity()
  {
    ArityImpl arity = new ArityImpl();
    return arity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipConstraint createRelationshipConstraint()
  {
    RelationshipConstraintImpl relationshipConstraint = new RelationshipConstraintImpl();
    return relationshipConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipConjunctionConstraint createRelationshipConjunctionConstraint()
  {
    RelationshipConjunctionConstraintImpl relationshipConjunctionConstraint = new RelationshipConjunctionConstraintImpl();
    return relationshipConjunctionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipPrimitiveConstraint createRelationshipPrimitiveConstraint()
  {
    RelationshipPrimitiveConstraintImpl relationshipPrimitiveConstraint = new RelationshipPrimitiveConstraintImpl();
    return relationshipPrimitiveConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeConstraint createTypeConstraint()
  {
    TypeConstraintImpl typeConstraint = new TypeConstraintImpl();
    return typeConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationElement createEnumerationElement()
  {
    EnumerationElementImpl enumerationElement = new EnumerationElementImpl();
    return enumerationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedEntity createNamedEntity()
  {
    NamedEntityImpl namedEntity = new NamedEntityImpl();
    return namedEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedType createReferencedType()
  {
    ReferencedTypeImpl referencedType = new ReferencedTypeImpl();
    return referencedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetricComparator createMetricComparatorFromString(EDataType eDataType, String initialValue)
  {
    MetricComparator result = MetricComparator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMetricComparatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDSLPackage getArchitectureDSLPackage()
  {
    return (ArchitectureDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ArchitectureDSLPackage getPackage()
  {
    return ArchitectureDSLPackage.eINSTANCE;
  }

} //ArchitectureDSLFactoryImpl
