package com.uth.ums.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UmsServiceScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsServiceScheduleApplication.class, args);
	}

}
