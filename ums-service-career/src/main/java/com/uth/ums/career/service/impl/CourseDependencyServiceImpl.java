package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.entity.CourseDependency;
import com.uth.ums.career.repository.CourseDependencyRepository;
import com.uth.ums.career.service.CourseDependencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseDependencyServiceImpl implements CourseDependencyService {
	private final CourseDependencyRepository courseDependencyRepository;

	@Autowired
	public CourseDependencyServiceImpl(CourseDependencyRepository courseDependencyRepository) {
		this.courseDependencyRepository = courseDependencyRepository;
	}

	@Override
	public List<CourseDependency> getAllCourseDependencies() {
		return courseDependencyRepository.findAll();
	}

	@Override
	public Optional<CourseDependency> getCourseDependencyById(Long id) {
		return courseDependencyRepository.findById(id);
	}

	@Override
	public CourseDependency saveCourseDependency(CourseDependency courseDependency) {
		return courseDependencyRepository.save(courseDependency);
	}

	@Override
	public void deleteCourseDependency(Long id) {
		courseDependencyRepository.deleteById(id);
	}
}
