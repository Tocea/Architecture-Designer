package com.tocea.codewatch.architecture.extension;

import com.tocea.codewatch.architecture.core.AbstractRelationship;
import com.tocea.codewatch.architecture.extension.api.IExtensionRelationship;

public abstract class AbstractExtensionRelationship extends AbstractRelationship implements IExtensionRelationship {


	public boolean checkConstraint() {
		return true;
	}

}
