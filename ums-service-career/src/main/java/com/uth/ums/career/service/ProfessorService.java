package com.uth.ums.career.service;

import com.uth.ums.career.model.entity.Professor;
import java.util.List;
import java.util.Optional;

public interface ProfessorService {
	List<Professor> getAllProfessors();

	Optional<Professor> getProfessorById(Long id);

	Professor saveProfessor(Professor professor);

	void deleteProfessor(Long id);
}
