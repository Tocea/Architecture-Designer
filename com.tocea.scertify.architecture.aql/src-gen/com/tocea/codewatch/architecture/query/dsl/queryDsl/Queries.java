/**
 */
package com.tocea.codewatch.architecture.query.dsl.queryDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getName <em>Name</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getOutput <em>Output</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getImports <em>Imports</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.QueryDslPackage#getQueries()
 * @model
 * @generated
 */
public interface Queries extends EObject
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
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.QueryDslPackage#getQueries_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' attribute.
   * @see #setOutput(String)
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.QueryDslPackage#getQueries_Output()
   * @model
   * @generated
   */
  String getOutput();

  /**
   * Sets the value of the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getOutput <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' attribute.
   * @see #getOutput()
   * @generated
   */
  void setOutput(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.QueryDslPackage#getQueries_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
   * The list contents are of type {@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Query}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queries</em>' containment reference list.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.QueryDslPackage#getQueries_Queries()
   * @model containment="true"
   * @generated
   */
  EList<Query> getQueries();

} // Queries
