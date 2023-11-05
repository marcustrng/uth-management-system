package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.SemesterCourseDto;
import com.uth.ums.career.model.entity.SemesterCourse;
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
public interface SemesterCourseMapper {
    SemesterCourseDto toDto(SemesterCourse entity);
    SemesterCourse toEntity(SemesterCourseDto dto);
}
