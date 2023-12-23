package com.uth.ums.enrollment.model.mapper;

import com.uth.ums.enrollment.model.dto.CareerEnrollmentDto;
import com.uth.ums.enrollment.model.entity.CareerEnrollment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CareerEnrollmentMapper {
    CareerEnrollmentMapper INSTANCE = Mappers.getMapper(CareerEnrollmentMapper.class);

    @Mapping(target = "careerEnrollmentId", source = "careerEnrollmentId")
    @Mapping(target = "studentId", source = "studentId")
    @Mapping(target = "careerId", source = "careerId")
    @Mapping(target = "enrollmentDate", source = "enrollmentDate")
    @Mapping(target = "careerStatusId", source = "careerStatusId")
    @Mapping(target = "careerStatusDate", source = "careerStatusDate")
    CareerEnrollmentDto toDTO(CareerEnrollment careerEnrollment);

    @Mapping(target = "careerEnrollmentId", source = "careerEnrollmentId")
    @Mapping(target = "studentId", source = "studentId")
    @Mapping(target = "careerId", source = "careerId")
    @Mapping(target = "enrollmentDate", source = "enrollmentDate")
    @Mapping(target = "careerStatusId", source = "careerStatusId")
    @Mapping(target = "careerStatusDate", source = "careerStatusDate")
    CareerEnrollment toEntity(CareerEnrollmentDto careerEnrollmentDTO);
}
