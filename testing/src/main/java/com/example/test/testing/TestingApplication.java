package com.example.test.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.test.testing.properties.ConfigProperties;

 @SpringBootApplication
 //@EnableConfigurationProperties(ConfigProperties.class)
 @ConfigurationPropertiesScan("com.example.test.testing.properties")
public class TestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}

}
