package com.uth.ums.enrollment.controller;

import com.uth.ums.enrollment.model.dto.CourseEnrollmentDto;
import com.uth.ums.enrollment.service.CourseEnrollmentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/course-enrollments")
@RequiredArgsConstructor
public class CourseEnrollmentController {
	private final CourseEnrollmentService courseEnrollmentService;

	@GetMapping()
	public ResponseEntity<List<CourseEnrollmentDto>> getAll() {
		return ResponseEntity.ok(courseEnrollmentService.getAll());
	}
}
