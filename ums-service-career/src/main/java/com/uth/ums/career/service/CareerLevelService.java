package com.uth.ums.career.service;

import com.uth.ums.career.model.entity.CareerLevel;
import java.util.List;
import java.util.Optional;

public interface CareerLevelService {
	List<CareerLevel> getAllCareerLevels();

	Optional<CareerLevel> getCareerLevelById(Long id);

	CareerLevel saveCareerLevel(CareerLevel careerLevel);

	void deleteCareerLevel(Long id);
}
