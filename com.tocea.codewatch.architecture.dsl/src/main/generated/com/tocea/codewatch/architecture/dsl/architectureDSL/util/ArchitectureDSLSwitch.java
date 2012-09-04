/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL.util;

import com.tocea.codewatch.architecture.dsl.architectureDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage
 * @generated
 */
public class ArchitectureDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArchitectureDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ArchitectureDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ArchitectureDSLPackage.ARCHITECTURE_EXTENSION:
      {
        ArchitectureExtension architectureExtension = (ArchitectureExtension)theEObject;
        T result = caseArchitectureExtension(architectureExtension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.EXTENSION_ENTITY:
      {
        ExtensionEntity extensionEntity = (ExtensionEntity)theEObject;
        T result = caseExtensionEntity(extensionEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.DATATYPE:
      {
        Datatype datatype = (Datatype)theEObject;
        T result = caseDatatype(datatype);
        if (result == null) result = caseType(datatype);
        if (result == null) result = caseExtensionEntity(datatype);
        if (result == null) result = caseReferencedType(datatype);
        if (result == null) result = caseNamedEntity(datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseExtensionEntity(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseExtensionEntity(type);
        if (result == null) result = caseReferencedType(type);
        if (result == null) result = caseNamedEntity(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.PARAMETRIZED_TYPE:
      {
        ParametrizedType parametrizedType = (ParametrizedType)theEObject;
        T result = caseParametrizedType(parametrizedType);
        if (result == null) result = caseType(parametrizedType);
        if (result == null) result = caseExtensionEntity(parametrizedType);
        if (result == null) result = caseReferencedType(parametrizedType);
        if (result == null) result = caseNamedEntity(parametrizedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.PATTERN:
      {
        Pattern pattern = (Pattern)theEObject;
        T result = casePattern(pattern);
        if (result == null) result = caseParametrizedType(pattern);
        if (result == null) result = caseType(pattern);
        if (result == null) result = caseExtensionEntity(pattern);
        if (result == null) result = caseReferencedType(pattern);
        if (result == null) result = caseNamedEntity(pattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.PRIMITIVE_ROLE:
      {
        PrimitiveRole primitiveRole = (PrimitiveRole)theEObject;
        T result = casePrimitiveRole(primitiveRole);
        if (result == null) result = caseType(primitiveRole);
        if (result == null) result = caseExtensionEntity(primitiveRole);
        if (result == null) result = caseReferencedType(primitiveRole);
        if (result == null) result = caseNamedEntity(primitiveRole);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = caseParametrizedType(role);
        if (result == null) result = caseType(role);
        if (result == null) result = caseExtensionEntity(role);
        if (result == null) result = caseReferencedType(role);
        if (result == null) result = caseNamedEntity(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.RELATIONSHIP:
      {
        Relationship relationship = (Relationship)theEObject;
        T result = caseRelationship(relationship);
        if (result == null) result = caseExtensionEntity(relationship);
        if (result == null) result = caseNamedEntity(relationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseReferencedType(parameter);
        if (result == null) result = caseNamedEntity(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.ARITY:
      {
        Arity arity = (Arity)theEObject;
        T result = caseArity(arity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.TYPE_REFERENCE:
      {
        TypeReference typeReference = (TypeReference)theEObject;
        T result = caseTypeReference(typeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.RELATIONSHIP_CONSTRAINT:
      {
        RelationshipConstraint relationshipConstraint = (RelationshipConstraint)theEObject;
        T result = caseRelationshipConstraint(relationshipConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.RELATIONSHIP_CONJUNCTION_CONSTRAINT:
      {
        RelationshipConjunctionConstraint relationshipConjunctionConstraint = (RelationshipConjunctionConstraint)theEObject;
        T result = caseRelationshipConjunctionConstraint(relationshipConjunctionConstraint);
        if (result == null) result = caseRelationshipConstraint(relationshipConjunctionConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.RELATIONSHIP_PRIMITIVE_CONSTRAINT:
      {
        RelationshipPrimitiveConstraint relationshipPrimitiveConstraint = (RelationshipPrimitiveConstraint)theEObject;
        T result = caseRelationshipPrimitiveConstraint(relationshipPrimitiveConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.TYPE_CONSTRAINT:
      {
        TypeConstraint typeConstraint = (TypeConstraint)theEObject;
        T result = caseTypeConstraint(typeConstraint);
        if (result == null) result = caseRelationshipPrimitiveConstraint(typeConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.NAMED_ENTITY:
      {
        NamedEntity namedEntity = (NamedEntity)theEObject;
        T result = caseNamedEntity(namedEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArchitectureDSLPackage.REFERENCED_TYPE:
      {
        ReferencedType referencedType = (ReferencedType)theEObject;
        T result = caseReferencedType(referencedType);
        if (result == null) result = caseNamedEntity(referencedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Architecture Extension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Architecture Extension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArchitectureExtension(ArchitectureExtension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtensionEntity(ExtensionEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatype(Datatype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parametrized Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parametrized Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParametrizedType(ParametrizedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveRole(PrimitiveRole object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationship(Relationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArity(Arity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeReference(TypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationshipConstraint(RelationshipConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship Conjunction Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship Conjunction Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationshipConjunctionConstraint(RelationshipConjunctionConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship Primitive Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship Primitive Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationshipPrimitiveConstraint(RelationshipPrimitiveConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeConstraint(TypeConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedEntity(NamedEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedType(ReferencedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ArchitectureDSLSwitch
