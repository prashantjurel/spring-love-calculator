package com.project.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.lc.model.FormDetailDTO;

@Controller
public class LcAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") FormDetailDTO formDetailDTO) {
		return "homePage";

	}

	@RequestMapping("/result")
	public String showResultPage(@Valid @ModelAttribute("userInfo") FormDetailDTO formDetailDTO,
			BindingResult bindingResult) {

		return bindingResult.hasErrors() ? "homePage" : "resultPage";

	}

}
