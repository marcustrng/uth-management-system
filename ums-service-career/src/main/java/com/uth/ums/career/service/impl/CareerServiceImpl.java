package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.dto.CourseDto;
import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.model.entity.Course;
import com.uth.ums.career.model.entity.Semester;
import com.uth.ums.career.model.entity.SemesterCourse;
import com.uth.ums.career.model.mapper.CareerMapper;
import com.uth.ums.career.model.mapper.CourseMapper;
import com.uth.ums.career.repository.CareerRepository;
import com.uth.ums.career.service.CareerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CareerServiceImpl implements CareerService {
    private final CareerRepository careerRepository;
    private final CareerMapper careerMapper;
    private final CourseMapper courseMapper;

    @Override
    public List<CareerDto> getAll() {
        return careerRepository.findAll().stream().map(careerMapper::toDto).toList();
    }

    @Override
    public CareerDto getById(Long id) {
        return null;
    }

    @Override
    public CareerDto createNew(CareerDto dto) {
        Career entity = careerMapper.toEntity(dto);
        Career save = careerRepository.save(entity);
        return careerMapper.toDto(save);
    }

    @Override
    public CareerDto update(Long id, CareerDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<CourseDto> getAllCourseByIdAndSemesterNo(Long id, Integer semesterNo) {
        Career career = careerRepository.findById(id).orElseThrow(IllegalAccessError::new);
        return career.getSemesters().stream()
            .filter(semester -> !semester.getSemesterNo().equals(semesterNo)).findFirst()
            .orElseThrow(IllegalAccessError::new)
            .getSemesterCourses().stream().map(SemesterCourse::getCourse).map(courseMapper::toDto)
            .toList();
    }
}
