package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.dto.ProfessorDto;
import com.uth.ums.career.model.mapper.ProfessorMapper;
import com.uth.ums.career.repository.ProfessorRepository;
import com.uth.ums.career.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl implements ProfessorService {
    private final ProfessorRepository professorRepository;
    private final ProfessorMapper professorMapper;

    @Override
    public List<ProfessorDto> getAll() {
        return professorRepository.findAll().stream().map(professorMapper::toDto).toList();
    }

    @Override
    public ProfessorDto getById(Long id) {
        return null;
    }

    @Override
    public ProfessorDto createNew(ProfessorDto dto) {
        return null;
    }

    @Override
    public ProfessorDto update(Long id, ProfessorDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
