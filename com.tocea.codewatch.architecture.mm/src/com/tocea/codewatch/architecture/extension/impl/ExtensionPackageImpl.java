/**
 */
package com.tocea.codewatch.architecture.extension.impl;

import com.tocea.codewatch.architecture.ArchitecturePackage;

import com.tocea.codewatch.architecture.extension.ExtensionFactory;
import com.tocea.codewatch.architecture.extension.ExtensionPackage;
import com.tocea.codewatch.architecture.extension.ExtensionRelationship;
import com.tocea.codewatch.architecture.extension.Pattern;
import com.tocea.codewatch.architecture.extension.PatternRelationship;
import com.tocea.codewatch.architecture.extension.RelationshipConstraint;
import com.tocea.codewatch.architecture.extension.Role;
import com.tocea.codewatch.architecture.extension.RoleRelationship;

import com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionPackageImpl extends EPackageImpl implements ExtensionPackage {
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
	private EClass roleEClass = null;

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
	private EClass extensionRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternRelationshipEClass = null;

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
	 * @see com.tocea.codewatch.architecture.extension.ExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtensionPackageImpl() {
		super(eNS_URI, ExtensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtensionPackage init() {
		if (isInited) return (ExtensionPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionPackage.eNS_URI);

		// Obtain or create and register package
		ExtensionPackageImpl theExtensionPackage = (ExtensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtensionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);

		// Create package meta-data objects
		theExtensionPackage.createPackageContents();
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theExtensionPackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtensionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtensionPackage.eNS_URI, theExtensionPackage);
		return theExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_AttachedElement() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipConstraint() {
		return relationshipConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionRelationship() {
		return extensionRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRelationship() {
		return roleRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternRelationship() {
		return patternRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternRelationship_ReferenceName() {
		return (EAttribute)patternRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionFactory getExtensionFactory() {
		return (ExtensionFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		patternEClass = createEClass(PATTERN);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__ATTACHED_ELEMENT);

		relationshipConstraintEClass = createEClass(RELATIONSHIP_CONSTRAINT);

		extensionRelationshipEClass = createEClass(EXTENSION_RELATIONSHIP);

		roleRelationshipEClass = createEClass(ROLE_RELATIONSHIP);

		patternRelationshipEClass = createEClass(PATTERN_RELATIONSHIP);
		createEAttribute(patternRelationshipEClass, PATTERN_RELATIONSHIP__REFERENCE_NAME);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArchitecturePackage theArchitecturePackage = (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Create type parameters
		ETypeParameter roleEClass_T = addETypeParameter(roleEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		patternEClass.getESuperTypes().add(theArchitecturePackage.getAnalysedElement());
		roleEClass.getESuperTypes().add(theArchitecturePackage.getAnalysedElement());
		extensionRelationshipEClass.getESuperTypes().add(theArchitecturePackage.getRelationship());
		roleRelationshipEClass.getESuperTypes().add(theArchitecturePackage.getRelationship());
		patternRelationshipEClass.getESuperTypes().add(theArchitecturePackage.getRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(patternEClass, Pattern.class, "Pattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(roleEClass_T);
		initEAttribute(getRole_AttachedElement(), g1, "attachedElement", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipConstraintEClass, RelationshipConstraint.class, "RelationshipConstraint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(relationshipConstraintEClass, ecorePackage.getEBoolean(), "check", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExtensionRelationship(), "relationship", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extensionRelationshipEClass, ExtensionRelationship.class, "ExtensionRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(extensionRelationshipEClass, ecorePackage.getEBoolean(), "checkConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roleRelationshipEClass, RoleRelationship.class, "RoleRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(roleRelationshipEClass, ecorePackage.getEBoolean(), "checkConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(roleRelationshipEClass, null, "getTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getRole());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(patternRelationshipEClass, PatternRelationship.class, "PatternRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternRelationship_ReferenceName(), ecorePackage.getEString(), "referenceName", null, 1, 1, PatternRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(patternRelationshipEClass, ecorePackage.getEBoolean(), "checkConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(patternRelationshipEClass, null, "getTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getRole());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(patternRelationshipEClass, this.getPattern(), "getSource", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //ExtensionPackageImpl
