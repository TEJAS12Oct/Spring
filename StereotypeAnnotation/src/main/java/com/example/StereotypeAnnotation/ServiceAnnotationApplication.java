package com.example.StereotypeAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.StereotypeAnnotation.Service.ServiceClass;

public class ServiceAnnotationApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"com.example.StereotypeAnnotation");
			
		ServiceClass myServiceClass = context.getBean(ServiceClass.class);
		int factorialOf5 = myServiceClass.factorial(5);
		System.out.println("Factorial of 5 is: " + factorialOf5);
		context.close();
	}
}
