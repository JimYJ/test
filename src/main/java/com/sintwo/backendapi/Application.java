package com.sintwo.backendapi;


import com.sintwo.backendapi.config.JerseyConfig;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.sintwo.backendapi.db.mapper")
public class Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class)
                .run(args);
	}

	@Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/*");
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
        return registration;
    }
}

