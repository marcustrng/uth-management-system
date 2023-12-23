package com.uth.ums.enrollment.model.mapper;

import com.uth.ums.enrollment.model.dto.CourseEnrollmentEvaluationDto;
import com.uth.ums.enrollment.model.entity.CourseEnrollmentEvaluation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseEnrollmentEvaluationMapper {

    CourseEnrollmentEvaluationMapper INSTANCE = Mappers.getMapper(CourseEnrollmentEvaluationMapper.class);

    CourseEnrollmentEvaluationDto toDTO(CourseEnrollmentEvaluation courseEnrollmentEvaluation);

    CourseEnrollmentEvaluation toEntity(CourseEnrollmentEvaluationDto courseEnrollmentEvaluationDTO);
}
