package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.ProfessorCourseDto;
import com.uth.ums.career.model.entity.ProfessorCourse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfessorCourseMapper {
	ProfessorCourseMapper INSTANCE = Mappers.getMapper(ProfessorCourseMapper.class);

	@Mapping(source = "professor", target = "professor")
	@Mapping(source = "course", target = "course")
	ProfessorCourseDto toDto(ProfessorCourse professorCourse);

	@Mapping(target = "id", ignore = true)
	@Mapping(source = "professor", target = "professor")
	@Mapping(source = "course", target = "course")
	ProfessorCourse toEntity(ProfessorCourseDto professorCourseDto);
}
