package com.uth.ums.edge.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	private final JwtAuthConverter jwtAuthConverter;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
				.authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests
//						.requestMatchers(HttpMethod.GET, "/actuator/**").permitAll()
//						.requestMatchers("/api/userextras/me").hasAnyRole(UMS_ADMIN, UMS_STUDENT, UMS_PROFESSOR)
//						.requestMatchers("/swagger-ui.html", "/swagger-ui/**", "/v3/api-docs", "/v3/api-docs/**")
//						.permitAll()
						.anyRequest().permitAll())
				.oauth2ResourceServer(oauth2ResourceServer -> oauth2ResourceServer.jwt(
						jwt -> jwt.jwtAuthenticationConverter(jwtAuthConverter)))
				.sessionManagement(
						sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.cors(Customizer.withDefaults())
				.build();
	}

	public static final String UMS_ADMIN = "UMS_ADMIN";
	public static final String UMS_STUDENT = "UMS_STUDENT";
	public static final String UMS_PROFESSOR = "UMS_PROFESSOR";
}
