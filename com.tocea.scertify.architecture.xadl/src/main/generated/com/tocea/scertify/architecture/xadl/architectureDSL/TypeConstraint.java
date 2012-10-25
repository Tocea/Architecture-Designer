/**
 */
package com.tocea.scertify.architecture.xadl.architectureDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint#getSource <em>Source</em>}</li>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getTypeConstraint()
 * @model
 * @generated
 */
public interface TypeConstraint extends RelationshipPrimitiveConstraint
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Type)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getTypeConstraint_Source()
   * @model
   * @generated
   */
  Type getSource();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Type value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Type)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getTypeConstraint_Target()
   * @model
   * @generated
   */
  Type getTarget();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.TypeConstraint#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Type value);

} // TypeConstraint
