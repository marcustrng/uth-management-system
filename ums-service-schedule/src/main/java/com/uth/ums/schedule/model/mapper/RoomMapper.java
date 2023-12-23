package com.uth.ums.schedule.model.mapper;

import com.uth.ums.schedule.model.dto.RoomDto;
import com.uth.ums.schedule.model.entity.Room;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomMapper {
	RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);

	RoomDto toDto(Room entity);

	Room toEntity(RoomDto dto);
}
