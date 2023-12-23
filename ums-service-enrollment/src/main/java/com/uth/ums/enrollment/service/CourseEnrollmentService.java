package com.uth.ums.enrollment.service;

import com.uth.ums.enrollment.model.dto.CourseEnrollmentDto;

public interface CourseEnrollmentService {
  CourseEnrollmentDto createCourseEnrollment(CourseEnrollmentDto courseEnrollmentDTO);

  CourseEnrollmentDto updateCourseEnrollment(
      Long careerEnrollmentId, CourseEnrollmentDto careerEnrollmentDTO);

  void deleteCourseEnrollment(Long id);

  CourseEnrollmentDto getCourseEnrollmentById(Long id);

  // Other methods for retrieving or querying course enrollments
}
