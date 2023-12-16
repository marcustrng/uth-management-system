package com.uth.ums.career.controller;

import com.uth.ums.career.model.entity.Professor;
import com.uth.ums.career.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
	private final ProfessorService professorService;

	@Autowired
	public ProfessorController(ProfessorService professorService) {
		this.professorService = professorService;
	}

	@GetMapping
	public ResponseEntity<List<Professor>> getAllProfessors() {
		List<Professor> professors = professorService.getAllProfessors();
		return new ResponseEntity<>(professors, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Professor> getProfessorById(@PathVariable Long id) {
		Optional<Professor> professor = professorService.getProfessorById(id);
		return professor.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping
	public ResponseEntity<Professor> createProfessor(@RequestBody Professor professor) {
		Professor createdProfessor = professorService.saveProfessor(professor);
		return new ResponseEntity<>(createdProfessor, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Professor> updateProfessor(@PathVariable Long id, @RequestBody Professor professor) {
		Optional<Professor> existingProfessor = professorService.getProfessorById(id);
		if (existingProfessor.isPresent()) {
			professor.setProfessorId(id);
			Professor updatedProfessor = professorService.saveProfessor(professor);
			return new ResponseEntity<>(updatedProfessor, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProfessor(@PathVariable Long id) {
		Optional<Professor> existingProfessor = professorService.getProfessorById(id);
		if (existingProfessor.isPresent()) {
			professorService.deleteProfessor(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
