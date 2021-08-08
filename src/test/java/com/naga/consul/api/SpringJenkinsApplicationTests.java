package com.naga.consul.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	
	Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
		
	@Test
	void contextLoads() {
		logger.info("Test Case excuting...");
		assert.Equals(true,true);
	}

}
