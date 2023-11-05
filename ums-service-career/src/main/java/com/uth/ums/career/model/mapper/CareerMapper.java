package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.entity.Career;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {CourseMapper.class, SemesterMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CareerMapper {
    CareerDto toDto(Career entity);
    Career toEntity(CareerDto dto);
}
