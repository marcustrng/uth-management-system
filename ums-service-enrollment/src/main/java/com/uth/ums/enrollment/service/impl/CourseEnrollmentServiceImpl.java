package com.uth.ums.enrollment.service.impl;

import com.uth.ums.enrollment.exception.NotFoundException;
import com.uth.ums.enrollment.model.dto.CareerEnrollmentDto;
import com.uth.ums.enrollment.model.dto.CourseEnrollmentDto;
import com.uth.ums.enrollment.model.entity.CareerEnrollment;
import com.uth.ums.enrollment.model.entity.CourseEnrollment;
import com.uth.ums.enrollment.model.mapper.CareerEnrollmentMapper;
import com.uth.ums.enrollment.model.mapper.CourseEnrollmentMapper;
import com.uth.ums.enrollment.repository.CourseEnrollmentRepository;
import com.uth.ums.enrollment.service.CourseEnrollmentService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseEnrollmentServiceImpl implements CourseEnrollmentService {

  private final CourseEnrollmentRepository courseEnrollmentRepository;

  @Override
  public CourseEnrollmentDto createCourseEnrollment(CourseEnrollmentDto courseEnrollmentDTO) {
    CourseEnrollment courseEnrollment =
        CourseEnrollmentMapper.INSTANCE.toEntity(courseEnrollmentDTO);
    CourseEnrollment createdCourseEnrollment = courseEnrollmentRepository.save(courseEnrollment);
    return CourseEnrollmentMapper.INSTANCE.toDTO(createdCourseEnrollment);
  }

   @Override
    public CourseEnrollmentDto updateCourseEnrollment(Long careerEnrollmentId, CourseEnrollmentDto careerEnrollmentDTO) {
        Optional<CourseEnrollment> optionalCareerEnrollment = courseEnrollmentRepository.findById(careerEnrollmentId);
        if (optionalCareerEnrollment.isPresent()) {
            CourseEnrollment enrollment = optionalCareerEnrollment.get();
            enrollment.setStudentId(careerEnrollmentDTO.studentId());
            enrollment.setCourseEnrollmentId(careerEnrollmentDTO.courseEnrollmentId());
            enrollment.setCourseOccurrenceId(careerEnrollmentDTO.courseOccurrenceId());
            enrollment.setFinalScore(careerEnrollmentDTO.finalScore());
            CourseEnrollment updatedCareerEnrollment = courseEnrollmentRepository.save(enrollment);
            return CourseEnrollmentMapper.INSTANCE.toDTO(updatedCareerEnrollment);
        }
        throw new IllegalArgumentException("Career enrollment not found with ID: " + careerEnrollmentId);
    }

  @Override
  public void deleteCourseEnrollment(Long id) {
    courseEnrollmentRepository.deleteById(id);
  }

  @Override
  public CourseEnrollmentDto getCourseEnrollmentById(Long id) {
    CourseEnrollment courseEnrollment =
        courseEnrollmentRepository
            .findById(id)
            .orElseThrow(() -> new NotFoundException("Course enrollment not found"));
    return CourseEnrollmentMapper.INSTANCE.toDTO(courseEnrollment);
  }

  // Implement other methods as needed
}
