package com.tocea.codewatch.architecture.dsl.generator

import com.google.inject.Guice
import com.google.inject.Inject
import com.tocea.codewatch.architecture.dsl.ArchitectureDSLRuntimeModule
import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureExtension
import com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionEntity
import com.tocea.codewatch.architecture.dsl.architectureDSL.NamedEntity
import com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType
import com.tocea.codewatch.architecture.dsl.architectureDSL.Pattern
import com.tocea.codewatch.architecture.dsl.architectureDSL.Relationship
import com.tocea.codewatch.architecture.dsl.architectureDSL.Role
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider

class ArchitectureDSLGenerator implements IGenerator {

	@Inject extension IQualifiedNameProvider

	val injector = Guice::createInjector(new ArchitectureDSLRuntimeModule)

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		(fsa as AbstractFileSystemAccess).setOutputPath("src")
		for(architectureExtension : resource.allContents.toIterable.filter(typeof(ArchitectureExtension))) {
			if(!architectureExtension.entities.filter([e| e instanceof ParametrizedType || e instanceof Relationship]).empty) {
				fsa.generateFile(architectureExtension.fullyQualifiedName.toString("/")+"/"+architectureExtension.simpleName+"Factory.java", compile(architectureExtension))
				for(entity : architectureExtension.entities.filter([e| e instanceof ParametrizedType || e instanceof Relationship]))
					fsa.generateFile(entity.fullyQualifiedName.toString("/")+".java", compile(entity))
			}
		}
	}

	def dispatch compile(ArchitectureExtension architectureExtension) {
		val helper = injector.getInstance(typeof(GeneratorHelper))
		
		var res =
		'''
			public class «architectureExtension.simpleName»Factory {

				public static final «architectureExtension.simpleName»Factory instance = new «architectureExtension.simpleName»Factory();

				«FOR entity : architectureExtension.entities.filter([e|e.toInclude])»

					/**
					 * Creates an instance of {@link «entity.fullyQualifiedName» <em>«(entity as NamedEntity).name»</em>}.
					 */
					public «IF entity instanceof ParametrizedType && !(entity as ParametrizedType).parameters.empty»«helper.printParameters(entity as ParametrizedType)» «ENDIF»«helper.printDeclaration(entity)» create«(entity as NamedEntity).name.toFirstUpper»() {
						return new «helper.printDeclaration(entity)»();
					}
				«ENDFOR»

			}
		'''
		res = "package "+architectureExtension.fullyQualifiedName+";\n"+helper.printImports+"\n"+res
		res
	}

	def dispatch compile(Pattern pattern) {
		val helper = injector.getInstance(typeof(GeneratorHelper))
		
		var res =
		'''
			«helper.printDocumentation(pattern)»
			public «IF pattern.isAbstract»abstract «ENDIF»class «helper.printDeclaration(pattern)» extends «IF pattern.superPattern==null»«helper.print(GeneratorHelper::ABSTRACT_PATTERN)»«ELSE»«helper.print(pattern.superPattern)»«ENDIF» {

				«FOR field : pattern.fields»
					«helper.print(field)»
				«ENDFOR»
				«FOR field : pattern.fields»
					«helper.printAccessors(field)»
				«ENDFOR»

			}
		'''
		res = "package "+pattern.eContainer.fullyQualifiedName+";\n"+helper.printImports+"\n"+res
		res.toString
	}

	def dispatch compile(Role role) {
		val helper = injector.getInstance(typeof(GeneratorHelper))
		
		var res=
		'''
			«helper.printDocumentation(role)»
			public «IF role.isAbstract»abstract «ENDIF»class «helper.printDeclaration(role)» extends «IF role.superRole==null»«helper.print(GeneratorHelper::ABSTRACT_ROLE)»«ELSE»«helper.print(role.superRole)»«ENDIF»<«IF role.element==null»«helper.print(GeneratorHelper::ANALYSED_ELEMENT)»«ELSE»«helper.print(role.element)»«ENDIF»> {

				«FOR field : role.fields»
					«helper.print(field)»
				«ENDFOR»
				«FOR field : role.fields»
					«helper.printAccessors(field)»
				«ENDFOR»

			}
		'''
		res = "package "+role.eContainer.fullyQualifiedName+";\n"+helper.printImports+"\n"+res
		res
	}

	def dispatch compile(Relationship relationship) {
		val helper = injector.getInstance(typeof(GeneratorHelper))

		var res =
		'''
			«helper.printDocumentation(relationship)»
			public «IF relationship.isAbstract»abstract «ENDIF»class «helper.printDeclaration(relationship)» extends «IF relationship.superRelationship==null»«helper.print(GeneratorHelper::ABSTRACT_EXTENSION_RELATIONSHIP)»«ELSE»«helper.print(relationship.superRelationship)»«ENDIF» {
				«FOR field : relationship.fields»
					«helper.print(field)»
				«ENDFOR»
				«FOR field : relationship.fields»
					«helper.printAccessors(field)»
				«ENDFOR»

				«IF relationship.constraints.size>0»
					private static final «helper.print(GeneratorHelper::IRELATIONSHIP_CONSTRAINT)» _constraint = «helper.print(relationship.constraints)»;

					@Override
					public boolean checkConstraint() {
						return «IF relationship.superRelationship!=null»super.checkConstraint() && «ENDIF»_constraint.check(this);
					}

				«ENDIF»
			}
		'''
		res = "package "+relationship.eContainer.fullyQualifiedName+";\n"+helper.printImports+"\n"+res
		res
	}

	def dispatch toInclude(ExtensionEntity entity) {
		false
	}

	def dispatch toInclude(Pattern pattern) {
		!pattern.isAbstract()
	}

	def dispatch toInclude(Role role) {
		!role.isAbstract()
	}

	def dispatch toInclude(Relationship relationship) {
		!relationship.isAbstract()
	}

	def getSimpleName(ArchitectureExtension architectureExtension) {
		architectureExtension.name.split("\\.").last.toFirstUpper
	}

	/*def dispatch printType(ParametrizedType type)
		'''«type.fullyQualifiedName»«type.printParameters»'''

	def dispatch printType(Relationship relationship) {
		relationship.fullyQualifiedName
	}

	def dispatch printType(Datatype datatype) {
		datatype.reference.fullyQualifiedName
	}

	def dispatch printType(Parameter parameter) {
		parameter.name
	}

	def dispatch printType(ExtensionEntity entity) {
		""
	}

	def printParameters(ParametrizedType type)
		'''«FOR parameter : type.parameters BEFORE '<' SEPARATOR ', ' AFTER '>'»«parameter.printType»«ENDFOR»'''*/

}
