package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;

@Data
@Entity
@Table(name = "career_enrollment")
public class CareerEnrollment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "career_enrollment_id")
  private Long careerEnrollmentId;

  @Column(name = "student_id")
  private Integer studentId;

  @Column(name = "career_id")
  private Integer careerId;

  @Column(name = "enrollment_date")
  private Date enrollmentDate;

  @Column(name = "career_status_id")
  private Integer careerStatusId;

  @Column(name = "career_status_date")
  private Date careerStatusDate;
}
