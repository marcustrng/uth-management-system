package com.uth.ums.enrollment.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;

/** DTO for {@link com.uth.ums.enrollment.model.entity.CareerEnrollment} */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CareerEnrollmentDto(
    Long careerEnrollmentId,
    Integer studentId,
    Integer careerId,
    Date enrollmentDate,
    Integer careerStatusId,
    Date careerStatusDate)
    implements Serializable {}
