package com.uth.ums.career.controller;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.dto.CourseDto;
import com.uth.ums.career.model.mapper.CareerMapper;
import com.uth.ums.career.service.CareerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/careers")
@RequiredArgsConstructor
public class CareerController {
    private final CareerService careerService;

    @GetMapping()
    public ResponseEntity<List<CareerDto>> getAll() {
        return ResponseEntity.ok(careerService.getAll());
    }

    @PostMapping()
    public ResponseEntity<CareerDto> save(@RequestBody CareerDto careerDto) {
        log.info("Career initiated in career-service from {}", careerDto.toString());
        return ResponseEntity.ok(careerService.createNew(careerDto));
    }

    @GetMapping(value = "/{id}/semester/{semesterNo}/courses")
    public ResponseEntity<List<CourseDto>> getAllCourseByIdAndSemesterNo(@PathVariable("id") Long id,
        @PathVariable("semesterNo") Integer semesterNo) {
        return ResponseEntity.ok(careerService.getAllCourseByIdAndSemesterNo(id, semesterNo));
    }
}
