package com.uth.ums.enrollment.model.mapper;

import com.uth.ums.enrollment.model.entity.EvaluationType;
import com.uth.ums.enrollment.model.dto.EvaluationTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EvaluationTypeMapper {
    EvaluationTypeMapper INSTANCE = Mappers.getMapper(EvaluationTypeMapper.class);

    @Mapping(source = "evaluationTypeId", target = "evaluationTypeId")
    @Mapping(source = "evaluationTypeName", target = "evaluationTypeName")
    @Mapping(source = "groupActivity", target = "groupActivity")
    EvaluationTypeDto toDTO(EvaluationType evaluationType);

    @Mapping(source = "evaluationTypeId", target = "evaluationTypeId")
    @Mapping(source = "evaluationTypeName", target = "evaluationTypeName")
    @Mapping(source = "groupActivity", target = "groupActivity")
    EvaluationType toEntity(EvaluationTypeDto evaluationTypeDTO);
}
