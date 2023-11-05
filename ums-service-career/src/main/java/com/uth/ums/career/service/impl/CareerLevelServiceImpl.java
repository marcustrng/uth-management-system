package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.dto.CareerLevelDto;
import com.uth.ums.career.model.mapper.CareerLevelMapper;
import com.uth.ums.career.repository.CareerLevelRepository;
import com.uth.ums.career.service.CareerLevelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CareerLevelServiceImpl implements CareerLevelService {
    private final CareerLevelRepository careerLevelRepository;
    private final CareerLevelMapper careerLevelMapper;

    @Override
    public List<CareerLevelDto> getAll() {
        return careerLevelRepository.findAll().stream().map(careerLevelMapper::toDto).toList();
    }

    @Override
    public CareerLevelDto getById(Long id) {
        return null;
    }

    @Override
    public CareerLevelDto createNew(CareerLevelDto dto) {
        return null;
    }

    @Override
    public CareerLevelDto update(Long id, CareerLevelDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
