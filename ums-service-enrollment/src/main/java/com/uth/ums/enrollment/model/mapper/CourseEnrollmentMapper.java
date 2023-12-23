package com.uth.ums.enrollment.model.mapper;

import com.uth.ums.enrollment.model.dto.CourseEnrollmentDto;
import com.uth.ums.enrollment.model.entity.CourseEnrollment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseEnrollmentMapper {

  CourseEnrollmentMapper INSTANCE = Mappers.getMapper(CourseEnrollmentMapper.class);

  @Mapping(target = "courseEnrollmentId", source = "courseEnrollment.courseEnrollmentId")
  @Mapping(target = "studentId", source = "courseEnrollment.studentId")
  @Mapping(target = "courseOccurrenceId", source = "courseEnrollment.courseOccurrenceId")
  @Mapping(target = "finalScore", source = "courseEnrollment.finalScore")
  CourseEnrollmentDto toDTO(CourseEnrollment courseEnrollment);

  @Mapping(target = "courseEnrollmentId", source = "dto.courseEnrollmentId")
  @Mapping(target = "studentId", source = "dto.studentId")
  @Mapping(target = "courseOccurrenceId", source = "dto.courseOccurrenceId")
  @Mapping(target = "finalScore", source = "dto.finalScore")
  CourseEnrollment toEntity(CourseEnrollmentDto dto);
}
