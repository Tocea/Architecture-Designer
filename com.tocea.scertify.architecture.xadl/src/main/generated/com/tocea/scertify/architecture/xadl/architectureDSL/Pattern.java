/**
 */
package com.tocea.scertify.architecture.xadl.architectureDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Pattern#getSuperPattern <em>Super Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends ParametrizedType
{
  /**
   * Returns the value of the '<em><b>Super Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Pattern</em>' containment reference.
   * @see #setSuperPattern(TypeReference)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getPattern_SuperPattern()
   * @model containment="true"
   * @generated
   */
  TypeReference getSuperPattern();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Pattern#getSuperPattern <em>Super Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Pattern</em>' containment reference.
   * @see #getSuperPattern()
   * @generated
   */
  void setSuperPattern(TypeReference value);

} // Pattern
