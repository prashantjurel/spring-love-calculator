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
@Target(ElementType.FIELD)
@Constraint(validatedBy = { AgeValidation.class })
public @interface Age {
	
	int min() default 18;
	
	int max() default 60;
	
	String message()default "{invalidAgeMessage}";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	

}
