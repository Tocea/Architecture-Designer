package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IDeclaredType;


public class DeclaredType extends AbstractRelationship implements IDeclaredType	
{	
	
	
	public DeclaredType(){
		super();
	}
		
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitDeclaredType(this);
	}
}
