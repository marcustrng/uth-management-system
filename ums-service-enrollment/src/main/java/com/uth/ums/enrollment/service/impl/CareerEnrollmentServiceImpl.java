package com.uth.ums.enrollment.service.impl;

import com.uth.ums.enrollment.model.dto.CareerEnrollmentDto;
import com.uth.ums.enrollment.model.entity.CareerEnrollment;
import com.uth.ums.enrollment.model.mapper.CareerEnrollmentMapper;
import com.uth.ums.enrollment.repository.CareerEnrollmentRepository;
import com.uth.ums.enrollment.service.CareerEnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CareerEnrollmentServiceImpl implements CareerEnrollmentService {

    private final CareerEnrollmentRepository careerEnrollmentRepository;


    @Override
    public CareerEnrollmentDto createCareerEnrollment(CareerEnrollmentDto careerEnrollmentDTO) {
        CareerEnrollment careerEnrollment = CareerEnrollmentMapper.INSTANCE.toEntity(careerEnrollmentDTO);
        CareerEnrollment savedCareerEnrollment = careerEnrollmentRepository.save(careerEnrollment);
    return CareerEnrollmentMapper.INSTANCE.toDTO(savedCareerEnrollment);
    }

    @Override
    public CareerEnrollmentDto updateCareerEnrollment(Long careerEnrollmentId, CareerEnrollmentDto careerEnrollmentDTO) {
        Optional<CareerEnrollment> optionalCareerEnrollment = careerEnrollmentRepository.findById(careerEnrollmentId);
        if (optionalCareerEnrollment.isPresent()) {
            CareerEnrollment careerEnrollment = optionalCareerEnrollment.get();
            careerEnrollment.setStudentId(careerEnrollmentDTO.getStudentId());
            careerEnrollment.setCareerId(careerEnrollmentDTO.getCareerId());
            careerEnrollment.setEnrollmentDate(careerEnrollmentDTO.getEnrollmentDate());
            careerEnrollment.setCareerStatusId(careerEnrollmentDTO.getCareerStatusId());
            careerEnrollment.setCareerStatusDate(careerEnrollmentDTO.getCareerStatusDate());
            CareerEnrollment updatedCareerEnrollment = careerEnrollmentRepository.save(careerEnrollment);
            return CareerEnrollmentMapper.INSTANCE.toDTO(updatedCareerEnrollment);
        }
        throw new IllegalArgumentException("Career enrollment not found with ID: " + careerEnrollmentId);
    }

    @Override
    public void deleteCareerEnrollment(Long careerEnrollmentId) {
        careerEnrollmentRepository.deleteById(careerEnrollmentId);
    }

    @Override
    public CareerEnrollmentDto getCareerEnrollmentById(Long careerEnrollmentId) {
        Optional<CareerEnrollment> optionalCareerEnrollment = careerEnrollmentRepository.findById(careerEnrollmentId);
        if (optionalCareerEnrollment.isPresent()) {
            CareerEnrollment careerEnrollment = optionalCareerEnrollment.get();
            return CareerEnrollmentMapper.INSTANCE.toDTO(careerEnrollment);
        }
        throw new IllegalArgumentException("Career enrollment not found with ID: " + careerEnrollmentId);
    }

    @Override
    public List<CareerEnrollmentDto> getAllCareerEnrollments() {
        List<CareerEnrollment> careerEnrollments = careerEnrollmentRepository.findAll();
        return careerEnrollments.stream()
                .map(CareerEnrollmentMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }
}
