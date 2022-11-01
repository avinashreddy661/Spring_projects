package com.seleniumexpress.ic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LCController {

	@RequestMapping("/text")
	public String sayhello() {
		
		return "hello-world";
	}
	
}
