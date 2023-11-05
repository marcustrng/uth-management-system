package com.uth.ums.student.service.impl;


import com.uth.ums.student.model.dto.CourseEnrollmentDto;
import com.uth.ums.student.model.entity.CourseEnrollment;
import com.uth.ums.student.repository.CourseEnrollmentRepository;
import com.uth.ums.student.service.CourseEnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseEnrollmentServiceImpl implements CourseEnrollmentService {
    private final CourseEnrollmentRepository courseEnrollmentRepository;
    @Override
    public List<CourseEnrollmentDto> getAll() {
        return new ArrayList<>();
    }

    @Override
    public CourseEnrollmentDto getById(Long id) {
        return null;
    }

    @Override
    public CourseEnrollmentDto createNew(CourseEnrollmentDto dto) {
        return null;
    }

    @Override
    public CourseEnrollmentDto update(Long id, CourseEnrollmentDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {
        CourseEnrollment courseEnrollment = courseEnrollmentRepository.findById(id).orElseThrow();
        courseEnrollmentRepository.delete(courseEnrollment);
    }
}
