package com.tocea.codewatch.architecture.dsl.generator

import com.google.inject.Inject
import com.tocea.annotations.factory.AnnotationsFactory
import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureExtension
import com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionEntity
import com.tocea.codewatch.architecture.dsl.architectureDSL.Field
import com.tocea.codewatch.architecture.dsl.architectureDSL.NamedEntity
import com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType
import com.tocea.codewatch.architecture.dsl.architectureDSL.Pattern
import com.tocea.codewatch.architecture.dsl.architectureDSL.Relationship
import com.tocea.codewatch.architecture.dsl.architectureDSL.Role
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.xtext.generator.AbstractFileSystemAccess
import java.util.ArrayList
import com.tocea.annotations.api.IAnnotationType
import com.tocea.annotations.xml.AnnotationsXMLTools

class ArchitectureDSLGenerator implements IGenerator {

	@Inject extension IQualifiedNameProvider

	val annotationsFactory = new AnnotationsFactory

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val project = ResourcesPlugin::workspace.root.getFile(new Path(resource.URI.toPlatformString(true))).project
		val propertiesHelper = new PropertiesHelper(project)
		(fsa as AbstractFileSystemAccess).setOutputPath(propertiesHelper.outputPath)
		val annotationTypes = new ArrayList<IAnnotationType>
		for(architectureExtension : resource.allContents.toIterable.filter(typeof(ArchitectureExtension))) {
			val entities = architectureExtension.entities.filter([e| e instanceof ParametrizedType || e instanceof Relationship])
			if(!entities.empty) {
				fsa.generateFile(architectureExtension.fullyQualifiedName.toString("/")+"/"+architectureExtension.simpleName+"Factory.java", compile(architectureExtension))
				for(entity : entities) {
					fsa.generateFile(entity.fullyQualifiedName.toString("/")+".java", compile(entity))
					if(entity instanceof Role)
						annotationTypes.add((entity as Role).annotationType)
				}
			}
		}
		val name = resource.URI.trimFileExtension.lastSegment.split("/").last+".xml"
		val file = propertiesHelper.getAnnotationFile(name).location.toFile
		AnnotationsXMLTools::serialize(file, annotationTypes as IAnnotationType[])
	}
	


	def dispatch compile(ArchitectureExtension architectureExtension) {
		val helper = new GeneratorHelper(this._iQualifiedNameProvider)
		
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
		val helper = new GeneratorHelper(this._iQualifiedNameProvider)
		
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
		val helper = new GeneratorHelper(this._iQualifiedNameProvider)
		
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
		val helper = new GeneratorHelper(this._iQualifiedNameProvider)

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

	def getAnnotationType(Role role) {
		val annotationType = annotationsFactory.newAnnotationType(role.name)
		for(field : role.fields)
			annotationType.attributes.add(field.annotationAttribute)
		annotationType
	}

	def getAnnotationAttribute(Field field) {
		annotationsFactory.newAnnotationAttribute(field.name, field.many)
	}

}
