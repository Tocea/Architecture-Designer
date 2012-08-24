package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IAnalysedElement;
import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IRelationship;


public abstract class AbstractRelationship implements IRelationship	
{	
	protected IAnalysedElement target;
	protected IAnalysedElement source;
	protected int relationShipId;
	
	
	public AbstractRelationship(){
	}
		

	public int compareTo(IRelationship o) {
	
	    return this.getRelationShipId() - o.getRelationShipId();
	}
	
	
	/**
	 * Get the value of the '<em><b>target</b></em>' reference.
	 * 
	 * @return the value of the '<em>target</em>' reference.
	 */
	public IAnalysedElement getTarget(){
		
		
		return this.target;
		
	}
	
	
	/**
	 * Set the value of the '<em>target</em>' reference.
	 * @param _target 
	 *            the new value of the '<em>target</em>' reference.
	 */
	public void setTarget(IAnalysedElement _target){
		
		
		this.target = _target;
	}
	
	
	/**
	 * Get the value of the '<em><b>source</b></em>' reference.
	 * 
	 * @return the value of the '<em>source</em>' reference.
	 */
	public IAnalysedElement getSource(){
		
		
		return this.source;
		
	}
	
	
	/**
	 * Set the value of the '<em>source</em>' reference.
	 * @param _source 
	 *            the new value of the '<em>source</em>' reference.
	 */
	public void setSource(IAnalysedElement _source){
		
		
		this.source = _source;
	}
	
	
	/**
	 * Get the value of the '<em><b>relationShipId</b></em>' attribute.
	 * 
	 * @return the value of the '<em>relationShipId</em>' attribute.
	 */
	public int getRelationShipId(){
		
		
		return this.relationShipId;
	}
	
	
	/**
	 * Set the value of the '<em>relationShipId</em>' reference.
	 * @param _relationShipId 
	 *            the new value of the '<em>relationShipId</em>' reference.
	 */
	public void setRelationShipId(final int _relationShipId){
		
		
		this.relationShipId = _relationShipId;
	}
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitRelationship(this);
	}
}
