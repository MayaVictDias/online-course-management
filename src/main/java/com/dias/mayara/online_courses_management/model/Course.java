package com.dias.mayara.online_courses_management.model;

import com.dias.mayara.online_courses_management.service.CourseService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "cursos")
@NoArgsConstructor
@Data
@ToString
public class Course {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "workload")
    private double workload;

}
