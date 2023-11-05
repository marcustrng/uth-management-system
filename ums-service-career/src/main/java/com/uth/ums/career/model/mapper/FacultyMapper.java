package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.FacultyDto;
import com.uth.ums.career.model.entity.Faculty;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface FacultyMapper {
    FacultyDto toDto(Faculty entity);
    Faculty toEntity(FacultyDto dto);
}
