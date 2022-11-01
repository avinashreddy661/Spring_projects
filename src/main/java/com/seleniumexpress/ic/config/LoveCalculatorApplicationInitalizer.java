package com.seleniumexpress.ic.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitalizer //implements WebApplicationInitializer 
{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// System.out.println("my custome class onstartup method called
		// --------->Aviansh Reddy Perumalla");

		// create a dispatcher servlet object

		AnnotationConfigWebApplicationContext a = new AnnotationConfigWebApplicationContext();
		a.register(LCConfiguration.class);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(a);
		ServletRegistration.Dynamic d = servletContext.addServlet("m1", dispatcherServlet);
		 if (d == null) {
			    throw new IllegalStateException("Failed to register servlet with name '" + "m1" + "'. " +
			        "Check if there is another servlet registered under the same name.");
			  }
		d.setLoadOnStartup(1);
		d.addMapping("/mywebesite.com/*");

	}

}
