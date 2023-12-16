package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.entity.Course;
import com.uth.ums.career.repository.CourseRepository;
import com.uth.ums.career.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
	private final CourseRepository courseRepository;

	@Autowired
	public CourseServiceImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Optional<Course> getCourseById(Long id) {
		return courseRepository.findById(id);
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}
}
