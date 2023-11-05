package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.dto.ProfessorCourseDto;
import com.uth.ums.career.service.ProfessorCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorCourseServiceImpl implements ProfessorCourseService {
    @Override
    public List<ProfessorCourseDto> getAll() {
        return null;
    }

    @Override
    public ProfessorCourseDto getById(Long id) {
        return null;
    }

    @Override
    public ProfessorCourseDto createNew(ProfessorCourseDto dto) {
        return null;
    }

    @Override
    public ProfessorCourseDto update(Long id, ProfessorCourseDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
