package com.dias.mayara.online_courses_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Table(name = "enrollments")
@Entity
@Data
public class Enrollment {

    public Enrollment() {
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Student student;

    @OneToOne
    private Course course;

    private LocalDate enrollmentDate;
}
