package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CourseDto;
import com.uth.ums.career.model.entity.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseMapper {
	CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

	CourseDto toDto(Course course);

	@Mapping(target = "career", ignore = true)
	Course toEntity(CourseDto courseDto);
}
