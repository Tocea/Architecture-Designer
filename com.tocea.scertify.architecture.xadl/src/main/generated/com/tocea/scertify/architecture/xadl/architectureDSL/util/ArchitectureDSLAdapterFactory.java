/**
 */
package com.tocea.scertify.architecture.xadl.architectureDSL.util;

import com.tocea.scertify.architecture.xadl.architectureDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage
 * @generated
 */
public class ArchitectureDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArchitectureDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ArchitectureDSLPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected ArchitectureDSLSwitch<Adapter> modelSwitch =
    new ArchitectureDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseArchitectureExtension(ArchitectureExtension object)
      {
        return createArchitectureExtensionAdapter();
      }
      @Override
      public Adapter caseExtensionEntity(ExtensionEntity object)
      {
        return createExtensionEntityAdapter();
      }
      @Override
      public Adapter caseDatatype(Datatype object)
      {
        return createDatatypeAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseParametrizedType(ParametrizedType object)
      {
        return createParametrizedTypeAdapter();
      }
      @Override
      public Adapter casePattern(Pattern object)
      {
        return createPatternAdapter();
      }
      @Override
      public Adapter casePrimitiveRole(PrimitiveRole object)
      {
        return createPrimitiveRoleAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter caseExtensionConstraint(ExtensionConstraint object)
      {
        return createExtensionConstraintAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseRelationship(Relationship object)
      {
        return createRelationshipAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseArity(Arity object)
      {
        return createArityAdapter();
      }
      @Override
      public Adapter caseTypeReference(TypeReference object)
      {
        return createTypeReferenceAdapter();
      }
      @Override
      public Adapter caseRelationshipConstraint(RelationshipConstraint object)
      {
        return createRelationshipConstraintAdapter();
      }
      @Override
      public Adapter caseRelationshipConjunctionConstraint(RelationshipConjunctionConstraint object)
      {
        return createRelationshipConjunctionConstraintAdapter();
      }
      @Override
      public Adapter caseRelationshipPrimitiveConstraint(RelationshipPrimitiveConstraint object)
      {
        return createRelationshipPrimitiveConstraintAdapter();
      }
      @Override
      public Adapter caseTypeConstraint(TypeConstraint object)
      {
        return createTypeConstraintAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseEnumerationElement(EnumerationElement object)
      {
        return createEnumerationElementAdapter();
      }
      @Override
      public Adapter caseNamedEntity(NamedEntity object)
      {
        return createNamedEntityAdapter();
      }
      @Override
      public Adapter caseReferencedType(ReferencedType object)
      {
        return createReferencedTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension <em>Architecture Extension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension
   * @generated
   */
  public Adapter createArchitectureExtensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionEntity <em>Extension Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionEntity
   * @generated
   */
  public Adapter createExtensionEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Datatype
   * @generated
   */
  public Adapter createDatatypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType <em>Parametrized Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType
   * @generated
   */
  public Adapter createParametrizedTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.PrimitiveRole <em>Primitive Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.PrimitiveRole
   * @generated
   */
  public Adapter createPrimitiveRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionConstraint <em>Extension Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionConstraint
   * @generated
   */
  public Adapter createExtensionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Relationship
   * @generated
   */
  public Adapter createRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Arity <em>Arity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Arity
   * @generated
   */
  public Adapter createArityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.TypeReference
   * @generated
   */
  public Adapter createTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConstraint <em>Relationship Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConstraint
   * @generated
   */
  public Adapter createRelationshipConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConjunctionConstraint <em>Relationship Conjunction Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConjunctionConstraint
   * @generated
   */
  public Adapter createRelationshipConjunctionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipPrimitiveConstraint <em>Relationship Primitive Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipPrimitiveConstraint
   * @generated
   */
  public Adapter createRelationshipPrimitiveConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint <em>Type Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint
   * @generated
   */
  public Adapter createTypeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.EnumerationElement <em>Enumeration Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.EnumerationElement
   * @generated
   */
  public Adapter createEnumerationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.NamedEntity <em>Named Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.NamedEntity
   * @generated
   */
  public Adapter createNamedEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ReferencedType <em>Referenced Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ReferencedType
   * @generated
   */
  public Adapter createReferencedTypeAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ArchitectureDSLAdapterFactory
