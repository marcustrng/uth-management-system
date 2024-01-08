package com.uth.ums.enrollment.feignclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ScheduleDto(
    Long scheduleId,
    String dayOfWeek,
    LocalDateTime startTime,
    LocalDateTime endTime,
    RoomDto room)
    implements Serializable {}
