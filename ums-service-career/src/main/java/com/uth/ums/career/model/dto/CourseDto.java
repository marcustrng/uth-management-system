package com.uth.ums.career.model.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Course}
 */
@Value
public class CourseDto implements Serializable {
    Long courseId;
    String courseName;
    String courseCode;
    Integer credits;
    transient Set<ProfessorCourseDto> professorCourses;
}
