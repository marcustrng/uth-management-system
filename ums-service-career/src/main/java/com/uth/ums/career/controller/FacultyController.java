package com.uth.ums.career.controller;

import com.uth.ums.career.model.dto.FacultyDto;
import com.uth.ums.career.service.FacultyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/faculties")
@RequiredArgsConstructor
public class FacultyController {
    private final FacultyService facultyService;

    @GetMapping()
    public ResponseEntity<List<FacultyDto>> getAll() {
        return ResponseEntity.ok(facultyService.getAll());
    }
}
