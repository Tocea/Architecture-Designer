package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IRuntimeDependency;


public class RuntimeDependency extends AbstractRelationship implements IRuntimeDependency	
{	
	
	
	public RuntimeDependency(){
		super();
	}
		
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitRuntimeDependency(this);
	}
}
