package com.project.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.lc.model.FormDetailDTO;

@Controller
public class LcAppController {

	@RequestMapping("/")
	public String showHomePage() {
		return "homePage";

	}

	@RequestMapping("/result")
	public String showResultPage(FormDetailDTO formDetailDTO, Model model) {

		model.addAttribute("userInfo", formDetailDTO);
		return "resultPage";
	}

}
