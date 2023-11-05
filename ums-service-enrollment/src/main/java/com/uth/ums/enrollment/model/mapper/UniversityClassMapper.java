package com.uth.ums.enrollment.model.mapper;


import com.uth.ums.enrollment.model.dto.UniversityClassDto;
import com.uth.ums.enrollment.model.entity.UniversityClass;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface UniversityClassMapper {
    UniversityClassDto toDto(UniversityClass entity);
    UniversityClass toEntity(UniversityClassDto dto);
}
