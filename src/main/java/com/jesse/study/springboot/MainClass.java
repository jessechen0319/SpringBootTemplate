package com.jesse.study.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainClass {
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context){
        return args -> {
            System.out.println("inspect the beans provided by spring boot");
            String[] beanNames = context.getBeanDefinitionNames();
            for (String name:beanNames) {
                System.out.println(name);
            }
        };
    }
}
