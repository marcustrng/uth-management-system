package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id", nullable = false)
    private Long courseId;

    private String courseName;
    private String courseCode;
    private Integer credits;

    @OneToMany(mappedBy = "course")
    private Set<ProfessorCourse> professorCourses;

    @OneToMany(mappedBy="course")
    private Set<SemesterCourse> semesterCourses;

    @ManyToOne
    @JoinColumn(name="faculty_id", nullable=false)
    private Faculty faculty;
}
