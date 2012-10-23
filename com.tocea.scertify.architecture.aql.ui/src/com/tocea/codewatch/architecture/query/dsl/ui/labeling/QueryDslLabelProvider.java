/*
 * generated by Xtext
 */
package com.tocea.codewatch.architecture.query.dsl.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;
import com.tocea.codewatch.architecture.query.dsl.queryDsl.CustomQuery;
import com.tocea.codewatch.architecture.query.dsl.queryDsl.Import;
import com.tocea.codewatch.architecture.query.dsl.queryDsl.MetricQuery;

/**
 * Provides labels for a EObjects.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class QueryDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public QueryDslLabelProvider(final AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	/*
	 * //Labels and icons can be computed like this:
	 * 
	 * String text(MyModel ele) { return "my "+ele.getName(); }
	 * 
	 * String image(MyModel ele) { return "MyModel.gif"; }
	 */

	String image(final CustomQuery s) {
		return "query.png";
	}

	String image(final MetricQuery s) {
		return "metric.png";
	}

	String image(final Import s) {
		return "import.png";
	}
}