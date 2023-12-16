package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.DepartmentDto;
import com.uth.ums.career.model.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {
	DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

	DepartmentDto toDto(Department department);

	Department toEntity(DepartmentDto departmentDto);
}
