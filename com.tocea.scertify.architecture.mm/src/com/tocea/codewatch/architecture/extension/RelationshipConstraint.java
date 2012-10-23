/**
 */
package com.tocea.codewatch.architecture.extension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.tocea.codewatch.architecture.extension.ExtensionPackage#getRelationshipConstraint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RelationshipConstraint extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean check(ExtensionRelationship relationship);

} // RelationshipConstraint
