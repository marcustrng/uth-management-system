package com.uth.ums.enrollment.controller;

import com.uth.ums.enrollment.model.dto.CourseEnrollmentDto;
import com.uth.ums.enrollment.service.CourseEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course-enrollments")
public class CourseEnrollmentController {

  private final CourseEnrollmentService courseEnrollmentService;

  @Autowired
  public CourseEnrollmentController(CourseEnrollmentService courseEnrollmentService) {
    this.courseEnrollmentService = courseEnrollmentService;
  }

  @PostMapping
  public ResponseEntity<CourseEnrollmentDto> createCourseEnrollment(
      @RequestBody CourseEnrollmentDto courseEnrollmentDTO) {
    CourseEnrollmentDto createdCourseEnrollment =
        courseEnrollmentService.createCourseEnrollment(courseEnrollmentDTO);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdCourseEnrollment);
  }

  @PutMapping("/{id}")
  public ResponseEntity<CourseEnrollmentDto> updateCourseEnrollment(
      @PathVariable("id") Long id, @RequestBody CourseEnrollmentDto courseEnrollmentDTO) {

    return ResponseEntity.ok(courseEnrollmentDTO);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteCourseEnrollment(@PathVariable("id") Long id) {
    courseEnrollmentService.deleteCourseEnrollment(id);
    return ResponseEntity.noContent().build();
  }

  @GetMapping("/{id}")
  public ResponseEntity<CourseEnrollmentDto> getCourseEnrollmentById(@PathVariable("id") Long id) {
    CourseEnrollmentDto courseEnrollment = courseEnrollmentService.getCourseEnrollmentById(id);
    return ResponseEntity.ok(courseEnrollment);
  }

  // Other methods for retrieving or querying course enrollments
}
