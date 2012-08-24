package com.tocea.codewatch.architecture.extension.api;

import com.tocea.codewatch.architecture.core.api.IRelationship;

public interface IExtensionRelationship extends IRelationship {

	/**
	 * Checks that the constraint is satisfied.
	 */
	public boolean checkConstraint();

}
