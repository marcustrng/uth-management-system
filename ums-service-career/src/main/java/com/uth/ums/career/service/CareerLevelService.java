package com.uth.ums.career.service;

import com.uth.ums.career.model.dto.CareerLevelDto;

import java.util.List;

public interface CareerLevelService {
    List<CareerLevelDto> getAll();
    CareerLevelDto getById(Long id);
    CareerLevelDto createNew(CareerLevelDto dto);
    CareerLevelDto update(Long id, CareerLevelDto dto);
    void delete(Long id);
}
