package com.uth.ums.enrollment.service;

import com.uth.ums.enrollment.model.dto.CourseEnrollmentEvaluationDto;

public interface CourseEnrollmentEvaluationService {

  CourseEnrollmentEvaluationDto createCourseEnrollmentEvaluation(
      CourseEnrollmentEvaluationDto courseEnrollmentEvaluationDTO);

  CourseEnrollmentEvaluationDto updateCourseEnrollmentEvaluation(
      Long id, CourseEnrollmentEvaluationDto courseEnrollmentEvaluationDTO);

  void deleteCourseEnrollmentEvaluation(Long id);

  CourseEnrollmentEvaluationDto getCourseEnrollmentEvaluationById(Long id);
}
