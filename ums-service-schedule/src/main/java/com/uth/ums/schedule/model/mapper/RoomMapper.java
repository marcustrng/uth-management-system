package com.uth.ums.schedule.model.mapper;

import com.uth.ums.schedule.model.dto.RoomDto;
import com.uth.ums.schedule.model.entity.Room;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RoomMapper {
    RoomDto toDto(Room entity);
    Room toEntity(RoomDto dto);
}
