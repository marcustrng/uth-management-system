package com.uth.ums.schedule.model.mapper;

import com.uth.ums.schedule.model.dto.ScheduleDto;
import com.uth.ums.schedule.model.entity.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ScheduleMapper {
	ScheduleMapper INSTANCE = Mappers.getMapper(ScheduleMapper.class);

	ScheduleDto toDto(Schedule entity);

	Schedule toEntity(ScheduleDto dto);
}
