package com.uth.ums.student.model.mapper;


import com.uth.ums.student.model.dto.UniversityClassDto;
import com.uth.ums.student.model.entity.UniversityClass;
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
