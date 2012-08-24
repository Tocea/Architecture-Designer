package com.tocea.codewatch.architecture.extension;

import java.util.HashSet;
import java.util.Set;

import com.tocea.codewatch.architecture.extension.api.IExtensionRelationship;
import com.tocea.codewatch.architecture.extension.api.IRelationshipConstraint;

/**
 * 
 * Class that makes the disjunction between different constraints. The check method is
 * short circuited.
 * 
 * @author Romain Delamare
 * @since August 14, 2012
 *
 */
public class DisjunctionConstraint implements IRelationshipConstraint {

	private final Set<IRelationshipConstraint> constraints = new HashSet<IRelationshipConstraint>();

	public DisjunctionConstraint(IRelationshipConstraint... constraints) {
		if(constraints!=null)
			for(IRelationshipConstraint constraint : constraints)
				this.constraints.add(constraint);
	}

	/**
	 * Adds a constraint to the disjunction.
	 * 
	 * @param constraint the constraint to add
	 */
	public void addConstraint(IRelationshipConstraint constraint) {
		constraints.add(constraint);
	}

	/**
	 * 
	 * Removes a constraint from the disjunction.
	 * 
	 * @param constraint the constraint to remove
	 */
	public void removeConstraint(IRelationshipConstraint constraint) {
		constraints.remove(constraint);
	}


	public boolean check(IExtensionRelationship relationship) {
		for(IRelationshipConstraint constraint : constraints)
			if(constraint.check(relationship))
				return true;
		return false;
	}

}
