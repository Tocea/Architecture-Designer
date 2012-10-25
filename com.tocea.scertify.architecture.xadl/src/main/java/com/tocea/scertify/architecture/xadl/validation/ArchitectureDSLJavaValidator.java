package com.tocea.scertify.architecture.xadl.validation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.validation.Check;

import com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage;
import com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension;
import com.tocea.scertify.architecture.xadl.architectureDSL.Datatype;
import com.tocea.scertify.architecture.xadl.architectureDSL.ExtensionEntity;
import com.tocea.scertify.architecture.xadl.architectureDSL.Field;
import com.tocea.scertify.architecture.xadl.architectureDSL.NamedEntity;
import com.tocea.scertify.architecture.xadl.architectureDSL.Parameter;
import com.tocea.scertify.architecture.xadl.architectureDSL.ParametrizedType;
import com.tocea.scertify.architecture.xadl.architectureDSL.Pattern;
import com.tocea.scertify.architecture.xadl.architectureDSL.Role;

public class ArchitectureDSLJavaValidator extends
		AbstractArchitectureDSLJavaValidator {

	private static final String DUPLICATE_NAME = "Duplicate name ";
	private static final String CYCLE_DETECTED = "Cycle detected.";

	@Check
	public void checkSuperPattern(Pattern pattern) {
		if (pattern.getSuperPattern() != null) {
			if (!(pattern.getSuperPattern().getReference() instanceof Pattern))
				error("A pattern can only extend a pattern.",
						ArchitectureDSLPackage.Literals.PATTERN__SUPER_PATTERN);
			if (!checkInheritanceCycle(pattern))
				error(CYCLE_DETECTED,
						ArchitectureDSLPackage.Literals.PATTERN__SUPER_PATTERN);
		}
	}

	@Check
	public void checkSuperRole(Role role) {
		if (role.getSuperRole() != null) {
			if (!(role.getSuperRole().getReference() instanceof Role))
				error("A role can only extend a role",
						ArchitectureDSLPackage.Literals.ROLE__SUPER_ROLE);
			if (!checkInheritanceCycle(role))
				error(CYCLE_DETECTED,
						ArchitectureDSLPackage.Literals.ROLE__SUPER_ROLE);
		}
	}

	@Check
	public void checkPatternRoleUniqueNames(ArchitectureExtension extension) {
		Map<String, NamedEntity> entities = new HashMap<String, NamedEntity>();
		for (ExtensionEntity entity : extension.getEntities())
			if (entity instanceof NamedEntity) {
				final NamedEntity namedEntity = (NamedEntity) entity;
				final String name = namedEntity.getName();
				if (entities.containsKey(name)) {
					error(DUPLICATE_NAME + name, namedEntity,
							ArchitectureDSLPackage.Literals.NAMED_ENTITY__NAME,
							null);
					error(DUPLICATE_NAME + name, entities.get(name),
							ArchitectureDSLPackage.Literals.NAMED_ENTITY__NAME,
							null);
				} else
					entities.put(name, namedEntity);
			}
	}

	@Check
	public void checkParameterUniqueName(ParametrizedType type) {
		Map<String, Parameter> parameters = new HashMap<String, Parameter>();
		for (Parameter parameter : type.getParameters()) {
			String name = parameter.getName();
			if (parameters.containsKey(name)) {
				error(DUPLICATE_NAME + name, parameter,
						ArchitectureDSLPackage.Literals.NAMED_ENTITY__NAME,
						null);
				error(DUPLICATE_NAME + name, parameters.get(name),
						ArchitectureDSLPackage.Literals.NAMED_ENTITY__NAME,
						null);
			} else
				parameters.put(name, parameter);
		}
	}

	@Check
	public void checkDuplicateDataType(ArchitectureExtension extension) {
		Map<String, Datatype> datatypes = new HashMap<String, Datatype>();
		for (ExtensionEntity entity : extension.getEntities())
			if (entity instanceof Datatype) {
				final Datatype datatype = (Datatype) entity;
				final String name = datatype.getReference().getQualifiedName();
				;
				if (datatypes.containsKey(name)) {
					error(DUPLICATE_NAME + name,
							datatype,
							ArchitectureDSLPackage.Literals.DATATYPE__REFERENCE,
							null);
					error(DUPLICATE_NAME + name,
							datatypes.get(name),
							ArchitectureDSLPackage.Literals.DATATYPE__REFERENCE,
							null);
				} else
					datatypes.put(name, datatype);
			}
	}

	@Check
	public void checkArity(Field field) {
		if (field.getLb() != null && field.getUb() != null
				&& !field.getLb().isUnbound() && !field.getUb().isUnbound()
				&& field.getLb().getValue() >= field.getUb().getValue())
			error("Lower bound must be lower than upper bound.",
					ArchitectureDSLPackage.Literals.FIELD__LB);
	}

	// Returns true if there is no cycle
	private boolean checkInheritanceCycle(Role role) {
		try {
			Role superRole = (Role) role.getSuperRole().getReference();
			while (superRole != null) {
				if (superRole == role)
					return false;
				superRole = (Role) superRole.getSuperRole().getReference();
			}
			return true;
		} catch (ClassCastException e) {
			return true;
		}
	}

	// Returns true if there is no cycle
	private boolean checkInheritanceCycle(Pattern pattern) {
		try {
			Pattern superPattern = (Pattern) pattern.getSuperPattern()
					.getReference();
			while (superPattern != null) {
				if (superPattern == pattern)
					return false;
				superPattern = (Pattern) superPattern.getSuperPattern()
						.getReference();
			}
			return true;
		} catch (ClassCastException e) {
			return true;
		}
	}

}
