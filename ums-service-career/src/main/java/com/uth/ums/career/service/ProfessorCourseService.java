package com.uth.ums.career.service;

import com.uth.ums.career.model.entity.ProfessorCourse;
import java.util.List;
import java.util.Optional;

public interface ProfessorCourseService {
	List<ProfessorCourse> getAllProfessorCourses();

	Optional<ProfessorCourse> getProfessorCourseById(Long id);

	ProfessorCourse saveProfessorCourse(ProfessorCourse professorCourse);

	void deleteProfessorCourse(Long id);
}
