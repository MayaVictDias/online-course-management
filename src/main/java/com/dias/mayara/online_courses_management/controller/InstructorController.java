package com.dias.mayara.online_courses_management.controller;

import com.dias.mayara.online_courses_management.model.Instructor;
import com.dias.mayara.online_courses_management.service.InstructorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("instructors")
public class InstructorController {

    // Service to handle instructor-related operations
    private final InstructorService instructorService;

    // Constructor to inject the InstructorService dependency
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    // Endpoint to retrieve all instructors
    @GetMapping("/")
    public List<Instructor> findAll() {
        return instructorService.findAll();
    }

    // Endpoint to save an instructor
    @PostMapping
    public Instructor save(@RequestBody Instructor instructor) {
        return instructorService.save(instructor);
    }

    // Endpoint to update an instructor by ID
    @PutMapping("{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Instructor instructor) {
        instructorService.update(id, instructor);
    }

    // Endpoint to delete an instructor by ID
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        instructorService.deleteById(id);
    }
}