package com.uth.ums.enrollment;

import java.util.Arrays;
import java.util.stream.StreamSupport;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;

@SpringBootApplication
@RequiredArgsConstructor
@Log4j2
@EnableFeignClients
public class UmsServiceEnrollmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsServiceEnrollmentApplication.class, args);
	}

	@EventListener
	public void handleContextRefresh(ContextRefreshedEvent event) {
		final Environment env = event.getApplicationContext()
				.getEnvironment();

		log.info("Active profiles: {}", Arrays.toString(env.getActiveProfiles()));

		final MutablePropertySources sources = ((AbstractEnvironment) env).getPropertySources();

		StreamSupport.stream(sources.spliterator(), false)
				.filter(EnumerablePropertySource.class::isInstance)
				.map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
				.flatMap(Arrays::stream)
				.distinct()
				.filter(prop -> !(prop.contains("credentials") || prop.contains("password")))
				.forEach(prop -> log.info("{}: {}", prop, env.getProperty(prop)));
	}


}
