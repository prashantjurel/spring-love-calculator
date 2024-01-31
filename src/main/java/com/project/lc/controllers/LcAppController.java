package com.project.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.lc.model.FormDetailDTO;

@Controller
public class LcAppController {

	@RequestMapping("/")
	public String showHomePage() {
		return "homePage";

	}
	
	@RequestMapping("/result")
	public String showResultPage(@ModelAttribute("userInfo") FormDetailDTO formDetailDTO) {
		return "resultPage";
	}

}
