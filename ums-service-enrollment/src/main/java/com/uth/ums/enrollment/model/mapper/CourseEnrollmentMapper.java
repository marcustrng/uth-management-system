package com.uth.ums.enrollment.model.mapper;

import com.uth.ums.enrollment.model.dto.CourseEnrollmentDto;
import com.uth.ums.enrollment.model.entity.CourseEnrollment;
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
