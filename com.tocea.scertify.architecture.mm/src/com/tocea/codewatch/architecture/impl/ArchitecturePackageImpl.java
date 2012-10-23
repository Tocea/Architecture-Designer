/**
 */
package com.tocea.codewatch.architecture.impl;

import com.tocea.codewatch.architecture.AnalysedElement;
import com.tocea.codewatch.architecture.ArchitectureFactory;
import com.tocea.codewatch.architecture.ArchitectureFile;
import com.tocea.codewatch.architecture.ArchitecturePackage;
import com.tocea.codewatch.architecture.CallRelationship;
import com.tocea.codewatch.architecture.DeclaredType;
import com.tocea.codewatch.architecture.Dependency;
import com.tocea.codewatch.architecture.Field;
import com.tocea.codewatch.architecture.FieldReferenceDependency;
import com.tocea.codewatch.architecture.ImportReferenceDependency;
import com.tocea.codewatch.architecture.InheritanceDependency;
import com.tocea.codewatch.architecture.InjectionDependency;
import com.tocea.codewatch.architecture.Library;
import com.tocea.codewatch.architecture.Method;
import com.tocea.codewatch.architecture.ParameterRelationship;
import com.tocea.codewatch.architecture.Project;
import com.tocea.codewatch.architecture.ReferenceDependency;
import com.tocea.codewatch.architecture.Relationship;
import com.tocea.codewatch.architecture.ReturnTypeRelationship;
import com.tocea.codewatch.architecture.RuntimeDependency;
import com.tocea.codewatch.architecture.Type;

import com.tocea.codewatch.architecture.extension.ExtensionPackage;

