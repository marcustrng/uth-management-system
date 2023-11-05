package com.uth.ums.career.service;

import com.uth.ums.career.model.dto.FacultyDto;

import java.util.List;

public interface FacultyService {
    List<FacultyDto> getAll();
    FacultyDto getById(Long id);
    FacultyDto createNew(FacultyDto dto);
    FacultyDto update(Long id, FacultyDto dto);
    void delete(Long id);
}
