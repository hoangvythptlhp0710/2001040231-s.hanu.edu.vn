package com.example.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringBoot1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1Application.class, args);
    }
}
