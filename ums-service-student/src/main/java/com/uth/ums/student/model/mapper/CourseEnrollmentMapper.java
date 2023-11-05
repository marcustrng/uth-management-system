package com.uth.ums.student.model.mapper;

import com.uth.ums.student.model.dto.CourseEnrollmentDto;
import com.uth.ums.student.model.entity.CourseEnrollment;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface CourseEnrollmentMapper {
    CourseEnrollmentDto toDto(CourseEnrollment entity);
    CourseEnrollment toEntity(CourseEnrollmentDto dto);
}
