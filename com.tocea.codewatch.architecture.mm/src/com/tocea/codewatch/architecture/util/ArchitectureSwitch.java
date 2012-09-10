/**
 */
package com.tocea.codewatch.architecture.util;

import com.tocea.codewatch.architecture.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.tocea.codewatch.architecture.ArchitecturePackage
 * @generated
 */
public class ArchitectureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureSwitch() {
		if (modelPackage == null) {
			modelPackage = ArchitecturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArchitecturePackage.ANALYSED_ELEMENT: {
				AnalysedElement analysedElement = (AnalysedElement)theEObject;
				T result = caseAnalysedElement(analysedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseAnalysedElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.ARCHITECTURE_FILE: {
				ArchitectureFile architectureFile = (ArchitectureFile)theEObject;
				T result = caseArchitectureFile(architectureFile);
				if (result == null) result = caseAnalysedElement(architectureFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.INHERITANCE_DEPENDENCY: {
				InheritanceDependency inheritanceDependency = (InheritanceDependency)theEObject;
				T result = caseInheritanceDependency(inheritanceDependency);
				if (result == null) result = caseDependency(inheritanceDependency);
				if (result == null) result = caseRelationship(inheritanceDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.REFERENCE_DEPENDENCY: {
				ReferenceDependency referenceDependency = (ReferenceDependency)theEObject;
				T result = caseReferenceDependency(referenceDependency);
				if (result == null) result = caseDependency(referenceDependency);
				if (result == null) result = caseRelationship(referenceDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseRelationship(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseAnalysedElement(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.RUNTIME_DEPENDENCY: {
				RuntimeDependency runtimeDependency = (RuntimeDependency)theEObject;
				T result = caseRuntimeDependency(runtimeDependency);
				if (result == null) result = caseDependency(runtimeDependency);
				if (result == null) result = caseRelationship(runtimeDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.INJECTION_DEPENDENCY: {
				InjectionDependency injectionDependency = (InjectionDependency)theEObject;
				T result = caseInjectionDependency(injectionDependency);
				if (result == null) result = caseRuntimeDependency(injectionDependency);
				if (result == null) result = caseDependency(injectionDependency);
				if (result == null) result = caseRelationship(injectionDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.FIELD_REFERENCE_DEPENDENCY: {
				FieldReferenceDependency fieldReferenceDependency = (FieldReferenceDependency)theEObject;
				T result = caseFieldReferenceDependency(fieldReferenceDependency);
				if (result == null) result = caseReferenceDependency(fieldReferenceDependency);
				if (result == null) result = caseDependency(fieldReferenceDependency);
				if (result == null) result = caseRelationship(fieldReferenceDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.IMPORT_REFERENCE_DEPENDENCY: {
				ImportReferenceDependency importReferenceDependency = (ImportReferenceDependency)theEObject;
				T result = caseImportReferenceDependency(importReferenceDependency);
				if (result == null) result = caseReferenceDependency(importReferenceDependency);
				if (result == null) result = caseDependency(importReferenceDependency);
				if (result == null) result = caseRelationship(importReferenceDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = caseAnalysedElement(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseAnalysedElement(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.RETURN_TYPE_RELATIONSHIP: {
				ReturnTypeRelationship returnTypeRelationship = (ReturnTypeRelationship)theEObject;
				T result = caseReturnTypeRelationship(returnTypeRelationship);
				if (result == null) result = caseRelationship(returnTypeRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.PARAMETER_RELATIONSHIP: {
				ParameterRelationship parameterRelationship = (ParameterRelationship)theEObject;
				T result = caseParameterRelationship(parameterRelationship);
				if (result == null) result = caseRelationship(parameterRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.CALL_RELATIONSHIP: {
				CallRelationship callRelationship = (CallRelationship)theEObject;
				T result = caseCallRelationship(callRelationship);
				if (result == null) result = caseRelationship(callRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseAnalysedElement(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.DECLARED_TYPE: {
				DeclaredType declaredType = (DeclaredType)theEObject;
				T result = caseDeclaredType(declaredType);
				if (result == null) result = caseRelationship(declaredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysedElement(AnalysedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitectureFile(ArchitectureFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritanceDependency(InheritanceDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceDependency(ReferenceDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeDependency(RuntimeDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Injection Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Injection Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInjectionDependency(InjectionDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Reference Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Reference Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldReferenceDependency(FieldReferenceDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Reference Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Reference Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportReferenceDependency(ImportReferenceDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnTypeRelationship(ReturnTypeRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterRelationship(ParameterRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallRelationship(CallRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredType(DeclaredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArchitectureSwitch
