package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IFieldReferenceDependency;


public class FieldReferenceDependency extends ReferenceDependency implements IFieldReferenceDependency	
{	
	
	
	public FieldReferenceDependency(){
		super();
	}
		
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitFieldReferenceDependency(this);
	}
}
