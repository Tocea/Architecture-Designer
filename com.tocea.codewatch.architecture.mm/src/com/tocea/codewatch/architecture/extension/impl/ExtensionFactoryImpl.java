/**
 */
package com.tocea.codewatch.architecture.extension.impl;

import com.tocea.codewatch.architecture.extension.*;

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
public class ExtensionFactoryImpl extends EFactoryImpl implements ExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtensionFactory init() {
		try {
			ExtensionFactory theExtensionFactory = (ExtensionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tocea.com/codewatch/architecture/extension"); 
			if (theExtensionFactory != null) {
				return theExtensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionFactoryImpl() {
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
			case ExtensionPackage.EXTENSION_RELATIONSHIP: return createExtensionRelationship();
			case ExtensionPackage.ROLE_RELATIONSHIP: return createRoleRelationship();
			case ExtensionPackage.PATTERN_RELATIONSHIP: return createPatternRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionRelationship createExtensionRelationship() {
		ExtensionRelationshipImpl extensionRelationship = new ExtensionRelationshipImpl();
		return extensionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRelationship createRoleRelationship() {
		RoleRelationshipImpl roleRelationship = new RoleRelationshipImpl();
		return roleRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternRelationship createPatternRelationship() {
		PatternRelationshipImpl patternRelationship = new PatternRelationshipImpl();
		return patternRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPackage getExtensionPackage() {
		return (ExtensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtensionPackage getPackage() {
		return ExtensionPackage.eINSTANCE;
	}

} //ExtensionFactoryImpl
