/**
 */
package com.tocea.codewatch.architecture.extension.util;

import com.tocea.codewatch.architecture.AnalysedElement;
import com.tocea.codewatch.architecture.Relationship;

import com.tocea.codewatch.architecture.extension.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.tocea.codewatch.architecture.extension.ExtensionPackage
 * @generated
 */
public class ExtensionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtensionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtensionPackage.eINSTANCE;
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
	protected ExtensionSwitch<Adapter> modelSwitch =
		new ExtensionSwitch<Adapter>() {
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public <T> Adapter caseRole(Role<T> object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRelationshipConstraint(RelationshipConstraint object) {
				return createRelationshipConstraintAdapter();
			}
			@Override
			public Adapter caseExtensionRelationship(ExtensionRelationship object) {
				return createExtensionRelationshipAdapter();
			}
			@Override
			public Adapter caseRoleRelationship(RoleRelationship object) {
				return createRoleRelationshipAdapter();
			}
			@Override
			public Adapter casePatternRelationship(PatternRelationship object) {
				return createPatternRelationshipAdapter();
			}
			@Override
			public Adapter caseAnalysedElement(AnalysedElement object) {
				return createAnalysedElementAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.extension.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.extension.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.extension.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.extension.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.extension.RelationshipConstraint <em>Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.extension.RelationshipConstraint
	 * @generated
	 */
	public Adapter createRelationshipConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.extension.ExtensionRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.extension.ExtensionRelationship
	 * @generated
	 */
	public Adapter createExtensionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.extension.RoleRelationship <em>Role Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.extension.RoleRelationship
	 * @generated
	 */
	public Adapter createRoleRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.extension.PatternRelationship <em>Pattern Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.extension.PatternRelationship
	 * @generated
	 */
	public Adapter createPatternRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.AnalysedElement <em>Analysed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.AnalysedElement
	 * @generated
	 */
	public Adapter createAnalysedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
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

} //ExtensionAdapterFactory
