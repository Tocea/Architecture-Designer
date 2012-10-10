/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL.impl;

import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Constraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.ExtensionConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.ExtensionConstraintImpl#getExplanation <em>Explanation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionConstraintImpl extends MinimalEObjectImpl.Container implements ExtensionConstraint
{
  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected Constraint constraint;

  /**
   * The default value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExplanation()
   * @generated
   * @ordered
   */
  protected static final String EXPLANATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExplanation()
   * @generated
   * @ordered
   */
  protected String explanation = EXPLANATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtensionConstraintImpl()
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
    return ArchitectureDSLPackage.Literals.EXTENSION_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(Constraint newConstraint, NotificationChain msgs)
  {
    Constraint oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.EXTENSION_CONSTRAINT__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(Constraint newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitectureDSLPackage.EXTENSION_CONSTRAINT__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitectureDSLPackage.EXTENSION_CONSTRAINT__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.EXTENSION_CONSTRAINT__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExplanation()
  {
    return explanation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplanation(String newExplanation)
  {
    String oldExplanation = explanation;
    explanation = newExplanation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.EXTENSION_CONSTRAINT__EXPLANATION, oldExplanation, explanation));
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
      case ArchitectureDSLPackage.EXTENSION_CONSTRAINT__CONSTRAINT:
        return basicSetConstraint(null, msgs);
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
      case ArchitectureDSLPackage.EXTENSION_CONSTRAINT__CONSTRAINT:
        return getConstraint();
      case ArchitectureDSLPackage.EXTENSION_CONSTRAINT__EXPLANATION:
        return getExplanation();
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
      case ArchitectureDSLPackage.EXTENSION_CONSTRAINT__CONSTRAINT:
        setConstraint((Constraint)newValue);
        return;
      case ArchitectureDSLPackage.EXTENSION_CONSTRAINT__EXPLANATION:
        setExplanation((String)newValue);
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
      case ArchitectureDSLPackage.EXTENSION_CONSTRAINT__CONSTRAINT:
        setConstraint((Constraint)null);
        return;
      case ArchitectureDSLPackage.EXTENSION_CONSTRAINT__EXPLANATION:
        setExplanation(EXPLANATION_EDEFAULT);
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
      case ArchitectureDSLPackage.EXTENSION_CONSTRAINT__CONSTRAINT:
        return constraint != null;
      case ArchitectureDSLPackage.EXTENSION_CONSTRAINT__EXPLANATION:
        return EXPLANATION_EDEFAULT == null ? explanation != null : !EXPLANATION_EDEFAULT.equals(explanation);
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
    result.append(" (explanation: ");
    result.append(explanation);
    result.append(')');
    return result.toString();
  }

} //ExtensionConstraintImpl
