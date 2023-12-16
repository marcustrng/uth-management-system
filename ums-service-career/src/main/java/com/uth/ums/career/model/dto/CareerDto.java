package com.uth.ums.career.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Career}
 */
public record CareerDto(Long careerId, @NotBlank String careerName, DepartmentDto department, @Min(0) Integer durationYears, Integer requiredOptativeCourses, CareerLevelDto careerLevel) implements
		Serializable {}
