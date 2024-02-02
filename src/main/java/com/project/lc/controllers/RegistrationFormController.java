package com.project.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.lc.model.CommunicationDTO;
import com.project.lc.model.Phone;
import com.project.lc.model.UserRegistrationInfo;

@Controller
public class RegistrationFormController {
	
	@RequestMapping("/user-register")
	public String showRegistrationForm(@ModelAttribute("userReg") UserRegistrationInfo userRegistrationInfo) {
		return "registrationForm";
	}
	
	@RequestMapping("/registration-success")
	public String showRegistrationFormResult(@ModelAttribute("userReg") UserRegistrationInfo userRegistrationInfo) {
		return "registrationSuccess";
	}

}
