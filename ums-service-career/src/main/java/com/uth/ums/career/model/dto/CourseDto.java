package com.uth.ums.career.model.dto;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.entity.Course;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * DTO for {@link Course}
 */
public record CourseDto(Long courseId, @NotBlank String courseName, @NotBlank String courseCode, CareerDto career, @NotNull Integer year, @NotNull Integer semester, boolean optative) implements
		Serializable {
}
