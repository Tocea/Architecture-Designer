package com.tocea.codewatch.architecture.dsl.generator

import com.tocea.codewatch.architecture.dsl.architectureDSL.Datatype
import com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionEntity
import com.tocea.codewatch.architecture.dsl.architectureDSL.Field
import com.tocea.codewatch.architecture.dsl.architectureDSL.NamedEntity
import com.tocea.codewatch.architecture.dsl.architectureDSL.Parameter
import com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType
import com.tocea.codewatch.architecture.dsl.architectureDSL.Pattern
import com.tocea.codewatch.architecture.dsl.architectureDSL.Relationship
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConjunctionConstraint
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConstraint
import com.tocea.codewatch.architecture.dsl.architectureDSL.Role
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeConstraint
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.tocea.codewatch.architecture.dsl.architectureDSL.PrimitiveRole
import com.tocea.codewatch.architecture.dsl.architectureDSL.Arity
import com.tocea.codewatch.architecture.dsl.architectureDSL.Type
import com.tocea.codewatch.architecture.dsl.architectureDSL.ReferencedType


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
	

	static val documentationProvider = new MultiLineCommentDocumentationProvider

	extension IQualifiedNameProvider

	val List<String> imports = new ArrayList
	val Map<String, String> names = new HashMap // Qualified Name => Name to use

	new(ExtensionEntity entity, IQualifiedNameProvider qualifiedNameProvider) {
		this._iQualifiedNameProvider = qualifiedNameProvider
		entity.parseReferences
	}

	
	def private addName(String qualifiedName) {
		addName(qualifiedName, true)
	}
	

	def private addName(String qualifiedName, boolean addImport) {
		val simpleName = qualifiedName.split("\\.").last
		if(names.containsKey(qualifiedName))
			return null
		if(names.containsValue(simpleName))
			names.put(qualifiedName, qualifiedName)
		else {
			names.put(qualifiedName, simpleName)
			if(addImport)
				imports.add(qualifiedName)
		}
	}

	def private dispatch void parseReferences(ExtensionEntity entity) {}

	def private dispatch void parseReferences(Datatype datatype) {
		if(!datatype.primitive)
			addName(datatype.reference.qualifiedName)
	}
	
	def private dispatch isPrimitive(Type t){
		return false
	}
	
	def private dispatch isPrimitive(ReferencedType t){
		return false
	}
	
	def private dispatch isPrimitive (Datatype t){
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
	

	def private dispatch void parseReferences(PrimitiveRole primitiveRole) {
		addName(primitiveRole.type.qualifiedName)
	}

	def private dispatch void parseReferences(Pattern pattern) {
		addName(pattern.qualifiedName, false)
		for(parameter : pattern.parameters)
			addName(parameter.qualifiedName, false)
		if(pattern.superPattern==null)
			addName(ABSTRACT_PATTERN)
		else
			pattern.superPattern.parseReferences
		pattern.fields.parseFields
	}

	def private dispatch void parseReferences(Role role) {
		addName(role.qualifiedName, false)
		for(parameter : role.parameters)
			addName(parameter.qualifiedName, false)
		if(role.superRole==null)
			addName(ABSTRACT_ROLE)
		if(role.element!=null)
			addName(role.element.qualifiedName)
		else if (role.superRole==null)
			addName(ANALYSED_ELEMENT)
		if(role.superRole!=null)
			role.superRole.parseReferences
		role.fields.parseFields
	}

	def private dispatch void parseReferences(Relationship relationship) {
		addName(relationship.qualifiedName, false)
		if(relationship.superRelationship==null)
			addName(ABSTRACT_EXTENSION_RELATIONSHIP)
		else
			addName(relationship.superRelationship.qualifiedName)
		relationship.constraints.parseConstraints
		relationship.fields.parseFields
	}

	def private dispatch void parseReferences(TypeReference reference) {
		val add = !reference.reference.primitive
		addName(reference.reference.qualifiedName, add)
		for(parameter : reference.parameters)
			parameter.parseReferences
	}

	def private parseFields(Collection<Field> fields) {
		for(field : fields) {
		
			if(field.many) {
				addName(LIST)
				addName(ARRAY_LIST)
			}
			if(field.lb!=null)
				addName(BOUNDLIST)
			field.type.parseReferences
		}			
	}
	

	
	

	def private parseConstraints(Collection<RelationshipConstraint> constraints) {
		if(constraints!=null) {
			if(constraints.size>1)
				addName(DISJUNCTION_CONSTRAINT)
			for(constraint : constraints)
				constraint.parseConstraint
		}
	}

	def private parseConstraint(RelationshipConstraint constraint) {
		switch constraint {
			RelationshipConjunctionConstraint : {
				addName(TYPE_CONSTRAINT)
				addName(IRELATIONSHIP_CONSTRAINT)
				if(constraint.constraints.size>1)
					addName(CONJUNCTION_CONSTRAINT)
				for(c : constraint.constraints)
					switch c {
						TypeConstraint : {
							if(c.source!=null)
								addName(c.source.qualifiedName)
							if(c.target!=null)
								addName(c.target.qualifiedName)
						}
					} 
			}
		}
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

	def private dispatch getQualifiedName(PrimitiveRole primitiveRole) {
		primitiveRole.type.qualifiedName
	}

	def varname(Field f){
		'''_'''+ f.name
	}
	
	def print(Field field)
	'''
		«field.documentation»
		«IF field.many»
		private final «LIST.print»<«field.type.print»> «field.varname» = new «ARRAY_LIST.print»<«field.type.print»>();
		«ELSE»
			«IF field.lb!=null»
				private final «BOUNDLIST.print»<«field.type.print»> «field.varname» = new «BOUNDLIST.print»<«field.type.print»>(«field.lb.print», «IF field.ub==null»-1«ELSE»«field.ub.print»«ENDIF»);
			«ELSE»
			private «field.printType» «field.varname»;
			«ENDIF»
		«ENDIF»
	'''
	
	def printAccessor(Field field)
	'''

		public «field.printType» get«field.name.toFirstUpper»() {
			return this.«field.varname»;
		}

		«IF !field.many && field.lb==null»
			public void set«field.name.toFirstUpper»(«field.printType» _«field.name») {
				this.«field.varname» = _«field.name»;
			}
		«ENDIF»
	'''

	def print(NamedEntity entity) {
		entity.qualifiedName.print
	}

	def print(TypeReference reference) {
		if(!reference.parameters.empty)
			reference.reference.print + reference.parameters.printParameters([p | p.print])
		else
			reference.reference.print
	}

	def print(String qualifiedName) {
		if(names.containsKey(qualifiedName))
			names.get(qualifiedName)
		else
			qualifiedName
	}

	def print(Arity arity) {
		if(arity.unbound)
			"-1"
		else
			arity.value.toString
	}


	def printDeclaration(ParametrizedType type) {
		if(!type.parameters.empty)
			type.name + type.parameters.printParameters([p | p.name])
		else
			type.name
	}

	def private <T> printParameters(Collection<T> parameters, (T)=>String f)
		'''<«FOR parameter : parameters SEPARATOR ', '»«f.apply(parameter)»«ENDFOR»>'''

	def printImports()
		'''

			«FOR i : imports»
				import «i»;
			«ENDFOR»
		'''

	def getDocumentation(EObject object) {
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

	def printType(Field field) {
		if(field.many)
			'''«LIST.print»<«field.type.print»>'''
		else if(field.lb!=null)
			'''«BOUNDLIST.print»<«field.type.print»>'''
		else
			field.type.print
	}

	def print(List<RelationshipConstraint> constraints) {
		switch constraints {
			case constraints.size==1 :
				'''«(constraints.get(0) as RelationshipConjunctionConstraint).print»;'''
			case constraints.size>1 :
				'''new «DISJUNCTION_CONSTRAINT.print»(«FOR c : constraints SEPARATOR ', '»«(c as RelationshipConjunctionConstraint).print»«ENDFOR»);'''
		}
	}

	def print(RelationshipConjunctionConstraint constraint) {
		switch constraint {
			case constraint.constraints.size == 1 :
				(constraint.constraints.get(0) as TypeConstraint).print
			case constraint.constraints.size > 1 :
				'''new «CONJUNCTION_CONSTRAINT.print»(«FOR c : constraint.constraints SEPARATOR ', '»«(c as TypeConstraint).print»«ENDFOR»)'''
			default:
				""
		}
	}

	def print(TypeConstraint constraint)
		'''new «TYPE_CONSTRAINT.print»(«IF constraint.source==null»null«ELSE»«constraint.source.qualifiedName.print».class«ENDIF», «IF constraint.target==null»null«ELSE»«constraint.target.qualifiedName.print».class«ENDIF»)'''

}