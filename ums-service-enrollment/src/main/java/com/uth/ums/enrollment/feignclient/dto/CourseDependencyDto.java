package com.uth.ums.enrollment.feignclient.dto;

import java.io.Serializable;

public record CourseDependencyDto(CourseDto course, CourseDto requiredCourse) implements
		Serializable {
}
