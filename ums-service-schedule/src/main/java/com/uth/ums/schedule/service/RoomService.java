package com.uth.ums.schedule.service;

import com.uth.ums.schedule.model.dto.RoomDto;

import java.util.List;

public interface RoomService {
    List<RoomDto> getAll();
    RoomDto getById(Long id);
    RoomDto createNew(RoomDto dto);
    RoomDto update(Long id, RoomDto dto);
    void delete(Long id);
}
