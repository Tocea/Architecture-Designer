/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage
 * @generated
 */
public interface ArchitectureDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArchitectureDSLFactory eINSTANCE = com.tocea.codewatch.architecture.dsl.architectureDSL.impl.ArchitectureDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Architecture Extension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Architecture Extension</em>'.
   * @generated
   */
  ArchitectureExtension createArchitectureExtension();

  /**
   * Returns a new object of class '<em>Extension Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Entity</em>'.
   * @generated
   */
  ExtensionEntity createExtensionEntity();

  /**
   * Returns a new object of class '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype</em>'.
   * @generated
   */
  Datatype createDatatype();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Parametrized Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parametrized Type</em>'.
   * @generated
   */
  ParametrizedType createParametrizedType();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Primitive Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Role</em>'.
   * @generated
   */
  PrimitiveRole createPrimitiveRole();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>Extension Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Constraint</em>'.
   * @generated
   */
  ExtensionConstraint createExtensionConstraint();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship</em>'.
   * @generated
   */
  Relationship createRelationship();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Arity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arity</em>'.
   * @generated
   */
  Arity createArity();

  /**
   * Returns a new object of class '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Reference</em>'.
   * @generated
   */
  TypeReference createTypeReference();

  /**
   * Returns a new object of class '<em>Relationship Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Constraint</em>'.
   * @generated
   */
  RelationshipConstraint createRelationshipConstraint();

  /**
   * Returns a new object of class '<em>Relationship Conjunction Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Conjunction Constraint</em>'.
   * @generated
   */
  RelationshipConjunctionConstraint createRelationshipConjunctionConstraint();

  /**
   * Returns a new object of class '<em>Relationship Primitive Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Primitive Constraint</em>'.
   * @generated
   */
  RelationshipPrimitiveConstraint createRelationshipPrimitiveConstraint();

  /**
   * Returns a new object of class '<em>Type Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Constraint</em>'.
   * @generated
   */
  TypeConstraint createTypeConstraint();

  /**
   * Returns a new object of class '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration</em>'.
   * @generated
   */
  Enumeration createEnumeration();

  /**
   * Returns a new object of class '<em>Enumeration Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Element</em>'.
   * @generated
   */
  EnumerationElement createEnumerationElement();

  /**
   * Returns a new object of class '<em>Named Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Entity</em>'.
   * @generated
   */
  NamedEntity createNamedEntity();

  /**
   * Returns a new object of class '<em>Referenced Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Referenced Type</em>'.
   * @generated
   */
  ReferencedType createReferencedType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArchitectureDSLPackage getArchitectureDSLPackage();

} //ArchitectureDSLFactory
