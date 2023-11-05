package com.uth.ums.schedule.model.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.uth.ums.schedule.model.entity.Schedule}
 */
@Value
public class ScheduleDto implements Serializable {
    Long scheduleId;
    String dayOfWeek;
    LocalDate startDate;
    LocalDate endDate;
    RoomDto room;
}
