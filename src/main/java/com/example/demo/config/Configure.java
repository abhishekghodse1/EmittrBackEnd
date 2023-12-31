package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Configure {
	

	@Bean
	  public WebMvcConfigurer Configuration() {
	    return new WebMvcConfigurer() {
	      @Override
	      
	      public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	        .allowedMethods("GET", "POST", "PUT", "DELETE")
	        .allowedHeaders("*")
	        .allowedOrigins("https://localhost:4200");
	      }
	    };
	}

}
