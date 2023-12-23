package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "career_status")
@Data
public class CareerStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "career_status_id")
    private int careerStatusId;

    @Column(name = "career_status_name", length = 50)
    private String careerStatusName;
}
