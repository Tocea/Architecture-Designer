/**
 */
package com.tocea.codewatch.architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Injection Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.InjectionDependency#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getInjectionDependency()
 * @model
 * @generated
 */
public interface InjectionDependency extends RuntimeDependency {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(AnalysedElement)
	 * @see com.tocea.codewatch.architecture.ArchitecturePackage#getInjectionDependency_Mapping()
	 * @model
	 * @generated
	 */
	AnalysedElement getMapping();

	/**
	 * Sets the value of the '{@link com.tocea.codewatch.architecture.InjectionDependency#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(AnalysedElement value);

} // InjectionDependency
