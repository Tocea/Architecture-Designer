package com.tocea.codewatch.architecture.core.api;



public interface IType extends IAnalysedElement{
	
	
	/**
	 * Get the value of the '<em><b>qualifiedName</b></em>' reference.
	 * 
	 * @return the value of the '<em>qualifiedName</em>' reference.
	 */
	String getQualifiedName();
	/**
	 * Set the value of the '<em>qualifiedName</em>' reference.
	 * @param _qualifiedName 
	 *            the new value of the '<em>qualifiedName</em>' reference.
	 */
	void setQualifiedName(final String _qualifiedName);
	
	
	
	/**
	 * Get the value of the '<em><b>source</b></em>' reference.
	 * 
	 * @return the value of the '<em>source</em>' reference.
	 */
	boolean isSource();
	/**
	 * Set the value of the '<em>source</em>' reference.
	 * @param _source 
	 *            the new value of the '<em>source</em>' reference.
	 */
	void setSource(final boolean _source);
	
	
	
	/**
	 * Get the value of the '<em><b>binary</b></em>' reference.
	 * 
	 * @return the value of the '<em>binary</em>' reference.
	 */
	boolean isBinary();
	/**
	 * Set the value of the '<em>binary</em>' reference.
	 * @param _binary 
	 *            the new value of the '<em>binary</em>' reference.
	 */
	void setBinary(final boolean _binary);
	
}
