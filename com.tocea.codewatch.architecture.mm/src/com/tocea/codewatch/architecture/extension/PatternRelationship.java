/**
 */
package com.tocea.codewatch.architecture.extension;

import com.tocea.codewatch.architecture.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.extension.PatternRelationship#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.extension.ExtensionPackage#getPatternRelationship()
 * @model
 * @generated
 */
public interface PatternRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see com.tocea.codewatch.architecture.extension.ExtensionPackage#getPatternRelationship_ReferenceName()
	 * @model required="true"
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.extension.PatternRelationship#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkConstraint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Role<?> getTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Pattern getSource();

} // PatternRelationship
