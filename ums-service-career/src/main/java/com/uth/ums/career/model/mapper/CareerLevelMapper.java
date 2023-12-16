package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CareerLevelDto;
import com.uth.ums.career.model.entity.CareerLevel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CareerLevelMapper {
	CareerLevelMapper INSTANCE = Mappers.getMapper(CareerLevelMapper.class);

	CareerLevelDto toDto(CareerLevel careerLevel);

	CareerLevel toEntity(CareerLevelDto careerLevelDto);
}
