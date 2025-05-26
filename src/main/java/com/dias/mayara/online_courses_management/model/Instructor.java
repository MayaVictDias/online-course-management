package com.dias.mayara.online_courses_management.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "instructors")
@Entity
@Data
public class Instructor {

    public Instructor() {
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "specialty")
    private String specialty;

}