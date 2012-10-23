package com.tocea.codewatch.architecture.query.dsl.validation;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.Check;

import com.tocea.codewatch.architecture.query.dsl.queryDsl.CustomQuery;
import com.tocea.codewatch.architecture.query.dsl.queryDsl.MetricQuery;
import com.tocea.codewatch.architecture.query.dsl.queryDsl.Query;
import com.tocea.codewatch.architecture.query.dsl.queryDsl.QueryDslPackage;

public class QueryDslJavaValidator extends AbstractQueryDslJavaValidator {

	@Check
	public void checkQueryDontStartsWithCapital(Query greeting) {
		if (Character.isUpperCase(greeting.getName().charAt(0))) {
			warning("Name should'nt start with a capital",
					QueryDslPackage.Literals.QUERY__NAME);
		}
	}

	@Check
	public void checkQueryReturnType(CustomQuery greeting) {
		JvmTypeReference type = getType(greeting);
		if (type == null || type.getSimpleName().equals("void")) {

			error("Query has to return a value",
					QueryDslPackage.Literals.QUERY__NAME);

		}
	}

	@Check
	public void checkMetricReturnType(MetricQuery greeting) {
		JvmTypeReference type = getType(greeting);
		if (type != null && !type.getSimpleName().equals("void")) {
			String simpleName = type.getType().getSimpleName();
			if (simpleName.equals("int") || simpleName.equals("float")
					|| simpleName.equals("double")) {
				return;
			} else
				error("Metric should return an int/float or double value instead of "+simpleName,
						QueryDslPackage.Literals.QUERY__NAME);

		} else {
			error("Metric has to return a value",
					QueryDslPackage.Literals.QUERY__NAME);

		}
	}

	private JvmTypeReference getType(Query q) {
		JvmTypeReference commonReturnType = getTypeProvider()
				.getCommonReturnType(q.getBody(), false);
		return commonReturnType;
	}
}
