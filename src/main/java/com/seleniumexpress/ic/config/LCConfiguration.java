package com.seleniumexpress.ic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.seleniumexpress.ic.controller")
public class LCConfiguration {

	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver v= new InternalResourceViewResolver();
		v.setPrefix("/WEB-INF/view/");
		v.setSuffix(".jsp");
		
		return v;
	}
	
}
