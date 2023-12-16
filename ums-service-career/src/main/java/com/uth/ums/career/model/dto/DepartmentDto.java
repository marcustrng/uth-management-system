package com.uth.ums.career.model.dto;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Department}
 */
public record DepartmentDto(Long departmentId, @NotBlank String departmentName) implements
		Serializable {
}
