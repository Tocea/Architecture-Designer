package com.tocea.scertify.architecture.xadl.tests;

import org.eclipse.emf.ecore.EObject;

import com.tocea.easycoverage.framework.behaviour.api.IClassTest;
import com.tocea.easycoverage.framework.behaviour.api.ITestBehaviour;

public class EMFClassTestBehaviour implements ITestBehaviour {

	public IClassTest newInstanceTest(final Object arg0) {
		if (arg0 instanceof EObject) {
			System.out.println("EMFClassTestBehaviour.newInstanceTest()");
		}
		return null;
	}

	public IClassTest newTest(final Class<?> arg0) {
		if (EObject.class.isAssignableFrom(arg0)) {

		}
		return null;
	}

}
