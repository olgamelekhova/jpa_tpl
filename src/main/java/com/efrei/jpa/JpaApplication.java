package com.efrei.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    //TODO: add necessary repositories as parameters and they will be autowired
    public CommandLineRunner demo() {
        return (args) -> {
            //TODO: write your code here
        };
    }
}
