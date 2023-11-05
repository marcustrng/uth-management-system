package com.uth.ums.career.service;

import com.uth.ums.career.model.dto.ProfessorCourseDto;

import java.util.List;

public interface ProfessorCourseService {
    List<ProfessorCourseDto> getAll();
    ProfessorCourseDto getById(Long id);
    ProfessorCourseDto createNew(ProfessorCourseDto dto);
    ProfessorCourseDto update(Long id, ProfessorCourseDto dto);
    void delete(Long id);
}
