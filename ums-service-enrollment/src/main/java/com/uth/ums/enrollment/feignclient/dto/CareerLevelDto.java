package com.uth.ums.enrollment.feignclient.dto;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

public record CareerLevelDto(Long careerLevelId, @NotBlank String careerLevelName) implements Serializable {}
