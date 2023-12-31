package com.uth.ums.enrollment.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Set;

/** DTO for {@link com.uth.ums.enrollment.model.entity.CourseEnrollment} */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CourseEnrollmentDto(
		Long courseEnrollmentId, Long studentId, Long courseOccurrenceId, Double finalScore,
		Set<CourseEnrollmentEvaluationDto> courseEnrollmentEvaluations)
    implements Serializable {}
