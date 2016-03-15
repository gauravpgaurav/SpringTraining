package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstBookProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstBookProjectApplication.class, args);

		Book bk = ctx.getBean(Book.class);
		Student std = ctx.getBean(Student.class);

		System.out.println(bk + "\n" + std);
	}
}
