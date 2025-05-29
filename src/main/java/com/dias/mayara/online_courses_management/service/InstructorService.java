package com.dias.mayara.online_courses_management.service;

import com.dias.mayara.online_courses_management.model.Instructor;
import com.dias.mayara.online_courses_management.repository.InstructorRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class InstructorService {

    // Service to handle instructor-related operations
    private final InstructorRepository instructorRepository;

    // Constructor to inject the InstructorRepository dependency
    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    // Method to retrieve all instructors
    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    // Method to save an instructor
    public Instructor save(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    // Method to update an instructor by ID
    public void update(Long id, Instructor instructor) {
        instructor.setId(id);
        instructorRepository.save(instructor);

    }

    // Method to delete an instructor by ID
    public void deleteById(Long id) {
        instructorRepository.deleteById(id);
    }
}
