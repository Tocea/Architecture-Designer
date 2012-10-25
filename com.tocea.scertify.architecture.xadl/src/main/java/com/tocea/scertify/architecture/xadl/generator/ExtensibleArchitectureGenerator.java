package com.tocea.scertify.architecture.xadl.generator;

import java.util.List;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

public class ExtensibleArchitectureGenerator implements IGenerator {


	IExtensionRegistry registry=Platform.getExtensionRegistry();

	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		List<IGenerator> registeredGenerators = new ExtensionGeneratorContributionsHandler(registry).getRegisteredGenerators();
		for (IGenerator gen : registeredGenerators) {
			gen.doGenerate(input, fsa);
		}
	}

}
