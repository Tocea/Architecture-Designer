/**
 */
package com.tocea.codewatch.architecture.dsl.architectureDSL.impl;

import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureDSLPackage;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Field;
import com.tocea.codewatch.architecture.dsl.architectureDSL.NamedEntity;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Relationship;
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConstraint;

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
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.RelationshipImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.RelationshipImpl#getSuperRelationship <em>Super Relationship</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.RelationshipImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.dsl.architectureDSL.impl.RelationshipImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends ExtensionEntityImpl implements Relationship
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperRelationship() <em>Super Relationship</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperRelationship()
   * @generated
   * @ordered
   */
  protected Relationship superRelationship;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<RelationshipConstraint> constraints;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipImpl()
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
    return ArchitectureDSLPackage.Literals.RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.RELATIONSHIP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.RELATIONSHIP__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship getSuperRelationship()
  {
    if (superRelationship != null && superRelationship.eIsProxy())
    {
      InternalEObject oldSuperRelationship = (InternalEObject)superRelationship;
      superRelationship = (Relationship)eResolveProxy(oldSuperRelationship);
      if (superRelationship != oldSuperRelationship)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitectureDSLPackage.RELATIONSHIP__SUPER_RELATIONSHIP, oldSuperRelationship, superRelationship));
      }
    }
    return superRelationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship basicGetSuperRelationship()
  {
    return superRelationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperRelationship(Relationship newSuperRelationship)
  {
    Relationship oldSuperRelationship = superRelationship;
    superRelationship = newSuperRelationship;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureDSLPackage.RELATIONSHIP__SUPER_RELATIONSHIP, oldSuperRelationship, superRelationship));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationshipConstraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<RelationshipConstraint>(RelationshipConstraint.class, this, ArchitectureDSLPackage.RELATIONSHIP__CONSTRAINTS);
    }
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, ArchitectureDSLPackage.RELATIONSHIP__FIELDS);
    }
    return fields;
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
      case ArchitectureDSLPackage.RELATIONSHIP__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
      case ArchitectureDSLPackage.RELATIONSHIP__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case ArchitectureDSLPackage.RELATIONSHIP__NAME:
        return getName();
      case ArchitectureDSLPackage.RELATIONSHIP__ABSTRACT:
        return isAbstract();
      case ArchitectureDSLPackage.RELATIONSHIP__SUPER_RELATIONSHIP:
        if (resolve) return getSuperRelationship();
        return basicGetSuperRelationship();
      case ArchitectureDSLPackage.RELATIONSHIP__CONSTRAINTS:
        return getConstraints();
      case ArchitectureDSLPackage.RELATIONSHIP__FIELDS:
        return getFields();
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
      case ArchitectureDSLPackage.RELATIONSHIP__NAME:
        setName((String)newValue);
        return;
      case ArchitectureDSLPackage.RELATIONSHIP__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case ArchitectureDSLPackage.RELATIONSHIP__SUPER_RELATIONSHIP:
        setSuperRelationship((Relationship)newValue);
        return;
      case ArchitectureDSLPackage.RELATIONSHIP__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends RelationshipConstraint>)newValue);
        return;
      case ArchitectureDSLPackage.RELATIONSHIP__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
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
      case ArchitectureDSLPackage.RELATIONSHIP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArchitectureDSLPackage.RELATIONSHIP__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case ArchitectureDSLPackage.RELATIONSHIP__SUPER_RELATIONSHIP:
        setSuperRelationship((Relationship)null);
        return;
      case ArchitectureDSLPackage.RELATIONSHIP__CONSTRAINTS:
        getConstraints().clear();
        return;
      case ArchitectureDSLPackage.RELATIONSHIP__FIELDS:
        getFields().clear();
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
      case ArchitectureDSLPackage.RELATIONSHIP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArchitectureDSLPackage.RELATIONSHIP__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case ArchitectureDSLPackage.RELATIONSHIP__SUPER_RELATIONSHIP:
        return superRelationship != null;
      case ArchitectureDSLPackage.RELATIONSHIP__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
      case ArchitectureDSLPackage.RELATIONSHIP__FIELDS:
        return fields != null && !fields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == NamedEntity.class)
    {
      switch (derivedFeatureID)
      {
        case ArchitectureDSLPackage.RELATIONSHIP__NAME: return ArchitectureDSLPackage.NAMED_ENTITY__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == NamedEntity.class)
    {
      switch (baseFeatureID)
      {
        case ArchitectureDSLPackage.NAMED_ENTITY__NAME: return ArchitectureDSLPackage.RELATIONSHIP__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(')');
    return result.toString();
  }

} //RelationshipImpl
