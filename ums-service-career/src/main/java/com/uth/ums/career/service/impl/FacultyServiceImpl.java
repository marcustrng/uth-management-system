package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.dto.FacultyDto;
import com.uth.ums.career.model.mapper.FacultyMapper;
import com.uth.ums.career.repository.FacultyRepository;
import com.uth.ums.career.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FacultyServiceImpl implements FacultyService {
    private final FacultyRepository facultyRepository;
    private final FacultyMapper facultyMapper;

    @Override
    public List<FacultyDto> getAll() {
        return facultyRepository.findAll().stream().map(facultyMapper::toDto).toList();
    }

    @Override
    public FacultyDto getById(Long id) {
        return null;
    }

    @Override
    public FacultyDto createNew(FacultyDto dto) {
        return null;
    }

    @Override
    public FacultyDto update(Long id, FacultyDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
