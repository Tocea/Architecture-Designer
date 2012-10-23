/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL.impl;

import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Constraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.MetricComparator;

import com.tocea.codewatch.architecture.query.dsl.queryDsl.Query;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.ConstraintImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.ConstraintImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.ConstraintImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint
{
  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected Query query;

  /**
   * The default value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparator()
   * @generated
   * @ordered
   */
  protected static final MetricComparator COMPARATOR_EDEFAULT = MetricComparator.GE;

  /**
   * The cached value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparator()
   * @generated
   * @ordered
   */
  protected MetricComparator comparator = COMPARATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected XExpression value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArchitectureDSLPackage.Literals.CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query getQuery()
  {
    if (query != null && query.eIsProxy())
    {
      InternalEObject oldQuery = (InternalEObject)query;
      query = (Query)eResolveProxy(oldQuery);
      if (query != oldQuery)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitectureDSLPackage.CONSTRAINT__QUERY, oldQuery, query));
      }
    }
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query basicGetQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(Query newQuery)
  {
    Query oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.CONSTRAINT__QUERY, oldQuery, query));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetricComparator getComparator()
  {
    return comparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComparator(MetricComparator newComparator)
  {
    MetricComparator oldComparator = comparator;
    comparator = newComparator == null ? COMPARATOR_EDEFAULT : newComparator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.CONSTRAINT__COMPARATOR, oldComparator, comparator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(XExpression newValue, NotificationChain msgs)
  {
    XExpression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.CONSTRAINT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(XExpression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitectureDSLPackage.CONSTRAINT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitectureDSLPackage.CONSTRAINT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.CONSTRAINT__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ArchitectureDSLPackage.CONSTRAINT__VALUE:
        return basicSetValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArchitectureDSLPackage.CONSTRAINT__QUERY:
        if (resolve) return getQuery();
        return basicGetQuery();
      case ArchitectureDSLPackage.CONSTRAINT__COMPARATOR:
        return getComparator();
      case ArchitectureDSLPackage.CONSTRAINT__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchitectureDSLPackage.CONSTRAINT__QUERY:
        setQuery((Query)newValue);
        return;
      case ArchitectureDSLPackage.CONSTRAINT__COMPARATOR:
        setComparator((MetricComparator)newValue);
        return;
      case ArchitectureDSLPackage.CONSTRAINT__VALUE:
        setValue((XExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArchitectureDSLPackage.CONSTRAINT__QUERY:
        setQuery((Query)null);
        return;
      case ArchitectureDSLPackage.CONSTRAINT__COMPARATOR:
        setComparator(COMPARATOR_EDEFAULT);
        return;
      case ArchitectureDSLPackage.CONSTRAINT__VALUE:
        setValue((XExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArchitectureDSLPackage.CONSTRAINT__QUERY:
        return query != null;
      case ArchitectureDSLPackage.CONSTRAINT__COMPARATOR:
        return comparator != COMPARATOR_EDEFAULT;
      case ArchitectureDSLPackage.CONSTRAINT__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (comparator: ");
    result.append(comparator);
    result.append(')');
    return result.toString();
  }

} //ConstraintImpl
