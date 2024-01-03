package com.uth.ums.enrollment.security;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@Configuration
@RequiredArgsConstructor
public class JwtAuthConverterProperties {

	@NotBlank
	@Value("${app.config.keycloak.client-id}")
	private String clientID;
	private String principalAttribute;
}
