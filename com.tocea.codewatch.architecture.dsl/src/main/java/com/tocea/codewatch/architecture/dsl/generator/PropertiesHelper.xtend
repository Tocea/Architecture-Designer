package com.tocea.codewatch.architecture.dsl.generator

import java.io.BufferedInputStream
import java.util.HashMap
import java.util.Map
import java.util.Properties
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject

class PropertiesHelper {

	static val String DEFAULT_OUTPUT_PATH			= "src-gen";
    static val String DEFAULT_ANNOTATIONS_OUTPUT	= "annotations";
    static val String PROPERTIES					= "adl.properties";
    
    static val String EXTENSION_OUTPUT				= "xadl.output";
    static val String ANNOTATIONS_OUTPUT			= "xadl.annotations_output";

	val Map<Object, Object> properties
	val IProject project

	new(IProject project) {
		this.project = project
		var file = project.getFile(PROPERTIES)
		if(file.exists()) {
			var properties = new Properties
			properties.load(new BufferedInputStream(file.contents))
			this.properties = properties;
		}
		else
			properties = new HashMap
	}

	def getOutputPath() {
		if(properties.containsKey(EXTENSION_OUTPUT))
			properties.get(EXTENSION_OUTPUT).toString
		else
			DEFAULT_OUTPUT_PATH
	}

	def getAnnotationsOutputPath() {
		if(properties.containsKey(ANNOTATIONS_OUTPUT))
			properties.get(ANNOTATIONS_OUTPUT).toString
		else
			DEFAULT_ANNOTATIONS_OUTPUT
	}

	def getAnnotationFile(String fileName) {
		val folder = project.getFolder(annotationsOutputPath)
		if(!folder.exists)
			createFolder(folder)
		folder.getFile(fileName)
	}

	def private createFolder(IContainer container) {
		if(container!=null && !container.exists) {
			createFolder(container.parent)
			(container as IFolder).create(true, true, null)
		}
	}

}