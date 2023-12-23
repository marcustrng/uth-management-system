package com.uth.ums.schedule.model.mapper;

import com.uth.ums.schedule.model.dto.CourseOccurrenceDto;
import com.uth.ums.schedule.model.entity.CourseOccurrence;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseOccurrenceMapper {
	CourseOccurrenceMapper INSTANCE = Mappers.getMapper(CourseOccurrenceMapper.class);

	CourseOccurrenceDto toDto(CourseOccurrence entity);

	CourseOccurrence toEntity(CourseOccurrenceDto dto);
}
