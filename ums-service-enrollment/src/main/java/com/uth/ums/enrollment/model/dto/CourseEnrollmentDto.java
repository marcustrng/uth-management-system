package com.uth.ums.enrollment.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * DTO for {@link com.uth.ums.enrollment.model.entity.CourseEnrollment}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseEnrollmentDto implements Serializable {

	Long courseEnrollmentId;
	Long studentId;
	Long courseOccurrenceId;
	Double finalScore;
	Set<CourseEnrollmentEvaluationDto> courseEnrollmentEvaluations;
}
