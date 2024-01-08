package com.uth.ums.enrollment.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uth.ums.enrollment.feignclient.dto.CareerDto;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * DTO for {@link com.uth.ums.enrollment.model.entity.CareerEnrollment}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CareerEnrollmentDto implements Serializable {

	Long careerEnrollmentId;
	Long studentId;
	Long careerId;
	Date enrollmentDate;
	Long careerStatusId;
	Date careerStatusDate;
	CareerStatusDto careerStatus;
	CareerDto careerDto;
}
