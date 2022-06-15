package com.example.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);

	@PostConstruct
	public void init() {

		logger.info("--Applicaiton post construct called ----");
	}

	public static void main(String[] args) {

		logger.info("--Inside main method Applicaiton Started ----");

		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
