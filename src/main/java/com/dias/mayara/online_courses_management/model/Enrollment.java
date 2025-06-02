package com.dias.mayara.online_courses_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Table(name = "enrollments")
@Entity
@Data
public class Enrollment {

    public Enrollment() {
    }

    // Unique identifier for the enrollment
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Relationship with Student and Course entities
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Relationship with Course entity
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private LocalDate enrollmentDate;
}
