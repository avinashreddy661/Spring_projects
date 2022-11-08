package com.seleniumexpress.ic.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seleniumexpress.ic.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showWelcomepage(@ModelAttribute("user") UserInfoDTO userInfo) {
		return "home-page";
	}

	@RequestMapping("/processing-homepage")
	public String showResult(@Valid @ModelAttribute("user") UserInfoDTO userInfo, BindingResult result) {
		
		System.out.println("userinfo is termand condition is accepted: "+userInfo.isTermAndCondition());
		if(result.hasErrors()) {
			System.out.println("My form has errors");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError objectError : allErrors) {
				System.out.println(objectError);
			}
			
			
			return "home-page";
		}

		return "result-page";
	}

	/*
	 * way 1
	 * 
	 * @RequestMapping("/") public String showWelcomepage() { return "home-page"; }
	 * 
	 * 
	 * @RequestMapping("/processing-homepage") public String
	 * showResult(@RequestParam String username1,@RequestParam String
	 * crushname1,Model model) { model.addAttribute("u1",username1);
	 * model.addAttribute("c1",crushname1); return "result-page"; }
	 */

}
