package com.uth.ums.schedule.service.impl;

import com.uth.ums.schedule.model.dto.CourseOccurrenceDto;
import com.uth.ums.schedule.service.CourseOccurrenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseOccurrenceServiceImpl implements CourseOccurrenceService {
    @Override
    public List<CourseOccurrenceDto> getAll() {
        return null;
    }

    @Override
    public List<CourseOccurrenceDto> getAllByClassCode(String classCode) {
        return null;
    }

    @Override
    public CourseOccurrenceDto getById(Long id) {
        return null;
    }

    @Override
    public CourseOccurrenceDto createNew(CourseOccurrenceDto dto) {
        return null;
    }

    @Override
    public CourseOccurrenceDto update(Long id, CourseOccurrenceDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
