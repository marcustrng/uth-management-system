package com.uth.ums.career.service;

import com.uth.ums.career.model.entity.CourseDependency;
import java.util.List;
import java.util.Optional;

public interface CourseDependencyService {
	List<CourseDependency> getAllCourseDependencies();

	Optional<CourseDependency> getCourseDependencyById(Long id);

	CourseDependency saveCourseDependency(CourseDependency courseDependency);

	void deleteCourseDependency(Long id);
}
