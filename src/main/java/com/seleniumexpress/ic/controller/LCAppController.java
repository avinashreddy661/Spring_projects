package com.seleniumexpress.ic.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
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
	public String showResult(@Valid @ModelAttribute("user1") UserInfoDTO userInfo, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("My form has errors");
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
