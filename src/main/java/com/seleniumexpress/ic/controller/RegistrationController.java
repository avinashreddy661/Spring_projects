package com.seleniumexpress.ic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.ic.api.CommunicationDTO;
import com.seleniumexpress.ic.api.Phone;
import com.seleniumexpress.ic.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userregistraction") UserRegistrationDTO userregistration) {
		System.out.println("when we hit /register url");
		
		// show the data from database when user wants to edit the entered data
		Phone phone =new Phone();
		phone.setCountrycode("91");
		phone.setUserNumber("98765531");
		
		CommunicationDTO communicationDTO=new CommunicationDTO();
		communicationDTO.setPhone(phone);
		userregistration.setCommunicationDTO(communicationDTO);
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserRegistration(@ModelAttribute("userregistraction") UserRegistrationDTO userregistration) {
		System.out.println("when we hit register button");
		return "registration-success";
	}
}
