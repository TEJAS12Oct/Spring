package com.example.demo.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Pojo.Student;

@Configuration
public class AppConfig {

	@Bean
	public Student student() {
		return new Student("Rutuja" , 1);
	}
}
