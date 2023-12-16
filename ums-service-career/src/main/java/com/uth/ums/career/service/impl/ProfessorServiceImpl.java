package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.entity.Professor;
import com.uth.ums.career.repository.ProfessorRepository;
import com.uth.ums.career.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorServiceImpl implements ProfessorService {
	private final ProfessorRepository professorRepository;

	@Autowired
	public ProfessorServiceImpl(ProfessorRepository professorRepository) {
		this.professorRepository = professorRepository;
	}

	@Override
	public List<Professor> getAllProfessors() {
		return professorRepository.findAll();
	}

	@Override
	public Optional<Professor> getProfessorById(Long id) {
		return professorRepository.findById(id);
	}

	@Override
	public Professor saveProfessor(Professor professor) {
		return professorRepository.save(professor);
	}

	@Override
	public void deleteProfessor(Long id) {
		professorRepository.deleteById(id);
	}
}
