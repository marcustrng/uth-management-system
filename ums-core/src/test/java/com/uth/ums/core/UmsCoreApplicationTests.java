package com.uth.ums.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(initializers = IntegrationTestInitializer.class)
@SpringBootTest
class UmsCoreApplicationTests {

	@Test
	@SuppressWarnings("squid:S2699")
	void contextLoads() {
	}

}
