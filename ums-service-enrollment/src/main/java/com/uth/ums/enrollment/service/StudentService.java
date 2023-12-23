package com.uth.ums.enrollment.service;

import com.uth.ums.enrollment.model.dto.StudentDto;
import java.util.List;

public interface StudentService {
  StudentDto createStudent(StudentDto studentDTO);

  StudentDto updateStudent(int studentId, StudentDto studentDTO);

  void deleteStudent(int studentId);

  StudentDto getStudentById(int studentId);

  List<StudentDto> getAllStudents();
}
