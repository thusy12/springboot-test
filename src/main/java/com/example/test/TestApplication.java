package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
//		System.out.println("hello1");
		SpringApplication.run(TestApplication.class, args);
		System.out.println("hello");
	}

}
