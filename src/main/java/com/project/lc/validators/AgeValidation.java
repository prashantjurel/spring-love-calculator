package com.project.lc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidation implements ConstraintValidator<Age, Integer> {

	private int minAge;
	private int maxAge;

	@Override
	public void initialize(Age age) {
		this.minAge = age.min();
		this.maxAge = age.max();
	}

	@Override
	public boolean isValid(Integer ageInteger, ConstraintValidatorContext context) {
		return (ageInteger == null || ageInteger < minAge || ageInteger > maxAge ) ? false : true;
	}

}
