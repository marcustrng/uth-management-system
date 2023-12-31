package com.uth.ums.enrollment.feignclient.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

public record ProfessorDto(Long professorId, @NotBlank String firstName, @NotBlank String lastName, @Email @NotBlank String email, String phoneNumber) implements
		Serializable {
}
