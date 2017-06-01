package com.eduardoportfolio.LSS.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@ComponentScan(basePackageClasses={})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

}
