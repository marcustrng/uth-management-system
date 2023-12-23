package com.uth.ums.schedule.model.mapper;

import com.uth.ums.schedule.model.dto.AssistantProfessorDto;
import com.uth.ums.schedule.model.entity.AssistantProfessor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AssistantProfessorMapper {
	AssistantProfessorMapper INSTANCE = Mappers.getMapper(AssistantProfessorMapper.class);

	AssistantProfessorDto toDto(AssistantProfessor entity);

	AssistantProfessor toEntity(AssistantProfessorDto dto);
}
