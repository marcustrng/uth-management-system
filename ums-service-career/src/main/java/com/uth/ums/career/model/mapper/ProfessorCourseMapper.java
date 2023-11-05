package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.ProfessorCourseDto;
import com.uth.ums.career.model.entity.ProfessorCourse;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ProfessorCourseMapper {
    ProfessorCourseDto toDto(ProfessorCourse entity);
    ProfessorCourse toEntity(ProfessorCourseDto dto);
}
