package com.tadorno.festa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class GestaoFesta2Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(GestaoFesta2Application.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GestaoFesta2Application.class);
    }
}
