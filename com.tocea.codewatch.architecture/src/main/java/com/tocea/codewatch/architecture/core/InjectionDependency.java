package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IAnalysedElement;
import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IInjectionDependency;


public class InjectionDependency extends RuntimeDependency implements IInjectionDependency	
{	
	protected IAnalysedElement mapping;
	
	
	public InjectionDependency(){
		super();
	}
		
	
	
	/**
	 * Get the value of the '<em><b>mapping</b></em>' reference.
	 * 
	 * @return the value of the '<em>mapping</em>' reference.
	 */
	public IAnalysedElement getMapping(){
		
		
		return this.mapping;
		
	}
	
	
	/**
	 * Set the value of the '<em>mapping</em>' reference.
	 * @param _mapping 
	 *            the new value of the '<em>mapping</em>' reference.
	 */
	public void setMapping(IAnalysedElement _mapping){
		
		
		this.mapping = _mapping;
	}
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitInjectionDependency(this);
	}
}
