package com.uth.ums.career.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Career}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CareerDto implements Serializable {

	Long careerId;
	String careerName;
	DepartmentDto department;
	Integer durationYears;
	Integer requiredOptativeCourses;
	CareerLevelDto careerLevel;
	private Set<CourseDto> courses;
}
