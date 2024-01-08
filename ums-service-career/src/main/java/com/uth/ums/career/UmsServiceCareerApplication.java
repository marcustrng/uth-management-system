package com.uth.ums.career;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UmsServiceCareerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsServiceCareerApplication.class, args);
	}

}
