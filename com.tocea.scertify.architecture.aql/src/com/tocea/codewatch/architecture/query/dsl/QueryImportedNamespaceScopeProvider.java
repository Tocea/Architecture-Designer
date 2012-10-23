package com.tocea.codewatch.architecture.query.dsl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;

public class QueryImportedNamespaceScopeProvider extends XbaseImportedNamespaceScopeProvider {
	
	@Override
	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		List<ImportNormalizer> implicitImports = super.getImplicitImports(ignoreCase);
		ArrayList<ImportNormalizer> imports = new ArrayList<ImportNormalizer>(implicitImports);
		
		imports.add(new ImportNormalizer(QualifiedName.create("com","tocea","codewatch","architecture","query","api"),true,ignoreCase));
		imports.add(new ImportNormalizer(QualifiedName.create("com","tocea","codewatch","architecture","query"),true,ignoreCase));
		imports.add(new ImportNormalizer(QualifiedName.create("com","tocea","codewatch","architecture","core","api"),true,ignoreCase));
		return imports;
	}
}