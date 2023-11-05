package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "career_level")
public class CareerLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "career_level_id", nullable = false)
    private Long careerLevelId;

    @Column(name = "career_level_name")
    private String careerLevelName;
}
