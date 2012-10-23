/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametrized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getParametrizedType()
 * @model
 * @generated
 */
public interface ParametrizedType extends Type
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getParametrizedType_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.tocea.codewatch.architecture.dsl.architectureDSL.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getParametrizedType_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link com.tocea.codewatch.architecture.dsl.architectureDSL.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getParametrizedType_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // ParametrizedType
