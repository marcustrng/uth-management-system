package com.uth.ums.enrollment.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

/** DTO for {@link com.uth.ums.enrollment.model.entity.CareerStatus} */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CareerStatusDto(int careerStatusId, String careerStatusName)
    implements Serializable {}
