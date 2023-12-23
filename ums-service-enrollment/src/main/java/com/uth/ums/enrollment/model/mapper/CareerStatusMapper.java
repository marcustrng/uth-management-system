package com.uth.ums.enrollment.model.mapper;

import com.uth.ums.enrollment.model.dto.CareerStatusDto;
import com.uth.ums.enrollment.model.entity.CareerStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CareerStatusMapper {
  CareerStatusMapper INSTANCE = Mappers.getMapper(CareerStatusMapper.class);

  @Mapping(target = "careerStatusId", ignore = true)
  CareerStatus toEntity(CareerStatusDto dto);

  CareerStatusDto toDto(CareerStatus entity);
}
