package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IInheritanceDependency;


public class InheritanceDependency extends AbstractRelationship implements IInheritanceDependency	
{	
	
	
	public InheritanceDependency(){
		super();
	}
		
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitInheritanceDependency(this);
	}
}
