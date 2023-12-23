package com.uth.ums.enrollment.service;

import com.uth.ums.enrollment.model.dto.CareerStatusDto;
import java.util.List;

public interface CareerStatusService {
  CareerStatusDto createCareerStatus(CareerStatusDto careerStatusDTO);

  CareerStatusDto updateCareerStatus(int careerStatusId, CareerStatusDto careerStatusDTO);

  void deleteCareerStatus(int careerStatusId);

  CareerStatusDto getCareerStatusById(int careerStatusId);

  List<CareerStatusDto> getAllCareerStatuses();
}
