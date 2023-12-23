package com.uth.ums.enrollment.service;

import com.uth.ums.enrollment.model.dto.EvaluationTypeDto;
import java.util.List;

public interface EvaluationTypeService {
    EvaluationTypeDto createEvaluationType(EvaluationTypeDto evaluationTypeDTO);

    EvaluationTypeDto updateEvaluationType(Long evaluationTypeId, EvaluationTypeDto evaluationTypeDTO);

    void deleteEvaluationType(Long evaluationTypeId);

    EvaluationTypeDto getEvaluationTypeById(Long evaluationTypeId);

    List<EvaluationTypeDto> getAllEvaluationTypes();
}
