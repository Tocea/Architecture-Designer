/**
 */
package com.tocea.codewatch.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.ReferenceDependency#getUri <em>Uri</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.ReferenceDependency#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getReferenceDependency()
 * @model
 * @generated
 */
public interface ReferenceDependency extends Dependency {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getReferenceDependency_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.ReferenceDependency#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getReferenceDependency_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.ReferenceDependency#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ReferenceDependency
