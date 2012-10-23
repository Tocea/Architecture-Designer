package com.tocea.codewatch.architecture.query.dsl.typing;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries;

@Singleton
public class QueryDslTypeProvider extends XbaseTypeProvider {
	@Inject
	private TypesFactory factory;
	
	protected JvmTypeReference _type(Queries q) {
		JvmParameterizedTypeReference reference = factory.createJvmParameterizedTypeReference();

		return reference;
	}
}
