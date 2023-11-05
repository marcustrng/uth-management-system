package com.uth.ums.enrollment.model.dto;

import com.uth.ums.enrollment.model.entity.CourseEnrollment;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link CourseEnrollment}
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
