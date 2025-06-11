package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.Pojo.AppConfig;
import com.example.demo.Pojo.Student;

public class ConstructorInjectionAnnotation {

	public static void main(String[] args) {
		// Load the Spring application context
		// using annotation-based configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve the Student bean
		Student student = context.getBean(Student.class);

		// Call the cheating() method
		student.cheating();
	}
}
