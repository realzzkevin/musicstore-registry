package com.challenge.registry;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootTest
@EnableWebSecurity
@EnableEurekaServer
class EurekaServiceRegistryApplicationTests {

	@Test
	void contextLoads() {
	}

}
