package com.uth.ums.schedule.model.mapper;

import com.uth.ums.schedule.model.dto.RoomDto;
import com.uth.ums.schedule.model.dto.ScheduleDto;
import com.uth.ums.schedule.model.entity.Room;
import com.uth.ums.schedule.model.entity.Schedule;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ScheduleMapper {
    ScheduleDto toDto(Schedule entity);
    Schedule toEntity(ScheduleDto dto);
}
