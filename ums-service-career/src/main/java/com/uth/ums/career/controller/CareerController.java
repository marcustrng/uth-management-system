package com.uth.ums.career.controller;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/careers")
public class CareerController {

	private final CareerService careerService;

	@Autowired
	public CareerController(CareerService careerService) {
		this.careerService = careerService;
	}

	@GetMapping
	public ResponseEntity<List<Career>> getAllCareers() {
		List<Career> careers = careerService.getAllCareers();
		return new ResponseEntity<>(careers, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CareerDto> getCareerById(@PathVariable Long id) {
		CareerDto careerDto = careerService.getCareerById(id);
		if (careerDto != null) {
			return ResponseEntity.ok(careerDto);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping
	public ResponseEntity<Career> createCareer(@RequestBody Career career) {
		Career createdCareer = careerService.saveCareer(career);
		return new ResponseEntity<>(createdCareer, HttpStatus.CREATED);
	}

//	@PutMapping("/{id}")
//	public ResponseEntity<Career> updateCareer(@PathVariable Long id, @RequestBody Career career) {
//		Optional<Career> existingCareer = careerService.getCareerById(id);
//		if (existingCareer.isPresent()) {
//			career.setCareerId(id);
//			Career updatedCareer = careerService.saveCareer(career);
//			return new ResponseEntity<>(updatedCareer, HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> deleteCareer(@PathVariable Long id) {
//		Optional<Career> existingCareer = careerService.getCareerById(id);
//		if (existingCareer.isPresent()) {
//			careerService.deleteCareer(id);
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
}
