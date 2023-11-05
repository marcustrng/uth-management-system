package com.uth.ums.career.controller;

import com.uth.ums.career.model.dto.CareerLevelDto;
import com.uth.ums.career.service.CareerLevelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/career-levels")
@RequiredArgsConstructor
public class CareerLevelController {
    private final CareerLevelService careerLevelService;

    @GetMapping()
    public ResponseEntity<List<CareerLevelDto>> getAll() {
        return ResponseEntity.ok(careerLevelService.getAll());
    }
}
