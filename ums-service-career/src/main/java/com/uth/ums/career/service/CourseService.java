package com.uth.ums.career.service;

import com.uth.ums.career.model.entity.Course;
import java.util.List;
import java.util.Optional;

public interface CourseService {
	List<Course> getAllCourses();

	Optional<Course> getCourseById(Long id);

	Course saveCourse(Course course);

	void deleteCourse(Long id);
}
