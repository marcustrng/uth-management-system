package com.uth.ums.student.model.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.uth.ums.student.model.entity.CourseEnrollment}
 */
@Value
public class CourseEnrollmentDto implements Serializable {
    Long courseEnrollmentId;
    Long courseOccurrenceId;
    Double attendanceScore;
    Double progressScore;
    Double midtermExamScore;
    Double finalExamScore;
    Double finalScore;
    StudentDto student;
}
