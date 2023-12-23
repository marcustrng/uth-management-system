package com.uth.ums.schedule.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uth.ums.schedule.model.entity.AssistantProfessor.AssistantProfessorId;
import java.io.Serializable;

/** DTO for {@link com.uth.ums.schedule.model.entity.AssistantProfessor} */
@JsonIgnoreProperties(ignoreUnknown = true)
public record AssistantProfessorDto(AssistantProfessorId id, CourseOccurrenceDto courseOccurrence)
    implements Serializable {}
