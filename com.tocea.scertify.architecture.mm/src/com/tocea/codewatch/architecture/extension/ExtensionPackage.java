/**
 */
package com.tocea.codewatch.architecture.extension;

import com.tocea.codewatch.architecture.ArchitecturePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.tocea.codewatch.architecture.extension.ExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tocea.com/codewatch/architecture/extension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionPackage eINSTANCE = com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.extension.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.extension.impl.PatternImpl
	 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = ArchitecturePackage.ANALYSED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__OUTGOING_RELATIONSHIPS = ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__INCOMING_RELATIONSHIPS = ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Id Analyzed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ID_ANALYZED_ELEMENT = ArchitecturePackage.ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CONTAINED_ELEMENTS = ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PROPERTIES = ArchitecturePackage.ANALYSED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PARENT = ArchitecturePackage.ANALYSED_ELEMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = ArchitecturePackage.ANALYSED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.extension.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.extension.impl.RoleImpl
	 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ArchitecturePackage.ANALYSED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OUTGOING_RELATIONSHIPS = ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INCOMING_RELATIONSHIPS = ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Id Analyzed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID_ANALYZED_ELEMENT = ArchitecturePackage.ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONTAINED_ELEMENTS = ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PROPERTIES = ArchitecturePackage.ANALYSED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PARENT = ArchitecturePackage.ANALYSED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attached Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ATTACHED_ELEMENT = ArchitecturePackage.ANALYSED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ArchitecturePackage.ANALYSED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.extension.RelationshipConstraint <em>Relationship Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.extension.RelationshipConstraint
	 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getRelationshipConstraint()
	 * @generated
	 */
	int RELATIONSHIP_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Relationship Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.extension.impl.ExtensionRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionRelationshipImpl
	 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getExtensionRelationship()
	 * @generated
	 */
	int EXTENSION_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_RELATIONSHIP__TARGET = ArchitecturePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_RELATIONSHIP__SOURCE = ArchitecturePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_RELATIONSHIP__RELATION_SHIP_ID = ArchitecturePackage.RELATIONSHIP__RELATION_SHIP_ID;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_RELATIONSHIP_FEATURE_COUNT = ArchitecturePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.extension.impl.RoleRelationshipImpl <em>Role Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.extension.impl.RoleRelationshipImpl
	 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getRoleRelationship()
	 * @generated
	 */
	int ROLE_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RELATIONSHIP__TARGET = ArchitecturePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RELATIONSHIP__SOURCE = ArchitecturePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RELATIONSHIP__RELATION_SHIP_ID = ArchitecturePackage.RELATIONSHIP__RELATION_SHIP_ID;

	/**
	 * The number of structural features of the '<em>Role Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RELATIONSHIP_FEATURE_COUNT = ArchitecturePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.extension.impl.PatternRelationshipImpl <em>Pattern Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.extension.impl.PatternRelationshipImpl
	 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getPatternRelationship()
	 * @generated
	 */
	int PATTERN_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONSHIP__TARGET = ArchitecturePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONSHIP__SOURCE = ArchitecturePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONSHIP__RELATION_SHIP_ID = ArchitecturePackage.RELATIONSHIP__RELATION_SHIP_ID;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONSHIP__REFERENCE_NAME = ArchitecturePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONSHIP_FEATURE_COUNT = ArchitecturePackage.RELATIONSHIP_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.extension.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see com.tocea.codewatch.architecture.extension.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.extension.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see com.tocea.codewatch.architecture.extension.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.extension.Role#getAttachedElement <em>Attached Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached Element</em>'.
	 * @see com.tocea.codewatch.architecture.extension.Role#getAttachedElement()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_AttachedElement();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.extension.RelationshipConstraint <em>Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Constraint</em>'.
	 * @see com.tocea.codewatch.architecture.extension.RelationshipConstraint
	 * @generated
	 */
	EClass getRelationshipConstraint();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.extension.ExtensionRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see com.tocea.codewatch.architecture.extension.ExtensionRelationship
	 * @generated
	 */
	EClass getExtensionRelationship();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.extension.RoleRelationship <em>Role Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Relationship</em>'.
	 * @see com.tocea.codewatch.architecture.extension.RoleRelationship
	 * @generated
	 */
	EClass getRoleRelationship();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.extension.PatternRelationship <em>Pattern Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Relationship</em>'.
	 * @see com.tocea.codewatch.architecture.extension.PatternRelationship
	 * @generated
	 */
	EClass getPatternRelationship();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.extension.PatternRelationship#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see com.tocea.codewatch.architecture.extension.PatternRelationship#getReferenceName()
	 * @see #getPatternRelationship()
	 * @generated
	 */
	EAttribute getPatternRelationship_ReferenceName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionFactory getExtensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.extension.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.extension.impl.PatternImpl
		 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.extension.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.extension.impl.RoleImpl
		 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Attached Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ATTACHED_ELEMENT = eINSTANCE.getRole_AttachedElement();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.extension.RelationshipConstraint <em>Relationship Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.extension.RelationshipConstraint
		 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getRelationshipConstraint()
		 * @generated
		 */
		EClass RELATIONSHIP_CONSTRAINT = eINSTANCE.getRelationshipConstraint();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.extension.impl.ExtensionRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionRelationshipImpl
		 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getExtensionRelationship()
		 * @generated
		 */
		EClass EXTENSION_RELATIONSHIP = eINSTANCE.getExtensionRelationship();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.extension.impl.RoleRelationshipImpl <em>Role Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.extension.impl.RoleRelationshipImpl
		 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getRoleRelationship()
		 * @generated
		 */
		EClass ROLE_RELATIONSHIP = eINSTANCE.getRoleRelationship();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.extension.impl.PatternRelationshipImpl <em>Pattern Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.extension.impl.PatternRelationshipImpl
		 * @see com.tocea.codewatch.architecture.extension.impl.ExtensionPackageImpl#getPatternRelationship()
		 * @generated
		 */
		EClass PATTERN_RELATIONSHIP = eINSTANCE.getPatternRelationship();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_RELATIONSHIP__REFERENCE_NAME = eINSTANCE.getPatternRelationship_ReferenceName();

	}

} //ExtensionPackage
