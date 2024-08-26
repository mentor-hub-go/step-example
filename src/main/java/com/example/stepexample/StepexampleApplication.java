package com.example.stepexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StepexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(StepexampleApplication.class, args);
    }

}
