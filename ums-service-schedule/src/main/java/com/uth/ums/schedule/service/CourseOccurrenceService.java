package com.uth.ums.schedule.service;

import com.uth.ums.schedule.model.dto.CourseOccurrenceDto;

import java.util.List;

public interface CourseOccurrenceService {
    List<CourseOccurrenceDto> getAll();
    List<CourseOccurrenceDto> getAllByClassCode(String classCode);
    CourseOccurrenceDto getById(Long id);
    CourseOccurrenceDto createNew(CourseOccurrenceDto dto);
    CourseOccurrenceDto update(Long id, CourseOccurrenceDto dto);
    void delete(Long id);
}
