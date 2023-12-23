package com.uth.ums.enrollment.model.mapper;

import com.uth.ums.enrollment.model.dto.StudentDto;
import com.uth.ums.enrollment.model.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "studentId", ignore = true)
    Student toEntity(StudentDto dto);

    StudentDto toDto(Student entity);
}
