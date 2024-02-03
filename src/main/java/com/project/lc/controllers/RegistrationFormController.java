package com.project.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.lc.model.UserRegistrationInfo;

@Controller
public class RegistrationFormController {

	@RequestMapping("/user-register")
	public String showRegistrationForm(@ModelAttribute("userReg") UserRegistrationInfo userRegistrationInfo) {
		return "registrationForm";
	}

	@RequestMapping("/registration-success")
	public String showRegistrationFormResult(
			@Valid @ModelAttribute("userReg") UserRegistrationInfo userRegistrationInfo, BindingResult result) {

		return result.hasErrors() ? "registrationForm" : "registrationSuccess";
	}

}
