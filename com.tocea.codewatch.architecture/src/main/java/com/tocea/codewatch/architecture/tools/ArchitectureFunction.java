
package com.tocea.codewatch.architecture.tools;



import com.tocea.codewatch.architecture.core.AbstractArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IAnalysedElement;
import com.tocea.codewatch.architecture.core.api.IArchitectureFile;
import com.tocea.codewatch.architecture.core.api.IArchitectureVisitable;
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
 * This type describe an abstract function that can be applied to any instance of {@link IArchitectureVisitable}. Override the evaluate
 * methods to customize behaviors.
 * 
 * @param <T>
 */
public abstract class ArchitectureFunction<T>
{
    
    
    private final FunctionVisitor dispatch = new FunctionVisitor();
    
    
    
    /**
     * This method apply the function to a visitable object for an array of arguments.
     * It call the evaluate function for the deepest type in the inheritance hierarchy. If the result is null
     * then the evaluation is based on the type supertype.
     * 
     * @param _o
     * @param args
     * @return
     */
    public T apply(final IArchitectureVisitable _o, final Object... args) {
    
    
        dispatch.args = args;
        _o.accept(dispatch);
        return dispatch.result;
    }
    
    
    protected T evaluateAnalysedElement(final IAnalysedElement _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateType(final IType _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateArchitectureFile(final IArchitectureFile _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateRelationship(final IRelationship _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateInheritanceDependency(final IInheritanceDependency _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateReferenceDependency(final IReferenceDependency _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateLibrary(final ILibrary _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateRuntimeDependency(final IRuntimeDependency _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateInjectionDependency(final IInjectionDependency _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateFieldReferenceDependency(final IFieldReferenceDependency _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateImportReferenceDependency(final IImportReferenceDependency _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateProject(final IProject _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateMethod(final IMethod _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateReturnTypeRelationship(final IReturnTypeRelationship _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateParameterRelationship(final IParameterRelationship _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateCallRelationship(final ICallRelationship _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateField(final IField _o, final Object... args) {
    
    
        return null;
    }
    
    
    protected T evaluateDeclaredType(final IDeclaredType _o, final Object... args) {
    
    
        return null;
    }
    
    
    
    private class FunctionVisitor extends AbstractArchitectureVisitor
    {
        
        
        private T        result;
        private Object[] args;
        
        
        
        @Override
        public void visitAnalysedElement(IAnalysedElement _o) {
        
        
            result = evaluateAnalysedElement(_o, args);
        }
        
        
        @Override
        public void visitType(IType _o) {
        
        
            result = evaluateType(_o, args);
            if (result == null) {
                result = evaluateAnalysedElement(_o, args);
            }
        }
        
        
        @Override
        public void visitArchitectureFile(IArchitectureFile _o) {
        
        
            result = evaluateArchitectureFile(_o, args);
            if (result == null) {
                result = evaluateAnalysedElement(_o, args);
            }
        }
        
        
        @Override
        public void visitRelationship(IRelationship _o) {
        
        
            result = evaluateRelationship(_o, args);
        }
        
        
        @Override
        public void visitInheritanceDependency(IInheritanceDependency _o) {
        
        
            result = evaluateInheritanceDependency(_o, args);
            if (result == null) {
                result = evaluateRelationship(_o, args);
            }
        }
        
        
        @Override
        public void visitReferenceDependency(IReferenceDependency _o) {
        
        
            result = evaluateReferenceDependency(_o, args);
            if (result == null) {
                result = evaluateRelationship(_o, args);
            }
        }
        
        
        @Override
        public void visitLibrary(ILibrary _o) {
        
        
            result = evaluateLibrary(_o, args);
            if (result == null) {
                result = evaluateAnalysedElement(_o, args);
            }
        }
        
        
        @Override
        public void visitRuntimeDependency(IRuntimeDependency _o) {
        
        
            result = evaluateRuntimeDependency(_o, args);
            if (result == null) {
                result = evaluateRelationship(_o, args);
            }
        }
        
        
        @Override
        public void visitInjectionDependency(IInjectionDependency _o) {
        
        
            result = evaluateInjectionDependency(_o, args);
            if (result == null) {
                result = evaluateRuntimeDependency(_o, args);
            }
        }
        
        
        @Override
        public void visitFieldReferenceDependency(IFieldReferenceDependency _o) {
        
        
            result = evaluateFieldReferenceDependency(_o, args);
            if (result == null) {
                result = evaluateReferenceDependency(_o, args);
            }
        }
        
        
        @Override
        public void visitImportReferenceDependency(IImportReferenceDependency _o) {
        
        
            result = evaluateImportReferenceDependency(_o, args);
            if (result == null) {
                result = evaluateReferenceDependency(_o, args);
            }
        }
        
        
        @Override
        public void visitProject(IProject _o) {
        
        
            result = evaluateProject(_o, args);
            if (result == null) {
                result = evaluateAnalysedElement(_o, args);
            }
        }
        
        
        @Override
        public void visitMethod(IMethod _o) {
        
        
            result = evaluateMethod(_o, args);
            if (result == null) {
                result = evaluateAnalysedElement(_o, args);
            }
        }
        
        
        @Override
        public void visitReturnTypeRelationship(IReturnTypeRelationship _o) {
        
        
            result = evaluateReturnTypeRelationship(_o, args);
            if (result == null) {
                result = evaluateRelationship(_o, args);
            }
        }
        
        
        @Override
        public void visitParameterRelationship(IParameterRelationship _o) {
        
        
            result = evaluateParameterRelationship(_o, args);
            if (result == null) {
                result = evaluateRelationship(_o, args);
            }
        }
        
        
        @Override
        public void visitCallRelationship(ICallRelationship _o) {
        
        
            result = evaluateCallRelationship(_o, args);
            if (result == null) {
                result = evaluateRelationship(_o, args);
            }
        }
        
        
        @Override
        public void visitField(IField _o) {
        
        
            result = evaluateField(_o, args);
            if (result == null) {
                result = evaluateAnalysedElement(_o, args);
            }
        }
        
        
        @Override
        public void visitDeclaredType(IDeclaredType _o) {
        
        
            result = evaluateDeclaredType(_o, args);
            if (result == null) {
                result = evaluateRelationship(_o, args);
            }
        }
    }
}
