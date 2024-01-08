package com.uth.ums.career.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Value;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Department}
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartmentDto implements Serializable {

	Long departmentId;
	String departmentName;
}
