/**
 */
package com.tocea.codewatch.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.Relationship#getRelationShipId <em>Relation Ship Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.tocea.codewatch.architecture.AnalysedElement#getIncomingRelationships <em>Incoming Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AnalysedElement)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getRelationship_Target()
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getIncomingRelationships
	 * @model opposite="incomingRelationships" required="true"
	 * @generated
	 */
	AnalysedElement getTarget();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AnalysedElement value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.tocea.codewatch.architecture.AnalysedElement#getOutgoingRelationships <em>Outgoing Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(AnalysedElement)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getRelationship_Source()
	 * @see com.tocea.codewatch.architecture.AnalysedElement#getOutgoingRelationships
	 * @model opposite="outgoingRelationships" required="true" transient="false"
	 * @generated
	 */
	AnalysedElement getSource();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.Relationship#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AnalysedElement value);

	/**
	 * Returns the value of the '<em><b>Relation Ship Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Ship Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Ship Id</em>' attribute.
	 * @see #setRelationShipId(int)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getRelationship_RelationShipId()
	 * @model id="true"
	 * @generated
	 */
	int getRelationShipId();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.Relationship#getRelationShipId <em>Relation Ship Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Ship Id</em>' attribute.
	 * @see #getRelationShipId()
	 * @generated
	 */
	void setRelationShipId(int value);

} // Relationship
