package com.uth.ums.enrollment.feignclient.dto;


import java.io.Serializable;

public record ProfessorCourseDto(ProfessorDto professor, CourseDto course) implements Serializable {
}
