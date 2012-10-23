/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.Datatype#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getDatatype()
 * @model
 * @generated
 */
public interface Datatype extends Type
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(JvmTypeReference)
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getDatatype_Reference()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getReference();

  /**
   * Sets the value of the '{@link com.tocea.codewatch.architecture.dsl.architectureDSL.Datatype#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(JvmTypeReference value);

} // Datatype
