package com.example.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsIntegrationApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsIntegrationApplicationTests.class);
	
	@Test
	void contextLoads() {
		
		logger.info("--Test Cases Executed--");
		assertEquals(true, true);
	}

}
