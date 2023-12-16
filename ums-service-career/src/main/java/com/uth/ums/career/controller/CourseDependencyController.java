package com.uth.ums.career.controller;

import com.uth.ums.career.model.entity.CourseDependency;
import com.uth.ums.career.service.CourseDependencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course-dependencies")
public class CourseDependencyController {
	private final CourseDependencyService courseDependencyService;

	@Autowired
	public CourseDependencyController(CourseDependencyService courseDependencyService) {
		this.courseDependencyService = courseDependencyService;
	}

	@GetMapping
	public ResponseEntity<List<CourseDependency>> getAllCourseDependencies() {
		List<CourseDependency> courseDependencies = courseDependencyService.getAllCourseDependencies();
		return new ResponseEntity<>(courseDependencies, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CourseDependency> getCourseDependencyById(@PathVariable Long id) {
		Optional<CourseDependency> courseDependency = courseDependencyService.getCourseDependencyById(id);
		return courseDependency.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping
	public ResponseEntity<CourseDependency> createCourseDependency(@RequestBody CourseDependency courseDependency) {
		CourseDependency createdCourseDependency = courseDependencyService.saveCourseDependency(courseDependency);
		return new ResponseEntity<>(createdCourseDependency, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<CourseDependency> updateCourseDependency(@PathVariable Long id, @RequestBody CourseDependency courseDependency) {
		Optional<CourseDependency> existingCourseDependency = courseDependencyService.getCourseDependencyById(id);
		if (existingCourseDependency.isPresent()) {
			CourseDependency updatedCourseDependency = courseDependencyService.saveCourseDependency(courseDependency);
			return new ResponseEntity<>(updatedCourseDependency, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCourseDependency(@PathVariable Long id) {
		Optional<CourseDependency> existingCourseDependency = courseDependencyService.getCourseDependencyById(id);
		if (existingCourseDependency.isPresent()) {
			courseDependencyService.deleteCourseDependency(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
