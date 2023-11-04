package com.uth.ums.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UmsServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsServerRegistryApplication.class, args);
	}

}
