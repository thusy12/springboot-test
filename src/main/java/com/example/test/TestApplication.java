package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class TestApplication {

	public static void main(String[] args) {
//		System.out.println("hello1");
		SpringApplication.run(TestApplication.class, args);
		System.out.println("hello");
	}

}
