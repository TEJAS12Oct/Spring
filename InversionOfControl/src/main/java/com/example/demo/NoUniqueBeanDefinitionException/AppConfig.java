package com.example.demo.NoUniqueBeanDefinitionException;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo.NoUniqueBeanDefinitionException ")
public class AppConfig {

}
