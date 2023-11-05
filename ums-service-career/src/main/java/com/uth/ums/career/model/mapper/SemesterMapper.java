package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.SemesterDto;
import com.uth.ums.career.model.entity.Semester;
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
public interface SemesterMapper {
    SemesterDto toDto(Semester entity);
    Semester toEntity(SemesterDto dto);
}
