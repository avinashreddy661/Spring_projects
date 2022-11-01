package com.seleniumexpress.ic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.ic.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userregistraction") UserRegistrationDTO userregistration) {
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserRegistration(@ModelAttribute("userregistraction") UserRegistrationDTO userregistration) {
		
		return "registration-success";
	}
}
