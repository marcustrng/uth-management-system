package com.uth.ums.student.service;

import com.uth.ums.student.model.dto.StudentDto;
import java.util.List;

public interface StudentService {
    List<StudentDto> getAll();
    StudentDto getById(Long id);
    StudentDto createNew(StudentDto dto);
    StudentDto update(Long id, StudentDto dto);
    void delete(Long id);
}
