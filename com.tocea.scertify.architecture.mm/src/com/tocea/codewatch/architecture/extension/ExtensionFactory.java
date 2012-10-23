/**
 */
package com.tocea.codewatch.architecture.extension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.tocea.codewatch.architecture.extension.ExtensionPackage
 * @generated
 */
public interface ExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionFactory eINSTANCE = com.tocea.codewatch.architecture.extension.impl.ExtensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	ExtensionRelationship createExtensionRelationship();

	/**
	 * Returns a new object of class '<em>Role Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Relationship</em>'.
	 * @generated
	 */
	RoleRelationship createRoleRelationship();

	/**
	 * Returns a new object of class '<em>Pattern Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Relationship</em>'.
	 * @generated
	 */
	PatternRelationship createPatternRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtensionPackage getExtensionPackage();

} //ExtensionFactory
