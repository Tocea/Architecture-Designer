/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.Arity#getValue <em>Value</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.Arity#isUnbound <em>Unbound</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getArity()
 * @model
 * @generated
 */
public interface Arity extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getArity_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link com.tocea.codewatch.architecture.dsl.architectureDSL.Arity#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Unbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unbound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unbound</em>' attribute.
   * @see #setUnbound(boolean)
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getArity_Unbound()
   * @model
   * @generated
   */
  boolean isUnbound();

  /**
   * Sets the value of the '{@link com.tocea.codewatch.architecture.dsl.architectureDSL.Arity#isUnbound <em>Unbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unbound</em>' attribute.
   * @see #isUnbound()
   * @generated
   */
  void setUnbound(boolean value);

} // Arity
