package com.project.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer // implements WebApplicationInitializer 
{

	//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

//		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
//		webApplicationContext.setConfigLocation("/WEB-INF/application-config.xml");
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		DispatcherServlet myDispatcherServlet = new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic servletRegistrationDynamic = servletContext.addServlet("MyDispatcherServlet", myDispatcherServlet); 
		
		servletRegistrationDynamic.setLoadOnStartup(1);
		servletRegistrationDynamic.addMapping("/mywebsite.com/*");
		

	}

}
