package com.uth.ums.schedule.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDateTime;

/** DTO for {@link com.uth.ums.schedule.model.entity.Schedule} */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ScheduleDto(
    Long scheduleId,
    CourseOccurrenceDto courseOccurrence,
    String dayOfWeek,
    LocalDateTime startTime,
    LocalDateTime endTime,
    RoomDto room)
    implements Serializable {}
