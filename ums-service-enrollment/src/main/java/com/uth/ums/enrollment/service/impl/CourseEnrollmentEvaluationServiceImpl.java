package com.uth.ums.enrollment.service.impl;

import com.uth.ums.enrollment.exception.EntityNotFoundException;
import com.uth.ums.enrollment.model.dto.CourseEnrollmentEvaluationDto;
import com.uth.ums.enrollment.model.entity.CourseEnrollmentEvaluation;
import com.uth.ums.enrollment.model.mapper.CourseEnrollmentEvaluationMapper;
import com.uth.ums.enrollment.repository.CourseEnrollmentEvaluationRepository;
import com.uth.ums.enrollment.service.CourseEnrollmentEvaluationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CourseEnrollmentEvaluationServiceImpl implements CourseEnrollmentEvaluationService {

  private final CourseEnrollmentEvaluationRepository courseEnrollmentEvaluationRepository;

  @Override
  public CourseEnrollmentEvaluationDto createCourseEnrollmentEvaluation(
      CourseEnrollmentEvaluationDto courseEnrollmentEvaluationDTO) {
    CourseEnrollmentEvaluation courseEnrollmentEvaluation =
        CourseEnrollmentEvaluationMapper.INSTANCE.toEntity(courseEnrollmentEvaluationDTO);
    CourseEnrollmentEvaluation createdCourseEnrollmentEvaluation =
        courseEnrollmentEvaluationRepository.save(courseEnrollmentEvaluation);
    return CourseEnrollmentEvaluationMapper.INSTANCE.toDTO(createdCourseEnrollmentEvaluation);
  }

  @Override
  public CourseEnrollmentEvaluationDto updateCourseEnrollmentEvaluation(
      Long id, CourseEnrollmentEvaluationDto courseEnrollmentEvaluationDTO) {

    return null;
  }

  @Override
  public void deleteCourseEnrollmentEvaluation(Long id) {
    CourseEnrollmentEvaluation courseEnrollmentEvaluation = getCourseEnrollmentEvaluationEntity(id);
    courseEnrollmentEvaluationRepository.delete(courseEnrollmentEvaluation);
  }

  @Override
  public CourseEnrollmentEvaluationDto getCourseEnrollmentEvaluationById(Long id) {
    CourseEnrollmentEvaluation courseEnrollmentEvaluation = getCourseEnrollmentEvaluationEntity(id);
    return CourseEnrollmentEvaluationMapper.INSTANCE.toDTO(courseEnrollmentEvaluation);
  }

  private CourseEnrollmentEvaluation getCourseEnrollmentEvaluationEntity(Long id) {
    return courseEnrollmentEvaluationRepository
        .findById(id)
        .orElseThrow(
            () ->
                new EntityNotFoundException("CourseEnrollmentEvaluation not found with ID: " + id));
  }
}
