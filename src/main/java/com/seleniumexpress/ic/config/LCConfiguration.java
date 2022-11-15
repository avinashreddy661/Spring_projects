package com.seleniumexpress.ic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.seleniumexpress.ic.formatter.PhoneNumberFormatter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.seleniumexpress.ic.controller")
public class LCConfiguration implements WebMvcConfigurer{

	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver v= new InternalResourceViewResolver();
		v.setPrefix("/WEB-INF/view/");
		v.setSuffix(".jsp");
		
		return v;
	}

	public void addFormatters(FormatterRegistry registry) {
		System.out.println("addformater methid in lcconfiguration class ");
		registry.addFormatter(new PhoneNumberFormatter());
	}
	
	
	
}
