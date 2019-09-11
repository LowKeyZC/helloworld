package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

  public static final String REGEX_TEL = "^[1]+[3,4,5,6,7,8,9]{1}+\\d{9}$";

  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }

}
