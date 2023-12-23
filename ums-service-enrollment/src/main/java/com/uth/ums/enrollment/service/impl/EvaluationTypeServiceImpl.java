package com.uth.ums.enrollment.service.impl;

import com.uth.ums.enrollment.model.entity.EvaluationType;
import com.uth.ums.enrollment.model.dto.EvaluationTypeDto;
import com.uth.ums.enrollment.model.mapper.EvaluationTypeMapper;
import com.uth.ums.enrollment.repository.EvaluationTypeRepository;
import com.uth.ums.enrollment.service.EvaluationTypeService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EvaluationTypeServiceImpl implements EvaluationTypeService {
  private final EvaluationTypeRepository evaluationTypeRepository;

  @Override
  public EvaluationTypeDto createEvaluationType(EvaluationTypeDto evaluationTypeDTO) {
    EvaluationType evaluationType = EvaluationTypeMapper.INSTANCE.toEntity(evaluationTypeDTO);
    EvaluationType savedEvaluationType = evaluationTypeRepository.save(evaluationType);
    return EvaluationTypeMapper.INSTANCE.toDTO(savedEvaluationType);
  }

  @Override
  public EvaluationTypeDto updateEvaluationType(
      Long evaluationTypeId, EvaluationTypeDto evaluationTypeDTO) {
    Optional<EvaluationType> optionalEvaluationType =
        evaluationTypeRepository.findById(evaluationTypeId);
    if (optionalEvaluationType.isPresent()) {
      EvaluationType evaluationType = optionalEvaluationType.get();
      evaluationType.setEvaluationTypeName(evaluationTypeDTO.evaluationTypeName());
      evaluationType.setGroupActivity(evaluationTypeDTO.groupActivity());
      EvaluationType updatedEvaluationType = evaluationTypeRepository.save(evaluationType);
      return EvaluationTypeMapper.INSTANCE.toDTO(updatedEvaluationType);
    }
    throw new IllegalArgumentException("Evaluation type not found with ID: " + evaluationTypeId);
  }

  @Override
  public void deleteEvaluationType(Long evaluationTypeId) {
    evaluationTypeRepository.deleteById(evaluationTypeId);
  }

  @Override
  public EvaluationTypeDto getEvaluationTypeById(Long evaluationTypeId) {
    Optional<EvaluationType> optionalEvaluationType =
        evaluationTypeRepository.findById(evaluationTypeId);
    if (optionalEvaluationType.isPresent()) {
      EvaluationType evaluationType = optionalEvaluationType.get();
      return EvaluationTypeMapper.INSTANCE.toDTO(evaluationType);
    }
    throw new IllegalArgumentException("Evaluation type not found with ID: " + evaluationTypeId);
  }

  @Override
  public List<EvaluationTypeDto> getAllEvaluationTypes() {
    List<EvaluationType> evaluationTypes = evaluationTypeRepository.findAll();
    return evaluationTypes.stream()
        .map(EvaluationTypeMapper.INSTANCE::toDTO)
        .collect(Collectors.toList());
  }
}
