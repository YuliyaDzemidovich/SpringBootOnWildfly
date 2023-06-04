package com.example.springonwildfly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringOnWildflyApplication extends SpringBootServletInitializer {

    private static final Class<SpringOnWildflyApplication> applicationClass = SpringOnWildflyApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(SpringOnWildflyApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}
