package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.entity.CareerLevel;
import com.uth.ums.career.repository.CareerLevelRepository;
import com.uth.ums.career.service.CareerLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CareerLevelServiceImpl implements CareerLevelService {
	private final CareerLevelRepository careerLevelRepository;

	@Autowired
	public CareerLevelServiceImpl(CareerLevelRepository careerLevelRepository) {
		this.careerLevelRepository = careerLevelRepository;
	}

	@Override
	public List<CareerLevel> getAllCareerLevels() {
		return careerLevelRepository.findAll();
	}

	@Override
	public Optional<CareerLevel> getCareerLevelById(Long id) {
		return careerLevelRepository.findById(id);
	}

	@Override
	public CareerLevel saveCareerLevel(CareerLevel careerLevel) {
		return careerLevelRepository.save(careerLevel);
	}

	@Override
	public void deleteCareerLevel(Long id) {
		careerLevelRepository.deleteById(id);
	}
}
