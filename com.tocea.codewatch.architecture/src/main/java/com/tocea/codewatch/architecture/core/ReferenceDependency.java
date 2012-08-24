package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IReferenceDependency;


public class ReferenceDependency extends AbstractRelationship implements IReferenceDependency	
{	
	protected String uri;
	protected String name;
	
	
	public ReferenceDependency(){
		super();
	}
		
	
	
	/**
	 * Get the value of the '<em><b>uri</b></em>' attribute.
	 * 
	 * @return the value of the '<em>uri</em>' attribute.
	 */
	public String getUri(){
		
		
		return this.uri;
	}
	
	
	/**
	 * Set the value of the '<em>uri</em>' reference.
	 * @param _uri 
	 *            the new value of the '<em>uri</em>' reference.
	 */
	public void setUri(final String _uri){
		
		
		this.uri = _uri;
	}
	
	
	/**
	 * Get the value of the '<em><b>name</b></em>' attribute.
	 * 
	 * @return the value of the '<em>name</em>' attribute.
	 */
	public String getName(){
		
		
		return this.name;
	}
	
	
	/**
	 * Set the value of the '<em>name</em>' reference.
	 * @param _name 
	 *            the new value of the '<em>name</em>' reference.
	 */
	public void setName(final String _name){
		
		
		this.name = _name;
	}
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitReferenceDependency(this);
	}
}
