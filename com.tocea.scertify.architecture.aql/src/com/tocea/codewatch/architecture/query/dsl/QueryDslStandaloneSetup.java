
package com.tocea.codewatch.architecture.query.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QueryDslStandaloneSetup extends QueryDslStandaloneSetupGenerated{

	public static void doSetup() {
		new QueryDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

