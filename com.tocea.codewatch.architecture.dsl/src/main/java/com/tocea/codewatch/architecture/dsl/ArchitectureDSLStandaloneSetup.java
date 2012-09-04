
package com.tocea.codewatch.architecture.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ArchitectureDSLStandaloneSetup extends ArchitectureDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new ArchitectureDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

