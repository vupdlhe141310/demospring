package com.firstgroup.GUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.*")
public class FirstWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstWebAppApplication.class, args);
    }

}
