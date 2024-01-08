package com.uth.ums.enrollment.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * DTO for {@link com.uth.ums.enrollment.model.entity.CourseEnrollmentEvaluation}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseEnrollmentEvaluationDto implements Serializable {

	Long courseEnrollmentEvaluationId;
	EvaluationTypeDto evaluationType;
	LocalDate evaluationDate;
	BigDecimal score;
}
