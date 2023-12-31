package com.uth.ums.enrollment.feignclient.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

public record CareerDto(Long careerId, @NotBlank String careerName, DepartmentDto department, @Min(0) Integer durationYears, Integer requiredOptativeCourses, CareerLevelDto careerLevel) implements
		Serializable {}
