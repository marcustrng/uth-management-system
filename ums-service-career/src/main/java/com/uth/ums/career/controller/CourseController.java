package com.uth.ums.career.controller;

import com.uth.ums.career.model.entity.Course;
import com.uth.ums.career.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {
	private final CourseService courseService;

	@Autowired
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@GetMapping
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> courses = courseService.getAllCourses();
		return new ResponseEntity<>(courses, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
		Optional<Course> course = courseService.getCourseById(id);
		return course.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		Course createdCourse = courseService.saveCourse(course);
		return new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Course> updateCourse(@PathVariable Long id, @RequestBody Course course) {
		Optional<Course> existingCourse = courseService.getCourseById(id);
		if (existingCourse.isPresent()) {
			course.setCourseId(id);
			Course updatedCourse = courseService.saveCourse(course);
			return new ResponseEntity<>(updatedCourse, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
		Optional<Course> existingCourse = courseService.getCourseById(id);
		if (existingCourse.isPresent()) {
			courseService.deleteCourse(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
