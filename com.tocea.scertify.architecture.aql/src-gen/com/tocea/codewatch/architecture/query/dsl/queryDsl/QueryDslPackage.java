/**
 */
package com.tocea.codewatch.architecture.query.dsl.queryDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.QueryDslFactory
 * @model kind="package"
 * @generated
 */
public interface QueryDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "queryDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tocea.com/codewatch/architecture/query/dsl/QueryDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "queryDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QueryDslPackage eINSTANCE = com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueriesImpl <em>Queries</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueriesImpl
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl#getQueries()
   * @generated
   */
  int QUERIES = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERIES__NAME = 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERIES__OUTPUT = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERIES__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERIES__QUERIES = 3;

  /**
   * The number of structural features of the '<em>Queries</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERIES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryImpl
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__BODY = 2;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.CustomQueryImpl <em>Custom Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.CustomQueryImpl
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl#getCustomQuery()
   * @generated
   */
  int CUSTOM_QUERY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_QUERY__NAME = QUERY__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_QUERY__PARAMETERS = QUERY__PARAMETERS;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_QUERY__BODY = QUERY__BODY;

  /**
   * The number of structural features of the '<em>Custom Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.MetricQueryImpl <em>Metric Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.MetricQueryImpl
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl#getMetricQuery()
   * @generated
   */
  int METRIC_QUERY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METRIC_QUERY__NAME = QUERY__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METRIC_QUERY__PARAMETERS = QUERY__PARAMETERS;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METRIC_QUERY__BODY = QUERY__BODY;

  /**
   * The number of structural features of the '<em>Metric Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METRIC_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.ImportImpl
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 4;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Queries</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries
   * @generated
   */
  EClass getQueries();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getName()
   * @see #getQueries()
   * @generated
   */
  EAttribute getQueries_Name();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getOutput()
   * @see #getQueries()
   * @generated
   */
  EAttribute getQueries_Output();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getImports()
   * @see #getQueries()
   * @generated
   */
  EReference getQueries_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries#getQueries()
   * @see #getQueries()
   * @generated
   */
  EReference getQueries_Queries();

  /**
   * Returns the meta object for class '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Query#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Query#getName()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Query#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Query#getParameters()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Query#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Query#getBody()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Body();

  /**
   * Returns the meta object for class '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.CustomQuery <em>Custom Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Query</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.CustomQuery
   * @generated
   */
  EClass getCustomQuery();

  /**
   * Returns the meta object for class '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.MetricQuery <em>Metric Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metric Query</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.MetricQuery
   * @generated
   */
  EClass getMetricQuery();

  /**
   * Returns the meta object for class '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QueryDslFactory getQueryDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueriesImpl <em>Queries</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueriesImpl
     * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl#getQueries()
     * @generated
     */
    EClass QUERIES = eINSTANCE.getQueries();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERIES__NAME = eINSTANCE.getQueries_Name();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERIES__OUTPUT = eINSTANCE.getQueries_Output();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERIES__IMPORTS = eINSTANCE.getQueries_Imports();

    /**
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERIES__QUERIES = eINSTANCE.getQueries_Queries();

    /**
     * The meta object literal for the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryImpl
     * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__NAME = eINSTANCE.getQuery_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__PARAMETERS = eINSTANCE.getQuery_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__BODY = eINSTANCE.getQuery_Body();

    /**
     * The meta object literal for the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.CustomQueryImpl <em>Custom Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.CustomQueryImpl
     * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl#getCustomQuery()
     * @generated
     */
    EClass CUSTOM_QUERY = eINSTANCE.getCustomQuery();

    /**
     * The meta object literal for the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.MetricQueryImpl <em>Metric Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.MetricQueryImpl
     * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl#getMetricQuery()
     * @generated
     */
    EClass METRIC_QUERY = eINSTANCE.getMetricQuery();

    /**
     * The meta object literal for the '{@link com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.ImportImpl
     * @see com.tocea.codewatch.architecture.query.dsl.queryDsl.impl.QueryDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

  }

} //QueryDslPackage
