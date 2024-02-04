package com.project.lc.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE})
@Constraint(validatedBy = { PhoneValidation.class })
public @interface ValidPhone {
	
	String message() default "{invalidPhoneNumber}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
