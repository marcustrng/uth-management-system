package com.uth.ums.enrollment.model.mapper;

import com.uth.ums.enrollment.model.dto.StudentDto;
import com.uth.ums.enrollment.model.entity.Student;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface StudentMapper {

    StudentDto toDto(Student entity);
    Student toEntity(StudentDto dto);
}
