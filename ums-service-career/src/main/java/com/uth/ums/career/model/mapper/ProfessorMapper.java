package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.ProfessorDto;
import com.uth.ums.career.model.entity.Professor;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ProfessorMapper {
    ProfessorDto toDto(Professor entity);
    Professor toEntity(ProfessorDto dto);
}
