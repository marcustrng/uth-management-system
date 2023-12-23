package com.uth.ums.enrollment.service.impl;

import com.uth.ums.enrollment.model.dto.CareerStatusDto;
import com.uth.ums.enrollment.model.entity.CareerStatus;
import com.uth.ums.enrollment.model.mapper.CareerStatusMapper;
import com.uth.ums.enrollment.repository.CareerStatusRepository;
import com.uth.ums.enrollment.service.CareerStatusService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CareerStatusServiceImpl implements CareerStatusService {
  private final CareerStatusRepository careerStatusRepository;

  @Autowired
  public CareerStatusServiceImpl(CareerStatusRepository careerStatusRepository) {
    this.careerStatusRepository = careerStatusRepository;
  }

  @Override
  public CareerStatusDto createCareerStatus(CareerStatusDto careerStatusDTO) {
    CareerStatus careerStatus = new CareerStatus();
    careerStatus.setCareerStatusName(careerStatusDTO.careerStatusName());
    CareerStatus savedCareerStatus = careerStatusRepository.save(careerStatus);
    return CareerStatusMapper.INSTANCE.toDto(savedCareerStatus);
  }

  @Override
  public CareerStatusDto updateCareerStatus(int careerStatusId, CareerStatusDto careerStatusDTO) {
    Optional<CareerStatus> optionalCareerStatus = careerStatusRepository.findById(careerStatusId);
    if (optionalCareerStatus.isPresent()) {
      CareerStatus careerStatus = optionalCareerStatus.get();
      careerStatus.setCareerStatusName(careerStatusDTO.careerStatusName());
      CareerStatus updatedCareerStatus = careerStatusRepository.save(careerStatus);
      return CareerStatusMapper.INSTANCE.toDto(updatedCareerStatus);
    } else {
      throw new RuntimeException("Career status with ID " + careerStatusId + " not found.");
    }
  }

  @Override
  public void deleteCareerStatus(int careerStatusId) {
    careerStatusRepository.deleteById(careerStatusId);
  }

  @Override
  public CareerStatusDto getCareerStatusById(int careerStatusId) {
    Optional<CareerStatus> optionalCareerStatus = careerStatusRepository.findById(careerStatusId);
    if (optionalCareerStatus.isPresent()) {
      CareerStatus careerStatus = optionalCareerStatus.get();
      return CareerStatusMapper.INSTANCE.toDto(careerStatus);
    } else {
      throw new RuntimeException("Career status with ID " + careerStatusId + " not found.");
    }
  }

  @Override
  public List<CareerStatusDto> getAllCareerStatuses() {
    List<CareerStatus> careerStatuses = careerStatusRepository.findAll();
    return careerStatuses.stream().map(CareerStatusMapper.INSTANCE::toDto).collect(Collectors.toList());
  }
}
