package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.dto.SemesterDto;
import com.uth.ums.career.model.mapper.SemesterMapper;
import com.uth.ums.career.repository.SemesterRepository;
import com.uth.ums.career.service.SemesterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SemesterServiceImpl implements SemesterService {
    private final SemesterRepository semesterRepository;
    private final SemesterMapper semesterMapper;
    @Override
    public List<SemesterDto> getAll() {
        return semesterRepository.findAll().stream().map(semesterMapper::toDto).toList();
    }

    @Override
    public SemesterDto getById(Long id) {
        return null;
    }

    @Override
    public SemesterDto createNew(SemesterDto dto) {
        return null;
    }

    @Override
    public SemesterDto update(Long id, SemesterDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
