package com.example.test.testing.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.testing.properties.ConfigProperties;

@RestController
public class TestResource {

	@Value("${server.port}")
    private String serverPort;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ConfigProperties prop;
	
	Logger logger = LoggerFactory.getLogger(TestResource.class);
	
	@GetMapping("/getEnvDetails")
	public String getDetails() {
		logger.info("Logger Testing ");
		return prop.getAppname()+prop.getHostname();
	}
}
