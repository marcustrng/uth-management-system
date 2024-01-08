package com.uth.ums.career.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Set;
import lombok.Value;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Course}
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseDto implements Serializable {

	Long courseId;
	String courseName;
	String courseCode;
	Integer year;
	Integer semester;
	ProfessorDto professor;
}
