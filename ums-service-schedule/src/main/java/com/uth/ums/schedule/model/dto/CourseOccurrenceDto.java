package com.uth.ums.schedule.model.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

/**
 * DTO for {@link com.uth.ums.schedule.model.entity.CourseOccurrence}
 */
@Value
public class CourseOccurrenceDto implements Serializable {
    Long courseOccurrenceId;
    Long courseId;
    Long professorId;
    String courseOccurrenceCode;
    String classCode;
    LocalDate startDate;
    LocalDate endDate;
    int capacity;
    Set<ScheduleDto> schedules;
}
