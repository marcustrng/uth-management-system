package com.uth.ums.enrollment.feignclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AssistantProfessorDto(CourseOccurrenceDto courseOccurrence)
		implements Serializable {

}
