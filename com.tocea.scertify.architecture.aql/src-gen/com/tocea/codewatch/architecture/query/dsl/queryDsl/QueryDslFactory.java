/**
 */
package com.tocea.codewatch.architecture.query.dsl.queryDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.QueryDslPackage
 * @generated
 */
public interface QueryDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QueryDslFactory eINSTANCE = com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Queries</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Queries</em>'.
   * @generated
   */
  Queries createQueries();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Custom Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Query</em>'.
   * @generated
   */
  CustomQuery createCustomQuery();

  /**
   * Returns a new object of class '<em>Metric Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metric Query</em>'.
   * @generated
   */
  MetricQuery createMetricQuery();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QueryDslPackage getQueryDslPackage();

} //QueryDslFactory
