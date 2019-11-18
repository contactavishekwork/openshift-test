package com.openshiftexample.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan( basePackages = { "com.openshiftexample.poc.controller", "com.openshiftexample.poc.daos", "com.openshiftexample.poc.models", "com.openshiftexample.poc.service"})
public class OpenshiftInitializrApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenshiftInitializrApplication.class, args);
    }

}
