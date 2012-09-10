/**
 */
package com.tocea.codewatch.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.Type#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.Type#isSource <em>Source</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.Type#isBinary <em>Binary</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getType()
 * @model
 * @generated
 */
public interface Type extends AnalysedElement {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getType_QualifiedName()
	 * @model required="true"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.Type#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(boolean)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getType_Source()
	 * @model
	 * @generated
	 */
	boolean isSource();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.Type#isSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #isSource()
	 * @generated
	 */
	void setSource(boolean value);

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary</em>' attribute.
	 * @see #setBinary(boolean)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getType_Binary()
	 * @model
	 * @generated
	 */
	boolean isBinary();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.Type#isBinary <em>Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary</em>' attribute.
	 * @see #isBinary()
	 * @generated
	 */
	void setBinary(boolean value);

} // Type
