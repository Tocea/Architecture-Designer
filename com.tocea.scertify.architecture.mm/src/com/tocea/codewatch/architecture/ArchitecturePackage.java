/**
 */
package com.tocea.codewatch.architecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.tocea.codewatch.architecture.ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tocea.com/codewatch/architecture/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturePackage eINSTANCE = com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.AnalysedElementImpl <em>Analysed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.AnalysedElementImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getAnalysedElement()
	 * @generated
	 */
	int ANALYSED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS = 1;

	/**
	 * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS = 2;

	/**
	 * The feature id for the '<em><b>Id Analyzed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSED_ELEMENT__CONTAINED_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSED_ELEMENT__PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSED_ELEMENT__PARENT = 6;

	/**
	 * The number of structural features of the '<em>Analysed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSED_ELEMENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.TypeImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = ANALYSED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OUTGOING_RELATIONSHIPS = ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INCOMING_RELATIONSHIPS = ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Id Analyzed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ID_ANALYZED_ELEMENT = ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CONTAINED_ELEMENTS = ANALYSED_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PROPERTIES = ANALYSED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARENT = ANALYSED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__QUALIFIED_NAME = ANALYSED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SOURCE = ANALYSED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__BINARY = ANALYSED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = ANALYSED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.ArchitectureFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.ArchitectureFileImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getArchitectureFile()
	 * @generated
	 */
	int ARCHITECTURE_FILE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FILE__NAME = ANALYSED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FILE__OUTGOING_RELATIONSHIPS = ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FILE__INCOMING_RELATIONSHIPS = ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Id Analyzed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FILE__ID_ANALYZED_ELEMENT = ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FILE__CONTAINED_ELEMENTS = ANALYSED_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FILE__PROPERTIES = ANALYSED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FILE__PARENT = ANALYSED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FILE__PATH = ANALYSED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FILE_FEATURE_COUNT = ANALYSED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.RelationshipImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATION_SHIP_ID = 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.Dependency <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.Dependency
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__RELATION_SHIP_ID = RELATIONSHIP__RELATION_SHIP_ID;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.InheritanceDependencyImpl <em>Inheritance Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.InheritanceDependencyImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getInheritanceDependency()
	 * @generated
	 */
	int INHERITANCE_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_DEPENDENCY__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_DEPENDENCY__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_DEPENDENCY__RELATION_SHIP_ID = DEPENDENCY__RELATION_SHIP_ID;

	/**
	 * The number of structural features of the '<em>Inheritance Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.ReferenceDependencyImpl <em>Reference Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.ReferenceDependencyImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getReferenceDependency()
	 * @generated
	 */
	int REFERENCE_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY__RELATION_SHIP_ID = DEPENDENCY__RELATION_SHIP_ID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY__URI = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY__NAME = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.LibraryImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = ANALYSED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OUTGOING_RELATIONSHIPS = ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__INCOMING_RELATIONSHIPS = ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Id Analyzed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ID_ANALYZED_ELEMENT = ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CONTAINED_ELEMENTS = ANALYSED_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__PROPERTIES = ANALYSED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__PARENT = ANALYSED_ELEMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = ANALYSED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.RuntimeDependencyImpl <em>Runtime Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.RuntimeDependencyImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getRuntimeDependency()
	 * @generated
	 */
	int RUNTIME_DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DEPENDENCY__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DEPENDENCY__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DEPENDENCY__RELATION_SHIP_ID = DEPENDENCY__RELATION_SHIP_ID;

	/**
	 * The number of structural features of the '<em>Runtime Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.InjectionDependencyImpl <em>Injection Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.InjectionDependencyImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getInjectionDependency()
	 * @generated
	 */
	int INJECTION_DEPENDENCY = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_DEPENDENCY__TARGET = RUNTIME_DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_DEPENDENCY__SOURCE = RUNTIME_DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_DEPENDENCY__RELATION_SHIP_ID = RUNTIME_DEPENDENCY__RELATION_SHIP_ID;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_DEPENDENCY__MAPPING = RUNTIME_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Injection Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_DEPENDENCY_FEATURE_COUNT = RUNTIME_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.FieldReferenceDependencyImpl <em>Field Reference Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.FieldReferenceDependencyImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getFieldReferenceDependency()
	 * @generated
	 */
	int FIELD_REFERENCE_DEPENDENCY = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE_DEPENDENCY__TARGET = REFERENCE_DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE_DEPENDENCY__SOURCE = REFERENCE_DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE_DEPENDENCY__RELATION_SHIP_ID = REFERENCE_DEPENDENCY__RELATION_SHIP_ID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE_DEPENDENCY__URI = REFERENCE_DEPENDENCY__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE_DEPENDENCY__NAME = REFERENCE_DEPENDENCY__NAME;

	/**
	 * The number of structural features of the '<em>Field Reference Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE_DEPENDENCY_FEATURE_COUNT = REFERENCE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.ImportReferenceDependencyImpl <em>Import Reference Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.ImportReferenceDependencyImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getImportReferenceDependency()
	 * @generated
	 */
	int IMPORT_REFERENCE_DEPENDENCY = 11;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_REFERENCE_DEPENDENCY__TARGET = REFERENCE_DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_REFERENCE_DEPENDENCY__SOURCE = REFERENCE_DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_REFERENCE_DEPENDENCY__RELATION_SHIP_ID = REFERENCE_DEPENDENCY__RELATION_SHIP_ID;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_REFERENCE_DEPENDENCY__URI = REFERENCE_DEPENDENCY__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_REFERENCE_DEPENDENCY__NAME = REFERENCE_DEPENDENCY__NAME;

	/**
	 * The number of structural features of the '<em>Import Reference Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_REFERENCE_DEPENDENCY_FEATURE_COUNT = REFERENCE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.ProjectImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = ANALYSED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OUTGOING_RELATIONSHIPS = ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INCOMING_RELATIONSHIPS = ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Id Analyzed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID_ANALYZED_ELEMENT = ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTAINED_ELEMENTS = ANALYSED_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROPERTIES = ANALYSED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PARENT = ANALYSED_ELEMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = ANALYSED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.MethodImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = ANALYSED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OUTGOING_RELATIONSHIPS = ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INCOMING_RELATIONSHIPS = ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Id Analyzed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ID_ANALYZED_ELEMENT = ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONTAINED_ELEMENTS = ANALYSED_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PROPERTIES = ANALYSED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARENT = ANALYSED_ELEMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = ANALYSED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.ReturnTypeRelationshipImpl <em>Return Type Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.ReturnTypeRelationshipImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getReturnTypeRelationship()
	 * @generated
	 */
	int RETURN_TYPE_RELATIONSHIP = 14;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_RELATIONSHIP__RELATION_SHIP_ID = RELATIONSHIP__RELATION_SHIP_ID;

	/**
	 * The number of structural features of the '<em>Return Type Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.ParameterRelationshipImpl <em>Parameter Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.ParameterRelationshipImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getParameterRelationship()
	 * @generated
	 */
	int PARAMETER_RELATIONSHIP = 15;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RELATIONSHIP__RELATION_SHIP_ID = RELATIONSHIP__RELATION_SHIP_ID;

	/**
	 * The number of structural features of the '<em>Parameter Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.CallRelationshipImpl <em>Call Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.CallRelationshipImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getCallRelationship()
	 * @generated
	 */
	int CALL_RELATIONSHIP = 16;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RELATIONSHIP__RELATION_SHIP_ID = RELATIONSHIP__RELATION_SHIP_ID;

	/**
	 * The number of structural features of the '<em>Call Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.FieldImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = ANALYSED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OUTGOING_RELATIONSHIPS = ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INCOMING_RELATIONSHIPS = ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Id Analyzed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID_ANALYZED_ELEMENT = ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTAINED_ELEMENTS = ANALYSED_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PROPERTIES = ANALYSED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PARENT = ANALYSED_ELEMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = ANALYSED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tocea.codewatch.architecture.impl.DeclaredTypeImpl <em>Declared Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tocea.codewatch.architecture.impl.DeclaredTypeImpl
	 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getDeclaredType()
	 * @generated
	 */
	int DECLARED_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__RELATION_SHIP_ID = RELATIONSHIP__RELATION_SHIP_ID;

	/**
	 * The number of structural features of the '<em>Declared Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.AnalysedElement <em>Analysed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysed Element</em>'.
	 * @see com.tocea.codewatch.architecture.AnalysedElement
	 * @generated
	 */
	EClass getAnalysedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.AnalysedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getName()
	 * @see #getAnalysedElement()
	 * @generated
	 */
	EAttribute getAnalysedElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.tocea.codewatch.architecture.AnalysedElement#getOutgoingRelationships <em>Outgoing Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Relationships</em>'.
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getOutgoingRelationships()
	 * @see #getAnalysedElement()
	 * @generated
	 */
	EReference getAnalysedElement_OutgoingRelationships();

	/**
	 * Returns the meta object for the reference list '{@link com.tocea.codewatch.architecture.AnalysedElement#getIncomingRelationships <em>Incoming Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Relationships</em>'.
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getIncomingRelationships()
	 * @see #getAnalysedElement()
	 * @generated
	 */
	EReference getAnalysedElement_IncomingRelationships();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.AnalysedElement#getIdAnalyzedElement <em>Id Analyzed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Analyzed Element</em>'.
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getIdAnalyzedElement()
	 * @see #getAnalysedElement()
	 * @generated
	 */
	EAttribute getAnalysedElement_IdAnalyzedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.tocea.codewatch.architecture.AnalysedElement#getContainedElements <em>Contained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getContainedElements()
	 * @see #getAnalysedElement()
	 * @generated
	 */
	EReference getAnalysedElement_ContainedElements();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.AnalysedElement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getProperties()
	 * @see #getAnalysedElement()
	 * @generated
	 */
	EAttribute getAnalysedElement_Properties();

	/**
	 * Returns the meta object for the container reference '{@link com.tocea.codewatch.architecture.AnalysedElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getParent()
	 * @see #getAnalysedElement()
	 * @generated
	 */
	EReference getAnalysedElement_Parent();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.tocea.codewatch.architecture.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.Type#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see com.tocea.codewatch.architecture.Type#getQualifiedName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.Type#isSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see com.tocea.codewatch.architecture.Type#isSource()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Source();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.Type#isBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary</em>'.
	 * @see com.tocea.codewatch.architecture.Type#isBinary()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Binary();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.ArchitectureFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see com.tocea.codewatch.architecture.ArchitectureFile
	 * @generated
	 */
	EClass getArchitectureFile();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.ArchitectureFile#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.tocea.codewatch.architecture.ArchitectureFile#getPath()
	 * @see #getArchitectureFile()
	 * @generated
	 */
	EAttribute getArchitectureFile_Path();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see com.tocea.codewatch.architecture.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link com.tocea.codewatch.architecture.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.tocea.codewatch.architecture.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the container reference '{@link com.tocea.codewatch.architecture.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see com.tocea.codewatch.architecture.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.Relationship#getRelationShipId <em>Relation Ship Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Ship Id</em>'.
	 * @see com.tocea.codewatch.architecture.Relationship#getRelationShipId()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_RelationShipId();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.InheritanceDependency <em>Inheritance Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance Dependency</em>'.
	 * @see com.tocea.codewatch.architecture.InheritanceDependency
	 * @generated
	 */
	EClass getInheritanceDependency();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.ReferenceDependency <em>Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Dependency</em>'.
	 * @see com.tocea.codewatch.architecture.ReferenceDependency
	 * @generated
	 */
	EClass getReferenceDependency();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.ReferenceDependency#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see com.tocea.codewatch.architecture.ReferenceDependency#getUri()
	 * @see #getReferenceDependency()
	 * @generated
	 */
	EAttribute getReferenceDependency_Uri();

	/**
	 * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.ReferenceDependency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.tocea.codewatch.architecture.ReferenceDependency#getName()
	 * @see #getReferenceDependency()
	 * @generated
	 */
	EAttribute getReferenceDependency_Name();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see com.tocea.codewatch.architecture.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see com.tocea.codewatch.architecture.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.RuntimeDependency <em>Runtime Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Dependency</em>'.
	 * @see com.tocea.codewatch.architecture.RuntimeDependency
	 * @generated
	 */
	EClass getRuntimeDependency();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.InjectionDependency <em>Injection Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Injection Dependency</em>'.
	 * @see com.tocea.codewatch.architecture.InjectionDependency
	 * @generated
	 */
	EClass getInjectionDependency();

	/**
	 * Returns the meta object for the reference '{@link com.tocea.codewatch.architecture.InjectionDependency#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see com.tocea.codewatch.architecture.InjectionDependency#getMapping()
	 * @see #getInjectionDependency()
	 * @generated
	 */
	EReference getInjectionDependency_Mapping();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.FieldReferenceDependency <em>Field Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Reference Dependency</em>'.
	 * @see com.tocea.codewatch.architecture.FieldReferenceDependency
	 * @generated
	 */
	EClass getFieldReferenceDependency();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.ImportReferenceDependency <em>Import Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Reference Dependency</em>'.
	 * @see com.tocea.codewatch.architecture.ImportReferenceDependency
	 * @generated
	 */
	EClass getImportReferenceDependency();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.tocea.codewatch.architecture.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see com.tocea.codewatch.architecture.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.ReturnTypeRelationship <em>Return Type Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type Relationship</em>'.
	 * @see com.tocea.codewatch.architecture.ReturnTypeRelationship
	 * @generated
	 */
	EClass getReturnTypeRelationship();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.ParameterRelationship <em>Parameter Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Relationship</em>'.
	 * @see com.tocea.codewatch.architecture.ParameterRelationship
	 * @generated
	 */
	EClass getParameterRelationship();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.CallRelationship <em>Call Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Relationship</em>'.
	 * @see com.tocea.codewatch.architecture.CallRelationship
	 * @generated
	 */
	EClass getCallRelationship();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see com.tocea.codewatch.architecture.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for class '{@link com.tocea.codewatch.architecture.DeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Type</em>'.
	 * @see com.tocea.codewatch.architecture.DeclaredType
	 * @generated
	 */
	EClass getDeclaredType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureFactory getArchitectureFactory();

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
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.AnalysedElementImpl <em>Analysed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.AnalysedElementImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getAnalysedElement()
		 * @generated
		 */
		EClass ANALYSED_ELEMENT = eINSTANCE.getAnalysedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSED_ELEMENT__NAME = eINSTANCE.getAnalysedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Outgoing Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS = eINSTANCE.getAnalysedElement_OutgoingRelationships();

		/**
		 * The meta object literal for the '<em><b>Incoming Relationships</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS = eINSTANCE.getAnalysedElement_IncomingRelationships();

		/**
		 * The meta object literal for the '<em><b>Id Analyzed Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT = eINSTANCE.getAnalysedElement_IdAnalyzedElement();

		/**
		 * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSED_ELEMENT__CONTAINED_ELEMENTS = eINSTANCE.getAnalysedElement_ContainedElements();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSED_ELEMENT__PROPERTIES = eINSTANCE.getAnalysedElement_Properties();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSED_ELEMENT__PARENT = eINSTANCE.getAnalysedElement_Parent();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.TypeImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__QUALIFIED_NAME = eINSTANCE.getType_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__SOURCE = eINSTANCE.getType_Source();

		/**
		 * The meta object literal for the '<em><b>Binary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__BINARY = eINSTANCE.getType_Binary();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.ArchitectureFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.ArchitectureFileImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getArchitectureFile()
		 * @generated
		 */
		EClass ARCHITECTURE_FILE = eINSTANCE.getArchitectureFile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_FILE__PATH = eINSTANCE.getArchitectureFile_Path();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.RelationshipImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Relation Ship Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__RELATION_SHIP_ID = eINSTANCE.getRelationship_RelationShipId();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.InheritanceDependencyImpl <em>Inheritance Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.InheritanceDependencyImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getInheritanceDependency()
		 * @generated
		 */
		EClass INHERITANCE_DEPENDENCY = eINSTANCE.getInheritanceDependency();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.ReferenceDependencyImpl <em>Reference Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.ReferenceDependencyImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getReferenceDependency()
		 * @generated
		 */
		EClass REFERENCE_DEPENDENCY = eINSTANCE.getReferenceDependency();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DEPENDENCY__URI = eINSTANCE.getReferenceDependency_Uri();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DEPENDENCY__NAME = eINSTANCE.getReferenceDependency_Name();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.Dependency <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.Dependency
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.LibraryImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.RuntimeDependencyImpl <em>Runtime Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.RuntimeDependencyImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getRuntimeDependency()
		 * @generated
		 */
		EClass RUNTIME_DEPENDENCY = eINSTANCE.getRuntimeDependency();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.InjectionDependencyImpl <em>Injection Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.InjectionDependencyImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getInjectionDependency()
		 * @generated
		 */
		EClass INJECTION_DEPENDENCY = eINSTANCE.getInjectionDependency();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INJECTION_DEPENDENCY__MAPPING = eINSTANCE.getInjectionDependency_Mapping();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.FieldReferenceDependencyImpl <em>Field Reference Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.FieldReferenceDependencyImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getFieldReferenceDependency()
		 * @generated
		 */
		EClass FIELD_REFERENCE_DEPENDENCY = eINSTANCE.getFieldReferenceDependency();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.ImportReferenceDependencyImpl <em>Import Reference Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.ImportReferenceDependencyImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getImportReferenceDependency()
		 * @generated
		 */
		EClass IMPORT_REFERENCE_DEPENDENCY = eINSTANCE.getImportReferenceDependency();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.ProjectImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.MethodImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.ReturnTypeRelationshipImpl <em>Return Type Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.ReturnTypeRelationshipImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getReturnTypeRelationship()
		 * @generated
		 */
		EClass RETURN_TYPE_RELATIONSHIP = eINSTANCE.getReturnTypeRelationship();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.ParameterRelationshipImpl <em>Parameter Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.ParameterRelationshipImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getParameterRelationship()
		 * @generated
		 */
		EClass PARAMETER_RELATIONSHIP = eINSTANCE.getParameterRelationship();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.CallRelationshipImpl <em>Call Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.CallRelationshipImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getCallRelationship()
		 * @generated
		 */
		EClass CALL_RELATIONSHIP = eINSTANCE.getCallRelationship();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.FieldImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '{@link com.tocea.codewatch.architecture.impl.DeclaredTypeImpl <em>Declared Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tocea.codewatch.architecture.impl.DeclaredTypeImpl
		 * @see com.tocea.codewatch.architecture.impl.ArchitecturePackageImpl#getDeclaredType()
		 * @generated
		 */
		EClass DECLARED_TYPE = eINSTANCE.getDeclaredType();

	}

} //ArchitecturePackage
