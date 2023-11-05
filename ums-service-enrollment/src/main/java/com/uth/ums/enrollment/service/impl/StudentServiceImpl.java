package com.uth.ums.enrollment.service.impl;

import com.uth.ums.enrollment.model.entity.Student;
import com.uth.ums.enrollment.repository.StudentRepository;
import com.uth.ums.enrollment.service.StudentService;
import com.uth.ums.enrollment.model.dto.StudentDto;
import com.uth.ums.enrollment.model.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    @Override
    public List<StudentDto> getAll() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(studentMapper::toDto).toList();
    }

    @Override
    public StudentDto getById(Long id) {
        return null;
    }

    @Override
    public StudentDto createNew(StudentDto dto) {
        return null;
    }

    @Override
    public StudentDto update(Long id, StudentDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
