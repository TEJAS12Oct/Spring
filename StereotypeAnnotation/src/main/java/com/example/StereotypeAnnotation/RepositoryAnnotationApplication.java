package com.example.StereotypeAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.StereotypeAnnotation.Entity.Student;
import com.example.StereotypeAnnotation.Repository.StudentRepository;

public class RepositoryAnnotationApplication {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"com.example.StereotypeAnnotation");

		StudentRepository repository = context.getBean(StudentRepository.class);

		// testing the store method
		repository.save(new Student(1L, "Anshul", 25));
		repository.save(new Student(2L, "Mayank", 23));

		// testing the retrieve method
		Student student = repository.findStudentById(1L);
		System.out.println(student);

		// close the spring context
		context.close();
	}

}