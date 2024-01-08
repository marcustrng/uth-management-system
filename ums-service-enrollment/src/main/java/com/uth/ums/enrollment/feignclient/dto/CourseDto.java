package com.uth.ums.enrollment.feignclient.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

public record CourseDto(Long courseId, @NotBlank String courseName, @NotBlank String courseCode, CareerDto career, @NotNull Integer year, @NotNull Integer semester, boolean optative,
                        Set<ProfessorCourseDto> professorCourses, ProfessorDto professor) implements
		Serializable {
}
