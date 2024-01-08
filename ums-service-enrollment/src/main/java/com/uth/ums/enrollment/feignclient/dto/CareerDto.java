package com.uth.ums.enrollment.feignclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
