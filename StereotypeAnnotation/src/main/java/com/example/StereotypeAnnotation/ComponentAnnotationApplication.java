package com.example.StereotypeAnnotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.StereotypeAnnotation.Component.ComponentDemo;

@SpringBootApplication
public class ComponentAnnotationApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.example.StereotypeAnnotation");
		context.refresh();
		ComponentDemo componentDemo = context.getBean(ComponentDemo.class);
		componentDemo.demoFunction();

		// Closing the context
		// using close() method
		context.close();

	}

}
