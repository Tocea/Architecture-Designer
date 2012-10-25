package com.tocea.scertify.architecture.xadl.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.xtext.generator.IGenerator;

public class ExtensionGeneratorContributionsHandler {

	private static final String GENERATOR_EXTENSION_ID = "com.tocea.scertify.architecture.xadl.generator";
	private final IExtensionRegistry registry;

	public ExtensionGeneratorContributionsHandler(final IExtensionRegistry registry) {
		super();
		this.registry = registry;
	}

	public List<IGenerator> getRegisteredGenerators() {
		final IConfigurationElement[] config = this.registry.getConfigurationElementsFor(GENERATOR_EXTENSION_ID);

		final List<IGenerator> generators = new ArrayList<IGenerator>(config.length);
		try {
			for (final IConfigurationElement e : config) {
				final IGenerator o = (IGenerator) e.createExecutableExtension("class");
				generators.add(o);
			}
			return generators;
		} catch (final CoreException ex) {
			throw new RuntimeException(ex);
		}

	}

}
