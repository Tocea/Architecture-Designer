
package com.tocea.scertify.architecture.xadl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ArchitectureDSLStandaloneSetup extends ArchitectureDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new ArchitectureDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

