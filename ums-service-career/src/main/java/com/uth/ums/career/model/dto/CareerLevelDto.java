package com.uth.ums.career.model.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.uth.ums.career.model.entity.CareerLevel}
 */
@Value
public class CareerLevelDto implements Serializable {
    Long careerLevelId;
    String careerLevelName;
}