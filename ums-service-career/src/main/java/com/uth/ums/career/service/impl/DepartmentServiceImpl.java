package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.entity.Department;
import com.uth.ums.career.repository.DepartmentRepository;
import com.uth.ums.career.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	private final DepartmentRepository departmentRepository;

	@Autowired
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Optional<Department> getDepartmentById(Long id) {
		return departmentRepository.findById(id);
	}

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public void deleteDepartment(Long id) {
		departmentRepository.deleteById(id);
	}
}
