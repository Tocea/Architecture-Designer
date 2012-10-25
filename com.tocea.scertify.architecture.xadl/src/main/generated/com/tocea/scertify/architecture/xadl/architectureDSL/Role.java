/**
 */
package com.tocea.scertify.architecture.xadl.architectureDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#isInherited <em>Inherited</em>}</li>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#getElement <em>Element</em>}</li>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#getSuperRole <em>Super Role</em>}</li>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends ParametrizedType
{
  /**
   * Returns the value of the '<em><b>Inherited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inherited</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inherited</em>' attribute.
   * @see #setInherited(boolean)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getRole_Inherited()
   * @model
   * @generated
   */
  boolean isInherited();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#isInherited <em>Inherited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inherited</em>' attribute.
   * @see #isInherited()
   * @generated
   */
  void setInherited(boolean value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(Type)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getRole_Element()
   * @model
   * @generated
   */
  Type getElement();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Type value);

  /**
   * Returns the value of the '<em><b>Super Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Role</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Role</em>' containment reference.
   * @see #setSuperRole(TypeReference)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getRole_SuperRole()
   * @model containment="true"
   * @generated
   */
  TypeReference getSuperRole();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Role#getSuperRole <em>Super Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Role</em>' containment reference.
   * @see #getSuperRole()
   * @generated
   */
  void setSuperRole(TypeReference value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getRole_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<ExtensionConstraint> getConstraints();

} // Role
