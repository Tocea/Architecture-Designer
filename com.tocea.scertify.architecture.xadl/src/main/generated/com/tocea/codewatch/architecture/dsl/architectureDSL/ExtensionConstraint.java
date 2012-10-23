/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionConstraint#getExplanation <em>Explanation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getExtensionConstraint()
 * @model
 * @generated
 */
public interface ExtensionConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(Constraint)
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getExtensionConstraint_Constraint()
   * @model containment="true"
   * @generated
   */
  Constraint getConstraint();

  /**
   * Sets the value of the '{@link com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionConstraint#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(Constraint value);

  /**
   * Returns the value of the '<em><b>Explanation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explanation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explanation</em>' attribute.
   * @see #setExplanation(String)
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getExtensionConstraint_Explanation()
   * @model
   * @generated
   */
  String getExplanation();

  /**
   * Sets the value of the '{@link com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionConstraint#getExplanation <em>Explanation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explanation</em>' attribute.
   * @see #getExplanation()
   * @generated
   */
  void setExplanation(String value);

} // ExtensionConstraint
