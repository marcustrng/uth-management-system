package com.uth.ums.enrollment.service.impl;

import com.uth.ums.enrollment.feignclient.dto.CareerDto;
import com.uth.ums.enrollment.feignclient.service.CareerApiClient;
import com.uth.ums.enrollment.model.dto.CareerEnrollmentDto;
import com.uth.ums.enrollment.model.dto.StudentDto;
import com.uth.ums.enrollment.model.entity.Student;
import com.uth.ums.enrollment.model.mapper.StudentMapper;
import com.uth.ums.enrollment.repository.StudentRepository;
import com.uth.ums.enrollment.service.StudentService;
import java.util.Objects;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;
	private final CareerApiClient careerApiClient;

	@Override
	public StudentDto createStudent(StudentDto studentDTO) {
		Student student = new Student();
		BeanUtils.copyProperties(studentDTO, student);
		Student savedStudent = studentRepository.save(student);
		return StudentMapper.INSTANCE.toDto(savedStudent);
	}

	@Override
	public StudentDto updateStudent(int studentId, StudentDto studentDTO) {
		Optional<Student> optionalStudent = studentRepository.findById(studentId);
		if (optionalStudent.isPresent()) {
			Student student = optionalStudent.get();
			BeanUtils.copyProperties(studentDTO, student);
			Student updatedStudent = studentRepository.save(student);
			return StudentMapper.INSTANCE.toDto(updatedStudent);
		}
		return null;
	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);
	}

	@Override
	public StudentDto getStudentById(int studentId) {
		Optional<Student> optionalStudent = studentRepository.findById(studentId);
		StudentDto studentDto = optionalStudent.map(StudentMapper.INSTANCE::toDto).orElse(new StudentDto());

		studentDto.getCareerEnrollments().forEach(careerEnrollmentDto -> {
			Long careerId = careerEnrollmentDto.getCareerId();
			CareerDto careerById = careerApiClient.getCareerById(careerId);
			if (Objects.nonNull(careerById)) {
				careerEnrollmentDto.setCareerDto(careerById);
			}
		});

		return studentDto;
	}

	@Override
	public List<StudentDto> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		return students.stream().map(StudentMapper.INSTANCE::toDto).toList();
	}
}
