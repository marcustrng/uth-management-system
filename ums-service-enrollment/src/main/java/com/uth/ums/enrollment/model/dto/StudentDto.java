package com.uth.ums.enrollment.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * DTO for {@link com.uth.ums.enrollment.model.entity.Student}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentDto implements Serializable {

	int studentId;
	String lastName;
	String firstName;
	LocalDate dateOfBirth;
	String email;
	String phoneNumber;
	Set<CourseEnrollmentDto> courseEnrollments = new HashSet<>();
	Set<CareerEnrollmentDto> careerEnrollments = new HashSet<>();
}
