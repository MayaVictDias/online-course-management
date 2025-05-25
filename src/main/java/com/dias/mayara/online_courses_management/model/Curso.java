package com.dias.mayara.online_courses_management.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "cursos")
@Data
public class Curso {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "worklaod")
    private String workload;
}
