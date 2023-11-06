package com.uth.ums.schedule.controller;

import com.uth.ums.schedule.service.CourseOccurrenceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/course-occurrence")
@RequiredArgsConstructor
public class CourseOccurrenceController {
	private final CourseOccurrenceService courseOccurrenceService;

	@GetMapping("/{classCode}")
	public ResponseEntity getByClassCode(@PathVariable("classCode") String classCode) {
		log.info("Reading CourseOccurrence by classCode {}", classCode);
		return ResponseEntity.ok(courseOccurrenceService.getAllByClassCode(classCode));
	}

}
