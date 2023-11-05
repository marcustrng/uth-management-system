package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.dto.CourseDto;
import com.uth.ums.career.model.mapper.CourseMapper;
import com.uth.ums.career.repository.CourseRepository;
import com.uth.ums.career.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    @Override
    public List<CourseDto> getAll() {
        return courseRepository.findAll().stream().map(courseMapper::toDto).toList();
    }

    @Override
    public CourseDto getById(Long id) {
        return null;
    }

    @Override
    public CourseDto createNew(CourseDto dto) {
        return null;
    }

    @Override
    public CourseDto update(Long id, CourseDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
