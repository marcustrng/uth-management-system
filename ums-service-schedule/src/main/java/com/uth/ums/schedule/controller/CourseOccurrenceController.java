package com.uth.ums.schedule.controller;

import com.uth.ums.schedule.model.dto.CourseOccurrenceDto;
import com.uth.ums.schedule.model.entity.CourseOccurrence;
import com.uth.ums.schedule.model.mapper.CourseOccurrenceMapper;
import com.uth.ums.schedule.service.CourseOccurrenceService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course-occurrences")
public class CourseOccurrenceController {

	private final CourseOccurrenceService courseOccurrenceService;

	public CourseOccurrenceController(CourseOccurrenceService courseOccurrenceService) {
		this.courseOccurrenceService = courseOccurrenceService;
	}

	@GetMapping
	public ResponseEntity<List<CourseOccurrenceDto>> getAllCourseOccurrences() {
		List<CourseOccurrence> courseOccurrences = courseOccurrenceService.getAllCourseOccurrences();
		List<CourseOccurrenceDto> dtoList =
				courseOccurrences.stream()
						.map(CourseOccurrenceMapper.INSTANCE::toDto)
						.collect(Collectors.toList());
		return ResponseEntity.ok(dtoList);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CourseOccurrenceDto> getCourseOccurrenceById(
			@PathVariable("id") Long courseOccurrenceId) {
		CourseOccurrence courseOccurrence =
				courseOccurrenceService.getCourseOccurrenceById(courseOccurrenceId);
		if (courseOccurrence == null) {
			return ResponseEntity.notFound().build();
		}
		CourseOccurrenceDto dto = CourseOccurrenceMapper.INSTANCE.toDto(courseOccurrence);
		return ResponseEntity.ok(dto);
	}

	@PostMapping
	public ResponseEntity<CourseOccurrenceDto> createCourseOccurrence(
			@RequestBody CourseOccurrenceDto courseOccurrenceDTO) {
		CourseOccurrence courseOccurrence = CourseOccurrenceMapper.INSTANCE.toEntity(courseOccurrenceDTO);
		CourseOccurrence createdCourseOccurrence =
				courseOccurrenceService.createCourseOccurrence(courseOccurrence);
		CourseOccurrenceDto createdDTO = CourseOccurrenceMapper.INSTANCE.toDto(createdCourseOccurrence);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdDTO);
	}

	@PutMapping("/{id}")
	public ResponseEntity<CourseOccurrenceDto> updateCourseOccurrence(
			@PathVariable("id") Long courseOccurrenceId,
			@RequestBody CourseOccurrenceDto courseOccurrenceDTO) {
		CourseOccurrence existingCourseOccurrence =
				courseOccurrenceService.getCourseOccurrenceById(courseOccurrenceId);
		if (existingCourseOccurrence == null) {
			return ResponseEntity.notFound().build();
		}
		CourseOccurrence updatedCourseOccurrence = CourseOccurrenceMapper.INSTANCE.toEntity(courseOccurrenceDTO);
		updatedCourseOccurrence.setCourseOccurrenceId(existingCourseOccurrence.getCourseOccurrenceId());
		CourseOccurrence savedCourseOccurrence =
				courseOccurrenceService.updateCourseOccurrence(updatedCourseOccurrence);
		CourseOccurrenceDto savedDTO = CourseOccurrenceMapper.INSTANCE.toDto(savedCourseOccurrence);
		return ResponseEntity.ok(savedDTO);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCourseOccurrence(@PathVariable("id") Long courseOccurrenceId) {
		CourseOccurrence courseOccurrence =
				courseOccurrenceService.getCourseOccurrenceById(courseOccurrenceId);
		if (courseOccurrence == null) {
			return ResponseEntity.notFound().build();
		}
		courseOccurrenceService.deleteCourseOccurrence(courseOccurrenceId);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("")
	public ResponseEntity<CourseOccurrenceDto> getCourseOccurrenceByCourseId(@RequestParam Long courseId) {
		CourseOccurrence courseOccurrence = courseOccurrenceService.getCourseOccurrenceByCourseId(courseId);
		if (courseOccurrence == null) {
			return ResponseEntity.notFound().build();
		}
		CourseOccurrenceDto dto = CourseOccurrenceMapper.INSTANCE.toDto(courseOccurrence);
		return ResponseEntity.ok(dto);
	}
}
