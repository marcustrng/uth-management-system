package com.uth.ums.enrollment.service;

import com.uth.ums.enrollment.model.dto.StudentDto;
import java.util.List;

public interface StudentService {
    List<StudentDto> getAll();
    StudentDto getById(Long id);
    StudentDto createNew(StudentDto dto);
    StudentDto update(Long id, StudentDto dto);
    void delete(Long id);
}
