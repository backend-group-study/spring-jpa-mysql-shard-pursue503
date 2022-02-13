package com.study.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@SpringBootApplication(exclude = JtaAutoConfiguration.class)
public class SpringBoliderplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoliderplateApplication.class, args);
    }

}
