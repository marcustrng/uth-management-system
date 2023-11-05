package com.uth.ums.enrollment.service.impl;


import com.uth.ums.enrollment.service.UniversityClassService;
import com.uth.ums.enrollment.model.dto.UniversityClassDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversityClassServiceImpl implements UniversityClassService {
    @Override
    public List<UniversityClassDto> getAll() {
        return null;
    }

    @Override
    public UniversityClassDto getById(Long id) {
        return null;
    }

    @Override
    public UniversityClassDto createNew(UniversityClassDto dto) {
        return null;
    }

    @Override
    public UniversityClassDto update(Long id, UniversityClassDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
