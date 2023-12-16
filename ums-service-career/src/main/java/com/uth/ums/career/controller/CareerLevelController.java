package com.uth.ums.career.controller;

import com.uth.ums.career.model.entity.CareerLevel;
import com.uth.ums.career.service.CareerLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/career-levels")
public class CareerLevelController {
	private final CareerLevelService careerLevelService;

	@Autowired
	public CareerLevelController(CareerLevelService careerLevelService) {
		this.careerLevelService = careerLevelService;
	}

	@GetMapping
	public ResponseEntity<List<CareerLevel>> getAllCareerLevels() {
		List<CareerLevel> careerLevels = careerLevelService.getAllCareerLevels();
		return new ResponseEntity<>(careerLevels, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CareerLevel> getCareerLevelById(@PathVariable Long id) {
		Optional<CareerLevel> careerLevel = careerLevelService.getCareerLevelById(id);
		return careerLevel.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping
	public ResponseEntity<CareerLevel> createCareerLevel(@RequestBody CareerLevel careerLevel) {
		CareerLevel createdCareerLevel = careerLevelService.saveCareerLevel(careerLevel);
		return new ResponseEntity<>(createdCareerLevel, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<CareerLevel> updateCareerLevel(@PathVariable Long id, @RequestBody CareerLevel careerLevel) {
		Optional<CareerLevel> existingCareerLevel = careerLevelService.getCareerLevelById(id);
		if (existingCareerLevel.isPresent()) {
			careerLevel.setCareerLevelId(id);
			CareerLevel updatedCareerLevel = careerLevelService.saveCareerLevel(careerLevel);
			return new ResponseEntity<>(updatedCareerLevel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCareerLevel(@PathVariable Long id) {
		Optional<CareerLevel> existingCareerLevel = careerLevelService.getCareerLevelById(id);
		if (existingCareerLevel.isPresent()) {
			careerLevelService.deleteCareerLevel(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
