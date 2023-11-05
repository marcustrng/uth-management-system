package com.uth.ums.career.model.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.uth.ums.career.model.entity.Faculty}
 */
@Value
public class FacultyDto implements Serializable {
    Long facultyId;
    String facultyName;
}