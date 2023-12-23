package com.uth.ums.enrollment.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/** DTO for {@link com.uth.ums.enrollment.model.entity.CourseEnrollmentEvaluation} */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CourseEnrollmentEvaluationDto(
    Long courseEnrollmentEvaluationId,
    CourseEnrollmentDto courseEnrollment,
    EvaluationTypeDto evaluationType,
    LocalDate evaluationDate,
    BigDecimal score)
    implements Serializable {}
