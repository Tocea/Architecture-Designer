package com.tocea.codewatch.architecture.core.api;



public interface IReferenceDependency extends IDependency{
	
	
	/**
	 * Get the value of the '<em><b>uri</b></em>' reference.
	 * 
	 * @return the value of the '<em>uri</em>' reference.
	 */
	String getUri();
	/**
	 * Set the value of the '<em>uri</em>' reference.
	 * @param _uri 
	 *            the new value of the '<em>uri</em>' reference.
	 */
	void setUri(final String _uri);
	
	
	
	/**
	 * Get the value of the '<em><b>name</b></em>' reference.
	 * 
	 * @return the value of the '<em>name</em>' reference.
	 */
	String getName();
	/**
	 * Set the value of the '<em>name</em>' reference.
	 * @param _name 
	 *            the new value of the '<em>name</em>' reference.
	 */
	void setName(final String _name);
	
}
