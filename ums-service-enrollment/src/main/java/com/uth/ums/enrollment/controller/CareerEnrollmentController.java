package com.uth.ums.enrollment.controller;

import com.uth.ums.enrollment.model.dto.CareerEnrollmentDto;
import com.uth.ums.enrollment.service.CareerEnrollmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/career-enrollments")
public class CareerEnrollmentController {

  private final CareerEnrollmentService careerEnrollmentService;

  @Autowired
  public CareerEnrollmentController(CareerEnrollmentService careerEnrollmentService) {
    this.careerEnrollmentService = careerEnrollmentService;
  }

  @PostMapping
  public ResponseEntity<CareerEnrollmentDto> createCareerEnrollment(
      @RequestBody CareerEnrollmentDto careerEnrollmentDTO) {
    CareerEnrollmentDto createdCareerEnrollment =
        careerEnrollmentService.createCareerEnrollment(careerEnrollmentDTO);
    return new ResponseEntity<>(createdCareerEnrollment, HttpStatus.CREATED);
  }

  @PutMapping("/{careerEnrollmentId}")
  public ResponseEntity<CareerEnrollmentDto> updateCareerEnrollment(
      @PathVariable Long careerEnrollmentId, @RequestBody CareerEnrollmentDto careerEnrollmentDTO) {
    CareerEnrollmentDto updatedCareerEnrollment =
        careerEnrollmentService.updateCareerEnrollment(careerEnrollmentId, careerEnrollmentDTO);
    return new ResponseEntity<>(updatedCareerEnrollment, HttpStatus.OK);
  }

  @DeleteMapping("/{careerEnrollmentId}")
  public ResponseEntity<Void> deleteCareerEnrollment(@PathVariable Long careerEnrollmentId) {
    careerEnrollmentService.deleteCareerEnrollment(careerEnrollmentId);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @GetMapping("/{careerEnrollmentId}")
  public ResponseEntity<CareerEnrollmentDto> getCareerEnrollmentById(
      @PathVariable Long careerEnrollmentId) {
    CareerEnrollmentDto careerEnrollment =
        careerEnrollmentService.getCareerEnrollmentById(careerEnrollmentId);
    return new ResponseEntity<>(careerEnrollment, HttpStatus.OK);
  }

  @GetMapping
  public ResponseEntity<List<CareerEnrollmentDto>> getAllCareerEnrollments() {
    List<CareerEnrollmentDto> careerEnrollments = careerEnrollmentService.getAllCareerEnrollments();
    return new ResponseEntity<>(careerEnrollments, HttpStatus.OK);
  }
}
