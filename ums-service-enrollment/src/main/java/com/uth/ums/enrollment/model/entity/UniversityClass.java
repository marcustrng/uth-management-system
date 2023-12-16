package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "classes")
public class UniversityClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id", nullable = false)
    private Long universityClassId;

    private Long careerId;
    private String classCode;
    private String className;
    private Long classYear;
    private String classStatus;

    @OneToMany(mappedBy="universityClass")
    private Set<Student> students;
}
