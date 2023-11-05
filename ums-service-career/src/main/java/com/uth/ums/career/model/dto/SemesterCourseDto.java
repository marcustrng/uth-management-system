package com.uth.ums.career.model.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.uth.ums.career.model.entity.SemesterCourse}
 */
@Value
public class SemesterCourseDto implements Serializable {
    Long semesterCourseId;
    CourseDto course;
}
