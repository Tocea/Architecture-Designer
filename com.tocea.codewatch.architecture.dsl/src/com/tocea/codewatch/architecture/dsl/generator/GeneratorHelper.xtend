package com.tocea.codewatch.architecture.dsl.generator

import com.tocea.codewatch.architecture.dsl.architectureDSL.Datatype
import com.tocea.codewatch.architecture.dsl.architectureDSL.Field
import com.tocea.codewatch.architecture.dsl.architectureDSL.NamedEntity
import com.tocea.codewatch.architecture.dsl.architectureDSL.Parameter
import com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType
import com.tocea.codewatch.architecture.dsl.architectureDSL.PrimitiveRole
import com.tocea.codewatch.architecture.dsl.architectureDSL.Relationship
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConjunctionConstraint
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConstraint
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeConstraint
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider

import static com.tocea.codewatch.architecture.dsl.generator.GeneratorHelper.*

class GeneratorHelper {

	public static val LIST = "java.util.List"
	public static val ARRAY_LIST = "java.util.ArrayList"
	public static val BOUNDLIST = "com.tocea.codewatch.architecture.extension.util.BoundList"

	public static val ABSTRACT_PATTERN = "com.tocea.codewatch.architecture.extension.AbstractPattern"
	public static val ABSTRACT_ROLE = "com.tocea.codewatch.architecture.extension.AbstractRole"
	public static val ABSTRACT_EXTENSION_RELATIONSHIP = "com.tocea.codewatch.architecture.extension.AbstractExtensionRelationship"
	public static val DISJUNCTION_CONSTRAINT = "com.tocea.codewatch.architecture.extension.DisjunctionConstraint"
	public static val CONJUNCTION_CONSTRAINT = "com.tocea.codewatch.architecture.extension.ConjunctionConstraint"
	public static val TYPE_CONSTRAINT = "com.tocea.codewatch.architecture.extension.TypeConstraint"
	public static val IRELATIONSHIP_CONSTRAINT = "com.tocea.codewatch.architecture.extension.api.IRelationshipConstraint"

	public static val ANALYSED_ELEMENT = "com.tocea.codewatch.architecture.core.api.IAnalysedElement"
	public static val TYPE = "com.tocea.codewatch.architecture.core.api.IType"
	public static val ARCHITECTURE_FILE = "com.tocea.codewatch.architecture.core.api.IArchitectureFile"
	public static val LIBRARY = "com.tocea.codewatch.architecture.core.api.ILibrary"
	public static val PROJECT = "com.tocea.codewatch.architecture.core.api.IProject"
	public static val METHOD = "com.tocea.codewatch.architecture.core.api.IMethod"
	public static val FIELD = "com.tocea.codewatch.architecture.core.api.IField"
	
	extension IQualifiedNameProvider

	val documentationProvider = new MultiLineCommentDocumentationProvider

	val List<String> imports = new ArrayList
	val Map<String, String> names = new HashMap // Qualified Name => Name to use

	new(IQualifiedNameProvider qualifiedNameProvider) {
		this._iQualifiedNameProvider = qualifiedNameProvider
	}

	def private printNoImport(String qualifiedName) {
		print(qualifiedName, false)
	}

	def private print(String qualifiedName, boolean addImport) {
		if(names.containsKey(qualifiedName))
			names.get(qualifiedName)
		else {
			val simpleName = qualifiedName.simpleName
			if(names.containsValue(simpleName)) {
				names.put(qualifiedName, qualifiedName)
				qualifiedName
			}
			else {
				names.put(qualifiedName, simpleName)
				if(addImport)
					imports.add(qualifiedName) 
				simpleName
			}
		}
	}

	def dispatch print(String qualifiedName) {
		print(qualifiedName, true)
	}

	def dispatch print(Field field) {
		switch field {
			case field.many :
				'''private «LIST.print»<«field.type.print»> «field.name» = new «ARRAY_LIST.print»<«field.type.print»>();'''
			case field.lb!=null:
				'''private «LIST.print»<«field.type.print»> «field.name» = new «BOUNDLIST.print»<«field.type.print»>();'''
			default:
				'''private «field.type.print» «field.name»;'''
		}		
	}

