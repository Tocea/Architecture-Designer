package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IType;


public class Type extends AbstractAnalysedElement implements IType	
{	
	protected String qualifiedName;
	protected boolean source;
	protected boolean binary;
	
	
	public Type(){
		super();
	}
		
	
	
	/**
	 * Get the value of the '<em><b>qualifiedName</b></em>' attribute.
	 * 
	 * @return the value of the '<em>qualifiedName</em>' attribute.
	 */
	public String getQualifiedName(){
		
		
		return this.qualifiedName;
	}
	
	
	/**
	 * Set the value of the '<em>qualifiedName</em>' reference.
	 * @param _qualifiedName 
	 *            the new value of the '<em>qualifiedName</em>' reference.
	 */
	public void setQualifiedName(final String _qualifiedName){
		
		
		this.qualifiedName = _qualifiedName;
	}
	
	
	/**
	 * Get the value of the '<em><b>source</b></em>' attribute.
	 * 
	 * @return the value of the '<em>source</em>' attribute.
	 */
	public boolean isSource(){
		
		
		return this.source;
	}
	
	
	/**
	 * Set the value of the '<em>source</em>' reference.
	 * @param _source 
	 *            the new value of the '<em>source</em>' reference.
	 */
	public void setSource(final boolean _source){
		
		
		this.source = _source;
	}
	
	
	/**
	 * Get the value of the '<em><b>binary</b></em>' attribute.
	 * 
	 * @return the value of the '<em>binary</em>' attribute.
	 */
	public boolean isBinary(){
		
		
		return this.binary;
	}
	
	
	/**
	 * Set the value of the '<em>binary</em>' reference.
	 * @param _binary 
	 *            the new value of the '<em>binary</em>' reference.
	 */
	public void setBinary(final boolean _binary){
		
		
		this.binary = _binary;
	}
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitType(this);
	}
}
