package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.repository.CareerRepository;
import com.uth.ums.career.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CareerServiceImpl implements CareerService {
	private final CareerRepository careerRepository;

	@Autowired
	public CareerServiceImpl(CareerRepository careerRepository) {
		this.careerRepository = careerRepository;
	}

	@Override
	public List<Career> getAllCareers() {
		return careerRepository.findAll();
	}

	@Override
	public Optional<Career> getCareerById(Long id) {
		return careerRepository.findById(id);
	}

	@Override
	public Career saveCareer(Career career) {
		return careerRepository.save(career);
	}

	@Override
	public void deleteCareer(Long id) {
		careerRepository.deleteById(id);
	}
}
