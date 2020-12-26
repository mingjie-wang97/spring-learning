package com.mingjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类， 说明说明这是一个Spring boot application
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        // start the spring application
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }

}
