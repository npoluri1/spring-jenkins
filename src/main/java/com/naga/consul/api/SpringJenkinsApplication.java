package com.naga.consul.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@postConstruct
	public void init() {
		logger.info("Application started...");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
