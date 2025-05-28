package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.AppConfig.AppConfig;
import com.example.demo.Pojo.Student;

@SpringBootApplication
public class ApplicationContextDemo {
	public static void main(String[] args) {

		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(AppConfig.class);

		ApplicationContext context = SpringApplication.run(ApplicationContextDemo.class, args);

		Student student = context.getBean(Student.class);

		// Print and display
		System.out.println(student);
	}
}