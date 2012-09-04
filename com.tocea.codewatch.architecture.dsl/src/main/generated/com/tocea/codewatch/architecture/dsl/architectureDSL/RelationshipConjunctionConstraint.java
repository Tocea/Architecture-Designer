/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Conjunction Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConjunctionConstraint#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getRelationshipConjunctionConstraint()
 * @model
 * @generated
 */
public interface RelationshipConjunctionConstraint extends RelationshipConstraint
{
  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipPrimitiveConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage#getRelationshipConjunctionConstraint_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<RelationshipPrimitiveConstraint> getConstraints();

} // RelationshipConjunctionConstraint
