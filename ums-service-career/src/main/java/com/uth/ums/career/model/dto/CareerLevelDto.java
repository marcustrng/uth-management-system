package com.uth.ums.career.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Value;

/**
 * DTO for {@link com.uth.ums.career.model.entity.CareerLevel}
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class CareerLevelDto implements Serializable {

	Long careerLevelId;
	String careerLevelName;
}
