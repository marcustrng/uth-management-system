package com.uth.ums.enrollment.feignclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Value;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartmentDto implements Serializable {

	Long departmentId;
	String departmentName;
}
