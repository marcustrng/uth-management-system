package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.ProfessorDto;
import com.uth.ums.career.model.entity.Professor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfessorMapper {
	ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);

	ProfessorDto toDto(Professor professor);

	Professor toEntity(ProfessorDto professorDto);
}
