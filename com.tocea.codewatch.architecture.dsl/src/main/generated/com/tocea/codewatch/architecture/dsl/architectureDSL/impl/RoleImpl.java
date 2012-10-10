/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL.impl;

import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Role;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Type;
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.RoleImpl#isInherited <em>Inherited</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.RoleImpl#getElement <em>Element</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.RoleImpl#getSuperRole <em>Super Role</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.RoleImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends ParametrizedTypeImpl implements Role
{
  /**
   * The default value of the '{@link #isInherited() <em>Inherited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInherited()
   * @generated
   * @ordered
   */
  protected static final boolean INHERITED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInherited() <em>Inherited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInherited()
   * @generated
   * @ordered
   */
  protected boolean inherited = INHERITED_EDEFAULT;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected Type element;

  /**
   * The cached value of the '{@link #getSuperRole() <em>Super Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperRole()
   * @generated
   * @ordered
   */
  protected TypeReference superRole;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<ExtensionConstraint> constraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleImpl()
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
    return ArchitectureDSLPackage.Literals.ROLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInherited()
  {
    return inherited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInherited(boolean newInherited)
  {
    boolean oldInherited = inherited;
    inherited = newInherited;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.ROLE__INHERITED, oldInherited, inherited));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getElement()
  {
    if (element != null && element.eIsProxy())
    {
      InternalEObject oldElement = (InternalEObject)element;
      element = (Type)eResolveProxy(oldElement);
      if (element != oldElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitectureDSLPackage.ROLE__ELEMENT, oldElement, element));
      }
    }
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(Type newElement)
  {
    Type oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.ROLE__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getSuperRole()
  {
    return superRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperRole(TypeReference newSuperRole, NotificationChain msgs)
  {
    TypeReference oldSuperRole = superRole;
    superRole = newSuperRole;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.ROLE__SUPER_ROLE, oldSuperRole, newSuperRole);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperRole(TypeReference newSuperRole)
  {
    if (newSuperRole != superRole)
    {
      NotificationChain msgs = null;
      if (superRole != null)
        msgs = ((InternalEObject)superRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitectureDSLPackage.ROLE__SUPER_ROLE, null, msgs);
      if (newSuperRole != null)
        msgs = ((InternalEObject)newSuperRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitectureDSLPackage.ROLE__SUPER_ROLE, null, msgs);
      msgs = basicSetSuperRole(newSuperRole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.ROLE__SUPER_ROLE, newSuperRole, newSuperRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExtensionConstraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<ExtensionConstraint>(ExtensionConstraint.class, this, ArchitectureDSLPackage.ROLE__CONSTRAINTS);
    }
    return constraints;
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
      case ArchitectureDSLPackage.ROLE__SUPER_ROLE:
        return basicSetSuperRole(null, msgs);
      case ArchitectureDSLPackage.ROLE__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
      case ArchitectureDSLPackage.ROLE__INHERITED:
        return isInherited();
      case ArchitectureDSLPackage.ROLE__ELEMENT:
        if (resolve) return getElement();
        return basicGetElement();
      case ArchitectureDSLPackage.ROLE__SUPER_ROLE:
        return getSuperRole();
      case ArchitectureDSLPackage.ROLE__CONSTRAINTS:
        return getConstraints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchitectureDSLPackage.ROLE__INHERITED:
        setInherited((Boolean)newValue);
        return;
      case ArchitectureDSLPackage.ROLE__ELEMENT:
        setElement((Type)newValue);
        return;
      case ArchitectureDSLPackage.ROLE__SUPER_ROLE:
        setSuperRole((TypeReference)newValue);
        return;
      case ArchitectureDSLPackage.ROLE__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends ExtensionConstraint>)newValue);
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
      case ArchitectureDSLPackage.ROLE__INHERITED:
        setInherited(INHERITED_EDEFAULT);
        return;
      case ArchitectureDSLPackage.ROLE__ELEMENT:
        setElement((Type)null);
        return;
      case ArchitectureDSLPackage.ROLE__SUPER_ROLE:
        setSuperRole((TypeReference)null);
        return;
      case ArchitectureDSLPackage.ROLE__CONSTRAINTS:
        getConstraints().clear();
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
      case ArchitectureDSLPackage.ROLE__INHERITED:
        return inherited != INHERITED_EDEFAULT;
      case ArchitectureDSLPackage.ROLE__ELEMENT:
        return element != null;
      case ArchitectureDSLPackage.ROLE__SUPER_ROLE:
        return superRole != null;
      case ArchitectureDSLPackage.ROLE__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
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
    result.append(" (inherited: ");
    result.append(inherited);
    result.append(')');
    return result.toString();
  }

} //RoleImpl
