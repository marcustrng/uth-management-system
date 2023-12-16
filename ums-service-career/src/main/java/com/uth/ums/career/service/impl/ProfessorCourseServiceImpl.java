package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.entity.ProfessorCourse;
import com.uth.ums.career.repository.ProfessorCourseRepository;
import com.uth.ums.career.service.ProfessorCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorCourseServiceImpl implements ProfessorCourseService {
	private final ProfessorCourseRepository professorCourseRepository;

	@Autowired
	public ProfessorCourseServiceImpl(ProfessorCourseRepository professorCourseRepository) {
		this.professorCourseRepository = professorCourseRepository;
	}

	@Override
	public List<ProfessorCourse> getAllProfessorCourses() {
		return professorCourseRepository.findAll();
	}

	@Override
	public Optional<ProfessorCourse> getProfessorCourseById(Long id) {
		return professorCourseRepository.findById(id);
	}

	@Override
	public ProfessorCourse saveProfessorCourse(ProfessorCourse professorCourse) {
		return professorCourseRepository.save(professorCourse);
	}

	@Override
	public void deleteProfessorCourse(Long id) {
		professorCourseRepository.deleteById(id);
	}
}
