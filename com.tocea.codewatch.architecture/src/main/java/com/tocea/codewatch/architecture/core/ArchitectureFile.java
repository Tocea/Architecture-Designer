package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IArchitectureFile;
import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;


public class ArchitectureFile extends AbstractAnalysedElement implements IArchitectureFile	
{	
	protected String path;
	
	
	public ArchitectureFile(){
		super();
	}
		
	
	
	/**
	 * Get the value of the '<em><b>path</b></em>' attribute.
	 * 
	 * @return the value of the '<em>path</em>' attribute.
	 */
	public String getPath(){
		
		
		return this.path;
	}
	
	
	/**
	 * Set the value of the '<em>path</em>' reference.
	 * @param _path 
	 *            the new value of the '<em>path</em>' reference.
	 */
	public void setPath(final String _path){
		
		
		this.path = _path;
	}
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitArchitectureFile(this);
	}
}
