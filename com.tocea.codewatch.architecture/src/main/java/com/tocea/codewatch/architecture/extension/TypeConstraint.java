package com.tocea.codewatch.architecture.extension;

import com.tocea.codewatch.architecture.core.api.IAnalysedElement;
import com.tocea.codewatch.architecture.extension.api.IExtensionRelationship;
import com.tocea.codewatch.architecture.extension.api.IRelationshipConstraint;

/**
 * Class that implements a constraint on the types of
 * the source and the target of a relationship.
 * 
 * @author Romain Delamare
 * @since August 14, 2012
 *
 */
public class TypeConstraint implements IRelationshipConstraint {

	private final Class<? extends IAnalysedElement> sourceType;
	private final Class<? extends IAnalysedElement> targetType;

	/**
	 * Creates a new TypeConstraint object
	 * 
	 * @param sourceType the type of the source, null for all types
	 * @param targetType the type of the target, null for all types
	 */
	public TypeConstraint(Class<? extends IAnalysedElement> sourceType, Class<? extends IAnalysedElement> targetType) {
		this.sourceType = sourceType;
		this.targetType = targetType;
	}


	public boolean check(IExtensionRelationship relationship) {
		if(sourceType!=null && !relationship.getSource().getClass().equals(sourceType))
			return false;
		if(targetType!=null && !relationship.getTarget().getClass().equals(targetType))
			return false;
		return true;
	}
	
}
