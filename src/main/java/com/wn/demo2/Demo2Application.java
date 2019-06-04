package com.wn.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication();
        springApplication.setAddCommandLineProperties(false);
        springApplication.run(Demo2Application.class, args);
    }

}
