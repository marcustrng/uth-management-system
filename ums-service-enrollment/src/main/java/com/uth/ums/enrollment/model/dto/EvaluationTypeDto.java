package com.uth.ums.enrollment.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uth.ums.enrollment.model.entity.EvaluationType;
import java.io.Serializable;

/** DTO for {@link EvaluationType} */
@JsonIgnoreProperties(ignoreUnknown = true)
public record EvaluationTypeDto(
    Long evaluationTypeId, String evaluationTypeName, boolean groupActivity)
    implements Serializable {}
