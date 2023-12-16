package com.uth.ums.career.model.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.uth.ums.career.model.entity.CourseDependency}
 */
public record CourseDependencyDto(CourseDto course, CourseDto requiredCourse) implements
		Serializable {
}
