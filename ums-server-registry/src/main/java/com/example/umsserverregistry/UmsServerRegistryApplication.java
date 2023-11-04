package com.example.umsserverregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UmsServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsServerRegistryApplication.class, args);
	}

}
