/**
 */
package com.tocea.codewatch.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.AnalysedElement#getName <em>Name</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.AnalysedElement#getOutgoingRelationships <em>Outgoing Relationships</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.AnalysedElement#getIncomingRelationships <em>Incoming Relationships</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.AnalysedElement#getIdAnalyzedElement <em>Id Analyzed Element</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.AnalysedElement#getContainedElements <em>Contained Elements</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.AnalysedElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.AnalysedElement#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getAnalysedElement()
 * @model abstract="true"
 * @generated
 */
public interface AnalysedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getAnalysedElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.AnalysedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link com.tocea.codewatch.architecture.Relationship}.
	 * It is bidirectional and its opposite is '{@link com.tocea.codewatch.architecture.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Relationships</em>' containment reference list.
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getAnalysedElement_OutgoingRelationships()
	 * @see com.tocea.codewatch.architecture.Relationship#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Relationship> getOutgoingRelationships();

	/**
	 * Returns the value of the '<em><b>Incoming Relationships</b></em>' reference list.
	 * The list contents are of type {@link com.tocea.codewatch.architecture.Relationship}.
	 * It is bidirectional and its opposite is '{@link com.tocea.codewatch.architecture.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Relationships</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Relationships</em>' reference list.
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getAnalysedElement_IncomingRelationships()
	 * @see com.tocea.codewatch.architecture.Relationship#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Relationship> getIncomingRelationships();

	/**
	 * Returns the value of the '<em><b>Id Analyzed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Analyzed Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Analyzed Element</em>' attribute.
	 * @see #setIdAnalyzedElement(int)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getAnalysedElement_IdAnalyzedElement()
	 * @model id="true"
	 * @generated
	 */
	int getIdAnalyzedElement();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.AnalysedElement#getIdAnalyzedElement <em>Id Analyzed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Analyzed Element</em>' attribute.
	 * @see #getIdAnalyzedElement()
	 * @generated
	 */
	void setIdAnalyzedElement(int value);

	/**
	 * Returns the value of the '<em><b>Contained Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.tocea.codewatch.architecture.AnalysedElement}.
	 * It is bidirectional and its opposite is '{@link com.tocea.codewatch.architecture.AnalysedElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Elements</em>' containment reference list.
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getAnalysedElement_ContainedElements()
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<AnalysedElement> getContainedElements();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute.
	 * @see #setProperties(int)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getAnalysedElement_Properties()
	 * @model
	 * @generated
	 */
	int getProperties();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.AnalysedElement#getProperties <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' attribute.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.tocea.codewatch.architecture.AnalysedElement#getContainedElements <em>Contained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AnalysedElement)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getAnalysedElement_Parent()
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getContainedElements
	 * @model opposite="containedElements" transient="false"
	 * @generated
	 */
	AnalysedElement getParent();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.AnalysedElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AnalysedElement value);

} // AnalysedElement
