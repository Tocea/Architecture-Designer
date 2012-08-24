package com.tocea.codewatch.architecture.core.api;



public interface IInjectionDependency extends IRuntimeDependency{
	
	
	/**
	 * Get the value of the '<em><b>mapping</b></em>' reference.
	 * 
	 * @return the value of the '<em>mapping</em>' reference.
	 */
	IAnalysedElement getMapping();
	/**
	 * Set the value of the '<em>mapping</em>' reference.
	 * @param _mapping 
	 *            the new value of the '<em>mapping</em>' reference.
	 */
	void setMapping(final IAnalysedElement _mapping);
	
}
