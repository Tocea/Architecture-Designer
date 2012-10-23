package com.tocea.codewatch.architecture.query.dsl.generator;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

import com.tocea.codewatch.architecture.query.dsl.queryDsl.Query;

@SuppressWarnings("restriction")
public class QueryCompiler extends XbaseCompiler {

	public String compile(Query operation, ImportManager importManager,ITreeAppendable appendable) {

	
		return compile(operation.getBody(), (ITreeAppendable) appendable,
				getType(operation)).toString();
	}

	JvmTypeReference getType(Query q) {
		JvmTypeReference commonReturnType = getTypeProvider()
				.getCommonReturnType(q.getBody(), false);
		return commonReturnType;
	}
}
