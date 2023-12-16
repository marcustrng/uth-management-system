package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CourseDependencyDto;
import com.uth.ums.career.model.entity.CourseDependency;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseDependencyMapper {
	CourseDependencyMapper INSTANCE = Mappers.getMapper(CourseDependencyMapper.class);

	@Mapping(source = "course", target = "course")
	@Mapping(source = "requiredCourse", target = "requiredCourse")
	CourseDependencyDto toDto(CourseDependency courseDependency);

	@Mapping(target = "id", ignore = true)
	@Mapping(source = "course", target = "course")
	@Mapping(source = "requiredCourse", target = "requiredCourse")
	CourseDependency toEntity(CourseDependencyDto courseDependencyDto);
}
