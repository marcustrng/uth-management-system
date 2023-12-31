package com.uth.ums.enrollment.model.mapper;

import com.uth.ums.enrollment.model.dto.CourseEnrollmentDto;
import com.uth.ums.enrollment.model.entity.CourseEnrollment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseEnrollmentMapper {

  CourseEnrollmentMapper INSTANCE = Mappers.getMapper(CourseEnrollmentMapper.class);

  CourseEnrollmentDto toDTO(CourseEnrollment courseEnrollment);

  @Mapping(target = "student", ignore = true)
  CourseEnrollment toEntity(CourseEnrollmentDto dto);
}
