/**
 */
package com.tocea.codewatch.architecture.query.dsl.queryDsl.impl;

import com.tocea.codewatch.architecture.query.dsl.queryDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryDslFactoryImpl extends EFactoryImpl implements QueryDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QueryDslFactory init()
  {
    try
    {
      QueryDslFactory theQueryDslFactory = (QueryDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tocea.com/codewatch/architecture/query/dsl/QueryDsl"); 
      if (theQueryDslFactory != null)
      {
        return theQueryDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QueryDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QueryDslPackage.QUERIES: return createQueries();
      case QueryDslPackage.QUERY: return createQuery();
      case QueryDslPackage.CUSTOM_QUERY: return createCustomQuery();
      case QueryDslPackage.METRIC_QUERY: return createMetricQuery();
      case QueryDslPackage.IMPORT: return createImport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Queries createQueries()
  {
    QueriesImpl queries = new QueriesImpl();
    return queries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomQuery createCustomQuery()
  {
    CustomQueryImpl customQuery = new CustomQueryImpl();
    return customQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetricQuery createMetricQuery()
  {
    MetricQueryImpl metricQuery = new MetricQueryImpl();
    return metricQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryDslPackage getQueryDslPackage()
  {
    return (QueryDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QueryDslPackage getPackage()
  {
    return QueryDslPackage.eINSTANCE;
  }

} //QueryDslFactoryImpl
