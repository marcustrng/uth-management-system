package com.uth.ums.career.service;

import com.uth.ums.career.model.dto.CareerDto;

import java.util.List;

public interface CareerService {
    List<CareerDto> getAll();
    CareerDto getById(Long id);
    CareerDto createNew(CareerDto dto);
    CareerDto update(Long id, CareerDto dto);
    void delete(Long id);
}
