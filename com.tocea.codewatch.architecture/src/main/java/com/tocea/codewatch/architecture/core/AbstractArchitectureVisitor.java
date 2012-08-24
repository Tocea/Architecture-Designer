package com.tocea.codewatch.architecture.core;

import com.tocea.codewatch.architecture.core.api.IAnalysedElement;
import com.tocea.codewatch.architecture.core.api.IArchitectureFile;
import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.ICallRelationship;
import com.tocea.codewatch.architecture.core.api.IDeclaredType;
import com.tocea.codewatch.architecture.core.api.IField;
import com.tocea.codewatch.architecture.core.api.IFieldReferenceDependency;
import com.tocea.codewatch.architecture.core.api.IImportReferenceDependency;
import com.tocea.codewatch.architecture.core.api.IInheritanceDependency;
import com.tocea.codewatch.architecture.core.api.IInjectionDependency;
import com.tocea.codewatch.architecture.core.api.ILibrary;
import com.tocea.codewatch.architecture.core.api.IMethod;
import com.tocea.codewatch.architecture.core.api.IParameterRelationship;
import com.tocea.codewatch.architecture.core.api.IProject;
import com.tocea.codewatch.architecture.core.api.IReferenceDependency;
import com.tocea.codewatch.architecture.core.api.IRelationship;
import com.tocea.codewatch.architecture.core.api.IReturnTypeRelationship;
import com.tocea.codewatch.architecture.core.api.IRuntimeDependency;
import com.tocea.codewatch.architecture.core.api.IType;



/**
 * This type describes a default visitor implementation for the architecture package.
 * Each visited object also visit all its contained features.
 * <p>
 */
public abstract class AbstractArchitectureVisitor implements IArchitectureVisitor{
	
	
	/**
	* This method performs the visitor behavior for a {@link IAnalysedElement} object.
	* <p>
	* Containment references (outgoingRelationships, containedElements) of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitAnalysedElement(IAnalysedElement _o){
		for(IRelationship child : _o.getOutgoingRelationships()){
			child.accept(this);
		}
		for(IAnalysedElement child : _o.getContainedElements()){
			child.accept(this);
		}
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IType} object.
	* <p>
	* Containment references (outgoingRelationships, containedElements) of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitType(IType _o){
		for(IRelationship child : _o.getOutgoingRelationships()){
			child.accept(this);
		}
		for(IAnalysedElement child : _o.getContainedElements()){
			child.accept(this);
		}
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IArchitectureFile} object.
	* <p>
	* Containment references (outgoingRelationships, containedElements) of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitArchitectureFile(IArchitectureFile _o){
		for(IRelationship child : _o.getOutgoingRelationships()){
			child.accept(this);
		}
		for(IAnalysedElement child : _o.getContainedElements()){
			child.accept(this);
		}
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IRelationship} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitRelationship(IRelationship _o){
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IInheritanceDependency} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitInheritanceDependency(IInheritanceDependency _o){
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IReferenceDependency} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitReferenceDependency(IReferenceDependency _o){
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link ILibrary} object.
	* <p>
	* Containment references (outgoingRelationships, containedElements) of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitLibrary(ILibrary _o){
		for(IRelationship child : _o.getOutgoingRelationships()){
			child.accept(this);
		}
		for(IAnalysedElement child : _o.getContainedElements()){
			child.accept(this);
		}
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IRuntimeDependency} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitRuntimeDependency(IRuntimeDependency _o){
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IInjectionDependency} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitInjectionDependency(IInjectionDependency _o){
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IFieldReferenceDependency} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitFieldReferenceDependency(IFieldReferenceDependency _o){
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IImportReferenceDependency} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitImportReferenceDependency(IImportReferenceDependency _o){
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IProject} object.
	* <p>
	* Containment references (outgoingRelationships, containedElements) of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitProject(IProject _o){
		for(IRelationship child : _o.getOutgoingRelationships()){
			child.accept(this);
		}
		for(IAnalysedElement child : _o.getContainedElements()){
			child.accept(this);
		}
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IMethod} object.
	* <p>
	* Containment references (outgoingRelationships, containedElements) of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitMethod(IMethod _o){
		for(IRelationship child : _o.getOutgoingRelationships()){
			child.accept(this);
		}
		for(IAnalysedElement child : _o.getContainedElements()){
			child.accept(this);
		}
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IReturnTypeRelationship} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitReturnTypeRelationship(IReturnTypeRelationship _o){
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IParameterRelationship} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitParameterRelationship(IParameterRelationship _o){
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link ICallRelationship} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitCallRelationship(ICallRelationship _o){
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IField} object.
	* <p>
	* Containment references (outgoingRelationships, containedElements) of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitField(IField _o){
		for(IRelationship child : _o.getOutgoingRelationships()){
			child.accept(this);
		}
		for(IAnalysedElement child : _o.getContainedElements()){
			child.accept(this);
		}
	}	
	
	
	/**
	* This method performs the visitor behavior for a {@link IDeclaredType} object.
	* <p>
	* Containment references () of the object 
	* will also be visited.
	*
	* @param _o 
	*			the object to visit
	*/
	public void visitDeclaredType(IDeclaredType _o){
	}	
}
