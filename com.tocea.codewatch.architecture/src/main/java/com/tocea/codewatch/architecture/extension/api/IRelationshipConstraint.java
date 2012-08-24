package com.tocea.codewatch.architecture.extension.api;

public interface IRelationshipConstraint {

	/**
	 * Check if a relationship satisfies the constraint.
	 * 
	 * @param relationship the relationship to check
	 * @return true if the relationship satisfies the constraint, false otherwise
	 */
	public boolean check(IExtensionRelationship relationship);

}
