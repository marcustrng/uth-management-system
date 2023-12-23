package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "evaluation_type")
@Data
public class EvaluationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evaluation_type_id")
    private Long evaluationTypeId;

    @Column(name = "evaluation_type_name", length = 50)
    private String evaluationTypeName;

    @Column(name = "is_group_activity")
    private boolean groupActivity;
}