	def dispatch print(TypeReference reference)
		'''«reference.reference.print»«FOR parameter : reference.parameters BEFORE '<' SEPARATOR ', ' AFTER '>'»«parameter.print»«ENDFOR»'''

	def dispatch print(Parameter parameter) {
		parameter.name.printNoImport
	}

	def dispatch print(NamedEntity entity) {
		entity.qualifiedName.print
	}

	def dispatch print(Datatype datatype) {
		if(datatype.primitive)
			datatype.qualifiedName.printNoImport
		else
			datatype.qualifiedName.print
	}

	def dispatch print(List<RelationshipConstraint> constraints) {
		switch constraints {
			case constraints.size==1 :
				'''«(constraints.get(0) as RelationshipConjunctionConstraint).print»;'''
			case constraints.size>1 :
				'''new «DISJUNCTION_CONSTRAINT.print»(«FOR c : constraints SEPARATOR ', '»«(c as RelationshipConjunctionConstraint).print»«ENDFOR»);'''
		}
	}

	def dispatch print(RelationshipConjunctionConstraint constraint) {
		switch constraint {
			case constraint.constraints.size == 1 :
				(constraint.constraints.get(0) as TypeConstraint).print
			case constraint.constraints.size > 1 :
				'''new «CONJUNCTION_CONSTRAINT.print»(«FOR c : constraint.constraints SEPARATOR ', '»«(c as TypeConstraint).print»«ENDFOR»)'''
			default:
				""
		}
	}

	def dispatch print(TypeConstraint constraint)
		'''new «TYPE_CONSTRAINT.print»(«IF constraint.source==null»null«ELSE»«constraint.source.qualifiedName.print».class«ENDIF», «IF constraint.target==null»null«ELSE»«constraint.target.qualifiedName.print».class«ENDIF»)'''

	def printAccessors(Field field)
	'''

		/**
		 * Getter for field «field.name».
		 */
		public «IF field.many || field.lb!=null»«LIST.print»<«field.type.print»>«ELSE»«field.type.print»«ENDIF» get«field.name.toFirstUpper»() {
			return «field.name»;
		}
		«IF !field.many && field.lb==null»

			/**
			 * Setter for field «field.name».
			 */
			public void set«field.name.toFirstUpper»(«field.type.print» «field.name») {
				this.«field.name» = «field.name»;
			}
		«ENDIF»
	'''
	
	def printDocumentation(EObject object) {
		val doc = documentationProvider.getDocumentation(object)
		if(doc!=null)  {
			'''
				/**
				«FOR line : doc.split("\\r?\\n")»
					«" * "»«line»
				«ENDFOR»
				 */
			'''
		}
	}

	def printImports() {
		Collections::sort(imports)
		'''

			«FOR i : imports»
				import «i»;
			«ENDFOR»
		'''
	}

	def dispatch printDeclaration(ParametrizedType type)
		'''«type.name.printNoImport»«type.printParameters»'''

	def dispatch printDeclaration(Relationship relationship) {
		relationship.qualifiedName.printNoImport
	}

	def printParameters(ParametrizedType type)
		'''«FOR parameter : type.parameters BEFORE'<' SEPARATOR ', ' AFTER '>'»«parameter.name»«ENDFOR»'''

	def private getSimpleName(String qualifiedName) {
		qualifiedName.split("\\.").last
	}

	def private dispatch getQualifiedName(NamedEntity entity) {
		entity.fullyQualifiedName.toString
	}

	def private dispatch getQualifiedName(Parameter parameter) {
		parameter.name
	}

	def private dispatch getQualifiedName(Datatype datatype) {
		datatype.reference.qualifiedName
	}

	def private dispatch getQualifiedName(PrimitiveRole role) {
		role.type.qualifiedName
	}

	def private isPrimitive(Datatype t){
		switch( t.reference.type.qualifiedName){
			case "boolean":
				return true
			case "int":
				return true
			case "long":
				return true
			case "double":
				return true
			case "float":
				return true
			case "byte":
				return true
			case "char":
				return true
		}
		return false
	}

}