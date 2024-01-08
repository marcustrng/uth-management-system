package com.uth.ums.career.service.impl;

import com.uth.ums.career.feignclient.dto.CourseOccurrenceDto;
import com.uth.ums.career.feignclient.service.CourseOccurrenceApiClient;
import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.dto.CourseDto;
import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.model.mapper.CareerMapper;
import com.uth.ums.career.repository.CareerRepository;
import com.uth.ums.career.service.CareerService;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CareerServiceImpl implements CareerService {

	private final CareerRepository careerRepository;
	private final CourseOccurrenceApiClient courseOccurrenceApiClient;

	@Override
	public List<Career> getAllCareers() {
		return careerRepository.findAll();
	}

	@Override
	public CareerDto getCareerById(Long id) {
		Optional<Career> optionalCareer = careerRepository.findById(id);
		CareerDto careerDto = optionalCareer.map(CareerMapper.INSTANCE::toDto).orElse(new CareerDto());

		careerDto.getCourses().forEach(courseDto -> {
			Long courseId = courseDto.getCourseId();
			try {
				CourseOccurrenceDto occurrenceByCourseId = courseOccurrenceApiClient.getCourseOccurrenceByCourseId(
						courseId);
				if (!Objects.isNull(occurrenceByCourseId)) {
					courseDto.setCourseOccurrenceDto(occurrenceByCourseId);
				}
			} catch (Exception ignore) {
			}
		});

		return careerDto;
	}

	@Override
	public Career saveCareer(Career career) {
		return careerRepository.save(career);
	}

	@Override
	public void deleteCareer(Long id) {
		careerRepository.deleteById(id);
	}

	@Override
	public CareerDto getCareerByIdAndSemester(Long id, int semester) {
		Optional<Career> optionalCareer = careerRepository.findById(id);
		CareerDto careerDto = optionalCareer.map(CareerMapper.INSTANCE::toDto).orElse(new CareerDto());

		Set<CourseDto> courseDtoStream = new HashSet<>();

		careerDto.getCourses().stream().filter(courseDto -> courseDto.getSemester() == semester).forEach(courseDto -> {
			Long courseId = courseDto.getCourseId();
			try {
				CourseOccurrenceDto occurrenceByCourseId = courseOccurrenceApiClient.getCourseOccurrenceByCourseId(
						courseId);
				if (!Objects.isNull(occurrenceByCourseId)) {
					courseDto.setCourseOccurrenceDto(occurrenceByCourseId);
				}
			} catch (Exception ignore) {
			} finally {
				courseDtoStream.add(courseDto);
			}
		});

		careerDto.setCourses(courseDtoStream);

		return careerDto;
	}
}
