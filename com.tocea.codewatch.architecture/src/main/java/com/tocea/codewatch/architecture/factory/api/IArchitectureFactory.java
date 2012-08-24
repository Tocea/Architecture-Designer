package com.tocea.codewatch.architecture.factory.api;

import com.tocea.codewatch.architecture.core.api.IAnalysedElement;
import com.tocea.codewatch.architecture.core.api.IArchitectureFile;
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
import com.tocea.codewatch.architecture.core.api.IReturnTypeRelationship;
import com.tocea.codewatch.architecture.core.api.IRuntimeDependency;
import com.tocea.codewatch.architecture.core.api.IType;

public interface IArchitectureFactory {
	
	
		 /**
	     * This method creates a new Type instance.
	     * 
	     * @param _name 
	     *			  name of the Type
	     * @param _qualifiedName 
	     *			  qualifiedName of the Type
	     * @return a new Type instance
	     */
		IType newType(final String _name, final String _qualifiedName);
	
	
		 /**
	     * This method creates a new ArchitectureFile instance.
	     * 
	     * @param _name 
	     *			  name of the ArchitectureFile
	     * @return a new ArchitectureFile instance
	     */
		IArchitectureFile newArchitectureFile(final String _name);
	
	
		 /**
	     * This method creates a new InheritanceDependency instance.
	     * 
	     * @param _target 
	     *			  target of the InheritanceDependency
	     * @param _source 
	     *			  source of the InheritanceDependency
	     * @return a new InheritanceDependency instance
	     */
		IInheritanceDependency newInheritanceDependency(final IAnalysedElement _target, final IAnalysedElement _source);
	
	
		 /**
	     * This method creates a new ReferenceDependency instance.
	     * 
	     * @param _target 
	     *			  target of the ReferenceDependency
	     * @param _source 
	     *			  source of the ReferenceDependency
	     * @return a new ReferenceDependency instance
	     */
		IReferenceDependency newReferenceDependency(final IAnalysedElement _target, final IAnalysedElement _source);
	
	
		 /**
	     * This method creates a new Library instance.
	     * 
	     * @param _name 
	     *			  name of the Library
	     * @return a new Library instance
	     */
		ILibrary newLibrary(final String _name);
	
	
		 /**
	     * This method creates a new RuntimeDependency instance.
	     * 
	     * @param _target 
	     *			  target of the RuntimeDependency
	     * @param _source 
	     *			  source of the RuntimeDependency
	     * @return a new RuntimeDependency instance
	     */
		IRuntimeDependency newRuntimeDependency(final IAnalysedElement _target, final IAnalysedElement _source);
	
	
		 /**
	     * This method creates a new InjectionDependency instance.
	     * 
	     * @param _target 
	     *			  target of the InjectionDependency
	     * @param _source 
	     *			  source of the InjectionDependency
	     * @return a new InjectionDependency instance
	     */
		IInjectionDependency newInjectionDependency(final IAnalysedElement _target, final IAnalysedElement _source);
	
	
		 /**
	     * This method creates a new FieldReferenceDependency instance.
	     * 
	     * @param _target 
	     *			  target of the FieldReferenceDependency
	     * @param _source 
	     *			  source of the FieldReferenceDependency
	     * @return a new FieldReferenceDependency instance
	     */
		IFieldReferenceDependency newFieldReferenceDependency(final IAnalysedElement _target, final IAnalysedElement _source);
	
	
		 /**
	     * This method creates a new ImportReferenceDependency instance.
	     * 
	     * @param _target 
	     *			  target of the ImportReferenceDependency
	     * @param _source 
	     *			  source of the ImportReferenceDependency
	     * @return a new ImportReferenceDependency instance
	     */
		IImportReferenceDependency newImportReferenceDependency(final IAnalysedElement _target, final IAnalysedElement _source);
	
	
		 /**
	     * This method creates a new Project instance.
	     * 
	     * @param _name 
	     *			  name of the Project
	     * @return a new Project instance
	     */
		IProject newProject(final String _name);
	
	
		 /**
	     * This method creates a new Method instance.
	     * 
	     * @param _name 
	     *			  name of the Method
	     * @return a new Method instance
	     */
		IMethod newMethod(final String _name);
	
	
		 /**
	     * This method creates a new ReturnTypeRelationship instance.
	     * 
	     * @param _target 
	     *			  target of the ReturnTypeRelationship
	     * @param _source 
	     *			  source of the ReturnTypeRelationship
	     * @return a new ReturnTypeRelationship instance
	     */
		IReturnTypeRelationship newReturnTypeRelationship(final IAnalysedElement _target, final IAnalysedElement _source);
	
	
		 /**
	     * This method creates a new ParameterRelationship instance.
	     * 
	     * @param _target 
	     *			  target of the ParameterRelationship
	     * @param _source 
	     *			  source of the ParameterRelationship
	     * @return a new ParameterRelationship instance
	     */
		IParameterRelationship newParameterRelationship(final IAnalysedElement _target, final IAnalysedElement _source);
	
	
		 /**
	     * This method creates a new CallRelationship instance.
	     * 
	     * @param _target 
	     *			  target of the CallRelationship
	     * @param _source 
	     *			  source of the CallRelationship
	     * @return a new CallRelationship instance
	     */
		ICallRelationship newCallRelationship(final IAnalysedElement _target, final IAnalysedElement _source);
	
	
		 /**
	     * This method creates a new Field instance.
	     * 
	     * @param _name 
	     *			  name of the Field
	     * @return a new Field instance
	     */
		IField newField(final String _name);
	
	
		 /**
	     * This method creates a new DeclaredType instance.
	     * 
	     * @param _target 
	     *			  target of the DeclaredType
	     * @param _source 
	     *			  source of the DeclaredType
	     * @return a new DeclaredType instance
	     */
		IDeclaredType newDeclaredType(final IAnalysedElement _target, final IAnalysedElement _source);
}
