package com.uth.ums.career.service;

import com.uth.ums.career.model.entity.Department;
import java.util.List;
import java.util.Optional;

public interface DepartmentService {
	List<Department> getAllDepartments();

	Optional<Department> getDepartmentById(Long id);

	Department saveDepartment(Department department);

	void deleteDepartment(Long id);
}
