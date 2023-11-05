package com.uth.ums.career.controller;

import com.uth.ums.career.model.dto.SemesterDto;
import com.uth.ums.career.service.SemesterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/semesters")
@RequiredArgsConstructor
public class SemesterController {
    private final SemesterService semesterService;

    @GetMapping()
    public ResponseEntity<List<SemesterDto>> getAll() {
        return ResponseEntity.ok(semesterService.getAll());
    }
}
