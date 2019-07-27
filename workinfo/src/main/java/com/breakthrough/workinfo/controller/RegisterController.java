package com.breakthrough.workinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.breakthrough.workinfo.domain.User;

@Controller
public class RegisterController {

	@RequestMapping(value = "/User")
	public String showIndexPage(ModelMap map) {
		return "User";		
	}

	@RequestMapping(value = "/signup")
	public void signup(@ModelAttribute("register") User register, ModelMap model, BindingResult result) {
		
	}
}
