package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IImportReferenceDependency;


public class ImportReferenceDependency extends ReferenceDependency implements IImportReferenceDependency	
{	
	
	
	public ImportReferenceDependency(){
		super();
	}
		
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitImportReferenceDependency(this);
	}
}
