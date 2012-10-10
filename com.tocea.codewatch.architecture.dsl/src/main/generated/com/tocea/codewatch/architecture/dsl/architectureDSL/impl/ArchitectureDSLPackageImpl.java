/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL.impl;

import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLFactory;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureExtension;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Arity;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Constraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Datatype;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Enumeration;
import com.tocea.codewatch.architecture.dsl.architectureDSL.EnumerationElement;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionEntity;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Field;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Import;
import com.tocea.codewatch.architecture.dsl.architectureDSL.MetricComparator;
import com.tocea.codewatch.architecture.dsl.architectureDSL.NamedEntity;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Parameter;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Pattern;
import com.tocea.codewatch.architecture.dsl.architectureDSL.PrimitiveRole;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ReferencedType;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Relationship;
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConjunctionConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipPrimitiveConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Role;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Type;
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference;

import com.tocea.codewatch.architecture.query.dsl.queryDsl.QueryDslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureDSLPackageImpl extends EPackageImpl implements ArchitectureDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass architectureExtensionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extensionEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datatypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

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
  private EClass parametrizedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveRoleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extensionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipEClass = null;

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
  private EClass fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipConjunctionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipPrimitiveConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referencedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum metricComparatorEEnum = null;

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
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ArchitectureDSLPackageImpl()
  {
    super(eNS_URI, ArchitectureDSLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ArchitectureDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ArchitectureDSLPackage init()
  {
    if (isInited) return (ArchitectureDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ArchitectureDSLPackage.eNS_URI);

    // Obtain or create and register package
    ArchitectureDSLPackageImpl theArchitectureDSLPackage = (ArchitectureDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArchitectureDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArchitectureDSLPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    QueryDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theArchitectureDSLPackage.createPackageContents();

    // Initialize created meta-data
    theArchitectureDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theArchitectureDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ArchitectureDSLPackage.eNS_URI, theArchitectureDSLPackage);
    return theArchitectureDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArchitectureExtension()
  {
    return architectureExtensionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArchitectureExtension_Name()
  {
    return (EAttribute)architectureExtensionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitectureExtension_Entities()
  {
    return (EReference)architectureExtensionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtensionEntity()
  {
    return extensionEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatype()
  {
    return datatypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatype_Reference()
  {
    return (EReference)datatypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParametrizedType()
  {
    return parametrizedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParametrizedType_Abstract()
  {
    return (EAttribute)parametrizedTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametrizedType_Parameters()
  {
    return (EReference)parametrizedTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametrizedType_Fields()
  {
    return (EReference)parametrizedTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPattern()
  {
    return patternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_SuperPattern()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveRole()
  {
    return primitiveRoleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitiveRole_Type()
  {
    return (EReference)primitiveRoleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRole_Inherited()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Element()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_SuperRole()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Constraints()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtensionConstraint()
  {
    return extensionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtensionConstraint_Constraint()
  {
    return (EReference)extensionConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtensionConstraint_Explanation()
  {
    return (EAttribute)extensionConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_Query()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Comparator()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_Value()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationship()
  {
    return relationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_Abstract()
  {
    return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_SuperRelationship()
  {
    return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_Constraints()
  {
    return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_Fields()
  {
    return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Mandatory()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Name()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_Type()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Many()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_Lb()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_Ub()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArity()
  {
    return arityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArity_Value()
  {
    return (EAttribute)arityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArity_Unbound()
  {
    return (EAttribute)arityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeReference()
  {
    return typeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeReference_Reference()
  {
    return (EReference)typeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeReference_Parameters()
  {
    return (EReference)typeReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipConstraint()
  {
    return relationshipConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipConjunctionConstraint()
  {
    return relationshipConjunctionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationshipConjunctionConstraint_Constraints()
  {
    return (EReference)relationshipConjunctionConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipPrimitiveConstraint()
  {
    return relationshipPrimitiveConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeConstraint()
  {
    return typeConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeConstraint_Source()
  {
    return (EReference)typeConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeConstraint_Target()
  {
    return (EReference)typeConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumeration()
  {
    return enumerationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumeration_Elements()
  {
    return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumerationElement()
  {
    return enumerationElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationElement_Name()
  {
    return (EAttribute)enumerationElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedEntity()
  {
    return namedEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedEntity_Name()
  {
    return (EAttribute)namedEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferencedType()
  {
    return referencedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMetricComparator()
  {
    return metricComparatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDSLFactory getArchitectureDSLFactory()
  {
    return (ArchitectureDSLFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    architectureExtensionEClass = createEClass(ARCHITECTURE_EXTENSION);
    createEAttribute(architectureExtensionEClass, ARCHITECTURE_EXTENSION__NAME);
    createEReference(architectureExtensionEClass, ARCHITECTURE_EXTENSION__ENTITIES);

    extensionEntityEClass = createEClass(EXTENSION_ENTITY);

    datatypeEClass = createEClass(DATATYPE);
    createEReference(datatypeEClass, DATATYPE__REFERENCE);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    typeEClass = createEClass(TYPE);

    parametrizedTypeEClass = createEClass(PARAMETRIZED_TYPE);
    createEAttribute(parametrizedTypeEClass, PARAMETRIZED_TYPE__ABSTRACT);
    createEReference(parametrizedTypeEClass, PARAMETRIZED_TYPE__PARAMETERS);
    createEReference(parametrizedTypeEClass, PARAMETRIZED_TYPE__FIELDS);

    patternEClass = createEClass(PATTERN);
    createEReference(patternEClass, PATTERN__SUPER_PATTERN);

    primitiveRoleEClass = createEClass(PRIMITIVE_ROLE);
    createEReference(primitiveRoleEClass, PRIMITIVE_ROLE__TYPE);

    roleEClass = createEClass(ROLE);
    createEAttribute(roleEClass, ROLE__INHERITED);
    createEReference(roleEClass, ROLE__ELEMENT);
    createEReference(roleEClass, ROLE__SUPER_ROLE);
    createEReference(roleEClass, ROLE__CONSTRAINTS);

    extensionConstraintEClass = createEClass(EXTENSION_CONSTRAINT);
    createEReference(extensionConstraintEClass, EXTENSION_CONSTRAINT__CONSTRAINT);
    createEAttribute(extensionConstraintEClass, EXTENSION_CONSTRAINT__EXPLANATION);

    constraintEClass = createEClass(CONSTRAINT);
    createEReference(constraintEClass, CONSTRAINT__QUERY);
    createEAttribute(constraintEClass, CONSTRAINT__COMPARATOR);
    createEReference(constraintEClass, CONSTRAINT__VALUE);

    relationshipEClass = createEClass(RELATIONSHIP);
    createEAttribute(relationshipEClass, RELATIONSHIP__ABSTRACT);
    createEReference(relationshipEClass, RELATIONSHIP__SUPER_RELATIONSHIP);
    createEReference(relationshipEClass, RELATIONSHIP__CONSTRAINTS);
    createEReference(relationshipEClass, RELATIONSHIP__FIELDS);

    parameterEClass = createEClass(PARAMETER);

    fieldEClass = createEClass(FIELD);
    createEAttribute(fieldEClass, FIELD__MANDATORY);
    createEAttribute(fieldEClass, FIELD__NAME);
    createEReference(fieldEClass, FIELD__TYPE);
    createEAttribute(fieldEClass, FIELD__MANY);
    createEReference(fieldEClass, FIELD__LB);
    createEReference(fieldEClass, FIELD__UB);

    arityEClass = createEClass(ARITY);
    createEAttribute(arityEClass, ARITY__VALUE);
    createEAttribute(arityEClass, ARITY__UNBOUND);

    typeReferenceEClass = createEClass(TYPE_REFERENCE);
    createEReference(typeReferenceEClass, TYPE_REFERENCE__REFERENCE);
    createEReference(typeReferenceEClass, TYPE_REFERENCE__PARAMETERS);

    relationshipConstraintEClass = createEClass(RELATIONSHIP_CONSTRAINT);

    relationshipConjunctionConstraintEClass = createEClass(RELATIONSHIP_CONJUNCTION_CONSTRAINT);
    createEReference(relationshipConjunctionConstraintEClass, RELATIONSHIP_CONJUNCTION_CONSTRAINT__CONSTRAINTS);

    relationshipPrimitiveConstraintEClass = createEClass(RELATIONSHIP_PRIMITIVE_CONSTRAINT);

    typeConstraintEClass = createEClass(TYPE_CONSTRAINT);
    createEReference(typeConstraintEClass, TYPE_CONSTRAINT__SOURCE);
    createEReference(typeConstraintEClass, TYPE_CONSTRAINT__TARGET);

    enumerationEClass = createEClass(ENUMERATION);
    createEReference(enumerationEClass, ENUMERATION__ELEMENTS);

    enumerationElementEClass = createEClass(ENUMERATION_ELEMENT);
    createEAttribute(enumerationElementEClass, ENUMERATION_ELEMENT__NAME);

    namedEntityEClass = createEClass(NAMED_ENTITY);
    createEAttribute(namedEntityEClass, NAMED_ENTITY__NAME);

    referencedTypeEClass = createEClass(REFERENCED_TYPE);

    // Create enums
    metricComparatorEEnum = createEEnum(METRIC_COMPARATOR);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    QueryDslPackage theQueryDslPackage = (QueryDslPackage)EPackage.Registry.INSTANCE.getEPackage(QueryDslPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    datatypeEClass.getESuperTypes().add(this.getType());
    importEClass.getESuperTypes().add(this.getExtensionEntity());
    typeEClass.getESuperTypes().add(this.getExtensionEntity());
    typeEClass.getESuperTypes().add(this.getReferencedType());
    parametrizedTypeEClass.getESuperTypes().add(this.getType());
    patternEClass.getESuperTypes().add(this.getParametrizedType());
    primitiveRoleEClass.getESuperTypes().add(this.getType());
    roleEClass.getESuperTypes().add(this.getParametrizedType());
    relationshipEClass.getESuperTypes().add(this.getExtensionEntity());
    relationshipEClass.getESuperTypes().add(this.getNamedEntity());
    parameterEClass.getESuperTypes().add(this.getReferencedType());
    relationshipConjunctionConstraintEClass.getESuperTypes().add(this.getRelationshipConstraint());
    typeConstraintEClass.getESuperTypes().add(this.getRelationshipPrimitiveConstraint());
    enumerationEClass.getESuperTypes().add(this.getType());
    referencedTypeEClass.getESuperTypes().add(this.getNamedEntity());

    // Initialize classes and features; add operations and parameters
    initEClass(architectureExtensionEClass, ArchitectureExtension.class, "ArchitectureExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArchitectureExtension_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArchitectureExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchitectureExtension_Entities(), this.getExtensionEntity(), null, "entities", null, 0, -1, ArchitectureExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extensionEntityEClass, ExtensionEntity.class, "ExtensionEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatatype_Reference(), theTypesPackage.getJvmTypeReference(), null, "reference", null, 0, 1, Datatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parametrizedTypeEClass, ParametrizedType.class, "ParametrizedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParametrizedType_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, ParametrizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParametrizedType_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ParametrizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParametrizedType_Fields(), this.getField(), null, "fields", null, 0, -1, ParametrizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPattern_SuperPattern(), this.getTypeReference(), null, "superPattern", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveRoleEClass, PrimitiveRole.class, "PrimitiveRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimitiveRole_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, PrimitiveRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRole_Inherited(), ecorePackage.getEBoolean(), "inherited", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Element(), this.getType(), null, "element", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_SuperRole(), this.getTypeReference(), null, "superRole", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Constraints(), this.getExtensionConstraint(), null, "constraints", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extensionConstraintEClass, ExtensionConstraint.class, "ExtensionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtensionConstraint_Constraint(), this.getConstraint(), null, "constraint", null, 0, 1, ExtensionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtensionConstraint_Explanation(), ecorePackage.getEString(), "explanation", null, 0, 1, ExtensionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraint_Query(), theQueryDslPackage.getQuery(), null, "query", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraint_Comparator(), this.getMetricComparator(), "comparator", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_Value(), theXbasePackage.getXExpression(), null, "value", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationship_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_SuperRelationship(), this.getRelationship(), null, "superRelationship", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_Constraints(), this.getRelationshipConstraint(), null, "constraints", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_Fields(), this.getField(), null, "fields", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_Type(), this.getTypeReference(), null, "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_Lb(), this.getArity(), null, "lb", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_Ub(), this.getArity(), null, "ub", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arityEClass, Arity.class, "Arity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArity_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Arity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArity_Unbound(), ecorePackage.getEBoolean(), "unbound", null, 0, 1, Arity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeReference_Reference(), this.getReferencedType(), null, "reference", null, 0, 1, TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeReference_Parameters(), this.getTypeReference(), null, "parameters", null, 0, -1, TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipConstraintEClass, RelationshipConstraint.class, "RelationshipConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationshipConjunctionConstraintEClass, RelationshipConjunctionConstraint.class, "RelationshipConjunctionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationshipConjunctionConstraint_Constraints(), this.getRelationshipPrimitiveConstraint(), null, "constraints", null, 0, -1, RelationshipConjunctionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipPrimitiveConstraintEClass, RelationshipPrimitiveConstraint.class, "RelationshipPrimitiveConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeConstraintEClass, TypeConstraint.class, "TypeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeConstraint_Source(), this.getType(), null, "source", null, 0, 1, TypeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeConstraint_Target(), this.getType(), null, "target", null, 0, 1, TypeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumeration_Elements(), this.getEnumerationElement(), null, "elements", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationElementEClass, EnumerationElement.class, "EnumerationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumerationElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumerationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedEntityEClass, NamedEntity.class, "NamedEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referencedTypeEClass, ReferencedType.class, "ReferencedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(metricComparatorEEnum, MetricComparator.class, "MetricComparator");
    addEEnumLiteral(metricComparatorEEnum, MetricComparator.GE);
    addEEnumLiteral(metricComparatorEEnum, MetricComparator.LE);
    addEEnumLiteral(metricComparatorEEnum, MetricComparator.GT);
    addEEnumLiteral(metricComparatorEEnum, MetricComparator.LT);
    addEEnumLiteral(metricComparatorEEnum, MetricComparator.EQ);
    addEEnumLiteral(metricComparatorEEnum, MetricComparator.NE);

    // Create resource
    createResource(eNS_URI);
  }

} //ArchitectureDSLPackageImpl
