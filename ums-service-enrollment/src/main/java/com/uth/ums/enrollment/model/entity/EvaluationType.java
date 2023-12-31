package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "evaluation_type")
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
