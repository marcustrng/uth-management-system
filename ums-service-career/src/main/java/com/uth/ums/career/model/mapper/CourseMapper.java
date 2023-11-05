package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CourseDto;
import com.uth.ums.career.model.entity.Course;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CourseMapper {
    CourseDto toDto(Course entity);
    Course toEntity(CourseDto dto);
}
