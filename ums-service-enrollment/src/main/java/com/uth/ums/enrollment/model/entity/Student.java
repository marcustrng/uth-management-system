package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "student_id")
  private int studentId;

  @Column(name = "last_name", length = 50)
  private String lastName;

  @Column(name = "first_name", length = 50)
  private String firstName;

  @Column(name = "date_of_birth")
  private LocalDate dateOfBirth;

  @Column(name = "email", length = 100)
  private String email;

  @Column(name = "phone_number", length = 20)
  private String phoneNumber;
}
