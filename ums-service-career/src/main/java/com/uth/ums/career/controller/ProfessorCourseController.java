package com.uth.ums.career.controller;

import com.uth.ums.career.model.entity.ProfessorCourse;
import com.uth.ums.career.service.ProfessorCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professor-courses")
public class ProfessorCourseController {
	private final ProfessorCourseService professorCourseService;

	@Autowired
	public ProfessorCourseController(ProfessorCourseService professorCourseService) {
		this.professorCourseService = professorCourseService;
	}

	@GetMapping
	public ResponseEntity<List<ProfessorCourse>> getAllProfessorCourses() {
		List<ProfessorCourse> professorCourses = professorCourseService.getAllProfessorCourses();
		return new ResponseEntity<>(professorCourses, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProfessorCourse> getProfessorCourseById(@PathVariable Long id) {
		Optional<ProfessorCourse> professorCourse = professorCourseService.getProfessorCourseById(id);
		return professorCourse.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping
	public ResponseEntity<ProfessorCourse> createProfessorCourse(@RequestBody ProfessorCourse professorCourse) {
		ProfessorCourse createdProfessorCourse = professorCourseService.saveProfessorCourse(professorCourse);
		return new ResponseEntity<>(createdProfessorCourse, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ProfessorCourse> updateProfessorCourse(@PathVariable Long id, @RequestBody ProfessorCourse professorCourse) {
		Optional<ProfessorCourse> existingProfessorCourse = professorCourseService.getProfessorCourseById(id);
		if (existingProfessorCourse.isPresent()) {
			ProfessorCourse updatedProfessorCourse = professorCourseService.saveProfessorCourse(professorCourse);
			return new ResponseEntity<>(updatedProfessorCourse, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProfessorCourse(@PathVariable Long id) {
		Optional<ProfessorCourse> existingProfessorCourse = professorCourseService.getProfessorCourseById(id);
		if (existingProfessorCourse.isPresent()) {
			professorCourseService.deleteProfessorCourse(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
