package com.uth.ums.enrollment.feignclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Value;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class CareerLevelDto implements Serializable {

	Long careerLevelId;
	String careerLevelName;
}
