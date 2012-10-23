/**
 */
package com.tocea.codewatch.architecture.extension;

import com.tocea.codewatch.architecture.AnalysedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.extension.Role#getAttachedElement <em>Attached Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.extension.ExtensionPackage#getRole()
 * @model abstract="true"
 * @generated
 */
public interface Role<T> extends AnalysedElement {
	/**
	 * Returns the value of the '<em><b>Attached Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached Element</em>' attribute.
	 * @see #setAttachedElement(Object)
	 * @see com.tocea.codewatch.architecture.extension.ExtensionPackage#getRole_AttachedElement()
	 * @model required="true"
	 * @generated
	 */
	T getAttachedElement();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.extension.Role#getAttachedElement <em>Attached Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached Element</em>' attribute.
	 * @see #getAttachedElement()
	 * @generated
	 */
	void setAttachedElement(T value);

} // Role
