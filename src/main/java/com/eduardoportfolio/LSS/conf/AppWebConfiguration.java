package com.eduardoportfolio.LSS.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.eduardoportfolio.LSS.controllers.HomeController;

//It enables many features in our web application (Objects conversion for XML, Objects conversion for JSON,
//Validating using the specification, Support to the RSS generator, and so on).
@EnableWebMvc
//Through this annotation we indicate what packages should be read.
@ComponentScan(basePackageClasses={HomeController.class})
//The principal objective of this class is show for the SpringMvc Servlet what classes should be read and loaded.
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	
	//Show to Spring that the return from this method have to be registered as an object managed by the container.
	@Bean
	//Teach Spring where to look for the pages, where the pages can be found.
	public InternalResourceViewResolver internalResourceViewResolver (){
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
