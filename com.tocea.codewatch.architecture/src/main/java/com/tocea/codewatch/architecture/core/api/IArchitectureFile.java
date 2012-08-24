package com.tocea.codewatch.architecture.core.api;



public interface IArchitectureFile extends IAnalysedElement{
	
	
	/**
	 * Get the value of the '<em><b>path</b></em>' reference.
	 * 
	 * @return the value of the '<em>path</em>' reference.
	 */
	String getPath();
	/**
	 * Set the value of the '<em>path</em>' reference.
	 * @param _path 
	 *            the new value of the '<em>path</em>' reference.
	 */
	void setPath(final String _path);
	
}
