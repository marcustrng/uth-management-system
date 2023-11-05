package com.uth.ums.student.controller;

import com.uth.ums.student.model.dto.StudentDto;
import com.uth.ums.student.model.dto.UniversityClassDto;
import com.uth.ums.student.service.UniversityClassService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/classes")
@RequiredArgsConstructor
public class UniversityClassController {
	private final UniversityClassService universityClassService;

	@GetMapping()
	public ResponseEntity<List<UniversityClassDto>> getAll() {
		return ResponseEntity.ok(universityClassService.getAll());
	}
}
