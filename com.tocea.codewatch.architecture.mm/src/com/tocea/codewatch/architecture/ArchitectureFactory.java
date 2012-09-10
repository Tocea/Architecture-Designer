/**
 */
package com.tocea.codewatch.architecture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.tocea.codewatch.architecture.ArchitecturePackage
 * @generated
 */
public interface ArchitectureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitectureFactory eINSTANCE = com.tocea.codewatch.architecture.impl.ArchitectureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	ArchitectureFile createArchitectureFile();

	/**
	 * Returns a new object of class '<em>Inheritance Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance Dependency</em>'.
	 * @generated
	 */
	InheritanceDependency createInheritanceDependency();

	/**
	 * Returns a new object of class '<em>Reference Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Dependency</em>'.
	 * @generated
	 */
	ReferenceDependency createReferenceDependency();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Runtime Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Dependency</em>'.
	 * @generated
	 */
	RuntimeDependency createRuntimeDependency();

	/**
	 * Returns a new object of class '<em>Injection Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Injection Dependency</em>'.
	 * @generated
	 */
	InjectionDependency createInjectionDependency();

	/**
	 * Returns a new object of class '<em>Field Reference Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Reference Dependency</em>'.
	 * @generated
	 */
	FieldReferenceDependency createFieldReferenceDependency();

	/**
	 * Returns a new object of class '<em>Import Reference Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Reference Dependency</em>'.
	 * @generated
	 */
	ImportReferenceDependency createImportReferenceDependency();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Return Type Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type Relationship</em>'.
	 * @generated
	 */
	ReturnTypeRelationship createReturnTypeRelationship();

	/**
	 * Returns a new object of class '<em>Parameter Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Relationship</em>'.
	 * @generated
	 */
	ParameterRelationship createParameterRelationship();

	/**
	 * Returns a new object of class '<em>Call Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Relationship</em>'.
	 * @generated
	 */
	CallRelationship createCallRelationship();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Declared Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Type</em>'.
	 * @generated
	 */
	DeclaredType createDeclaredType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArchitecturePackage getArchitecturePackage();

} //ArchitectureFactory
