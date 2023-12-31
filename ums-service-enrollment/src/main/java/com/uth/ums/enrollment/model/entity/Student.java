package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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

  @OneToMany(mappedBy = "student")
  @Exclude
  private Set<CareerEnrollment> careerEnrollments;

  @OneToMany(mappedBy = "student")
  @Exclude
  private Set<CourseEnrollment> courseEnrollments;
}
