package com.tocea.codewatch.architecture.core.api;



public interface IRelationship extends IArchitectureVisitable,Comparable<IRelationship>{
	
	
	/**
	 * Get the value of the '<em><b>target</b></em>' reference.
	 * 
	 * @return the value of the '<em>target</em>' reference.
	 */
	IAnalysedElement getTarget();
	/**
	 * Set the value of the '<em>target</em>' reference.
	 * @param _target 
	 *            the new value of the '<em>target</em>' reference.
	 */
	void setTarget(final IAnalysedElement _target);
	
	
	
	/**
	 * Get the value of the '<em><b>source</b></em>' reference.
	 * 
	 * @return the value of the '<em>source</em>' reference.
	 */
	IAnalysedElement getSource();
	/**
	 * Set the value of the '<em>source</em>' reference.
	 * @param _source 
	 *            the new value of the '<em>source</em>' reference.
	 */
	void setSource(final IAnalysedElement _source);
	
	
	
	/**
	 * Get the value of the '<em><b>relationShipId</b></em>' reference.
	 * 
	 * @return the value of the '<em>relationShipId</em>' reference.
	 */
	int getRelationShipId();
	/**
	 * Set the value of the '<em>relationShipId</em>' reference.
	 * @param _relationShipId 
	 *            the new value of the '<em>relationShipId</em>' reference.
	 */
	void setRelationShipId(final int _relationShipId);
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor);
}
