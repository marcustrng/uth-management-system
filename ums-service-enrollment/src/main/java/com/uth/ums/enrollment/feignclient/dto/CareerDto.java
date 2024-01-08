package com.uth.ums.enrollment.feignclient.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Set;

public record CareerDto(Long careerId, @NotBlank String careerName, DepartmentDto department,
                        @Min(0) Integer durationYears, Integer requiredOptativeCourses,
                        CareerLevelDto careerLevel, Set<CourseDto> courses) implements
		Serializable {

}
