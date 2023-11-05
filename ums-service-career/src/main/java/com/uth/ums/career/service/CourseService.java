package com.uth.ums.career.service;

import com.uth.ums.career.model.dto.CourseDto;

import java.util.List;

public interface CourseService {
    List<CourseDto> getAll();
    CourseDto getById(Long id);
    CourseDto createNew(CourseDto dto);
    CourseDto update(Long id, CourseDto dto);
    void delete(Long id);
}
