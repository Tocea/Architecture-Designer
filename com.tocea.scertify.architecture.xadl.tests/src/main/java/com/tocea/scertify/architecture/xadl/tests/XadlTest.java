package com.tocea.scertify.architecture.xadl.tests;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Assert;
import org.junit.Test;

import com.tocea.easycoverage.framework.ClassScanner;
import com.tocea.easycoverage.framework.TestAutomatic;
import com.tocea.easycoverage.framework.TestHarness;
import com.tocea.easycoverage.framework.behaviour.MissingToStringBehaviour;
import com.tocea.easycoverage.framework.behaviour.NPEMethodBehaviour;
import com.tocea.easycoverage.framework.behaviour.VariableArgumentInvocationBehaviour;
import com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage;

public class XadlTest {

	@Test
	public void test() throws ClassNotFoundException {
		final ClassScanner scanner = TestAutomatic.newClassScanner();
		classes(ArchitectureDSLPackage.eINSTANCE, scanner);

		final TestHarness testHarness = TestAutomatic
				.newTestHarness(TestAutomatic.getAvailablePlugins());
		testHarness.removeTest(MissingToStringBehaviour.class);
		testHarness.removeTest(VariableArgumentInvocationBehaviour.class);
		testHarness.removeTest(NPEMethodBehaviour.class);
		testHarness.addBehaviour(new EMFClassTestBehaviour());

		testHarness.setClasses(scanner.getClasses());
		final boolean processTests = testHarness.processTests();
		Assert.assertTrue(processTests);
	}

	private static void classes(final EPackage p, final ClassScanner scanner)
			throws ClassNotFoundException {

		final ClassLoader classLoader = p.getClass().getClassLoader();

		for (final EClassifier classifier : p.getEClassifiers()) {
			final Class<?> _class = classLoader.loadClass(classifier
					.getInstanceClassName());
			scanner.addClasses(_class);
		}
		for (final EPackage subp : p.getESubpackages()) {
			classes(subp, scanner);
		}
	}

}
