package com.project.lc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.project.lc.model.CommunicationDTO;
import com.project.lc.model.Phone;

public class PhoneValidation implements ConstraintValidator<ValidPhone, CommunicationDTO> {
		
	@Override
	public void initialize(ValidPhone validPhone) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public boolean isValid(CommunicationDTO phone, ConstraintValidatorContext context) {
		System.out.println("Inside phone validation valid class");
		String regex = "\\d+";		
		return (phone.getPhone() == null || phone.getPhone().getUserNumberString().length() != 10
				|| !(phone.getPhone().getUserNumberString().matches(regex))) ? false : true;
	}
}
