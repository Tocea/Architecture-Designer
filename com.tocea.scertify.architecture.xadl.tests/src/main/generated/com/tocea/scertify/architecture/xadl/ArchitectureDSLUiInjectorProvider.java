/*
* generated by Xtext
*/
package com.tocea.scertify.architecture.xadl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ArchitectureDSLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.tocea.scertify.architecture.xadl.ui.internal.ArchitectureDSLActivator.getInstance().getInjector("com.tocea.scertify.architecture.xadl.ArchitectureDSL");
	}
	
}