
package com.tocea.codewatch.architecture.factory;



import com.tocea.codewatch.architecture.core.ArchitectureFile;
import com.tocea.codewatch.architecture.core.CallRelationship;
import com.tocea.codewatch.architecture.core.DeclaredType;
import com.tocea.codewatch.architecture.core.Field;
import com.tocea.codewatch.architecture.core.FieldReferenceDependency;
import com.tocea.codewatch.architecture.core.ImportReferenceDependency;
import com.tocea.codewatch.architecture.core.InheritanceDependency;
import com.tocea.codewatch.architecture.core.InjectionDependency;
import com.tocea.codewatch.architecture.core.Library;
import com.tocea.codewatch.architecture.core.Method;
import com.tocea.codewatch.architecture.core.ParameterRelationship;
import com.tocea.codewatch.architecture.core.Project;
import com.tocea.codewatch.architecture.core.ReferenceDependency;
import com.tocea.codewatch.architecture.core.ReturnTypeRelationship;
import com.tocea.codewatch.architecture.core.RuntimeDependency;
import com.tocea.codewatch.architecture.core.Type;
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
import com.tocea.codewatch.architecture.factory.api.IArchitectureFactory;



/**
 * This type describes the default implementation factory for the architecture package
 * <p>
 */
public class ArchitectureFactory implements IArchitectureFactory
{
    
    
    /**
     * This method creates a new Type instance.
     * 
     * @param _name
     *            name of the Type
     * @param _qualifiedName
     *            qualifiedName of the Type
     * @return a new Type instance
     */
    public IType newType(final String _name, final String _qualifiedName) {
    
    
        IType newType = new Type();
        newType.setName(_name);
        newType.setQualifiedName(_qualifiedName);
        return newType;
    }
    
    
    /**
     * This method creates a new ArchitectureFile instance.
     * 
     * @param _name
     *            name of the ArchitectureFile
     * @return a new ArchitectureFile instance
     */
    public IArchitectureFile newArchitectureFile(final String _name) {
    
    
        IArchitectureFile newArchitectureFile = new ArchitectureFile();
        newArchitectureFile.setName(_name);
        return newArchitectureFile;
    }
    
    
    /**
     * This method creates a new InheritanceDependency instance.
     * 
     * @param _target
     *            target of the InheritanceDependency
     * @param _source
     *            source of the InheritanceDependency
     * @return a new InheritanceDependency instance
     */
    public IInheritanceDependency newInheritanceDependency(final IAnalysedElement _target, final IAnalysedElement _source) {
    
    
        IInheritanceDependency newInheritanceDependency = new InheritanceDependency();
        newInheritanceDependency.setTarget(_target);
        newInheritanceDependency.setSource(_source);
        _target.getIncomingRelationships().add(newInheritanceDependency);
        _source.getOutgoingRelationships().add(newInheritanceDependency);
        return newInheritanceDependency;
    }
    
    
    /**
     * This method creates a new ReferenceDependency instance.
     * 
     * @param _target
     *            target of the ReferenceDependency
     * @param _source
     *            source of the ReferenceDependency
     * @return a new ReferenceDependency instance
     */
    public IReferenceDependency newReferenceDependency(final IAnalysedElement _target, final IAnalysedElement _source) {
    
    
        IReferenceDependency newReferenceDependency = new ReferenceDependency();
        newReferenceDependency.setTarget(_target);
        newReferenceDependency.setSource(_source);
        _target.getIncomingRelationships().add(newReferenceDependency);
        _source.getOutgoingRelationships().add(newReferenceDependency);
        return newReferenceDependency;
    }
    
    
    /**
     * This method creates a new Library instance.
     * 
     * @param _name
     *            name of the Library
     * @return a new Library instance
     */
    public ILibrary newLibrary(final String _name) {
    
    
        ILibrary newLibrary = new Library();
        newLibrary.setName(_name);
        return newLibrary;
    }
    
    
    /**
     * This method creates a new RuntimeDependency instance.
     * 
     * @param _target
     *            target of the RuntimeDependency
     * @param _source
     *            source of the RuntimeDependency
     * @return a new RuntimeDependency instance
     */
    public IRuntimeDependency newRuntimeDependency(final IAnalysedElement _target, final IAnalysedElement _source) {
    
    
        IRuntimeDependency newRuntimeDependency = new RuntimeDependency();
        newRuntimeDependency.setTarget(_target);
        newRuntimeDependency.setSource(_source);
        _target.getIncomingRelationships().add(newRuntimeDependency);
        _source.getOutgoingRelationships().add(newRuntimeDependency);
        return newRuntimeDependency;
    }
    
    
    /**
     * This method creates a new InjectionDependency instance.
     * 
     * @param _target
     *            target of the InjectionDependency
     * @param _source
     *            source of the InjectionDependency
     * @return a new InjectionDependency instance
     */
    public IInjectionDependency newInjectionDependency(final IAnalysedElement _target, final IAnalysedElement _source) {
    
    
        IInjectionDependency newInjectionDependency = new InjectionDependency();
        newInjectionDependency.setTarget(_target);
        newInjectionDependency.setSource(_source);
        _target.getIncomingRelationships().add(newInjectionDependency);
        _source.getOutgoingRelationships().add(newInjectionDependency);
        return newInjectionDependency;
    }
    
    
    /**
     * This method creates a new FieldReferenceDependency instance.
     * 
     * @param _target
     *            target of the FieldReferenceDependency
     * @param _source
     *            source of the FieldReferenceDependency
     * @return a new FieldReferenceDependency instance
     */
    public IFieldReferenceDependency newFieldReferenceDependency(final IAnalysedElement _target, final IAnalysedElement _source) {
    
    
        IFieldReferenceDependency newFieldReferenceDependency = new FieldReferenceDependency();
        newFieldReferenceDependency.setTarget(_target);
        newFieldReferenceDependency.setSource(_source);
        _target.getIncomingRelationships().add(newFieldReferenceDependency);
        _source.getOutgoingRelationships().add(newFieldReferenceDependency);
        return newFieldReferenceDependency;
    }
    
    
    /**
     * This method creates a new ImportReferenceDependency instance.
     * 
     * @param _target
     *            target of the ImportReferenceDependency
     * @param _source
     *            source of the ImportReferenceDependency
     * @return a new ImportReferenceDependency instance
     */
    public IImportReferenceDependency newImportReferenceDependency(final IAnalysedElement _target, final IAnalysedElement _source) {
    
    
        IImportReferenceDependency newImportReferenceDependency = new ImportReferenceDependency();
        newImportReferenceDependency.setTarget(_target);
        newImportReferenceDependency.setSource(_source);
        _target.getIncomingRelationships().add(newImportReferenceDependency);
        _source.getOutgoingRelationships().add(newImportReferenceDependency);
        return newImportReferenceDependency;
    }
    
    
    /**
     * This method creates a new Project instance.
     * 
     * @param _name
     *            name of the Project
     * @return a new Project instance
     */
    public IProject newProject(final String _name) {
    
    
        IProject newProject = new Project();
        newProject.setName(_name);
        return newProject;
    }
    
    
    /**
     * This method creates a new Method instance.
     * 
     * @param _name
     *            name of the Method
     * @return a new Method instance
     */
    public IMethod newMethod(final String _name) {
    
    
        IMethod newMethod = new Method();
        newMethod.setName(_name);
        return newMethod;
    }
    
    
    /**
     * This method creates a new ReturnTypeRelationship instance.
     * 
     * @param _target
     *            target of the ReturnTypeRelationship
     * @param _source
     *            source of the ReturnTypeRelationship
     * @return a new ReturnTypeRelationship instance
     */
    public IReturnTypeRelationship newReturnTypeRelationship(final IAnalysedElement _target, final IAnalysedElement _source) {
    
    
        IReturnTypeRelationship newReturnTypeRelationship = new ReturnTypeRelationship();
        newReturnTypeRelationship.setTarget(_target);
        newReturnTypeRelationship.setSource(_source);
        _target.getIncomingRelationships().add(newReturnTypeRelationship);
        _source.getOutgoingRelationships().add(newReturnTypeRelationship);
        return newReturnTypeRelationship;
    }
    
    
    /**
     * This method creates a new ParameterRelationship instance.
     * 
     * @param _target
     *            target of the ParameterRelationship
     * @param _source
     *            source of the ParameterRelationship
     * @return a new ParameterRelationship instance
     */
    public IParameterRelationship newParameterRelationship(final IAnalysedElement _target, final IAnalysedElement _source) {
    
    
        IParameterRelationship newParameterRelationship = new ParameterRelationship();
        newParameterRelationship.setTarget(_target);
        newParameterRelationship.setSource(_source);
        _target.getIncomingRelationships().add(newParameterRelationship);
        _source.getOutgoingRelationships().add(newParameterRelationship);
        return newParameterRelationship;
    }
    
    
    /**
     * This method creates a new CallRelationship instance.
     * 
     * @param _target
     *            target of the CallRelationship
     * @param _source
     *            source of the CallRelationship
     * @return a new CallRelationship instance
     */
    public ICallRelationship newCallRelationship(final IAnalysedElement _target, final IAnalysedElement _source) {
    
    
        ICallRelationship newCallRelationship = new CallRelationship();
        newCallRelationship.setTarget(_target);
        newCallRelationship.setSource(_source);
        _target.getIncomingRelationships().add(newCallRelationship);
        _source.getOutgoingRelationships().add(newCallRelationship);
        return newCallRelationship;
    }
    
    
    /**
     * This method creates a new Field instance.
     * 
     * @param _name
     *            name of the Field
     * @return a new Field instance
     */
    public IField newField(final String _name) {
    
    
        IField newField = new Field();
        newField.setName(_name);
        return newField;
    }
    
    
    /**
     * This method creates a new DeclaredType instance.
     * 
     * @param _target
     *            target of the DeclaredType
     * @param _source
     *            source of the DeclaredType
     * @return a new DeclaredType instance
     */
    public IDeclaredType newDeclaredType(final IAnalysedElement _target, final IAnalysedElement _source) {
    
    
        IDeclaredType newDeclaredType = new DeclaredType();
        newDeclaredType.setTarget(_target);
        newDeclaredType.setSource(_source);
        return newDeclaredType;
    }
}
