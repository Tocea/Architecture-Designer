/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference#getReference <em>Reference</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(ReferencedType)
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getTypeReference_Reference()
   * @model
   * @generated
   */
  ReferencedType getReference();

  /**
   * Sets the value of the '{@link com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(ReferencedType value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getTypeReference_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<TypeReference> getParameters();

} // TypeReference
