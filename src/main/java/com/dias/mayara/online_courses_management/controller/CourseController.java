package com.dias.mayara.online_courses_management.controller;

import com.dias.mayara.online_courses_management.model.Course;
import com.dias.mayara.online_courses_management.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses")
public class CourseController {

    // Service to handle course-related operations
    private final CourseService courseService;

    // Constructor to inject the CourseService dependency
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // Endpoint to retrieve all courses
    @GetMapping("/")
    public List<Course> findAll() {
        return courseService.findAll();
    }

    // Endpoint to save a course
    @PostMapping
    public Course save(@RequestBody Course course) {
        return courseService.save(course);
    }

    // Endpoint to update a course by ID
    @PutMapping("{id}")
    public void update(@PathVariable ("id") Long id, @RequestBody Course course) {

        courseService.update(id, course);
    }

    // Endpoint to delete a course by ID
    @DeleteMapping("{id}")
    public void delete(@PathVariable ("id") Long id) {
        courseService.deleteById(id);
    }
}
