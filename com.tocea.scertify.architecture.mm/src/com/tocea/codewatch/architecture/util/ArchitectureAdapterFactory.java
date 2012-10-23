/**
 */
package com.tocea.codewatch.architecture.util;

import com.tocea.codewatch.architecture.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.tocea.codewatch.architecture.ArchitecturePackage
 * @generated
 */
public class ArchitectureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArchitecturePackage.eINSTANCE;
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
	protected ArchitectureSwitch<Adapter> modelSwitch =
		new ArchitectureSwitch<Adapter>() {
			@Override
			public Adapter caseAnalysedElement(AnalysedElement object) {
				return createAnalysedElementAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseArchitectureFile(ArchitectureFile object) {
				return createArchitectureFileAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseInheritanceDependency(InheritanceDependency object) {
				return createInheritanceDependencyAdapter();
			}
			@Override
			public Adapter caseReferenceDependency(ReferenceDependency object) {
				return createReferenceDependencyAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseRuntimeDependency(RuntimeDependency object) {
				return createRuntimeDependencyAdapter();
			}
			@Override
			public Adapter caseInjectionDependency(InjectionDependency object) {
				return createInjectionDependencyAdapter();
			}
			@Override
			public Adapter caseFieldReferenceDependency(FieldReferenceDependency object) {
				return createFieldReferenceDependencyAdapter();
			}
			@Override
			public Adapter caseImportReferenceDependency(ImportReferenceDependency object) {
				return createImportReferenceDependencyAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseReturnTypeRelationship(ReturnTypeRelationship object) {
				return createReturnTypeRelationshipAdapter();
			}
			@Override
			public Adapter caseParameterRelationship(ParameterRelationship object) {
				return createParameterRelationshipAdapter();
			}
			@Override
			public Adapter caseCallRelationship(CallRelationship object) {
				return createCallRelationshipAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseDeclaredType(DeclaredType object) {
				return createDeclaredTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.ArchitectureFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.ArchitectureFile
	 * @generated
	 */
	public Adapter createArchitectureFileAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.InheritanceDependency <em>Inheritance Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.InheritanceDependency
	 * @generated
	 */
	public Adapter createInheritanceDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.ReferenceDependency <em>Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.ReferenceDependency
	 * @generated
	 */
	public Adapter createReferenceDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.RuntimeDependency <em>Runtime Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.RuntimeDependency
	 * @generated
	 */
	public Adapter createRuntimeDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.InjectionDependency <em>Injection Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.InjectionDependency
	 * @generated
	 */
	public Adapter createInjectionDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.FieldReferenceDependency <em>Field Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.FieldReferenceDependency
	 * @generated
	 */
	public Adapter createFieldReferenceDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.ImportReferenceDependency <em>Import Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.ImportReferenceDependency
	 * @generated
	 */
	public Adapter createImportReferenceDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.ReturnTypeRelationship <em>Return Type Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.ReturnTypeRelationship
	 * @generated
	 */
	public Adapter createReturnTypeRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.ParameterRelationship <em>Parameter Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.ParameterRelationship
	 * @generated
	 */
	public Adapter createParameterRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.CallRelationship <em>Call Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.CallRelationship
	 * @generated
	 */
	public Adapter createCallRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tocea.codewatch.architecture.DeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tocea.codewatch.architecture.DeclaredType
	 * @generated
	 */
	public Adapter createDeclaredTypeAdapter() {
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

} //ArchitectureAdapterFactory
