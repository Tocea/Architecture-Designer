package com.tocea.codewatch.architecture.core.api;

/**
 * This type describes a visitable interface for the architecture package
 * <p>
 */
public interface IArchitectureVisitable {

	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	void accept(IArchitectureVisitor _visitor);	

}
