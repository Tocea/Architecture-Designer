/**
 */
package com.tocea.codewatch.architecture.extension.impl;

import com.tocea.codewatch.architecture.extension.ExtensionPackage;
import com.tocea.codewatch.architecture.extension.Role;

import com.tocea.codewatch.architecture.impl.AnalysedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.extension.impl.RoleImpl#getAttachedElement <em>Attached Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoleImpl<T> extends AnalysedElementImpl implements Role<T> {
	/**
	 * The cached value of the '{@link #getAttachedElement() <em>Attached Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedElement()
	 * @generated
	 * @ordered
	 */
	protected T attachedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getAttachedElement() {
		return attachedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachedElement(T newAttachedElement) {
		T oldAttachedElement = attachedElement;
		attachedElement = newAttachedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.ROLE__ATTACHED_ELEMENT, oldAttachedElement, attachedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionPackage.ROLE__ATTACHED_ELEMENT:
				return getAttachedElement();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionPackage.ROLE__ATTACHED_ELEMENT:
				setAttachedElement((T)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExtensionPackage.ROLE__ATTACHED_ELEMENT:
				setAttachedElement((T)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExtensionPackage.ROLE__ATTACHED_ELEMENT:
				return attachedElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (attachedElement: ");
		result.append(attachedElement);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
