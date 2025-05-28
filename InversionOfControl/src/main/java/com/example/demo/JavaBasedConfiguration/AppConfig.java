package com.example.demo.JavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Sim sim2() {
		return new Airtel();
	}

    @Bean
    Sim sim3() {
		return new Jio();
	}
}
