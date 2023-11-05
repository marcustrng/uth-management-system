package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CareerLevelDto;
import com.uth.ums.career.model.entity.CareerLevel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CareerLevelMapper {
    CareerLevelDto toDto(CareerLevel entity);
    CareerLevel toEntity(CareerLevelDto dto);
}
