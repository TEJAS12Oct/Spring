package com.example.demo.AnnotationForDependancyInjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo.AnnotationForDependancyInjection")
public class AppConfig {

}
