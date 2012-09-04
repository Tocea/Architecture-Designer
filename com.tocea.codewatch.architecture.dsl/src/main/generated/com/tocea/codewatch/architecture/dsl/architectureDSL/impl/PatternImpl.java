/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL.impl;

import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Pattern;
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.PatternImpl#getSuperPattern <em>Super Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternImpl extends ParametrizedTypeImpl implements Pattern
{
  /**
   * The cached value of the '{@link #getSuperPattern() <em>Super Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperPattern()
   * @generated
   * @ordered
   */
  protected TypeReference superPattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternImpl()
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
    return ArchitectureDSLPackage.Literals.PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getSuperPattern()
  {
    return superPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperPattern(TypeReference newSuperPattern, NotificationChain msgs)
  {
    TypeReference oldSuperPattern = superPattern;
    superPattern = newSuperPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.PATTERN__SUPER_PATTERN, oldSuperPattern, newSuperPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperPattern(TypeReference newSuperPattern)
  {
    if (newSuperPattern != superPattern)
    {
      NotificationChain msgs = null;
      if (superPattern != null)
        msgs = ((InternalEObject)superPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitectureDSLPackage.PATTERN__SUPER_PATTERN, null, msgs);
      if (newSuperPattern != null)
        msgs = ((InternalEObject)newSuperPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitectureDSLPackage.PATTERN__SUPER_PATTERN, null, msgs);
      msgs = basicSetSuperPattern(newSuperPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.PATTERN__SUPER_PATTERN, newSuperPattern, newSuperPattern));
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
      case ArchitectureDSLPackage.PATTERN__SUPER_PATTERN:
        return basicSetSuperPattern(null, msgs);
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
      case ArchitectureDSLPackage.PATTERN__SUPER_PATTERN:
        return getSuperPattern();
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
      case ArchitectureDSLPackage.PATTERN__SUPER_PATTERN:
        setSuperPattern((TypeReference)newValue);
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
      case ArchitectureDSLPackage.PATTERN__SUPER_PATTERN:
        setSuperPattern((TypeReference)null);
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
      case ArchitectureDSLPackage.PATTERN__SUPER_PATTERN:
        return superPattern != null;
    }
    return super.eIsSet(featureID);
  }

} //PatternImpl
