package com.eduardoportfolio.LSS.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Following the servlets specification, in web projects, is necessary to have at least one Filter or Servlet.
//The Servlet responsible for process all incoming requests for Spring MVC is the DispatcherServlet.
//We need it to everything starts working.
public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	//Tells SpringMVC which controller have to be mapped, and which classes has to be loaded.
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class};
	}

	//Indicates what is the pattern of address that will be delegated to the SpringMVC servlet.
	@Override
	protected String[] getServletMappings() {
		return new String [] {"/"};
	}

}
