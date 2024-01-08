package com.uth.ums.career.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uth.ums.career.feignclient.dto.CourseOccurrenceDto;
import java.io.Serializable;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Course}
 */
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
