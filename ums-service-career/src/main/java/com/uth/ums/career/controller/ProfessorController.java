package com.uth.ums.career.controller;

import com.uth.ums.career.model.dto.ProfessorDto;
import com.uth.ums.career.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/professors")
@RequiredArgsConstructor
public class ProfessorController {
    private final ProfessorService professorService;

    @GetMapping()
    public ResponseEntity<List<ProfessorDto>> getAll() {
        return ResponseEntity.ok(professorService.getAll());
    }
}
