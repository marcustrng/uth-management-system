package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.entity.Career;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CareerMapper {
	CareerMapper INSTANCE = Mappers.getMapper(CareerMapper.class);

	@Mapping(source = "department.departmentId", target = "department.departmentId")
	@Mapping(source = "careerLevel.careerLevelId", target = "careerLevel.careerLevelId")
	CareerDto toDto(Career career);

	@Mapping(target = "department", ignore = true)
	@Mapping(target = "careerLevel", ignore = true)
	Career toEntity(CareerDto careerDto);
}
