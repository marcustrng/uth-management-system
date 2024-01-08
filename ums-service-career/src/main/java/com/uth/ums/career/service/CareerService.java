package com.uth.ums.career.service;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.entity.Career;
import java.util.List;
import java.util.Optional;

public interface CareerService {

	List<Career> getAllCareers();

	CareerDto getCareerById(Long id);

	Career saveCareer(Career career);

	void deleteCareer(Long id);

	CareerDto getCareerByIdAndSemester(Long id, int semester);
}
