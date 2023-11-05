package com.uth.ums.schedule.service;

import com.uth.ums.schedule.model.dto.RoomDto;
import com.uth.ums.schedule.model.dto.ScheduleDto;

import java.util.List;

public interface ScheduleService {
    List<ScheduleDto> getAll();
    ScheduleDto getById(Long id);
    ScheduleDto createNew(ScheduleDto dto);
    ScheduleDto update(Long id, ScheduleDto dto);
    void delete(Long id);
}
