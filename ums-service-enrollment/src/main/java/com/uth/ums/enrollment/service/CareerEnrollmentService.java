package com.uth.ums.enrollment.service;

import com.uth.ums.enrollment.model.dto.CareerEnrollmentDto;
import java.util.List;

public interface CareerEnrollmentService {
  CareerEnrollmentDto createCareerEnrollment(CareerEnrollmentDto careerEnrollmentDTO);

  CareerEnrollmentDto updateCareerEnrollment(
      Long careerEnrollmentId, CareerEnrollmentDto careerEnrollmentDTO);

  void deleteCareerEnrollment(Long careerEnrollmentId);

  CareerEnrollmentDto getCareerEnrollmentById(Long careerEnrollmentId);

  List<CareerEnrollmentDto> getAllCareerEnrollments();
}
