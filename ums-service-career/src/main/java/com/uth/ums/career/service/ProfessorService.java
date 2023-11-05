package com.uth.ums.career.service;

import com.uth.ums.career.model.dto.ProfessorDto;

import java.util.List;

public interface ProfessorService {
    List<ProfessorDto> getAll();
    ProfessorDto getById(Long id);
    ProfessorDto createNew(ProfessorDto dto);
    ProfessorDto update(Long id, ProfessorDto dto);
    void delete(Long id);
}
