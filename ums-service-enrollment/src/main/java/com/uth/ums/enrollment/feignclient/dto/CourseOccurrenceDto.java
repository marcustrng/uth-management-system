package com.uth.ums.enrollment.feignclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

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
