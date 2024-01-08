package com.uth.ums.enrollment.feignclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseDto implements Serializable {

	Long courseId;
	String courseName;
	String courseCode;
	Integer year;
	Integer semester;
	ProfessorDto professor;

	CourseOccurrenceDto courseOccurrenceDto;
}
