package com.uth.ums.career.controller;

import com.uth.ums.career.model.entity.Department;
import com.uth.ums.career.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	private final DepartmentService departmentService;

	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@GetMapping
	public ResponseEntity<List<Department>> getAllDepartments() {
		List<Department> departments = departmentService.getAllDepartments();
		return new ResponseEntity<>(departments, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
		Optional<Department> department = departmentService.getDepartmentById(id);
		return department.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping
	public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
		Department createdDepartment = departmentService.saveDepartment(department);
		return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Department> updateDepartment(@PathVariable Long id, @RequestBody Department department) {
		Optional<Department> existingDepartment = departmentService.getDepartmentById(id);
		if (existingDepartment.isPresent()) {
			department.setDepartmentId(id);
			Department updatedDepartment = departmentService.saveDepartment(department);
			return new ResponseEntity<>(updatedDepartment, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
		Optional<Department> existingDepartment = departmentService.getDepartmentById(id);
		if (existingDepartment.isPresent()) {
			departmentService.deleteDepartment(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
