/**
 */
package com.tocea.scertify.architecture.xadl.architectureDSL;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.PrimitiveRole#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getPrimitiveRole()
 * @model
 * @generated
 */
public interface PrimitiveRole extends Type
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getPrimitiveRole_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.PrimitiveRole#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

} // PrimitiveRole
