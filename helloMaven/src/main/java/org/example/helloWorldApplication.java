package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class helloWorldApplication {
    public static void main(String[] args) {
        System.out.println( "Hello World!");
        SpringApplication.run(helloWorldApplication.class, args);
    }
}