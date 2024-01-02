package com.uth.ums.ums.keycloak.security;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@Configuration
public class JwtAuthConverterProperties {

	@NotBlank
	@Value("${app.config.keycloak.client-id}")
	private String clientID;
	private String principalAttribute;
}
