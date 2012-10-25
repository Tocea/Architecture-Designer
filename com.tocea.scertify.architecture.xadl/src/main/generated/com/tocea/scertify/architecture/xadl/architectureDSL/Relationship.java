/**
 */
package com.tocea.scertify.architecture.xadl.architectureDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#getSuperRelationship <em>Super Relationship</em>}</li>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends ExtensionEntity, NamedEntity
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
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getRelationship_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Super Relationship</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Relationship</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Relationship</em>' reference.
   * @see #setSuperRelationship(Relationship)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getRelationship_SuperRelationship()
   * @model
   * @generated
   */
  Relationship getSuperRelationship();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Relationship#getSuperRelationship <em>Super Relationship</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Relationship</em>' reference.
   * @see #getSuperRelationship()
   * @generated
   */
  void setSuperRelationship(Relationship value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link com.tocea.scertify.architecture.xadl.architectureDSL.RelationshipConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getRelationship_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<RelationshipConstraint> getConstraints();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link com.tocea.scertify.architecture.xadl.architectureDSL.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getRelationship_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Relationship
