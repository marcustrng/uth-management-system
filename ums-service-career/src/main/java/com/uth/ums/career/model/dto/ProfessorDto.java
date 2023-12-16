package com.uth.ums.career.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Professor}
 */
public record ProfessorDto(Long professorId, @NotBlank String firstName, @NotBlank String lastName, @Email @NotBlank String email, String phoneNumber) implements
		Serializable {
}
