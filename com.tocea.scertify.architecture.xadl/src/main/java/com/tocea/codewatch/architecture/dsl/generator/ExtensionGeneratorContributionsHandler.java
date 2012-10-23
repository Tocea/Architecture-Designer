package com.tocea.codewatch.architecture.dsl.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.xtext.generator.IGenerator;

public class ExtensionGeneratorContributionsHandler {

	private static final String GENERATOR_EXTENSION_ID = "com.tocea.codewatch.architecture.dsl.generator";
	private IExtensionRegistry registry;

	public ExtensionGeneratorContributionsHandler(IExtensionRegistry registry) {
		super();
		this.registry = registry;
	}

	public List<IGenerator> getRegisteredGenerators() {
		IConfigurationElement[] config = registry
				.getConfigurationElementsFor(GENERATOR_EXTENSION_ID);

		List<IGenerator> generators = new ArrayList<IGenerator>(
				config.length);
		try {
			for (IConfigurationElement e : config) {
				final IGenerator o = (IGenerator) e
						.createExecutableExtension("class");
				generators.add(o);
			}
			return generators;
		} catch (CoreException ex) {
			throw new RuntimeException(ex);
		}

	}

}
