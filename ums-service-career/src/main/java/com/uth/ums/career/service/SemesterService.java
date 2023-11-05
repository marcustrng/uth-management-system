package com.uth.ums.career.service;

import com.uth.ums.career.model.dto.SemesterDto;

import java.util.List;

public interface SemesterService {
    List<SemesterDto> getAll();
    SemesterDto getById(Long id);
    SemesterDto createNew(SemesterDto dto);
    SemesterDto update(Long id, SemesterDto dto);
    void delete(Long id);
}
