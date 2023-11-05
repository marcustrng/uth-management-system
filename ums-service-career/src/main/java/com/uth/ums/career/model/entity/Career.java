package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "careers")
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "career_id", nullable = false)
    private Long careerId;

    private String careerName;

    @ManyToOne
    @JoinColumn(name="career_level_id", nullable=false)
    private CareerLevel careerLevel;

    @ManyToOne
    @JoinColumn(name="faculty_id", nullable=false)
    private Faculty faculty;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "career_id")
    private Set<Semester> semesters;
}