import com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturePackageImpl extends EPackageImpl implements ArchitecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injectionDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldReferenceDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importReferenceDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredTypeEClass = null;

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
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchitecturePackageImpl() {
		super(eNS_URI, ArchitectureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArchitecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchitecturePackage init() {
		if (isInited) return (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Obtain or create and register package
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArchitecturePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExtensionPackageImpl theExtensionPackage = (ExtensionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionPackage.eNS_URI) instanceof ExtensionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionPackage.eNS_URI) : ExtensionPackage.eINSTANCE);

		// Create package meta-data objects
		theArchitecturePackage.createPackageContents();
		theExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theArchitecturePackage.initializePackageContents();
		theExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchitecturePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchitecturePackage.eNS_URI, theArchitecturePackage);
		return theArchitecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysedElement() {
		return analysedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysedElement_Name() {
		return (EAttribute)analysedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysedElement_OutgoingRelationships() {
		return (EReference)analysedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysedElement_IncomingRelationships() {
		return (EReference)analysedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysedElement_IdAnalyzedElement() {
		return (EAttribute)analysedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysedElement_ContainedElements() {
		return (EReference)analysedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysedElement_Properties() {
		return (EAttribute)analysedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysedElement_Parent() {
		return (EReference)analysedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_QualifiedName() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Source() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Binary() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitectureFile() {
		return architectureFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitectureFile_Path() {
		return (EAttribute)architectureFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_RelationShipId() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritanceDependency() {
		return inheritanceDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceDependency() {
		return referenceDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDependency_Uri() {
		return (EAttribute)referenceDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDependency_Name() {
		return (EAttribute)referenceDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeDependency() {
		return runtimeDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInjectionDependency() {
		return injectionDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjectionDependency_Mapping() {
		return (EReference)injectionDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldReferenceDependency() {
		return fieldReferenceDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportReferenceDependency() {
		return importReferenceDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnTypeRelationship() {
		return returnTypeRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterRelationship() {
		return parameterRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallRelationship() {
		return callRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredType() {
		return declaredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureFactory getArchitectureFactory() {
		return (ArchitectureFactory)getEFactoryInstance();
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
		analysedElementEClass = createEClass(ANALYSED_ELEMENT);
		createEAttribute(analysedElementEClass, ANALYSED_ELEMENT__NAME);
		createEReference(analysedElementEClass, ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS);
		createEReference(analysedElementEClass, ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS);
		createEAttribute(analysedElementEClass, ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT);
		createEReference(analysedElementEClass, ANALYSED_ELEMENT__CONTAINED_ELEMENTS);
		createEAttribute(analysedElementEClass, ANALYSED_ELEMENT__PROPERTIES);
		createEReference(analysedElementEClass, ANALYSED_ELEMENT__PARENT);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__QUALIFIED_NAME);
		createEAttribute(typeEClass, TYPE__SOURCE);
		createEAttribute(typeEClass, TYPE__BINARY);

		architectureFileEClass = createEClass(ARCHITECTURE_FILE);
		createEAttribute(architectureFileEClass, ARCHITECTURE_FILE__PATH);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEAttribute(relationshipEClass, RELATIONSHIP__RELATION_SHIP_ID);

		inheritanceDependencyEClass = createEClass(INHERITANCE_DEPENDENCY);

		referenceDependencyEClass = createEClass(REFERENCE_DEPENDENCY);
		createEAttribute(referenceDependencyEClass, REFERENCE_DEPENDENCY__URI);
		createEAttribute(referenceDependencyEClass, REFERENCE_DEPENDENCY__NAME);

		dependencyEClass = createEClass(DEPENDENCY);

		libraryEClass = createEClass(LIBRARY);

		runtimeDependencyEClass = createEClass(RUNTIME_DEPENDENCY);

		injectionDependencyEClass = createEClass(INJECTION_DEPENDENCY);
		createEReference(injectionDependencyEClass, INJECTION_DEPENDENCY__MAPPING);

		fieldReferenceDependencyEClass = createEClass(FIELD_REFERENCE_DEPENDENCY);

		importReferenceDependencyEClass = createEClass(IMPORT_REFERENCE_DEPENDENCY);

		projectEClass = createEClass(PROJECT);

		methodEClass = createEClass(METHOD);

		returnTypeRelationshipEClass = createEClass(RETURN_TYPE_RELATIONSHIP);

		parameterRelationshipEClass = createEClass(PARAMETER_RELATIONSHIP);

		callRelationshipEClass = createEClass(CALL_RELATIONSHIP);

		fieldEClass = createEClass(FIELD);

		declaredTypeEClass = createEClass(DECLARED_TYPE);
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
		ExtensionPackage theExtensionPackage = (ExtensionPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExtensionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeEClass.getESuperTypes().add(this.getAnalysedElement());
		architectureFileEClass.getESuperTypes().add(this.getAnalysedElement());
		inheritanceDependencyEClass.getESuperTypes().add(this.getDependency());
		referenceDependencyEClass.getESuperTypes().add(this.getDependency());
		dependencyEClass.getESuperTypes().add(this.getRelationship());
		libraryEClass.getESuperTypes().add(this.getAnalysedElement());
		runtimeDependencyEClass.getESuperTypes().add(this.getDependency());
		injectionDependencyEClass.getESuperTypes().add(this.getRuntimeDependency());
		fieldReferenceDependencyEClass.getESuperTypes().add(this.getReferenceDependency());
		importReferenceDependencyEClass.getESuperTypes().add(this.getReferenceDependency());
		projectEClass.getESuperTypes().add(this.getAnalysedElement());
		methodEClass.getESuperTypes().add(this.getAnalysedElement());
		returnTypeRelationshipEClass.getESuperTypes().add(this.getRelationship());
		parameterRelationshipEClass.getESuperTypes().add(this.getRelationship());
		callRelationshipEClass.getESuperTypes().add(this.getRelationship());
		fieldEClass.getESuperTypes().add(this.getAnalysedElement());
		declaredTypeEClass.getESuperTypes().add(this.getRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(analysedElementEClass, AnalysedElement.class, "AnalysedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnalysedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysedElement_OutgoingRelationships(), this.getRelationship(), this.getRelationship_Source(), "outgoingRelationships", null, 0, -1, AnalysedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysedElement_IncomingRelationships(), this.getRelationship(), this.getRelationship_Target(), "incomingRelationships", null, 0, -1, AnalysedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysedElement_IdAnalyzedElement(), ecorePackage.getEInt(), "idAnalyzedElement", null, 0, 1, AnalysedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysedElement_ContainedElements(), this.getAnalysedElement(), this.getAnalysedElement_Parent(), "containedElements", null, 0, -1, AnalysedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysedElement_Properties(), ecorePackage.getEInt(), "properties", null, 0, 1, AnalysedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysedElement_Parent(), this.getAnalysedElement(), this.getAnalysedElement_ContainedElements(), "parent", null, 0, 1, AnalysedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Source(), ecorePackage.getEBoolean(), "source", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Binary(), ecorePackage.getEBoolean(), "binary", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureFileEClass, ArchitectureFile.class, "ArchitectureFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitectureFile_Path(), ecorePackage.getEString(), "path", null, 0, 1, ArchitectureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Target(), this.getAnalysedElement(), this.getAnalysedElement_IncomingRelationships(), "target", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Source(), this.getAnalysedElement(), this.getAnalysedElement_OutgoingRelationships(), "source", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_RelationShipId(), ecorePackage.getEInt(), "relationShipId", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceDependencyEClass, InheritanceDependency.class, "InheritanceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceDependencyEClass, ReferenceDependency.class, "ReferenceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceDependency_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ReferenceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDependency_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReferenceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeDependencyEClass, RuntimeDependency.class, "RuntimeDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(injectionDependencyEClass, InjectionDependency.class, "InjectionDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInjectionDependency_Mapping(), this.getAnalysedElement(), null, "mapping", null, 0, 1, InjectionDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldReferenceDependencyEClass, FieldReferenceDependency.class, "FieldReferenceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importReferenceDependencyEClass, ImportReferenceDependency.class, "ImportReferenceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnTypeRelationshipEClass, ReturnTypeRelationship.class, "ReturnTypeRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterRelationshipEClass, ParameterRelationship.class, "ParameterRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callRelationshipEClass, CallRelationship.class, "CallRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declaredTypeEClass, DeclaredType.class, "DeclaredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ArchitecturePackageImpl
