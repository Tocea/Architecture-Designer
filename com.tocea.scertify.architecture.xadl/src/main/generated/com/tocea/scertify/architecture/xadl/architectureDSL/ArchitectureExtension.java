/**
 */
package com.tocea.scertify.architecture.xadl.architectureDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension#getName <em>Name</em>}</li>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getArchitectureExtension()
 * @model
 * @generated
 */
public interface ArchitectureExtension extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getArchitectureExtension_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getArchitectureExtension_Entities()
   * @model containment="true"
   * @generated
   */
  EList<ExtensionEntity> getEntities();

} // ArchitectureExtension
