package com.uth.ums.enrollment.feignclient.dto;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

public record DepartmentDto(Long departmentId, @NotBlank String departmentName) implements
		Serializable {
}
