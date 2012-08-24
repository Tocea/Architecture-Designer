package com.tocea.codewatch.architecture.core.api;


/**
 * This type describes a visitor interface for the architecture package
 * <p>
 */
public interface IArchitectureVisitor {
	
	
	/**
	* This method performs the visitor behavior for a {@link IAnalysedElement} object.
	* 
	* @param _o the object to visit
	*/
	void visitAnalysedElement(IAnalysedElement _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IType} object.
	* 
	* @param _o the object to visit
	*/
	void visitType(IType _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IArchitectureFile} object.
	* 
	* @param _o the object to visit
	*/
	void visitArchitectureFile(IArchitectureFile _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IRelationship} object.
	* 
	* @param _o the object to visit
	*/
	void visitRelationship(IRelationship _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IInheritanceDependency} object.
	* 
	* @param _o the object to visit
	*/
	void visitInheritanceDependency(IInheritanceDependency _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IReferenceDependency} object.
	* 
	* @param _o the object to visit
	*/
	void visitReferenceDependency(IReferenceDependency _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link ILibrary} object.
	* 
	* @param _o the object to visit
	*/
	void visitLibrary(ILibrary _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IRuntimeDependency} object.
	* 
	* @param _o the object to visit
	*/
	void visitRuntimeDependency(IRuntimeDependency _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IInjectionDependency} object.
	* 
	* @param _o the object to visit
	*/
	void visitInjectionDependency(IInjectionDependency _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IFieldReferenceDependency} object.
	* 
	* @param _o the object to visit
	*/
	void visitFieldReferenceDependency(IFieldReferenceDependency _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IImportReferenceDependency} object.
	* 
	* @param _o the object to visit
	*/
	void visitImportReferenceDependency(IImportReferenceDependency _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IProject} object.
	* 
	* @param _o the object to visit
	*/
	void visitProject(IProject _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IMethod} object.
	* 
	* @param _o the object to visit
	*/
	void visitMethod(IMethod _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IReturnTypeRelationship} object.
	* 
	* @param _o the object to visit
	*/
	void visitReturnTypeRelationship(IReturnTypeRelationship _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IParameterRelationship} object.
	* 
	* @param _o the object to visit
	*/
	void visitParameterRelationship(IParameterRelationship _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link ICallRelationship} object.
	* 
	* @param _o the object to visit
	*/
	void visitCallRelationship(ICallRelationship _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IField} object.
	* 
	* @param _o the object to visit
	*/
	void visitField(IField _o);	
	
	
	/**
	* This method performs the visitor behavior for a {@link IDeclaredType} object.
	* 
	* @param _o the object to visit
	*/
	void visitDeclaredType(IDeclaredType _o);	
}
