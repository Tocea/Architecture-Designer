/**
 */
package com.tocea.codewatch.architecture.impl;

import com.tocea.codewatch.architecture.*;

import org.eclipse.emf.ecore.EClass;
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
public class ArchitectureFactoryImpl extends EFactoryImpl implements ArchitectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArchitectureFactory init() {
		try {
			ArchitectureFactory theArchitectureFactory = (ArchitectureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tocea.com/codewatch/architecture/"); 
			if (theArchitectureFactory != null) {
				return theArchitectureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArchitecturePackage.TYPE: return createType();
			case ArchitecturePackage.ARCHITECTURE_FILE: return createArchitectureFile();
			case ArchitecturePackage.INHERITANCE_DEPENDENCY: return createInheritanceDependency();
			case ArchitecturePackage.REFERENCE_DEPENDENCY: return createReferenceDependency();
			case ArchitecturePackage.LIBRARY: return createLibrary();
			case ArchitecturePackage.RUNTIME_DEPENDENCY: return createRuntimeDependency();
			case ArchitecturePackage.INJECTION_DEPENDENCY: return createInjectionDependency();
			case ArchitecturePackage.FIELD_REFERENCE_DEPENDENCY: return createFieldReferenceDependency();
			case ArchitecturePackage.IMPORT_REFERENCE_DEPENDENCY: return createImportReferenceDependency();
			case ArchitecturePackage.PROJECT: return createProject();
			case ArchitecturePackage.METHOD: return createMethod();
			case ArchitecturePackage.RETURN_TYPE_RELATIONSHIP: return createReturnTypeRelationship();
			case ArchitecturePackage.PARAMETER_RELATIONSHIP: return createParameterRelationship();
			case ArchitecturePackage.CALL_RELATIONSHIP: return createCallRelationship();
			case ArchitecturePackage.FIELD: return createField();
			case ArchitecturePackage.DECLARED_TYPE: return createDeclaredType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureFile createArchitectureFile() {
		ArchitectureFileImpl architectureFile = new ArchitectureFileImpl();
		return architectureFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceDependency createInheritanceDependency() {
		InheritanceDependencyImpl inheritanceDependency = new InheritanceDependencyImpl();
		return inheritanceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceDependency createReferenceDependency() {
		ReferenceDependencyImpl referenceDependency = new ReferenceDependencyImpl();
		return referenceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeDependency createRuntimeDependency() {
		RuntimeDependencyImpl runtimeDependency = new RuntimeDependencyImpl();
		return runtimeDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjectionDependency createInjectionDependency() {
		InjectionDependencyImpl injectionDependency = new InjectionDependencyImpl();
		return injectionDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldReferenceDependency createFieldReferenceDependency() {
		FieldReferenceDependencyImpl fieldReferenceDependency = new FieldReferenceDependencyImpl();
		return fieldReferenceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportReferenceDependency createImportReferenceDependency() {
		ImportReferenceDependencyImpl importReferenceDependency = new ImportReferenceDependencyImpl();
		return importReferenceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeRelationship createReturnTypeRelationship() {
		ReturnTypeRelationshipImpl returnTypeRelationship = new ReturnTypeRelationshipImpl();
		return returnTypeRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRelationship createParameterRelationship() {
		ParameterRelationshipImpl parameterRelationship = new ParameterRelationshipImpl();
		return parameterRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallRelationship createCallRelationship() {
		CallRelationshipImpl callRelationship = new CallRelationshipImpl();
		return callRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredType createDeclaredType() {
		DeclaredTypeImpl declaredType = new DeclaredTypeImpl();
		return declaredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturePackage getArchitecturePackage() {
		return (ArchitecturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchitecturePackage getPackage() {
		return ArchitecturePackage.eINSTANCE;
	}

} //ArchitectureFactoryImpl
