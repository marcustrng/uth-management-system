package com.uth.ums.career.model.dto;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * DTO for {@link com.uth.ums.career.model.entity.CareerLevel}
 */
public record CareerLevelDto(Long careerLevelId, @NotBlank String careerLevelName) implements Serializable {}
