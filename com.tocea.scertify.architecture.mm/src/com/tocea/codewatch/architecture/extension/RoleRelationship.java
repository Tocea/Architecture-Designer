/**
 */
package com.tocea.codewatch.architecture.extension;

import com.tocea.codewatch.architecture.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.tocea.codewatch.architecture.extension.ExtensionPackage#getRoleRelationship()
 * @model
 * @generated
 */
public interface RoleRelationship extends Relationship {
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

} // RoleRelationship
