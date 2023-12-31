package com.uth.ums.schedule.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

/** DTO for {@link com.uth.ums.schedule.model.entity.CourseOccurrence} */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CourseOccurrenceDto(
		Long courseOccurrenceId,
		Integer courseId,
		Integer occurrenceYear,
		String courseOccurrenceCode,
		Integer professorId,
		LocalDate startDate,
		LocalDate endDate,
		Integer capacity, Set<ScheduleDto> schedules)
    implements Serializable {}
